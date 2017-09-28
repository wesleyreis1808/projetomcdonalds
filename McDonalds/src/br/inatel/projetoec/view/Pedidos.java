/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.view;

import br.inatel.projetoec.model.ArquivoVendas;
import br.inatel.projetoec.model.Bebida;
import br.inatel.projetoec.model.Lanche;
import br.inatel.projetoec.model.Produto;
import br.inatel.projetoec.model.Venda;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WesleyReis
 */
public class Pedidos extends javax.swing.JFrame {

    ArquivoVendas arqVenda = new ArquivoVendas();
    private ArrayList<Venda> vendas;
    private DefaultTableModel dtm = new DefaultTableModel();
    private boolean pedidosPendentes;

    public Pedidos() {
        initComponents();

        dtm = (DefaultTableModel) tbl_Pedidos.getModel();
        this.vendas = arqVenda.resgatarArquivo();
        this.setLocationRelativeTo(null);
        
        tbl_Pedidos.getColumnModel().getColumn(0).setPreferredWidth(130);
        tbl_Pedidos.getColumnModel().getColumn(1).setPreferredWidth(110);
        tbl_Pedidos.getColumnModel().getColumn(2).setPreferredWidth(585);

        atualiza(vendas);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projetoec/imagens/images.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Fundo = new javax.swing.JPanel();
        pnl_Entrega = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_Endereco = new javax.swing.JLabel();
        lbl_Numero = new javax.swing.JLabel();
        lbl_Telefone = new javax.swing.JLabel();
        pnl_Informacoes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbl_Responsavel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_Codigo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_Data = new javax.swing.JLabel();
        lbl_Hora = new javax.swing.JLabel();
        pnl_Produtos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Pedidos = new javax.swing.JTable();
        pnl_Botoes = new javax.swing.JPanel();
        btn_Primeiro = new javax.swing.JButton();
        btn_Anterior = new javax.swing.JButton();
        btn_Proximo = new javax.swing.JButton();
        btn_Ultimo = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Entregue = new javax.swing.JButton();
        mnu_Menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Entrega.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrega"));

        jLabel1.setText("Endereço: ");

        jLabel2.setText("Nº :");

        jLabel3.setText("Telefone: ");

        javax.swing.GroupLayout pnl_EntregaLayout = new javax.swing.GroupLayout(pnl_Entrega);
        pnl_Entrega.setLayout(pnl_EntregaLayout);
        pnl_EntregaLayout.setHorizontalGroup(
            pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_EntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbl_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(lbl_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lbl_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        pnl_EntregaLayout.setVerticalGroup(
            pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_EntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Endereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_EntregaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbl_Telefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnl_Fundo.add(pnl_Entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 850, -1));

        pnl_Informacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabel4.setText("Responsável: ");

        jLabel5.setText("Codigo: ");

        jLabel6.setText("Data e Hora:");

        javax.swing.GroupLayout pnl_InformacoesLayout = new javax.swing.GroupLayout(pnl_Informacoes);
        pnl_Informacoes.setLayout(pnl_InformacoesLayout);
        pnl_InformacoesLayout.setHorizontalGroup(
            pnl_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_InformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lbl_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(lbl_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnl_InformacoesLayout.setVerticalGroup(
            pnl_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_InformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_InformacoesLayout.createSequentialGroup()
                        .addGroup(pnl_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbl_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_InformacoesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Data, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Hora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pnl_Fundo.add(pnl_Informacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 850, -1));

        pnl_Produtos.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        tbl_Pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Repartir", "Modificações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Pedidos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tbl_Pedidos);

        javax.swing.GroupLayout pnl_ProdutosLayout = new javax.swing.GroupLayout(pnl_Produtos);
        pnl_Produtos.setLayout(pnl_ProdutosLayout);
        pnl_ProdutosLayout.setHorizontalGroup(
            pnl_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnl_ProdutosLayout.setVerticalGroup(
            pnl_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_Fundo.add(pnl_Produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 854, -1));

        pnl_Botoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_Primeiro.setText("Primeiro");
        btn_Primeiro.setEnabled(false);
        btn_Primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrimeiroActionPerformed(evt);
            }
        });

        btn_Anterior.setText("Anterior");
        btn_Anterior.setEnabled(false);
        btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnteriorActionPerformed(evt);
            }
        });

        btn_Proximo.setText("Próximo");
        btn_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProximoActionPerformed(evt);
            }
        });

        btn_Ultimo.setText("Último");
        btn_Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UltimoActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Entregue.setText("Entregue");
        btn_Entregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntregueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_BotoesLayout = new javax.swing.GroupLayout(pnl_Botoes);
        pnl_Botoes.setLayout(pnl_BotoesLayout);
        pnl_BotoesLayout.setHorizontalGroup(
            pnl_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Primeiro)
                .addGap(18, 18, 18)
                .addComponent(btn_Anterior)
                .addGap(18, 18, 18)
                .addComponent(btn_Proximo)
                .addGap(18, 18, 18)
                .addComponent(btn_Ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Entregue)
                .addGap(18, 18, 18)
                .addComponent(btn_Cancelar)
                .addContainerGap())
        );
        pnl_BotoesLayout.setVerticalGroup(
            pnl_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Primeiro)
                    .addComponent(btn_Anterior)
                    .addComponent(btn_Proximo)
                    .addComponent(btn_Cancelar)
                    .addComponent(btn_Entregue)
                    .addComponent(btn_Ultimo))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnl_Fundo.add(pnl_Botoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 854, -1));

        getContentPane().add(pnl_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 462));

        jMenu1.setText("Pedidos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setText("Atualizar Pedidos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        mnu_Menu.add(jMenu1);

        setJMenuBar(mnu_Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        atualiza(vendas);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_EntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntregueActionPerformed
        ArrayList<Venda> todasVend = new ArrayList<>();
        todasVend = arqVenda.resgatarArquivo();

        for (Venda v : vendas) {
            String codigo = "" + v.getCodigo();
            if (codigo.equals(lbl_Codigo.getText()) && lbl_Responsavel.getText().equals(v.getComprador())) {
                v.setEntregue(true);

                for (Venda v2 : todasVend) {
                    if (v2.getCodigo() == v.getCodigo() && v2.getComprador().equals(v.getComprador()) && v2.getHora().equals(v.getHora())) {
                        v2.setEntregue(true);
                        arqVenda.salvarArquivo(todasVend, false);
                        break;
                    }
                }

                break;
            }
        }

        atualiza(vendas);
    }//GEN-LAST:event_btn_EntregueActionPerformed

    private void btn_UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UltimoActionPerformed
        this.ultimo();
    }//GEN-LAST:event_btn_UltimoActionPerformed

    private void btn_PrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrimeiroActionPerformed
        this.primeiro();
    }//GEN-LAST:event_btn_PrimeiroActionPerformed

    private void btn_ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProximoActionPerformed
        this.proximo();
    }//GEN-LAST:event_btn_ProximoActionPerformed

    private void btn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnteriorActionPerformed
        this.anterior();
    }//GEN-LAST:event_btn_AnteriorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Anterior;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Entregue;
    private javax.swing.JButton btn_Primeiro;
    private javax.swing.JButton btn_Proximo;
    private javax.swing.JButton btn_Ultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Codigo;
    private javax.swing.JLabel lbl_Data;
    private javax.swing.JLabel lbl_Endereco;
    private javax.swing.JLabel lbl_Hora;
    private javax.swing.JLabel lbl_Numero;
    private javax.swing.JLabel lbl_Responsavel;
    private javax.swing.JLabel lbl_Telefone;
    private javax.swing.JMenuBar mnu_Menu;
    private javax.swing.JPanel pnl_Botoes;
    private javax.swing.JPanel pnl_Entrega;
    private javax.swing.JPanel pnl_Fundo;
    private javax.swing.JPanel pnl_Informacoes;
    private javax.swing.JPanel pnl_Produtos;
    private javax.swing.JTable tbl_Pedidos;
    // End of variables declaration//GEN-END:variables

    private void atualiza(ArrayList<Venda> vend) {

        ArrayList<Venda> vendaN = new ArrayList<>();

        for (Venda v : vend) {
            if (!v.isEntregue()) {
                vendaN.add(v);
            }
        }

        if (vendaN.isEmpty()) {
            this.pedidosPendentes = false;
            JOptionPane.showMessageDialog(rootPane, "Não existem pedidos a serem feitos", "Aviso!", JOptionPane.WARNING_MESSAGE);
            this.dispose();
            desabilitaBotoes();
            return;
        }

        this.pedidosPendentes = true;
        this.vendas = vendaN;
        setPedido(0);

    }

    private void setPedido(int num) {
        Venda venda = new Venda();
        venda = this.vendas.get(num);

        lbl_Responsavel.setText(venda.getComprador());
        lbl_Codigo.setText("" + venda.getCodigo());
        lbl_Data.setText(venda.getData());
        lbl_Hora.setText(venda.getHora());

        if (venda.getEntrega() != null) {
            lbl_Endereco.setText(venda.getEntrega().getEndereco());
            lbl_Numero.setText(venda.getEntrega().getNum());
            lbl_Telefone.setText(venda.getEntrega().getTelefone());
        }
        else{
            lbl_Endereco.setText("");
            lbl_Numero.setText("");
            lbl_Telefone.setText("");
        }
        adicionarTabela(venda.getProdutos());

    }

    private void adicionarTabela(ArrayList<Produto> produtos) {
        DecimalFormat df = new DecimalFormat("0.00");

        dtm.getDataVector().removeAllElements();
        this.repaint();

        for (Produto produ : produtos) {
            if (produ instanceof Lanche) {
                String repartir = (((Lanche) produ).isRepartir()) ? "Sim" : "Não";

                dtm.insertRow(dtm.getRowCount(), new Object[]{
                    produ.getNome(),
                    repartir,
                    ((Lanche) produ).getObservacao()
                });

            } else if (produ instanceof Bebida) {
                dtm.insertRow(dtm.getRowCount(), new Object[]{
                    produ.getNome(),
                    "-",
                    "-"
                });
            }

        }
        this.repaint();
    }

    private void desabilitaBotoes() {
        btn_Anterior.setEnabled(false);
        btn_Entregue.setEnabled(false);
        btn_Primeiro.setEnabled(false);
        btn_Proximo.setEnabled(false);
        btn_Ultimo.setEnabled(false);
    }

    private void habilitaBotoes() {
        btn_Anterior.setEnabled(true);
        btn_Primeiro.setEnabled(true);
        btn_Proximo.setEnabled(true);
        btn_Ultimo.setEnabled(true);
    }

    private void primeiro() {

        if (this.pedidosPendentes) {
            setPedido(0);
            btn_Anterior.setEnabled(false);
            btn_Primeiro.setEnabled(false);
            btn_Proximo.setEnabled(true);
            btn_Ultimo.setEnabled(true);
        }
    }

    private void anterior() {
        if (this.pedidosPendentes) {
            if (posicao() == 1 || posicao() == 0 ) {
                setPedido(0);
                btn_Anterior.setEnabled(false);
                btn_Primeiro.setEnabled(false);
                btn_Proximo.setEnabled(true);
                btn_Ultimo.setEnabled(true);
            } else {
                setPedido(posicao() - 1);
                btn_Anterior.setEnabled(true);
                btn_Primeiro.setEnabled(true);
                btn_Proximo.setEnabled(true);
                btn_Ultimo.setEnabled(true);
            }
        }
    }

    private void proximo() {
        if (this.pedidosPendentes) {
            if (posicao() == (this.vendas.size()-1) || posicao() == (this.vendas.size()-2)) {
                setPedido(this.vendas.size()-1);
                btn_Anterior.setEnabled(true);
                btn_Primeiro.setEnabled(true);
                btn_Proximo.setEnabled(false);
                btn_Ultimo.setEnabled(false);
            } else {
                setPedido(posicao() + 1);
                btn_Anterior.setEnabled(true);
                btn_Primeiro.setEnabled(true);
                btn_Proximo.setEnabled(true);
                btn_Ultimo.setEnabled(true);
            }
        }
    }

    private void ultimo() {
        if (this.pedidosPendentes) {
            setPedido(vendas.size() - 1);
            btn_Anterior.setEnabled(true);
            btn_Primeiro.setEnabled(true);
            btn_Proximo.setEnabled(false);
            btn_Ultimo.setEnabled(false);
        }
    }

    private int posicao() {
        int pos = 0;

        for (Venda v : this.vendas) {
            if (v.getComprador().equals(lbl_Responsavel.getText()) && v.getCodigo() == Integer.parseInt(lbl_Codigo.getText()) && v.getHora().equals(lbl_Hora.getText())) {
                pos = vendas.indexOf(v);
                break;
            }
        }
        return pos;
    }

}
