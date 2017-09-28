/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.view;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author francisco
 */
public class CadastroBebida extends javax.swing.JFrame {

    /**
     * Creates new form NovoJFrame
     */
    public CadastroBebida() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projetoec/imagens/images.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoDeBotão_Tamanho = new javax.swing.ButtonGroup();
        Painel_Bebidas = new javax.swing.JPanel();
        label_Refri = new javax.swing.JLabel();
        ComBox_Refri = new javax.swing.JComboBox<>();
        label_Titulo = new javax.swing.JLabel();
        label_Preco = new javax.swing.JLabel();
        txf_preco = new javax.swing.JTextField();
        btm_salvar = new javax.swing.JButton();
        btm_cancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Rbtn_tamanho1 = new javax.swing.JRadioButton();
        Rbtn_tamanho2 = new javax.swing.JRadioButton();
        Rbtn_tamanho3 = new javax.swing.JRadioButton();
        Rbtn_tamanho4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        Painel_Bebidas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        label_Refri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projetoec/imagens/Coca-Cola.png"))); // NOI18N

        ComBox_Refri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coca-Cola", "7Up", "Coca-Cola_Light", "Coca-Cola_Zero", "Fanta_Laranja", "Pepsi", "Sprite", "Suco", "Vita-Cola" }));

        label_Titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_Titulo.setText("CADASTRAR BEBIDA");

        label_Preco.setText("PREÇO R$");

        txf_preco.setText("0,00");

        btm_salvar.setText("SALVAR");

        btm_cancelar.setText("CANCELAR");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        GrupoDeBotão_Tamanho.add(Rbtn_tamanho1);
        Rbtn_tamanho1.setText("Lata");

        GrupoDeBotão_Tamanho.add(Rbtn_tamanho2);
        Rbtn_tamanho2.setText("600 ml");

        GrupoDeBotão_Tamanho.add(Rbtn_tamanho3);
        Rbtn_tamanho3.setText("1 L");

        GrupoDeBotão_Tamanho.add(Rbtn_tamanho4);
        Rbtn_tamanho4.setText("2 L");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rbtn_tamanho4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Rbtn_tamanho1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rbtn_tamanho3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rbtn_tamanho2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Rbtn_tamanho1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rbtn_tamanho2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rbtn_tamanho3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rbtn_tamanho4)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Painel_BebidasLayout = new javax.swing.GroupLayout(Painel_Bebidas);
        Painel_Bebidas.setLayout(Painel_BebidasLayout);
        Painel_BebidasLayout.setHorizontalGroup(
            Painel_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_BebidasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Painel_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Painel_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label_Titulo)
                        .addGroup(Painel_BebidasLayout.createSequentialGroup()
                            .addComponent(label_Preco)
                            .addGap(18, 18, 18)
                            .addComponent(txf_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Painel_BebidasLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(ComBox_Refri, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label_Refri, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Painel_BebidasLayout.createSequentialGroup()
                        .addComponent(btm_cancelar)
                        .addGap(32, 32, 32)
                        .addComponent(btm_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        Painel_BebidasLayout.setVerticalGroup(
            Painel_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel_BebidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Titulo)
                .addGroup(Painel_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel_BebidasLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel_BebidasLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(ComBox_Refri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Painel_BebidasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_Refri, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Painel_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Preco))
                .addGap(19, 19, 19)
                .addGroup(Painel_BebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm_salvar)
                    .addComponent(btm_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_Bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_Bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(CadastroBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroBebida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComBox_Refri;
    private javax.swing.ButtonGroup GrupoDeBotão_Tamanho;
    private javax.swing.JPanel Painel_Bebidas;
    private javax.swing.JRadioButton Rbtn_tamanho1;
    private javax.swing.JRadioButton Rbtn_tamanho2;
    private javax.swing.JRadioButton Rbtn_tamanho3;
    private javax.swing.JRadioButton Rbtn_tamanho4;
    private javax.swing.JButton btm_cancelar;
    private javax.swing.JButton btm_salvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_Preco;
    private javax.swing.JLabel label_Refri;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JTextField txf_preco;
    // End of variables declaration//GEN-END:variables


}