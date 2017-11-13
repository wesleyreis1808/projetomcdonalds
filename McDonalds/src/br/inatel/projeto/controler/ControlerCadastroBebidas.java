/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Bebidas;
import br.inatel.projeto.model.BebidasDAO;
import br.inatel.projeto.model.Funcionarios;
import br.inatel.projeto.model.Tabela;
import br.inatel.projeto.view.CadastroBebida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WesleyReis
 */
public class ControlerCadastroBebidas implements ActionListener, Tabela {

    CadastroBebida cadastroBebida;
    DefaultTableModel dtm;
    ArrayList<Bebidas> bebidas;
    BebidasDAO bebidasBD = new BebidasDAO();
    Object[][] dados;
    private int posiSelect;

    public ControlerCadastroBebidas(CadastroBebida cadastroBebida) {
        this.cadastroBebida = cadastroBebida;

        this.cadastroBebida.getBtm_cancelar().addActionListener(this);
        this.cadastroBebida.getBtm_salvar().addActionListener(this);
        this.cadastroBebida.getBtn_deletar().addActionListener(this);
        this.cadastroBebida.getjTable1().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        getDados();
        preencheTabela();

        this.cadastroBebida.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.cadastroBebida.getBtm_cancelar()) {
            cancelar();
        } else if (obj == this.cadastroBebida.getBtm_salvar()) {
            if (verificaCampos()) {
                salvaCadastro();
            }
        } else if (obj == this.cadastroBebida.getBtn_deletar()) {
            limpaCampos();
            removerItemSelecionado();
        }
    }

    private void cancelar() {
        this.cadastroBebida.setVisible(false);
    }

    private void jTable1MouseClicked(MouseEvent evt) {
        limpaCampos();
        posiSelect = this.cadastroBebida.getjTable1().getSelectedRow();
        if (this.cadastroBebida.getjTable1().getSelectedRow() >= 0) {

            Bebidas bebi = this.bebidas.get(this.cadastroBebida.getjTable1().getSelectedRow());

            this.cadastroBebida.getTxf_preco().setText("" + bebi.getPreco());
            if (bebi.getTamanho().equals(this.cadastroBebida.getRbtn_tamanho1().getText())) {
                this.cadastroBebida.getRbtn_tamanho1().setSelected(true);
            } else if (bebi.getTamanho().equals(this.cadastroBebida.getRbtn_tamanho2().getText())) {
                this.cadastroBebida.getRbtn_tamanho2().setSelected(true);
            } else if (bebi.getTamanho().equals(this.cadastroBebida.getRbtn_tamanho3().getText())) {
                this.cadastroBebida.getRbtn_tamanho3().setSelected(true);
            } else if (bebi.getTamanho().equals(this.cadastroBebida.getRbtn_tamanho4().getText())) {
                this.cadastroBebida.getRbtn_tamanho4().setSelected(true);
            }

            this.cadastroBebida.getComBox_Refri().setSelectedItem(bebi.getNome());

        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha não selecionada!");
        }
    }

    @Override
    public boolean verificaCampos() {
        boolean teste = true;

        if (this.cadastroBebida.getTxf_preco().equals("") || this.cadastroBebida.getTxf_preco().equals("0,00")) {
            JOptionPane.showMessageDialog(this.cadastroBebida, "Preencher todos campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (this.cadastroBebida.getComBox_Refri().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this.cadastroBebida, "Preencher todos campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!this.cadastroBebida.getRbtn_tamanho1().isSelected() && !this.cadastroBebida.getRbtn_tamanho2().isSelected()
                && !this.cadastroBebida.getRbtn_tamanho3().isSelected() && !this.cadastroBebida.getRbtn_tamanho4().isSelected()) {
            JOptionPane.showMessageDialog(this.cadastroBebida, "Preencher todos campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            try {
                Float.parseFloat(this.cadastroBebida.getTxf_preco().getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this.cadastroBebida, "Preencher todos campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        return teste;
    }

    @Override
    public void preencheTabela() {
        dtm = (DefaultTableModel) this.cadastroBebida.getjTable1().getModel();

        for (Bebidas bebi : bebidas) {
            dtm.insertRow(dtm.getRowCount(), new Object[]{
                bebi.getNome(),
                bebi.getPreco(),
                bebi.getTamanho(),});
        }
    }

    @Override
    public void removerItemSelecionado() {
        limpaCampos();
        //this.produtos.remove(tbl_Carrinho.getSelectedRow());
        if (this.cadastroBebida.getjTable1().getSelectedRow() >= 0) {

            bebidasBD.remover(bebidas.get(posiSelect));
            this.bebidas.remove(this.cadastroBebida.getjTable1().getSelectedRow());
            dtm.removeRow(this.cadastroBebida.getjTable1().getSelectedRow());

            this.cadastroBebida.getjTable1().setModel(dtm);
            this.cadastroBebida.getjTable1().repaint();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha não selecionada!");
        }
    }

    @Override
    public void getDados() {
        this.bebidas = bebidasBD.listar();
    }

    @Override
    public void salvaCadastro() {
        Bebidas bebida = new Bebidas();

        bebida.setImage_path("VAZIO");
        bebida.setNome(this.cadastroBebida.getComBox_Refri().getSelectedItem().toString());
        bebida.setPreco(Float.parseFloat(this.cadastroBebida.getTxf_preco().getText()));
        if (this.cadastroBebida.getRbtn_tamanho1().isSelected()) {
            bebida.setTamanho(this.cadastroBebida.getRbtn_tamanho1().getText());
        } else if (this.cadastroBebida.getRbtn_tamanho2().isSelected()) {
            bebida.setTamanho(this.cadastroBebida.getRbtn_tamanho2().getText());
        } else if (this.cadastroBebida.getRbtn_tamanho3().isSelected()) {
            bebida.setTamanho(this.cadastroBebida.getRbtn_tamanho3().getText());
        } else if (this.cadastroBebida.getRbtn_tamanho4().isSelected()) {
            bebida.setTamanho(this.cadastroBebida.getRbtn_tamanho4().getText());
        }

        this.bebidas.add(bebida);

        //Grava no Banco de Dados
        bebidasBD.cadastrar(bebida);

        dtm.insertRow(dtm.getRowCount(), new Object[]{
            bebida.getNome(),
            bebida.getPreco(),
            bebida.getTamanho()
        });

        // salva banco;
        limpaCampos();

    }

    @Override
    public void limpaCampos() {
        this.cadastroBebida.getTxf_preco().setText("");
        this.cadastroBebida.getComBox_Refri().setSelectedIndex(0);
        this.cadastroBebida.getGrupoDeBotão_Tamanho().clearSelection();

    }

    @Override
    public void atualizarCadastro() {
//        if (posiSelect >= 0) {
//            Bebidas b = new Bebidas();
//            b.setNome(this.cadastroBebida.getComBox_Refri().getSelectedItem().toString());
//            b.setImage_path("VAZIO");
//            b.setTamanho(this.cadastroBebida.getR);
//            b.setSenha(this.cadastroBebida.getTxt_senha().getText());
//            b.setId(this.bebidas.get(posiSelect).getId());
//            if (this.cadastroBebida.getRd_vendedor().isSelected()) {
//                b.setNivel_acesso(1);
//            } else {
//                b.setNivel_acesso(2);
//            }
//            
//            funcBD.editar(f);
//            
//        } else {
//            JOptionPane.showMessageDialog(null, "Nenhuma linha não selecionada!");
//        }
    }
}
