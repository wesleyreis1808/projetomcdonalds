/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.*;
import br.inatel.projeto.view.AlteracaoLanche;
import br.inatel.projeto.view.Vendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WesleyReis
 */
public class ControlerVendas implements ActionListener {

    private Vendas vendas;
    private ControlerAlteracaoLanche alteracao;
    private ArrayList<Lanche> lanches = new ArrayList<>();  //Array que contem todos lanche cadastraddos
    private ArrayList<Bebidas> bebidas = new ArrayList<>();
    private static DefaultTableModel dtm = new DefaultTableModel();
    private static ArrayList<Produtos> produtos;
    private ArrayList<JButton> botoesLanche = new ArrayList<>();
    private ArrayList<JButton> botoesBebidas = new ArrayList<>();
    
    private LancheDAO lancBD = new LancheDAO();
    private BebidasDAO bebiBD = new BebidasDAO();
    private VendasDAO vendBD = new VendasDAO();
    
    Funcionarios funcionario;

    public ControlerVendas(Vendas vendas,Funcionarios funcionario) {
        this.vendas = vendas;
        this.funcionario = funcionario;
        
        ControlerVendas.produtos = new ArrayList<>();
        botoesBebidas = this.vendas.getArrayBotoesBebidas();
        botoesLanche = this.vendas.getArrayBotoesLanches();

        for (JButton botao : this.vendas.getArrayBotoesBebidas()) {
            botao.addActionListener(this);
            //botao.setVisible(false);
        }
        for (JButton botao : this.vendas.getArrayBotoesLanches()) {
            botao.addActionListener(this);
            //botao.setVisible(false);
        }
        this.vendas.getBtn_Calcular().addActionListener(this);
        this.vendas.getBtn_Cancelar().addActionListener(this);
        this.vendas.getBtn_Finalizar().addActionListener(this);
        this.vendas.getBtn_Remover().addActionListener(this);
        

        dtm = (DefaultTableModel) this.vendas.getTbl_Carrinho().getModel();

        getDados();
        ativarBotoes();
        this.vendas.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.vendas.getBtn_Calcular()) {
            calcularTroco();
        } else if (obj == this.vendas.getBtn_Cancelar()) {
            this.vendas.dispose();
        } else if (obj == this.vendas.getBtn_Finalizar()) {
            finalizarCompra();
        } else if (obj == this.vendas.getBtn_Remover()) {
            removerProduto();
        } else if (this.vendas.getArrayBotoesBebidas().contains(obj)) {
            System.out.println("Bebidas");
        } else if (this.vendas.getArrayBotoesLanches().contains(obj)) {
            System.out.println("Lanches");
        }

        for (JButton botao : this.vendas.getArrayBotoesBebidas()) {
            if (obj == botao) {
                System.out.println(botao.getText());
                this.produtos.add(bebidaEscolhida(botao.getText()));
                adicionaTabela(bebidaEscolhida(botao.getText()));
            }
        }
        for (JButton botao : this.vendas.getArrayBotoesLanches()) {
            if (obj == botao) {
                System.out.println(botao.getText());
                alteraLanche(botao.getText());
            }
        }
    }
    //=============================================================================
    //=========================== aparecer botoes tela ============================

    private void getDados() {
        
        this.bebidas = bebiBD.listar();
        this.lanches = lancBD.listar();
    }

    //=============================================================================
    //=========================== aparecer botoes tela ============================
    private void ativarBotoes() {
        DecimalFormat df = new DecimalFormat("00.00");
        for (int i = 0; i < this.lanches.size(); i++) {
            if (lanches.get(i) != null) {
                botoesLanche.get(i).setVisible(true);
                botoesLanche.get(i).setText(this.lanches.get(i).getNome());
            }
        }
        for (int i = 0; i < this.bebidas.size(); i++) {
            if (bebidas.get(i) != null) {
                botoesBebidas.get(i).setVisible(true);
                botoesBebidas.get(i).setText(this.bebidas.get(i).getNome() + "  " + this.bebidas.get(i).getTamanho());
            }
        }
    }
    //=============================================================================
    //=========================== tabela ======================================

    public void adicionaTabela(Produtos produ) {
        DecimalFormat df = new DecimalFormat("0.00");

        if (produ instanceof Bebidas) {
            dtm.insertRow(dtm.getRowCount(), new Object[]{
                produ.getNome(),
                produ.getPreco(),
                0,
                "Não"
            });
            this.vendas.getLbl_ValorCompra().setText(df.format(calculaTotal()));
        }

        // mostrarProdutos();
    }

    private float calculaTotal() {
        float total = 0;
        for (Produtos prod : this.produtos) {
            if (prod instanceof Lanche) {
                total += prod.getPreco() + ((Lanche) prod).getAdicional();
            } else if (prod instanceof Bebidas) {
                total += prod.getPreco();
            }
        }
        return total;
    }

    private void alteraLanche(String nomeLanche) {

        Lanche lanche = lancheEscolhido(nomeLanche);

        alteracao = new ControlerAlteracaoLanche(new AlteracaoLanche(), lanche, this.vendas);

    }

    private Lanche lancheEscolhido(String nome) {
        Lanche lanche = new Lanche();

        for (Lanche lan : this.lanches) {
            if (lan.getNome().equalsIgnoreCase(nome)) {
                lanche.setId(lan.getId());
                lanche.setNome(lan.getNome());
                lanche.setPreco(lan.getPreco());
                lanche.setIngredientes(lan.getIngredientes());
                break;
            }
        }

        return lanche;
    }

    private Produtos bebidaEscolhida(String nome) {
        Bebidas bebida = new Bebidas();

        for (Bebidas beb : bebidas) {
            if (nome.contains(beb.getNome())) {
                bebida.setId(beb.getId());
                bebida.setNome(beb.getNome());
                bebida.setPreco((float) beb.getPreco());
                bebida.setTamanho(beb.getTamanho());
                break;
            }
        }

        return bebida;
    }

    private void removerProduto() {
        DecimalFormat df = new DecimalFormat("0.00");

        if (this.vendas.getTbl_Carrinho().getSelectedRow() >= 0) {
            this.produtos.remove(this.vendas.getTbl_Carrinho().getSelectedRow());
            dtm.removeRow(this.vendas.getTbl_Carrinho().getSelectedRow());
            this.vendas.getTbl_Carrinho().setModel(dtm);
            this.vendas.getTbl_Carrinho().repaint();

            this.vendas.getLbl_ValorCompra().setText(df.format(calculaTotal()));
        } else {
            JOptionPane.showMessageDialog(this.vendas, "Nenhuma linha não selecionada!");
        }
    }

    private void calcularTroco() {
        try {
            String troco = this.vendas.getTxt_Dinheiro().getText().replace(",", ".");
            this.vendas.getLbl_Troco().setText("" + (Float.parseFloat(troco) - calculaTotal()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this.vendas, "Dinheiro inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    //==========================================================================
    //==========================================================================
    //====================== salvar banco e zerar tudo =========================
    private void finalizarCompra() {
        if (this.produtos.isEmpty()) {
            JOptionPane.showMessageDialog(this.vendas, "Nenhum produto adicionado!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        float troco = Float.parseFloat(this.vendas.getLbl_Troco().getText());
        if (troco < 0) {
            JOptionPane.showMessageDialog(this.vendas, "Troco inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            float dinheiro = Float.parseFloat(this.vendas.getTxt_Dinheiro().getText());

            finaliza();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this.vendas, "Dinheiro inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void finaliza() {

        br.inatel.projeto.model.Vendas ven = new br.inatel.projeto.model.Vendas();
        
        ven.setComprador(this.vendas.getTxt_Responsavel().getText());
        ven.setValortotal(calculaTotal());
        ven.setProdutos(produtos);
        ven.setVendedor(funcionario.getId());
        vendBD.cadastrar(ven);
        limpar();

        JOptionPane.showMessageDialog(this.vendas, "Venda Concluída!", "Venda", JOptionPane.INFORMATION_MESSAGE);

    }

    private void limpar() {
        this.vendas.getLbl_Troco().setText("0,00");
        this.vendas.getTxt_Dinheiro().setText("");
        this.vendas.getLbl_ValorCompra().setText("");

        this.vendas.getTxt_Responsavel().setText("");

        produtos.removeAll(produtos);
        dtm.getDataVector().removeAllElements();

        this.vendas.repaint();
    }

    public static ArrayList<Produtos> getProdutos() {
        return produtos;
    }

}
