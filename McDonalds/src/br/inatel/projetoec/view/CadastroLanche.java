/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.view;

import br.inatel.projetoec.model.ArquivoIngrediente;
import br.inatel.projetoec.model.ArquivoLanche;
import br.inatel.projetoec.model.Ingrediente;
import br.inatel.projetoec.model.Lanche;
import java.awt.Toolkit;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javafx.stage.FileChooser;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author francisco
 */
public class CadastroLanche extends javax.swing.JFrame {

    private List<Ingrediente> ingredientes = new ArrayList<>();
    private List<Ingrediente> ingredientesS = new ArrayList<>();
    private DefaultListModel dlm1 = new DefaultListModel();
    private DefaultListModel dlm2 = new DefaultListModel();

    public CadastroLanche() {

        initComponents();
        prencheLista();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projetoec/imagens/images.png")));
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_cadastro = new javax.swing.JPanel();
        btm_salvar = new javax.swing.JButton();
        btm_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_ingredientes = new javax.swing.JList<>();
        btm_adicionar = new javax.swing.JButton();
        txf_preco = new javax.swing.JTextField();
        label_preco = new javax.swing.JLabel();
        label_ingredientes = new javax.swing.JLabel();
        txf_nome = new javax.swing.JTextField();
        label_nome = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_lanche = new javax.swing.JList<>();
        label_lanche = new javax.swing.JLabel();
        label_imagem = new javax.swing.JLabel();
        btm_imagem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btm_remover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        painel_cadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painel_cadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btm_salvar.setText("SALVAR");
        btm_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_salvarActionPerformed(evt);
            }
        });
        painel_cadastro.add(btm_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        btm_cancelar.setText("CANCELAR");
        btm_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_cancelarActionPerformed(evt);
            }
        });
        painel_cadastro.add(btm_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        lista_ingredientes.setModel(dlm1);
        lista_ingredientes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lista_ingredientesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lista_ingredientes);

        painel_cadastro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 210, -1));

        btm_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projetoec/imagens/right-arrow.png"))); // NOI18N
        btm_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_adicionarActionPerformed(evt);
            }
        });
        painel_cadastro.add(btm_adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 110, -1));

        txf_preco.setText("0,00 ");
        txf_preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_precoActionPerformed(evt);
            }
        });
        painel_cadastro.add(txf_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 164, -1));

        label_preco.setText("PREÇO R$");
        painel_cadastro.add(label_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        label_ingredientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_ingredientes.setText("INGREDIENTES");
        painel_cadastro.add(label_ingredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        painel_cadastro.add(txf_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 164, -1));

        label_nome.setText("NOME");
        painel_cadastro.add(label_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, -1));

        lista_lanche.setModel(dlm2);
        jScrollPane2.setViewportView(lista_lanche);

        painel_cadastro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 210, -1));

        label_lanche.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_lanche.setText("LANCHE");
        painel_cadastro.add(label_lanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));
        painel_cadastro.add(label_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 90, -1, 100));

        btm_imagem.setText("IMAGEM");
        btm_imagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_imagemActionPerformed(evt);
            }
        });
        painel_cadastro.add(btm_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE LANCHES");
        painel_cadastro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btm_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projetoec/imagens/left-pointing-arrow.png"))); // NOI18N
        btm_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_removerActionPerformed(evt);
            }
        });
        painel_cadastro.add(btm_remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txf_precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_precoActionPerformed

    private void btm_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_salvarActionPerformed

        float precoLanche;
        String valor = txf_preco.getText();
        valor = valor.replace(",", ".");
        try {
            precoLanche = (float) Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Preço Inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!txf_nome.getText().equals("")) {
            if (precoLanche > 0) {

                if (!ingredientesS.isEmpty()) {

                    salvar();
                    JOptionPane.showMessageDialog(rootPane, "SALVO COM SUCESSO",
                            "AVISO", JOptionPane.PLAIN_MESSAGE);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(rootPane, "INGREDIENTE NÃO SELICIONADO",
                            "AVISO", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "PREÇO " + valor + " É INVALIDO",
                        "AVISO", JOptionPane.ERROR_MESSAGE);

            }
        } else {

            JOptionPane.showMessageDialog(rootPane, "CAMPO DE NOME VAZIO",
                    "AVISO", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_btm_salvarActionPerformed


    private void lista_ingredientesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lista_ingredientesValueChanged


    }//GEN-LAST:event_lista_ingredientesValueChanged

    private void btm_imagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_imagemActionPerformed

        JFileChooser chooser = new JFileChooser();//cria uma instancia do JFileChooser
        //filtro para as imagend
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG & GIF & PNG Images", "jpg", "gif", "png");
        //altera o filtro
        chooser.setFileFilter(filtro);

        String local;
        //localização padrão ("sem imagem")
        local = "C:\\Users\\francisco\\Documents\\NetBeansProjects\\projetoEc\\build\\classes\\Imagens\\sem_imagem.png";

        int returnVal = chooser.showOpenDialog(label_imagem);//abre JFileChooser
        if (returnVal == JFileChooser.APPROVE_OPTION) {//verifica se clicou em ok
            local = (chooser.getSelectedFile().getAbsolutePath());//local recebe a localização da imagem           
        }

        label_imagem.setIcon(new javax.swing.ImageIcon(local));//mudar o icone do label


    }//GEN-LAST:event_btm_imagemActionPerformed

    private void btm_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_adicionarActionPerformed

        adicionaArray(lista_ingredientes.getSelectedIndex());

    }//GEN-LAST:event_btm_adicionarActionPerformed

    private void btm_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_removerActionPerformed

        try {
            removeArray(lista_lanche.getSelectedIndex());
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "NENHUM INGREDIENTE NA LISTA");
        }

    }//GEN-LAST:event_btm_removerActionPerformed

    private void btm_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btm_cancelarActionPerformed

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLanche().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_adicionar;
    private javax.swing.JButton btm_cancelar;
    private javax.swing.JButton btm_imagem;
    private javax.swing.JButton btm_remover;
    private javax.swing.JButton btm_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_imagem;
    private javax.swing.JLabel label_ingredientes;
    private javax.swing.JLabel label_lanche;
    private javax.swing.JLabel label_nome;
    private javax.swing.JLabel label_preco;
    private javax.swing.JList<String> lista_ingredientes;
    private javax.swing.JList<String> lista_lanche;
    private javax.swing.JPanel painel_cadastro;
    private javax.swing.JTextField txf_nome;
    private javax.swing.JTextField txf_preco;
    // End of variables declaration//GEN-END:variables

    private void prencheLista() {

        ArquivoIngrediente a1 = new ArquivoIngrediente();
        this.ingredientes = a1.resgatarArquivo();
        for (int i = 0; i < ingredientes.size(); i++) {
            dlm1.add(i, ingredientes.get(i).getNome());
        }

    }

    private void adicionaArray(int num) {

        ingredientesS.add(this.ingredientes.get(num));
        prencheLista2();
    }

    private void removeArray(int num) {

        ingredientesS.remove(this.ingredientesS.get(num));
        prencheLista2();

    }

    private void prencheLista2() {
        dlm2.clear();
        for (int i = 0; i < ingredientesS.size(); i++) {
            dlm2.add(i, ingredientesS.get(i).getNome());
        }

    }

    private void salvar() {

        ArquivoLanche l1 = new ArquivoLanche();

        ArrayList<Lanche> a1 = new ArrayList<>();

        a1 = l1.resgatarArquivo();

        Lanche lan1 = new Lanche();

        lan1.setNome(txf_nome.getText());
        String valor = txf_preco.getText();
        valor = valor.replace(",", ".");
        lan1.setPreco(Float.parseFloat(valor));
        lan1.setIngredientes((ArrayList<Ingrediente>) ingredientesS);
        lan1.setTipo("Lanche");

        a1.add(lan1);
        l1.salvarArquivo(a1, false);

    }

}
