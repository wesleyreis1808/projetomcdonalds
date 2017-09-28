/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.view;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author aluno
 */
public class Remove extends javax.swing.JFrame {

    /**
     * Creates new form Remove
     */
    public Remove() {
        initComponents();
        this.setLocationRelativeTo(null);

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projetoec/imagens/images.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painel_Lanche = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista_lanche = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        btm_removerLanche = new javax.swing.JButton();
        painel_bebida = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_bebida = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        btm_removeBebida = new javax.swing.JButton();
        painel_tamanho = new javax.swing.JPanel();
        Rbtn_tamanho4 = new javax.swing.JRadioButton();
        Rbtn_tamanho3 = new javax.swing.JRadioButton();
        Rbtn_tamanho2 = new javax.swing.JRadioButton();
        Rbtn_tamanho1 = new javax.swing.JRadioButton();
        painel_ingrediente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_ingrediente = new javax.swing.JList();
        lebel_titulo = new javax.swing.JLabel();
        btm_remover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel_Lanche.setLayout(null);

        lista_lanche.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lista_lanche);

        painel_Lanche.add(jScrollPane3);
        jScrollPane3.setBounds(10, 51, 258, 161);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Remover Lanche");
        painel_Lanche.add(jLabel2);
        jLabel2.setBounds(10, 11, 152, 22);

        btm_removerLanche.setText("REMOVER");
        painel_Lanche.add(btm_removerLanche);
        btm_removerLanche.setBounds(10, 230, 130, 23);

        jTabbedPane1.addTab("Lanche", painel_Lanche);

        painel_bebida.setLayout(null);

        jScrollPane2.setViewportView(lista_bebida);

        painel_bebida.add(jScrollPane2);
        jScrollPane2.setBounds(10, 51, 258, 161);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Remover Bebida");
        painel_bebida.add(jLabel1);
        jLabel1.setBounds(10, 11, 147, 22);

        btm_removeBebida.setText("REMOVER");
        painel_bebida.add(btm_removeBebida);
        btm_removeBebida.setBounds(10, 230, 130, 23);

        painel_tamanho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TAMANHO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup1.add(Rbtn_tamanho4);
        Rbtn_tamanho4.setText("2 L");

        buttonGroup1.add(Rbtn_tamanho3);
        Rbtn_tamanho3.setText("1 L");

        buttonGroup1.add(Rbtn_tamanho2);
        Rbtn_tamanho2.setText("600 ml");

        buttonGroup1.add(Rbtn_tamanho1);
        Rbtn_tamanho1.setText("Lata");

        javax.swing.GroupLayout painel_tamanhoLayout = new javax.swing.GroupLayout(painel_tamanho);
        painel_tamanho.setLayout(painel_tamanhoLayout);
        painel_tamanhoLayout.setHorizontalGroup(
            painel_tamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_tamanhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_tamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rbtn_tamanho2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rbtn_tamanho3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rbtn_tamanho4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel_tamanhoLayout.createSequentialGroup()
                        .addComponent(Rbtn_tamanho1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel_tamanhoLayout.setVerticalGroup(
            painel_tamanhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_tamanhoLayout.createSequentialGroup()
                .addComponent(Rbtn_tamanho1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rbtn_tamanho2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rbtn_tamanho3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rbtn_tamanho4)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        painel_bebida.add(painel_tamanho);
        painel_tamanho.setBounds(274, 51, 110, 160);

        jTabbedPane1.addTab("Bebidas", painel_bebida);

        painel_ingrediente.setLayout(null);

        jScrollPane1.setViewportView(lista_ingrediente);

        painel_ingrediente.add(jScrollPane1);
        jScrollPane1.setBounds(10, 51, 258, 160);

        lebel_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lebel_titulo.setText("Remover Ingrediente");
        painel_ingrediente.add(lebel_titulo);
        lebel_titulo.setBounds(10, 11, 194, 22);

        btm_remover.setText("REMOVER");
        painel_ingrediente.add(btm_remover);
        btm_remover.setBounds(10, 229, 120, 23);

        jTabbedPane1.addTab("Ingredientes", painel_ingrediente);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 300));

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
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rbtn_tamanho1;
    private javax.swing.JRadioButton Rbtn_tamanho2;
    private javax.swing.JRadioButton Rbtn_tamanho3;
    private javax.swing.JRadioButton Rbtn_tamanho4;
    private javax.swing.JButton btm_removeBebida;
    private javax.swing.JButton btm_remover;
    private javax.swing.JButton btm_removerLanche;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lebel_titulo;
    private javax.swing.JList lista_bebida;
    private javax.swing.JList lista_ingrediente;
    private javax.swing.JList lista_lanche;
    private javax.swing.JPanel painel_Lanche;
    private javax.swing.JPanel painel_bebida;
    private javax.swing.JPanel painel_ingrediente;
    private javax.swing.JPanel painel_tamanho;
    // End of variables declaration//GEN-END:variables

    

}
