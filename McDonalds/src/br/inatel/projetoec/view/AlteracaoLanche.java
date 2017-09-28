/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.view;


import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author WesleyReis
 */
public class AlteracaoLanche extends javax.swing.JFrame {

 // array contendo os ingredientes selecionados dos lanches   
    private ArrayList<JCheckBox> botoes = new ArrayList<>();
    
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Ingredientes = new javax.swing.JPanel();
        ckb_Ingrediente1 = new javax.swing.JCheckBox();
        ckb_Ingrediente2 = new javax.swing.JCheckBox();
        ckb_Ingrediente3 = new javax.swing.JCheckBox();
        ckb_Ingrediente4 = new javax.swing.JCheckBox();
        ckb_Ingrediente5 = new javax.swing.JCheckBox();
        ckb_Ingrediente6 = new javax.swing.JCheckBox();
        ckb_Ingrediente13 = new javax.swing.JCheckBox();
        ckb_Ingrediente14 = new javax.swing.JCheckBox();
        ckb_Ingrediente15 = new javax.swing.JCheckBox();
        ckb_Ingrediente16 = new javax.swing.JCheckBox();
        ckb_Ingrediente17 = new javax.swing.JCheckBox();
        ckb_Ingrediente18 = new javax.swing.JCheckBox();
        ckb_Ingrediente19 = new javax.swing.JCheckBox();
        ckb_Ingrediente20 = new javax.swing.JCheckBox();
        ckb_Ingrediente8 = new javax.swing.JCheckBox();
        ckb_Ingrediente9 = new javax.swing.JCheckBox();
        ckb_Ingrediente7 = new javax.swing.JCheckBox();
        ckb_Ingrediente21 = new javax.swing.JCheckBox();
        ckb_Ingrediente10 = new javax.swing.JCheckBox();
        ckb_Ingrediente22 = new javax.swing.JCheckBox();
        ckb_Ingrediente23 = new javax.swing.JCheckBox();
        ckb_Ingrediente24 = new javax.swing.JCheckBox();
        ckb_Ingrediente11 = new javax.swing.JCheckBox();
        ckb_Ingrediente12 = new javax.swing.JCheckBox();
        pnl_Opcoes = new javax.swing.JPanel();
        ckb_Repartir = new javax.swing.JCheckBox();
        btn_Finalizar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opções Lanches");
        setAlwaysOnTop(true);
        setModalExclusionType(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Ingredientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingredientes"));
        pnl_Ingredientes.setPreferredSize(new java.awt.Dimension(507, 180));
        pnl_Ingredientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ckb_Ingrediente1.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));

        ckb_Ingrediente2.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 16, -1, -1));

        ckb_Ingrediente3.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 16, -1, -1));

        ckb_Ingrediente4.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 16, -1, -1));

        ckb_Ingrediente5.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, -1, -1));

        ckb_Ingrediente6.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 42, -1, -1));

        ckb_Ingrediente13.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, -1, -1));

        ckb_Ingrediente14.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente14, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 97, -1, -1));

        ckb_Ingrediente15.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente15, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 97, -1, -1));

        ckb_Ingrediente16.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente16, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 97, -1, -1));

        ckb_Ingrediente17.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 123, -1, -1));

        ckb_Ingrediente18.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente18, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 123, -1, -1));

        ckb_Ingrediente19.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente19, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 123, -1, -1));

        ckb_Ingrediente20.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente20, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 123, -1, -1));

        ckb_Ingrediente8.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente8, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 42, -1, -1));

        ckb_Ingrediente9.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, -1, -1));

        ckb_Ingrediente7.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente7, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 42, -1, -1));

        ckb_Ingrediente21.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente21, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, -1, -1));

        ckb_Ingrediente10.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente10, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 70, -1, -1));

        ckb_Ingrediente22.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente22, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 149, -1, -1));

        ckb_Ingrediente23.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente23, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 149, -1, -1));

        ckb_Ingrediente24.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente24, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 149, -1, -1));

        ckb_Ingrediente11.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente11, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 70, -1, -1));

        ckb_Ingrediente12.setText("jCheckBox1");
        pnl_Ingredientes.add(ckb_Ingrediente12, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 68, -1, 26));

        getContentPane().add(pnl_Ingredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 170));

        pnl_Opcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));
        pnl_Opcoes.setLayout(null);

        ckb_Repartir.setText("Repartir");
        pnl_Opcoes.add(ckb_Repartir);
        ckb_Repartir.setBounds(10, 30, 90, 23);

        btn_Finalizar.setText("Finalizar");
        pnl_Opcoes.add(btn_Finalizar);
        btn_Finalizar.setBounds(290, 20, 84, 34);

        btn_Cancelar.setText("Cancelar");
        pnl_Opcoes.add(btn_Cancelar);
        btn_Cancelar.setBounds(400, 20, 84, 34);

        getContentPane().add(pnl_Opcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 507, 70));

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
            java.util.logging.Logger.getLogger(AlteracaoLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlteracaoLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlteracaoLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlteracaoLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlteracaoLanche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Finalizar;
    private javax.swing.JCheckBox ckb_Ingrediente1;
    private javax.swing.JCheckBox ckb_Ingrediente10;
    private javax.swing.JCheckBox ckb_Ingrediente11;
    private javax.swing.JCheckBox ckb_Ingrediente12;
    private javax.swing.JCheckBox ckb_Ingrediente13;
    private javax.swing.JCheckBox ckb_Ingrediente14;
    private javax.swing.JCheckBox ckb_Ingrediente15;
    private javax.swing.JCheckBox ckb_Ingrediente16;
    private javax.swing.JCheckBox ckb_Ingrediente17;
    private javax.swing.JCheckBox ckb_Ingrediente18;
    private javax.swing.JCheckBox ckb_Ingrediente19;
    private javax.swing.JCheckBox ckb_Ingrediente2;
    private javax.swing.JCheckBox ckb_Ingrediente20;
    private javax.swing.JCheckBox ckb_Ingrediente21;
    private javax.swing.JCheckBox ckb_Ingrediente22;
    private javax.swing.JCheckBox ckb_Ingrediente23;
    private javax.swing.JCheckBox ckb_Ingrediente24;
    private javax.swing.JCheckBox ckb_Ingrediente3;
    private javax.swing.JCheckBox ckb_Ingrediente4;
    private javax.swing.JCheckBox ckb_Ingrediente5;
    private javax.swing.JCheckBox ckb_Ingrediente6;
    private javax.swing.JCheckBox ckb_Ingrediente7;
    private javax.swing.JCheckBox ckb_Ingrediente8;
    private javax.swing.JCheckBox ckb_Ingrediente9;
    private javax.swing.JCheckBox ckb_Repartir;
    private javax.swing.JPanel pnl_Ingredientes;
    private javax.swing.JPanel pnl_Opcoes;
    // End of variables declaration//GEN-END:variables

}