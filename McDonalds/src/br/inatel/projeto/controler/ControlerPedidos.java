/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Produtos;
import br.inatel.projeto.model.Vendas;
import br.inatel.projeto.model.VendasDAO;
import br.inatel.projeto.view.Pedidos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    VendasDAO vendBD = new VendasDAO();

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
        ArrayList<Vendas> v = new ArrayList<>();
        v = vendBD.listar();
        
        for (int i = 0; i < v.size(); i++) {
            if(v.get(i).getEntregue() == 0){
                vendas.add(v.get(i));
                System.out.println("Add");
            }
        }
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
        this.vendas.get(this.indice).setEntregue(0);
        atualizaBanco();
    }
}
