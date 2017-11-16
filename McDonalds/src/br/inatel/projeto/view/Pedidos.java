/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.view;


import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;

/**
 *
 * @author WesleyReis
 */
public class Pedidos extends javax.swing.JFrame {

    public Pedidos() {
        initComponents();

        
        this.setLocationRelativeTo(null);
        
        tbl_Pedidos.getColumnModel().getColumn(0).setPreferredWidth(130);
        tbl_Pedidos.getColumnModel().getColumn(1).setPreferredWidth(110);

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projeto/imagens/images.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Fundo = new javax.swing.JPanel();
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
        mnu_atualizar_pedidos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                "Produto", "Modificações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
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
            .addGroup(pnl_ProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_ProdutosLayout.setVerticalGroup(
            pnl_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_Fundo.add(pnl_Produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 850, -1));

        pnl_Botoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_Primeiro.setText("Primeiro");
        btn_Primeiro.setEnabled(false);

        btn_Anterior.setText("Anterior");
        btn_Anterior.setEnabled(false);

        btn_Proximo.setText("Próximo");

        btn_Ultimo.setText("Último");

        btn_Cancelar.setText("Cancelar");

        btn_Entregue.setText("Entregue");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(btn_Entregue)
                .addGap(18, 18, 18)
                .addComponent(btn_Cancelar)
                .addGap(26, 26, 26))
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

        pnl_Fundo.add(pnl_Botoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 850, -1));

        getContentPane().add(pnl_Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        jMenu1.setText("Pedidos");

        mnu_atualizar_pedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        mnu_atualizar_pedidos.setText("Atualizar Pedidos");
        jMenu1.add(mnu_atualizar_pedidos);

        mnu_Menu.add(jMenu1);

        setJMenuBar(mnu_Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Codigo;
    private javax.swing.JLabel lbl_Data;
    private javax.swing.JLabel lbl_Hora;
    private javax.swing.JLabel lbl_Responsavel;
    private javax.swing.JMenuBar mnu_Menu;
    private javax.swing.JMenuItem mnu_atualizar_pedidos;
    private javax.swing.JPanel pnl_Botoes;
    private javax.swing.JPanel pnl_Fundo;
    private javax.swing.JPanel pnl_Informacoes;
    private javax.swing.JPanel pnl_Produtos;
    private javax.swing.JTable tbl_Pedidos;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_Anterior() {
        return btn_Anterior;
    }

    public JButton getBtn_Cancelar() {
        return btn_Cancelar;
    }

    public JButton getBtn_Entregue() {
        return btn_Entregue;
    }

    public JButton getBtn_Primeiro() {
        return btn_Primeiro;
    }

    public JButton getBtn_Proximo() {
        return btn_Proximo;
    }

    public JButton getBtn_Ultimo() {
        return btn_Ultimo;
    }

  
    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JLabel getLbl_Codigo() {
        return lbl_Codigo;
    }

    public JLabel getLbl_Data() {
        return lbl_Data;
    }

    public JLabel getLbl_Hora() {
        return lbl_Hora;
    }


    public JLabel getLbl_Responsavel() {
        return lbl_Responsavel;
    }

    public JMenuBar getMnu_Menu() {
        return mnu_Menu;
    }

    public JMenuItem getMnu_atualizar_pedidos() {
        return mnu_atualizar_pedidos;
    }

    public JPanel getPnl_Botoes() {
        return pnl_Botoes;
    }

    public JPanel getPnl_Fundo() {
        return pnl_Fundo;
    }

    public JPanel getPnl_Informacoes() {
        return pnl_Informacoes;
    }

    public JPanel getPnl_Produtos() {
        return pnl_Produtos;
    }

    public JTable getTbl_Pedidos() {
        return tbl_Pedidos;
    }

    
}
