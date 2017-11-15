/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.view;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

/**
 *
 * @author WesleyReis
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Inicial() {
        initComponents();
        this.setLocationRelativeTo(null);

        setIcon();

        ImageIcon img = new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\telaFundo.png");
        img.setImage(img.getImage().getScaledInstance(617, 447, 100));

        lbl_imagem.setIcon(img);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_imagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnu_Vendas = new javax.swing.JMenuItem();
        mnu_Pedidos = new javax.swing.JMenuItem();
        mnu_historico = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnu_cadastro_ingredientes = new javax.swing.JMenuItem();
        mnu_cadastro_lanches = new javax.swing.JMenuItem();
        mnu_cadastro_bebidas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mnu_remover_cadastros = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mnu_cadastroFuncionario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnu_alterar_imagem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MnuSair = new javax.swing.JMenuItem();
        mnu_sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lbl_imagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jMenu1.setText("Venda");

        mnu_Vendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        mnu_Vendas.setText("Vendas");
        jMenu1.add(mnu_Vendas);

        mnu_Pedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnu_Pedidos.setText("Pedidos");
        jMenu1.add(mnu_Pedidos);

        mnu_historico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mnu_historico.setText("Histórico");
        jMenu1.add(mnu_historico);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Cadastro");

        mnu_cadastro_ingredientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mnu_cadastro_ingredientes.setText("Cadastro de Ingredientes");
        jMenu3.add(mnu_cadastro_ingredientes);

        mnu_cadastro_lanches.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnu_cadastro_lanches.setText("Cadastro de Lanches");
        jMenu3.add(mnu_cadastro_lanches);

        mnu_cadastro_bebidas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mnu_cadastro_bebidas.setText("Cadastro de Bebidas");
        jMenu3.add(mnu_cadastro_bebidas);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Remover");

        mnu_remover_cadastros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnu_remover_cadastros.setText("Remover Ingredientes");
        jMenu6.add(mnu_remover_cadastros);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Funcionários");

        mnu_cadastroFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mnu_cadastroFuncionario.setText("Cadastro de Funcionários");
        jMenu7.add(mnu_cadastroFuncionario);

        jMenuBar1.add(jMenu7);

        jMenu4.setText("Ferramentas");

        mnu_alterar_imagem.setText("Image Tela Principal");
        jMenu4.add(mnu_alterar_imagem);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Ajuda");

        MnuSair.setText("Sair");
        jMenu2.add(MnuSair);

        mnu_sobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        mnu_sobre.setText("Sobre");
        jMenu2.add(mnu_sobre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_imagem, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_imagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
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
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/

            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnuSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_imagem;
    private javax.swing.JMenuItem mnu_Pedidos;
    private javax.swing.JMenuItem mnu_Vendas;
    private javax.swing.JMenuItem mnu_alterar_imagem;
    private javax.swing.JMenuItem mnu_cadastroFuncionario;
    private javax.swing.JMenuItem mnu_cadastro_bebidas;
    private javax.swing.JMenuItem mnu_cadastro_ingredientes;
    private javax.swing.JMenuItem mnu_cadastro_lanches;
    private javax.swing.JMenuItem mnu_historico;
    private javax.swing.JMenuItem mnu_remover_cadastros;
    private javax.swing.JMenuItem mnu_sobre;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projeto/imagens/images.png")));
    }

    //==================================== gets e sets

    public JLabel getLbl_imagem() {
        return lbl_imagem;
    }

    public JMenuItem getMnu_Pedidos() {
        return mnu_Pedidos;
    }

    public JMenuItem getMnu_cadastroFuncionario() {
        return mnu_cadastroFuncionario;
    }

    public JMenuItem getMnu_Vendas() {
        return mnu_Vendas;
    }

    public JMenuItem getMnu_alterar_imagem() {
        return mnu_alterar_imagem;
    }

    public JMenuItem getMnuSair() {
        return MnuSair;
    }

    public void setMnuSair(JMenuItem MnuSair) {
        this.MnuSair = MnuSair;
    }

    public JMenuItem getMnu_cadastro_bebidas() {
        return mnu_cadastro_bebidas;
    }

    public JMenuItem getMnu_cadastro_ingredientes() {
        return mnu_cadastro_ingredientes;
    }

    public JMenuItem getMnu_cadastro_lanches() {
        return mnu_cadastro_lanches;
    }

    public JMenuItem getMnu_historico() {
        return mnu_historico;
    }

    public JMenuItem getMnu_remover_cadastros() {
        return mnu_remover_cadastros;
    }

    public JMenuItem getMnu_sobre() {
        return mnu_sobre;
    }
    
    

}
