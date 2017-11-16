/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Bebidas;
import br.inatel.projeto.model.Ingredientes;
import br.inatel.projeto.model.Lanche;
import br.inatel.projeto.model.Produtos;
import br.inatel.projeto.model.Vendas;
import br.inatel.projeto.model.VendasDAO;
import br.inatel.projeto.view.Historico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WesleyReis
 */
public class ControlerHistorico implements ActionListener {

    Historico historico;
    DefaultTableModel dtm = new DefaultTableModel();
    ArrayList<Vendas> vendas = new ArrayList<>();
    VendasDAO vendBD = new VendasDAO();

    public ControlerHistorico(Historico historico) {
        this.historico = historico;

        this.historico.getTbl_Historico().getColumnModel().getColumn(2).setPreferredWidth(170);
        this.historico.getTbl_Historico().getColumnModel().getColumn(4).setPreferredWidth(485);
        dtm = (DefaultTableModel) this.historico.getTbl_Historico().getModel();

        this.historico.getBtn_Cancelar().addActionListener(this);
        this.historico.getBtn_Ok().addActionListener(this);
        this.historico.getRbt_Data().addActionListener(this);
        this.historico.getRbt_Todas().addActionListener(this);

        getDados();
        preencheTabela();

        this.historico.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.historico.getBtn_Cancelar()) {
            this.historico.dispose();
        }else if (obj == this.historico.getBtn_Ok()) {
            botaoOk();
        } else if (obj == this.historico.getRbt_Data()) {
            radioButtonData();
        } else if (obj == this.historico.getRbt_Todas()) {
            radioButtonTodas();
        }

    }

    private void preencheTabela() {

        float total = 0;
        int entre = 0;

        dtm.getDataVector().removeAllElements();
        this.historico.repaint();

        for (Vendas v : vendas) {

            String produtos = produtos(v);

            total += v.getValortotal();

            dtm.insertRow(dtm.getRowCount(), new Object[]{
                v.getData(),
                v.getHora(),
                v.getComprador(),
                "" + v.getValortotal(),
                produtos
            });
        }
        this.historico.getLbl_Total().setText("R$ " + total);
        this.historico.repaint();

    }

    private void getDados() {
            
            this.vendas = vendBD.listar();

    }

    private String produtos(Vendas vend) {
        String prod = "";
        for (Produtos p : vend.getProdutos()) {
            if (p instanceof Lanche) {
                prod += p.getNome() + " - ";
            } else if (p instanceof Bebidas) {
                prod += p.getNome() + " " + ((Bebidas) p).getTamanho() + " - ";
            }
        }
        return prod;
    }

    private void limpar() {
        this.vendas.clear();
        this.dtm.getDataVector().removeAllElements();
        this.historico.getLbl_Total().setText("");
        this.historico.getButtonGroup1().clearSelection();
        this.historico.getTxt_Data().setText("");
        this.historico.repaint();
    }

    private void radioButtonData() {
        if (this.historico.getRbt_Data().isSelected()) {
            this.historico.getTxt_Data().setEnabled(true);
            this.historico.getBtn_Ok().setEnabled(true);
        } else {
            this.historico.getTxt_Data().setEnabled(false);
            this.historico.getBtn_Ok().setEnabled(false);
        }
    }

    private void radioButtonTodas() {
        if (this.historico.getRbt_Todas().isSelected()) {
            this.historico.getTxt_Data().setEnabled(false);
            this.historico.getBtn_Ok().setEnabled(false);
            preencheTabela();
        } else {
            this.historico.getTxt_Data().setEnabled(true);
            this.historico.getBtn_Ok().setEnabled(true);
        }
    }

    private void botaoOk() {
        if (!this.historico.getTxt_Data().getText().equals("")) {
            preencheTabelaData(this.historico.getTxt_Data().getText());
        } else {
            JOptionPane.showMessageDialog(this.historico, "Data em branco!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void preencheTabelaData(String text) {
        float total = 0;
        int entre = 0;

        dtm.getDataVector().removeAllElements();
        this.historico.repaint();

        for (Vendas v : vendas) {

            if (v.getData().equals(this.historico.getTxt_Data().getText())) {
                String produtos = produtos(v);

                total += v.getValortotal();

                dtm.insertRow(dtm.getRowCount(), new Object[]{
                    v.getData(),
                    v.getHora(),
                    v.getComprador(),
                    "" + v.getValortotal(),
                    produtos
                });
            }
        }
        this.historico.getLbl_Total().setText("R$ " + total);
        this.historico.repaint();
    }

}
