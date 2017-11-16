/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Bebidas;
import br.inatel.projeto.model.Ingredientes;
import br.inatel.projeto.model.IngredientesDAO;
import br.inatel.projeto.model.Lanche;
import br.inatel.projeto.model.Produtos;
import br.inatel.projeto.view.AlteracaoLanche;
import br.inatel.projeto.view.Vendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WesleyReis
 */
public class ControlerAlteracaoLanche implements ActionListener {

    private AlteracaoLanche alteracaoLanche;
    private ArrayList<Ingredientes> selecionados = new ArrayList<>();
    private ArrayList<Ingredientes> ingredientes = new ArrayList<>();

    private Vendas telaVenda;
    private Lanche lanche;
    private float valorAdicional;
    private boolean modificacao;
    private String sem = "";
    private String com = "";

    public ControlerAlteracaoLanche(AlteracaoLanche alteracaoLanche, Lanche lanche, Vendas tela) {
        this.alteracaoLanche = alteracaoLanche;
        this.lanche = lanche;
        this.telaVenda = tela;

        this.alteracaoLanche.getBtn_Cancelar().addActionListener(this);
        this.alteracaoLanche.getBtn_Finalizar().addActionListener(this);
        for (JCheckBox botao : this.alteracaoLanche.getBotoes()) {
            botao.addActionListener(this);
        }

        getDados();
        iniciaCheckBox();
        marcarCheck();

        this.alteracaoLanche.setVisible(true);
        this.alteracaoLanche.toFront();
        this.alteracaoLanche.setLocationRelativeTo(this.telaVenda);
        this.alteracaoLanche.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.alteracaoLanche.getBtn_Cancelar()) {
            this.alteracaoLanche.dispose();
        } else if (obj == this.alteracaoLanche.getBtn_Finalizar()) {
            finalizado();
        } else if (this.alteracaoLanche.getBotoes().contains(obj)) {
            for (JCheckBox botao : this.alteracaoLanche.getBotoes()) {
                if (obj == botao) {
                    System.out.println(botao.getText());
                    if (botao.isSelected()) {
                        adiciona(botao.getText());
                        //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
                    } else {
                        retira(botao.getText());
                        //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
                    }

                }
            }
        }

    }

    private void getDados() {
        // pegar todos ingredientes banco
        IngredientesDAO ingBD = new IngredientesDAO();
        ArrayList<Ingredientes> ingredientes = ingBD.listar();


        this.ingredientes = ingredientes;
    }

    private void iniciaCheckBox() {
        for (JCheckBox ck : this.alteracaoLanche.getBotoes()) {
            ck.setVisible(false);
        }

        for (int i = 0; i < this.ingredientes.size(); i++) {
            if (ingredientes.get(i) != null) {
                this.alteracaoLanche.getBotoes().get(i).setVisible(true);
                this.alteracaoLanche.getBotoes().get(i).setText(this.ingredientes.get(i).getNome());
            }
        }
    }
    // retira os ingredientes indesejados

    private void retira(String ing) {
        float valor = 0;
        for (int i = 0; i < selecionados.size(); i++) {
            if (selecionados.get(i).getNome().equalsIgnoreCase(ing)) {
                valor = selecionados.get(i).getPreco();
                selecionados.remove(i);
                break;
            }
        }
        boolean teste = true;
        for (int i = 0; i < lanche.getIngredientes().size(); i++) {
            if (lanche.getIngredientes().get(i).getNome().equalsIgnoreCase(ing)) {
                teste = false;
                break;
            }
        }
        if (teste) {
            this.valorAdicional -= valor;
            this.com = this.com.replace(" " + ing, "");
        } else {
            this.sem += " " + ing;
        }
        // System.out.println("com: "+com);
        //System.out.println("sem: "+sem);
    }

    // método para adionar ingrediente ao array selecionados
    private void adiciona(String ing) {
        float valor = 0;
        for (int i = 0; i < this.ingredientes.size(); i++) {
            if (this.ingredientes.get(i).getNome().equalsIgnoreCase(ing)) {
                selecionados.add(this.ingredientes.get(i));
                valor = this.ingredientes.get(i).getPreco();
                break;
            }
        }
        boolean teste = true;
        for (int i = 0; i < lanche.getIngredientes().size(); i++) {
            if (lanche.getIngredientes().get(i).getNome().equalsIgnoreCase(ing)) {
                teste = false;
                break;
            }
        }
        if (teste) {
            this.valorAdicional += valor;

            this.com += " " + ing;
        } else {
            this.sem = this.sem.replace(" " + ing, "");
        }
        //System.out.println("com: "+com);
        //System.out.println("sem: "+sem);
    }
    
    public boolean modificacao() {
        
        if(selecionados.size() != lanche.getIngredientes().size()) return false;
        else{
            for (int i = 0; i < selecionados.size(); i++) {
                if(!selecionados.get(i).getNome().equals(lanche.getIngredientes().get(i).getNome())) return false;
            }
        }        
        return true;
    }
    
    private void finalizado(){
        if(this.selecionados.isEmpty()){
            JOptionPane.showMessageDialog(this.alteracaoLanche, "Nenhum ingrediente selecionado!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        lanche.setAdicional(valorAdicional);

        this.alteracaoLanche.dispose();
        this.modificacao = modificacao();
        
        lanche.setIngredientes(selecionados);
        lanche.setModificacao("Sem: " + sem + " Com: " + com);
        ControlerVendas.getProdutos().add(lanche);
        adicionaTabela(lanche);

    }
    
    public void adicionaTabela(Produtos produ) {
        DecimalFormat df = new DecimalFormat("0.00");
         DefaultTableModel dtm = (DefaultTableModel) this.telaVenda.getTbl_Carrinho().getModel();
                 
        if (produ instanceof Lanche) {
            String op2 = produ.getModificacao();
//            String op2 = (((AlteracaoLanche) alteracao).isModificacao()) ? "Não" : "Sim";
            //           ((Lanche) produ).setModificacao(op2);

            dtm.insertRow(dtm.getRowCount(), new Object[]{
                produ.getNome(),
                ((float) produ.getPreco()),
                ((float) ((Lanche) produ).getAdicional()),
                op2
            });
            this.telaVenda.getLbl_ValorCompra().setText(df.format(calculaTotal()));

        } else if (produ instanceof Bebidas) {
            dtm.insertRow(dtm.getRowCount(), new Object[]{
                produ.getNome(),
                produ.getPreco(),
                0,
                "Não"
            });
            this.telaVenda.getLbl_ValorCompra().setText(df.format(calculaTotal()));
        }

        // mostrarProdutos();
    }
    
    private void marcarCheck() {

        if (lanche != null) {
            for (int i = 0; i < lanche.getIngredientes().size(); i++) {
                for (int j = 0; j < this.alteracaoLanche.getBotoes().size(); j++) {
                    if (this.alteracaoLanche.getBotoes().get(j).getText().equalsIgnoreCase(lanche.getIngredientes().get(i).getNome())) {
                        this.alteracaoLanche.getBotoes().get(j).setSelected(true);
                        selecionados.add(lanche.getIngredientes().get(i));
                        break;
                    }
                }
            }
        }

    }

    private float calculaTotal() {
        float total = 0;
        for (Produtos prod : ControlerVendas.getProdutos()) {
            if (prod instanceof Lanche) {
                total += prod.getPreco() + ((Lanche) prod).getAdicional();
            } else if (prod instanceof Bebidas) {
                total += prod.getPreco();
            }
        }
        return total;
    }
}
