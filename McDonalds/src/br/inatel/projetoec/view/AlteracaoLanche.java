/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.view;

import br.inatel.projetoec.model.*;
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

    private float valorAdicional;
    private Lanche lanche;
    private JFrame telaVenda;
    private boolean modificacao;
    private String sem = "";
    private String com = "";

    private ArrayList<Ingrediente> selecionados = new ArrayList<>();         // array contendo os ingredientes selecionados dos lanches   
    private ArrayList<JCheckBox> botoes = new ArrayList<>();
    private ArrayList<Ingrediente> todosIngredientes = new ArrayList<>();
    private ArquivoIngrediente arqIngrediente = new ArquivoIngrediente();

    public AlteracaoLanche(Lanche lanche, JFrame tela) {

        initComponents();
        telaVenda = tela;
        this.lanche = lanche;

        this.todosIngredientes = arqIngrediente.resgatarArquivo();

        inicializandoCheckBox();
        marcarCheck();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projetoec/imagens/images.png")));

    }

    public AlteracaoLanche() {
        initComponents();

        //=================== testes ===================================
        Ingrediente ing = new Ingrediente();
        ing.setNome("Bacon");
        ing.setPrecoAdicional((float) 2.00);
        todosIngredientes.add(ing);

        Ingrediente ing2 = new Ingrediente();
        ing2.setNome("Ovo");
        ing2.setPrecoAdicional((float) 1.00);
        todosIngredientes.add(ing2);

        lanche = new Lanche();
        lanche.setNome("Americano");
        lanche.setPreco((float) 9.00);
        lanche.getIngredientes().add(ing);

        // ========================================================
        inicializandoCheckBox();
        marcarCheck();

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
        ckb_Ingrediente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente1ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));

        ckb_Ingrediente2.setText("jCheckBox1");
        ckb_Ingrediente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente2ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 16, -1, -1));

        ckb_Ingrediente3.setText("jCheckBox1");
        ckb_Ingrediente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente3ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 16, -1, -1));

        ckb_Ingrediente4.setText("jCheckBox1");
        ckb_Ingrediente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente4ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 16, -1, -1));

        ckb_Ingrediente5.setText("jCheckBox1");
        ckb_Ingrediente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente5ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 42, -1, -1));

        ckb_Ingrediente6.setText("jCheckBox1");
        ckb_Ingrediente6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente6ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 42, -1, -1));

        ckb_Ingrediente13.setText("jCheckBox1");
        ckb_Ingrediente13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente13ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, -1, -1));

        ckb_Ingrediente14.setText("jCheckBox1");
        ckb_Ingrediente14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente14ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente14, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 97, -1, -1));

        ckb_Ingrediente15.setText("jCheckBox1");
        ckb_Ingrediente15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente15ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente15, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 97, -1, -1));

        ckb_Ingrediente16.setText("jCheckBox1");
        ckb_Ingrediente16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente16ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente16, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 97, -1, -1));

        ckb_Ingrediente17.setText("jCheckBox1");
        ckb_Ingrediente17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente17ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 123, -1, -1));

        ckb_Ingrediente18.setText("jCheckBox1");
        ckb_Ingrediente18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente18ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente18, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 123, -1, -1));

        ckb_Ingrediente19.setText("jCheckBox1");
        ckb_Ingrediente19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente19ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente19, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 123, -1, -1));

        ckb_Ingrediente20.setText("jCheckBox1");
        ckb_Ingrediente20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente20ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente20, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 123, -1, -1));

        ckb_Ingrediente8.setText("jCheckBox1");
        ckb_Ingrediente8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente8ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente8, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 42, -1, -1));

        ckb_Ingrediente9.setText("jCheckBox1");
        ckb_Ingrediente9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente9ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, -1, -1));

        ckb_Ingrediente7.setText("jCheckBox1");
        ckb_Ingrediente7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente7ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente7, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 42, -1, -1));

        ckb_Ingrediente21.setText("jCheckBox1");
        ckb_Ingrediente21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente21ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente21, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, -1, -1));

        ckb_Ingrediente10.setText("jCheckBox1");
        ckb_Ingrediente10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente10ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente10, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 70, -1, -1));

        ckb_Ingrediente22.setText("jCheckBox1");
        ckb_Ingrediente22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente22ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente22, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 149, -1, -1));

        ckb_Ingrediente23.setText("jCheckBox1");
        ckb_Ingrediente23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente23ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente23, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 149, -1, -1));

        ckb_Ingrediente24.setText("jCheckBox1");
        ckb_Ingrediente24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente24ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente24, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 149, -1, -1));

        ckb_Ingrediente11.setText("jCheckBox1");
        ckb_Ingrediente11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente11ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente11, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 70, -1, -1));

        ckb_Ingrediente12.setText("jCheckBox1");
        ckb_Ingrediente12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_Ingrediente12ActionPerformed(evt);
            }
        });
        pnl_Ingredientes.add(ckb_Ingrediente12, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 68, -1, 26));

        getContentPane().add(pnl_Ingredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 170));

        pnl_Opcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));
        pnl_Opcoes.setLayout(null);

        ckb_Repartir.setText("Repartir");
        ckb_Repartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_RepartirActionPerformed(evt);
            }
        });
        pnl_Opcoes.add(ckb_Repartir);
        ckb_Repartir.setBounds(10, 30, 90, 23);

        btn_Finalizar.setText("Finalizar");
        btn_Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FinalizarActionPerformed(evt);
            }
        });
        pnl_Opcoes.add(btn_Finalizar);
        btn_Finalizar.setBounds(290, 20, 84, 34);

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });
        pnl_Opcoes.add(btn_Cancelar);
        btn_Cancelar.setBounds(400, 20, 84, 34);

        getContentPane().add(pnl_Opcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 507, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FinalizarActionPerformed
        if(this.selecionados.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Nenhum ingrediente selecionado!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        lanche.setAdicional(valorAdicional);

        this.dispose();
        this.modificacao = modificacao();
        
        lanche.setIngredientes(selecionados);
        lanche.setObservacao("Sem: " + sem + " Com: " + com);
        ((Vendas) telaVenda).getProdutos().add(lanche);
        ((Vendas) telaVenda).adicionaTabela(lanche);

    }//GEN-LAST:event_btn_FinalizarActionPerformed

    private void ckb_RepartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_RepartirActionPerformed
        if (ckb_Repartir.isSelected()) {
            this.lanche.setRepartir(true);
        } else {
            this.lanche.setRepartir(false);
        }
    }//GEN-LAST:event_ckb_RepartirActionPerformed

    private void ckb_Ingrediente22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente22ActionPerformed
        if (ckb_Ingrediente22.isSelected()) {
            adiciona(ckb_Ingrediente22.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente22.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente22ActionPerformed

    private void ckb_Ingrediente15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente15ActionPerformed
        if (ckb_Ingrediente15.isSelected()) {
            adiciona(ckb_Ingrediente15.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente15.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente15ActionPerformed

    private void ckb_Ingrediente10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente10ActionPerformed
        if (ckb_Ingrediente10.isSelected()) {
            adiciona(ckb_Ingrediente10.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente10.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente10ActionPerformed

    private void ckb_Ingrediente14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente14ActionPerformed
        if (ckb_Ingrediente14.isSelected()) {
            adiciona(ckb_Ingrediente14.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente14.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente14ActionPerformed

    private void ckb_Ingrediente21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente21ActionPerformed
        if (ckb_Ingrediente21.isSelected()) {
            adiciona(ckb_Ingrediente21.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente21.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente21ActionPerformed

    private void ckb_Ingrediente13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente13ActionPerformed
        if (ckb_Ingrediente13.isSelected()) {
            adiciona(ckb_Ingrediente13.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente13.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente13ActionPerformed

    private void ckb_Ingrediente7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente7ActionPerformed
        if (ckb_Ingrediente7.isSelected()) {
            adiciona(ckb_Ingrediente7.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente7.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente7ActionPerformed

    private void ckb_Ingrediente6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente6ActionPerformed
        if (ckb_Ingrediente6.isSelected()) {
            adiciona(ckb_Ingrediente6.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente6.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente6ActionPerformed

    private void ckb_Ingrediente9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente9ActionPerformed
        if (ckb_Ingrediente9.isSelected()) {
            adiciona(ckb_Ingrediente9.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente9.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente9ActionPerformed

    private void ckb_Ingrediente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente5ActionPerformed
        if (ckb_Ingrediente5.isSelected()) {
            adiciona(ckb_Ingrediente5.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente5.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente5ActionPerformed

    private void ckb_Ingrediente8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente8ActionPerformed
        if (ckb_Ingrediente8.isSelected()) {
            adiciona(ckb_Ingrediente8.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente8.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente8ActionPerformed

    private void ckb_Ingrediente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente4ActionPerformed
        if (ckb_Ingrediente4.isSelected()) {
            adiciona(ckb_Ingrediente4.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente4.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente4ActionPerformed

    private void ckb_Ingrediente20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente20ActionPerformed
        if (ckb_Ingrediente20.isSelected()) {
            adiciona(ckb_Ingrediente20.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente20.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente20ActionPerformed

    private void ckb_Ingrediente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente3ActionPerformed
        if (ckb_Ingrediente3.isSelected()) {
            adiciona(ckb_Ingrediente3.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente3.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente3ActionPerformed

    private void ckb_Ingrediente12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente12ActionPerformed
        if (ckb_Ingrediente12.isSelected()) {
            adiciona(ckb_Ingrediente12.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente12.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente12ActionPerformed

    private void ckb_Ingrediente19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente19ActionPerformed
        if (ckb_Ingrediente19.isSelected()) {
            adiciona(ckb_Ingrediente19.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente19.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente19ActionPerformed

    private void ckb_Ingrediente11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente11ActionPerformed
        if (ckb_Ingrediente11.isSelected()) {
            adiciona(ckb_Ingrediente11.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente11.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente11ActionPerformed

    private void ckb_Ingrediente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente2ActionPerformed
        if (ckb_Ingrediente2.isSelected()) {
            adiciona(ckb_Ingrediente2.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente2.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente2ActionPerformed

    private void ckb_Ingrediente18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente18ActionPerformed
        if (ckb_Ingrediente18.isSelected()) {
            adiciona(ckb_Ingrediente18.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente18.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente18ActionPerformed

    private void ckb_Ingrediente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente1ActionPerformed
        if (ckb_Ingrediente1.isSelected()) {
            adiciona(ckb_Ingrediente1.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente1.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente1ActionPerformed

    private void ckb_Ingrediente24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente24ActionPerformed
        if (ckb_Ingrediente24.isSelected()) {
            adiciona(ckb_Ingrediente24.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente24.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente24ActionPerformed

    private void ckb_Ingrediente17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente17ActionPerformed
        if (ckb_Ingrediente17.isSelected()) {
            adiciona(ckb_Ingrediente17.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente17.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente17ActionPerformed

    private void ckb_Ingrediente23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente23ActionPerformed
        if (ckb_Ingrediente23.isSelected()) {
            adiciona(ckb_Ingrediente23.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente23.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente23ActionPerformed

    private void ckb_Ingrediente16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_Ingrediente16ActionPerformed
        if (ckb_Ingrediente16.isSelected()) {
            adiciona(ckb_Ingrediente16.getText());
            //    txt_Obs.setText("Com: " + ckb_Ingrediente1.getText() );
        } else {
            retira(ckb_Ingrediente16.getText());
            //   txt_Obs.setText("Sem: " + ckb_Ingrediente1.getText());
        }
    }//GEN-LAST:event_ckb_Ingrediente16ActionPerformed

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

    //  método que adiciona a um array todos os checkbox e mofica sua visibilidade
    private void inicializandoCheckBox() {
        this.botoes.add(ckb_Ingrediente1);
        this.botoes.add(ckb_Ingrediente2);
        this.botoes.add(ckb_Ingrediente3);
        this.botoes.add(ckb_Ingrediente4);
        this.botoes.add(ckb_Ingrediente5);
        this.botoes.add(ckb_Ingrediente6);
        this.botoes.add(ckb_Ingrediente7);
        this.botoes.add(ckb_Ingrediente8);
        this.botoes.add(ckb_Ingrediente9);
        this.botoes.add(ckb_Ingrediente10);
        this.botoes.add(ckb_Ingrediente11);
        this.botoes.add(ckb_Ingrediente12);
        this.botoes.add(ckb_Ingrediente13);
        this.botoes.add(ckb_Ingrediente14);
        this.botoes.add(ckb_Ingrediente15);
        this.botoes.add(ckb_Ingrediente16);
        this.botoes.add(ckb_Ingrediente17);
        this.botoes.add(ckb_Ingrediente18);
        this.botoes.add(ckb_Ingrediente19);
        this.botoes.add(ckb_Ingrediente20);
        this.botoes.add(ckb_Ingrediente21);
        this.botoes.add(ckb_Ingrediente22);
        this.botoes.add(ckb_Ingrediente23);
        this.botoes.add(ckb_Ingrediente24);

        for (JCheckBox ck : botoes) {
            ck.setVisible(false);
        }

        for (int i = 0; i < this.todosIngredientes.size(); i++) {
            if (todosIngredientes.get(i) != null) {
                botoes.get(i).setVisible(true);
                botoes.get(i).setText(todosIngredientes.get(i).getNome());
            }
        }
    }

    // método que seleciona as caixas de texto de acordo com os ingredientes presentes no lanche e os adiciona ao array Selecionados
    private void marcarCheck() {

        if (lanche != null) {
            for (int i = 0; i < lanche.getIngredientes().size(); i++) {
                for (int j = 0; j < botoes.size(); j++) {
                    if (botoes.get(j).getText().equalsIgnoreCase(lanche.getIngredientes().get(i).getNome())) {
                        botoes.get(j).setSelected(true);
                        selecionados.add(lanche.getIngredientes().get(i));
                        break;
                    }
                }
            }
        }

    }

    // retira os ingredientes indesejados
    private void retira(String ing) {
        float valor = 0;
        for (int i = 0; i < selecionados.size(); i++) {
            if (selecionados.get(i).getNome().equalsIgnoreCase(ing)) {
                valor = selecionados.get(i).getPrecoAdicional();
                selecionados.remove(i);
                break;
            }
        }
        boolean teste = true;
        for (int i = 0; i < lanche.getIngredientes().size(); i++) {
            if (lanche.getIngredientes().get(i).getNome().equalsIgnoreCase(ing)) {
                teste = false;
                break;
            }
        }
        if (teste) {
            this.valorAdicional -= valor;
            this.com = this.com.replace(" "+ing, "");
        }
        else{
            this.sem += " " + ing;
        }
       // System.out.println("com: "+com);
        //System.out.println("sem: "+sem);
    }

    // método para adionar ingrediente ao array selecionados
    private void adiciona(String ing) {
        float valor = 0;
        for (int i = 0; i < todosIngredientes.size(); i++) {
            if (todosIngredientes.get(i).getNome().equalsIgnoreCase(ing)) {
                selecionados.add(todosIngredientes.get(i));
                valor = todosIngredientes.get(i).getPrecoAdicional();
                break;
            }
        }
        boolean teste = true;
        for (int i = 0; i < lanche.getIngredientes().size(); i++) {
            if (lanche.getIngredientes().get(i).getNome().equalsIgnoreCase(ing)) {
                teste = false;
                break;
            }
        }
        if (teste) {
            this.valorAdicional += valor;
            
            this.com += " " + ing;
        }
        else{
            this.sem = this.sem.replace(" "+ing, "");
        }
        //System.out.println("com: "+com);
        //System.out.println("sem: "+sem);
    }

    // método de teste
    public void mostrarSelecionados() {
        System.out.println("=========================");
        for (Ingrediente ing : selecionados) {
            System.out.println(ing.getNome());
        }
        System.out.println("Preco: " + this.valorAdicional);
    }

    public boolean modificacao() {
        
        if(selecionados.size() != lanche.getIngredientes().size()) return false;
        else{
            for (int i = 0; i < selecionados.size(); i++) {
                if(!selecionados.get(i).getNome().equals(lanche.getIngredientes().get(i).getNome())) return false;
            }
        }        
        return true;
    }

    public boolean isModificacao() {
        return modificacao;
    }
    
    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public ArrayList<Ingrediente> getSelecionados() {
        return selecionados;
    }

    
}
