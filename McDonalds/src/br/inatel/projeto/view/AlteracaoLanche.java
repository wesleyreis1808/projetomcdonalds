/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.view;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author WesleyReis
 */
public class AlteracaoLanche extends javax.swing.JFrame {

    // array contendo os ingredientes selecionados dos lanches   
    private ArrayList<JCheckBox> botoes = new ArrayList<>();

    public AlteracaoLanche(){
        initComponents();
        
        insereBotoes();

    }

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

        pnl_Opcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_Opcoes.setLayout(null);

        btn_Finalizar.setText("Finalizar");
        pnl_Opcoes.add(btn_Finalizar);
        btn_Finalizar.setBounds(290, 20, 84, 34);

        btn_Cancelar.setText("Cancelar");
        pnl_Opcoes.add(btn_Cancelar);
        btn_Cancelar.setBounds(400, 20, 84, 34);

        getContentPane().add(pnl_Opcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 507, 70));
        pnl_Opcoes.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel pnl_Ingredientes;
    private javax.swing.JPanel pnl_Opcoes;
    // End of variables declaration//GEN-END:variables

    private void insereBotoes() {
        botoes.add(this.ckb_Ingrediente1);
        botoes.add(this.ckb_Ingrediente2);
        botoes.add(this.ckb_Ingrediente3);
        botoes.add(this.ckb_Ingrediente4);
        botoes.add(this.ckb_Ingrediente5);
        botoes.add(this.ckb_Ingrediente6);
        botoes.add(this.ckb_Ingrediente7);
        botoes.add(this.ckb_Ingrediente8);
        botoes.add(this.ckb_Ingrediente9);
        botoes.add(this.ckb_Ingrediente10);
        botoes.add(this.ckb_Ingrediente11);
        botoes.add(this.ckb_Ingrediente12);
        botoes.add(this.ckb_Ingrediente13);
        botoes.add(this.ckb_Ingrediente14);
        botoes.add(this.ckb_Ingrediente15);
        botoes.add(this.ckb_Ingrediente16);
        botoes.add(this.ckb_Ingrediente17);
        botoes.add(this.ckb_Ingrediente18);
        botoes.add(this.ckb_Ingrediente19);
        botoes.add(this.ckb_Ingrediente20);
        botoes.add(this.ckb_Ingrediente21);
        botoes.add(this.ckb_Ingrediente22);
        botoes.add(this.ckb_Ingrediente23);
        botoes.add(this.ckb_Ingrediente24);
    }

    public ArrayList<JCheckBox> getBotoes() {
        return botoes;
    }

    public void setBotoes(ArrayList<JCheckBox> botoes) {
        this.botoes = botoes;
    }

    public JButton getBtn_Cancelar() {
        return btn_Cancelar;
    }

    public void setBtn_Cancelar(JButton btn_Cancelar) {
        this.btn_Cancelar = btn_Cancelar;
    }

    public JButton getBtn_Finalizar() {
        return btn_Finalizar;
    }

    public void setBtn_Finalizar(JButton btn_Finalizar) {
        this.btn_Finalizar = btn_Finalizar;
    }

}
