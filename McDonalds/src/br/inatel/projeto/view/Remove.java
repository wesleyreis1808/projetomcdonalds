/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.view;

import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
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

        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projeto/imagens/images.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painel_ingrediente = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_ingrediente = new javax.swing.JList();
        lebel_titulo = new javax.swing.JLabel();
        btm_removeIngredientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel_ingrediente.setLayout(null);

        jScrollPane1.setViewportView(lista_ingrediente);

        painel_ingrediente.add(jScrollPane1);
        jScrollPane1.setBounds(10, 51, 258, 160);

        lebel_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lebel_titulo.setText("Remover Ingrediente");
        painel_ingrediente.add(lebel_titulo);
        lebel_titulo.setBounds(10, 11, 194, 22);

        btm_removeIngredientes.setText("REMOVER");
        painel_ingrediente.add(btm_removeIngredientes);
        btm_removeIngredientes.setBounds(10, 230, 130, 23);

        jTabbedPane1.addTab("Ingredientes", painel_ingrediente);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

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
    private javax.swing.JButton btm_removeIngredientes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lebel_titulo;
    private javax.swing.JList lista_ingrediente;
    private javax.swing.JPanel painel_ingrediente;
    // End of variables declaration//GEN-END:variables



    public JButton getBtm_removeIngredientes() {
        return btm_removeIngredientes;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

  

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

   

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public JLabel getLebel_titulo() {
        return lebel_titulo;
    }

   

    public JList getLista_ingrediente() {
        return lista_ingrediente;
    }



    public JPanel getPainel_ingrediente() {
        return painel_ingrediente;
    }

    

}
