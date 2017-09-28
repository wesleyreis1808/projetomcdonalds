/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.view;

import br.inatel.projetoec.model.ArquivoBebidas;
import br.inatel.projetoec.model.ArquivoIngrediente;
import br.inatel.projetoec.model.ArquivoLanche;
import br.inatel.projetoec.model.Bebida;
import br.inatel.projetoec.model.Ingrediente;
import br.inatel.projetoec.model.Lanche;
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
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private List<Lanche> lanches = new ArrayList<>();
    private List<Bebida> bebidas = new ArrayList<>();
    private DefaultListModel dlm1 = new DefaultListModel();
    private DefaultListModel dlm2 = new DefaultListModel();
    private DefaultListModel dlm3 = new DefaultListModel();

    public Remove() {
        initComponents();
        this.setLocationRelativeTo(null);

        prencheListaIngrediente();
        prencheListaLanche();
        prencheListaBebida();
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

        lista_lanche.setModel(dlm2);
        lista_lanche.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lista_lanche);

        painel_Lanche.add(jScrollPane3);
        jScrollPane3.setBounds(10, 51, 258, 161);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Remover Lanche");
        painel_Lanche.add(jLabel2);
        jLabel2.setBounds(10, 11, 152, 22);

        btm_removerLanche.setText("REMOVER");
        btm_removerLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_removerLancheActionPerformed(evt);
            }
        });
        painel_Lanche.add(btm_removerLanche);
        btm_removerLanche.setBounds(10, 230, 130, 23);

        jTabbedPane1.addTab("Lanche", painel_Lanche);

        painel_bebida.setLayout(null);

        lista_bebida.setModel(dlm3);
        lista_bebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_bebidaMouseClicked(evt);
            }
        });
        lista_bebida.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lista_bebidaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lista_bebida);

        painel_bebida.add(jScrollPane2);
        jScrollPane2.setBounds(10, 51, 258, 161);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Remover Bebida");
        painel_bebida.add(jLabel1);
        jLabel1.setBounds(10, 11, 147, 22);

        btm_removeBebida.setText("REMOVER");
        btm_removeBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_removeBebidaActionPerformed(evt);
            }
        });
        painel_bebida.add(btm_removeBebida);
        btm_removeBebida.setBounds(10, 230, 130, 23);

        painel_tamanho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TAMANHO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup1.add(Rbtn_tamanho4);
        Rbtn_tamanho4.setText("2 L");

        buttonGroup1.add(Rbtn_tamanho3);
        Rbtn_tamanho3.setText("1 L");
        Rbtn_tamanho3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_tamanho3ActionPerformed(evt);
            }
        });

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

        lista_ingrediente.setModel(dlm1);
        jScrollPane1.setViewportView(lista_ingrediente);

        painel_ingrediente.add(jScrollPane1);
        jScrollPane1.setBounds(10, 51, 258, 160);

        lebel_titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lebel_titulo.setText("Remover Ingrediente");
        painel_ingrediente.add(lebel_titulo);
        lebel_titulo.setBounds(10, 11, 194, 22);

        btm_remover.setText("REMOVER");
        btm_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_removerActionPerformed(evt);
            }
        });
        painel_ingrediente.add(btm_remover);
        btm_remover.setBounds(10, 229, 120, 23);

        jTabbedPane1.addTab("Ingredientes", painel_ingrediente);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rbtn_tamanho3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_tamanho3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rbtn_tamanho3ActionPerformed

    private void lista_bebidaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lista_bebidaValueChanged

    }//GEN-LAST:event_lista_bebidaValueChanged

    private void btm_removeBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_removeBebidaActionPerformed

        try {
            if (bebidas.isEmpty()) {
                return;
            }
            if (JOptionPane.showConfirmDialog(rootPane, "DESEJA REMOVER??") == 0) {
                removeBebida();
                prencheListaBebida();
            }

        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(rootPane, " LISTA VAZIA ");
        }
    }//GEN-LAST:event_btm_removeBebidaActionPerformed

    private void lista_bebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_bebidaMouseClicked
        ArquivoBebidas a3 = new ArquivoBebidas();
        this.bebidas = a3.resgatarArquivo();

        Bebida b1 = bebidas.get(lista_bebida.getSelectedIndex());
        if (b1.getTamanho().contains("Lata")) {
            Rbtn_tamanho1.setSelected(true);
        } else if (b1.getTamanho().contains("600 ml")) {
            Rbtn_tamanho2.setSelected(true);
        } else if (b1.getTamanho().contains("1 L")) {
            Rbtn_tamanho3.setSelected(true);
        } else if (b1.getTamanho().contains("2 L")) {
            Rbtn_tamanho4.setSelected(true);
        }
    }//GEN-LAST:event_lista_bebidaMouseClicked

    private void btm_removerLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_removerLancheActionPerformed

        try {
            if (lanches.isEmpty()) {
                return;

            }
            if (JOptionPane.showConfirmDialog(rootPane, "DESEJA REMOVER??") == 0) {
                removeLanche();
                prencheListaLanche();

            }
        } catch (ArrayIndexOutOfBoundsException b) {
            JOptionPane.showMessageDialog(rootPane, " LISTA VAZIA ");
        }


    }//GEN-LAST:event_btm_removerLancheActionPerformed

    private void btm_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_removerActionPerformed
        if (!verificaUtilizacao()) {
            try {
                if (ingredientes.isEmpty()) {
                    return;
                }
                if (JOptionPane.showConfirmDialog(rootPane, "DESEJA REMOVER??") == 0) {
                    removeIngrediente();
                    prencheListaIngrediente();
                }

            } catch (ArrayIndexOutOfBoundsException c) {
                JOptionPane.showMessageDialog(rootPane, " LISTA VAZIA ");
                c.printStackTrace();
            }
        }

    }//GEN-LAST:event_btm_removerActionPerformed

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

    private void prencheListaIngrediente() {

        dlm1.clear();
        this.repaint();
        ArquivoIngrediente a1 = new ArquivoIngrediente();
        this.ingredientes = a1.resgatarArquivo();
        for (int i = 0; i < ingredientes.size(); i++) {
            dlm1.add(i, ingredientes.get(i).getNome());
        }

    }

    private void prencheListaLanche() {

        dlm2.clear();
        this.repaint();
        ArquivoLanche a2 = new ArquivoLanche();
        this.lanches = a2.resgatarArquivo();
        for (int i = 0; i < lanches.size(); i++) {
            dlm2.add(i, lanches.get(i).getNome());
        }

    }

    private void prencheListaBebida() {

        dlm3.clear();
        this.repaint();
        ArquivoBebidas a3 = new ArquivoBebidas();
        this.bebidas = a3.resgatarArquivo();
        for (int i = 0; i < bebidas.size(); i++) {
            dlm3.add(i, bebidas.get(i).getNome());
        }

    }

    private void removeLanche() {

        ArquivoLanche a2 = new ArquivoLanche();
        this.lanches = a2.resgatarArquivo();

        Lanche l1 = lanches.get(lista_lanche.getSelectedIndex());
        this.lanches.remove(l1);
        a2.salvarArquivo((ArrayList) this.lanches, false);

    }

    private void removeBebida() {

        ArquivoBebidas a3 = new ArquivoBebidas();
        this.bebidas = a3.resgatarArquivo();

        Bebida b1 = bebidas.get(lista_bebida.getSelectedIndex());
        this.bebidas.remove(b1);
        a3.salvarArquivo((ArrayList) this.bebidas, false);

    }

    private void removeIngrediente() {

        ArquivoIngrediente a1 = new ArquivoIngrediente();
        this.ingredientes = a1.resgatarArquivo();

        Ingrediente i1 = ingredientes.get(lista_ingrediente.getSelectedIndex());
        this.ingredientes.remove(i1);
        a1.salvarArquivo((ArrayList) this.ingredientes, false);

    }

    private boolean verificaUtilizacao() {
        for (Lanche lan : this.lanches) {

            for (Ingrediente ing : lan.getIngredientes()) {
                if (ing.getNome().equals(ingredientes.get(lista_ingrediente.getSelectedIndex()).getNome())) {
                    JOptionPane.showMessageDialog(rootPane, "Ingrediente não pode ser removido!\nO lanche "
                            + lan.getNome() + " possui esse ingrediente.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return true;
                }
            }
        }
        return false;
    }

}
