/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Funcionarios;
import br.inatel.projeto.model.Ingredientes;
import br.inatel.projeto.model.Lanche;
import br.inatel.projeto.model.Produtos;
import br.inatel.projeto.model.Tabela;
import br.inatel.projeto.model.Vendas;
import br.inatel.projeto.view.Pedidos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WesleyReis
 */
public class ControlerPedidos implements ActionListener {

    int indice = 0;
    Pedidos pedidos;
    DefaultTableModel dtm;
    ArrayList<Vendas> vendas = new ArrayList();

    public ControlerPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;

        this.pedidos.getTbl_Pedidos().getColumnModel().getColumn(0).setPreferredWidth(240);
        this.pedidos.getTbl_Pedidos().getColumnModel().getColumn(1).setPreferredWidth(585);

        this.pedidos.getBtn_Anterior().addActionListener(this);
        this.pedidos.getBtn_Cancelar().addActionListener(this);
        this.pedidos.getBtn_Entregue().addActionListener(this);
        this.pedidos.getBtn_Primeiro().addActionListener(this);
        this.pedidos.getBtn_Proximo().addActionListener(this);
        this.pedidos.getBtn_Ultimo().addActionListener(this);
        this.pedidos.getMnu_atualizar_pedidos().addActionListener(this);

        getDados();
        this.dtm = (DefaultTableModel) this.pedidos.getTbl_Pedidos().getModel();
        preencheTabela();

        this.pedidos.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.pedidos.getBtn_Anterior()) {
            botaoAnterior();
        } else if (obj == this.pedidos.getBtn_Cancelar()) {
            this.pedidos.dispose();
        } else if (obj == this.pedidos.getBtn_Entregue()) {
            entregue();
        } else if (obj == this.pedidos.getBtn_Primeiro()) {
            botaoPrimeiro();
        } else if (obj == this.pedidos.getBtn_Proximo()) {
            botaoProximo();
        } else if (obj == this.pedidos.getBtn_Ultimo()) {
            botaoUltimo();
        } else if (obj == this.pedidos.getMnu_atualizar_pedidos()) {

        }

    }

    public void preencheTabela() {

        dtm.getDataVector().removeAllElements();
        this.pedidos.repaint();
        this.pedidos.getLbl_Responsavel().setText("");
        this.pedidos.getLbl_Codigo().setText("" );
        this.pedidos.getLbl_Data().setText("");
        this.pedidos.getLbl_Hora().setText("");

        if (this.indice >= 0 && this.vendas.size() > 0) {
            Vendas v = this.vendas.get(this.indice);
            for (Produtos produtos : v.getProdutos()) {
                dtm.insertRow(dtm.getRowCount(), new Object[]{
                    produtos.getNome(),
                    produtos.getModificacao()
                });
            }

            this.pedidos.getLbl_Responsavel().setText(v.getComprador());
            this.pedidos.getLbl_Codigo().setText("" + v.getId());
            this.pedidos.getLbl_Data().setText(v.getData());
            this.pedidos.getLbl_Hora().setText(v.getHora());
        }
    }

    // pegar apenas as vendas ainda não entregues
    public void getDados() {

        ArrayList<Produtos> prod = new ArrayList<>();
        ArrayList<Ingredientes> ingredientes = new ArrayList<>();
        Vendas venda = new Vendas();

        Ingredientes i1 = new Ingredientes();
        i1.setNome("Presunto");
        i1.setPreco((float) 0.50);
        ingredientes.add(i1);

        Ingredientes i2 = new Ingredientes();
        i2.setNome("Hamburger");
        i2.setPreco((float) 1.50);
        ingredientes.add(i2);

        Lanche l1 = new Lanche();
        l1.setNome("X-Tudo");
        l1.setPreco((float) 10.50);
        l1.addIngrediente(i1);
        l1.addIngrediente(i2);
        l1.setModificacao("Com Mofificação");
        prod.add(l1);

        Lanche l2 = new Lanche();
        l2.setNome("X-Nada");
        l2.setPreco((float) 5.50);
        l2.addIngrediente(i2);
        l2.setModificacao("Sem Mofificação");
        prod.add(l2);

        venda.setProdutos(prod);
        venda.setData("10/11/2017");
        venda.setHora("08:33");
        venda.setComprador("Jefão");
        venda.setValortotal((float) 35.70);
        venda.setVendedor("Atendente 1");
        venda.setId(0);
        this.vendas.add(venda);

        ArrayList<Produtos> prod2 = new ArrayList<>();
        ArrayList<Ingredientes> ingredientes2 = new ArrayList<>();
        Vendas venda2 = new Vendas();

        Ingredientes i3 = new Ingredientes();
        i3.setNome("Ovo");
        i3.setPreco((float) 0.50);
        ingredientes2.add(i3);

        Ingredientes i4 = new Ingredientes();
        i4.setNome("Queijo");
        i4.setPreco((float) 1.50);
        ingredientes2.add(i4);

        Lanche l3 = new Lanche();
        l3.setNome("Bauru");
        l3.setPreco((float) 10.50);
        l3.addIngrediente(i1);
        l3.addIngrediente(i2);
        l3.setModificacao("Sem Mofificação");
        prod2.add(l3);

        Lanche l4 = new Lanche();
        l4.setNome("X-Nada2");
        l4.setPreco((float) 5.50);
        l4.addIngrediente(i2);
        l4.setModificacao("Com Mofificação");
        prod2.add(l4);

        venda2.setProdutos(prod2);
        venda2.setData("20/01/2017");
        venda2.setHora("18:33");
        venda2.setComprador("Emerson");
        venda2.setValortotal((float) 45.70);
        venda2.setVendedor("Atendente 2");
        venda2.setId(1);

        this.vendas.add(venda2);

    }

    public void atualizaBanco() {
        // salva banco
        this.vendas.remove(this.indice);
        if (this.vendas.size() <= 0) {
            this.indice = -1;
        }

        if(this.vendas.size() == 1){
            desabilitaBotoes();
            preencheTabela();
        }else{
            botaoPrimeiro();
        }
        
        
    }

    private void botaoPrimeiro() {

        if (this.vendas.size() == 1) {
            desabilitaBotoes();
        } else {
            this.indice = 0;
            preencheTabela();
        }

        this.pedidos.getBtn_Primeiro().setEnabled(false);
        this.pedidos.getBtn_Anterior().setEnabled(false);
        this.pedidos.getBtn_Proximo().setEnabled(true);
        this.pedidos.getBtn_Ultimo().setEnabled(true);
    }

    private void desabilitaBotoes() {
        this.pedidos.getBtn_Primeiro().setEnabled(false);
        this.pedidos.getBtn_Anterior().setEnabled(false);
        this.pedidos.getBtn_Proximo().setEnabled(false);
        this.pedidos.getBtn_Ultimo().setEnabled(false);
    }

    private void botaoProximo() {
        if (this.indice < this.vendas.size() - 1) {
            this.indice++;
            preencheTabela();
            this.pedidos.getBtn_Primeiro().setEnabled(true);
            this.pedidos.getBtn_Anterior().setEnabled(true);
            this.pedidos.getBtn_Proximo().setEnabled(true);
            this.pedidos.getBtn_Ultimo().setEnabled(true);

        }
        if (this.indice == this.vendas.size() - 1) {

            this.pedidos.getBtn_Primeiro().setEnabled(true);
            this.pedidos.getBtn_Anterior().setEnabled(true);
            this.pedidos.getBtn_Proximo().setEnabled(false);
            this.pedidos.getBtn_Ultimo().setEnabled(false);
        }

    }

    private void botaoUltimo() {
        this.indice = this.vendas.size() - 1;
        preencheTabela();
        this.pedidos.getBtn_Primeiro().setEnabled(true);
        this.pedidos.getBtn_Anterior().setEnabled(true);
        this.pedidos.getBtn_Proximo().setEnabled(false);
        this.pedidos.getBtn_Ultimo().setEnabled(false);

    }

    private void botaoAnterior() {
        if (this.indice > 0) {
            this.indice--;
            preencheTabela();
            this.pedidos.getBtn_Primeiro().setEnabled(true);
            this.pedidos.getBtn_Anterior().setEnabled(true);
            this.pedidos.getBtn_Proximo().setEnabled(true);
            this.pedidos.getBtn_Ultimo().setEnabled(true);

        } if (this.indice == 0) {

            this.pedidos.getBtn_Primeiro().setEnabled(false);
            this.pedidos.getBtn_Anterior().setEnabled(false);
            this.pedidos.getBtn_Proximo().setEnabled(true);
            this.pedidos.getBtn_Ultimo().setEnabled(true);
        }
    }

    private void entregue() {
        this.vendas.get(this.indice).setEntregue(true);
        atualizaBanco();
    }
}
