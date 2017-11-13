package br.inatel.projeto.view;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author WesleyReis
 */
public class Vendas extends javax.swing.JFrame {

    ArrayList<JButton> arrayBotoesLanches = new ArrayList();
    ArrayList<JButton> arrayBotoesBebidas = new ArrayList();

    /**
     * Creates new form Vendas
     */
    public Vendas() {
        initComponents();

        insereBotoes();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);  // abre a tela maximizada
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projeto/imagens/images.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        tbp_Venda = new javax.swing.JTabbedPane();
        pnl_Venda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Carrinho = new javax.swing.JTable();
        btn_Remover = new javax.swing.JButton();
        pnl_Pagamento = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbl_ValorCompra = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Dinheiro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbl_Troco = new javax.swing.JLabel();
        btn_Finalizar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Calcular = new javax.swing.JButton();
        pnl_Responsavel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_Responsavel = new javax.swing.JTextField();
        tbp_Guias = new javax.swing.JTabbedPane();
        pnl_Lanche = new javax.swing.JPanel();
        btn_Lanche5 = new javax.swing.JButton();
        btn_Lanche1 = new javax.swing.JButton();
        btn_Lanche2 = new javax.swing.JButton();
        btn_Lanche3 = new javax.swing.JButton();
        btn_Lanche4 = new javax.swing.JButton();
        btn_Lanche6 = new javax.swing.JButton();
        btn_Lanche7 = new javax.swing.JButton();
        btn_Lanche8 = new javax.swing.JButton();
        btn_Lanche9 = new javax.swing.JButton();
        btn_Lanche10 = new javax.swing.JButton();
        btn_Lanche11 = new javax.swing.JButton();
        btn_Lanche12 = new javax.swing.JButton();
        btn_Lanche13 = new javax.swing.JButton();
        btn_Lanche14 = new javax.swing.JButton();
        btn_Lanche15 = new javax.swing.JButton();
        btn_Lanche16 = new javax.swing.JButton();
        btn_Lanche17 = new javax.swing.JButton();
        btn_Lanche18 = new javax.swing.JButton();
        btn_Lanche19 = new javax.swing.JButton();
        btn_Lanche20 = new javax.swing.JButton();
        pnl_Bebida = new javax.swing.JPanel();
        btn_Bebida5 = new javax.swing.JButton();
        btn_Bebida1 = new javax.swing.JButton();
        btn_Bebida2 = new javax.swing.JButton();
        btn_Bebida3 = new javax.swing.JButton();
        btn_Bebida4 = new javax.swing.JButton();
        btn_Bebida10 = new javax.swing.JButton();
        btn_Bebida6 = new javax.swing.JButton();
        btn_Bebida7 = new javax.swing.JButton();
        btn_Bebida8 = new javax.swing.JButton();
        btn_Bebida9 = new javax.swing.JButton();
        btn_Bebida15 = new javax.swing.JButton();
        btn_Bebida11 = new javax.swing.JButton();
        btn_Bebida12 = new javax.swing.JButton();
        btn_Bebida13 = new javax.swing.JButton();
        btn_Bebida14 = new javax.swing.JButton();
        btn_Bebida20 = new javax.swing.JButton();
        btn_Bebida16 = new javax.swing.JButton();
        btn_Bebida17 = new javax.swing.JButton();
        btn_Bebida18 = new javax.swing.JButton();
        btn_Bebida19 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        setLocation(new java.awt.Point(0, 0));
        setModalExclusionType(null);
        setName("Vendas"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jScrollPane4.setMaximumSize(null);
        jScrollPane4.setPreferredSize(new java.awt.Dimension(1000, 800));

        pnl_Venda.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_Venda.setLayout(null);

        tbl_Carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Preço", "Adicional", "Modificações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Carrinho.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbl_Carrinho);

        pnl_Venda.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 370, 310);

        btn_Remover.setText("Remover");
        pnl_Venda.add(btn_Remover);
        btn_Remover.setBounds(290, 330, 90, 23);

        pnl_Pagamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagamento"));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Valor da Compra: R$");

        lbl_ValorCompra.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_ValorCompra.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Dinheiro: R$");

        txt_Dinheiro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Troco: R$ ");

        lbl_Troco.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_Troco.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Troco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Troco.setText("0.00");
        lbl_Troco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbl_Troco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_Finalizar.setText("Finalizar");

        btn_Cancelar.setText("Cancelar");

        btn_Calcular.setText("Calcular");

        javax.swing.GroupLayout pnl_PagamentoLayout = new javax.swing.GroupLayout(pnl_Pagamento);
        pnl_Pagamento.setLayout(pnl_PagamentoLayout);
        pnl_PagamentoLayout.setHorizontalGroup(
            pnl_PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_PagamentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_PagamentoLayout.createSequentialGroup()
                        .addGroup(pnl_PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_PagamentoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Dinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Calcular))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_PagamentoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_ValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_PagamentoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_Troco, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(15, Short.MAX_VALUE))))
        );
        pnl_PagamentoLayout.setVerticalGroup(
            pnl_PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PagamentoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnl_PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lbl_ValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Dinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnl_PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_Troco, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnl_PagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btn_Cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        pnl_Venda.add(pnl_Pagamento);
        pnl_Pagamento.setBounds(10, 410, 370, 250);

        pnl_Responsavel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Responsável:");

        javax.swing.GroupLayout pnl_ResponsavelLayout = new javax.swing.GroupLayout(pnl_Responsavel);
        pnl_Responsavel.setLayout(pnl_ResponsavelLayout);
        pnl_ResponsavelLayout.setHorizontalGroup(
            pnl_ResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ResponsavelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnl_ResponsavelLayout.setVerticalGroup(
            pnl_ResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ResponsavelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_ResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_Venda.add(pnl_Responsavel);
        pnl_Responsavel.setBounds(10, 360, 370, 40);

        tbp_Venda.addTab("Venda", pnl_Venda);

        tbp_Guias.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tbp_Guias.setMinimumSize(new java.awt.Dimension(0, 0));
        tbp_Guias.setPreferredSize(new java.awt.Dimension(0, 0));

        pnl_Lanche.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_Lanche.setLayout(null);

        btn_Lanche5.setText("jButton1");
        pnl_Lanche.add(btn_Lanche5);
        btn_Lanche5.setBounds(730, 10, 170, 120);

        btn_Lanche1.setText("jButton1");
        pnl_Lanche.add(btn_Lanche1);
        btn_Lanche1.setBounds(10, 10, 170, 120);

        btn_Lanche2.setText("jButton1");
        pnl_Lanche.add(btn_Lanche2);
        btn_Lanche2.setBounds(190, 10, 170, 120);

        btn_Lanche3.setText("jButton1");
        pnl_Lanche.add(btn_Lanche3);
        btn_Lanche3.setBounds(370, 10, 170, 120);

        btn_Lanche4.setText("jButton1");
        pnl_Lanche.add(btn_Lanche4);
        btn_Lanche4.setBounds(550, 10, 170, 120);

        btn_Lanche6.setText("jButton1");
        pnl_Lanche.add(btn_Lanche6);
        btn_Lanche6.setBounds(10, 140, 170, 120);

        btn_Lanche7.setText("jButton1");
        pnl_Lanche.add(btn_Lanche7);
        btn_Lanche7.setBounds(190, 140, 170, 120);

        btn_Lanche8.setText("jButton1");
        pnl_Lanche.add(btn_Lanche8);
        btn_Lanche8.setBounds(370, 140, 170, 120);

        btn_Lanche9.setText("jButton1");
        pnl_Lanche.add(btn_Lanche9);
        btn_Lanche9.setBounds(550, 140, 170, 120);

        btn_Lanche10.setText("jButton1");
        pnl_Lanche.add(btn_Lanche10);
        btn_Lanche10.setBounds(730, 140, 170, 120);

        btn_Lanche11.setText("jButton1");
        pnl_Lanche.add(btn_Lanche11);
        btn_Lanche11.setBounds(10, 270, 170, 120);

        btn_Lanche12.setText("jButton1");
        pnl_Lanche.add(btn_Lanche12);
        btn_Lanche12.setBounds(190, 270, 170, 120);

        btn_Lanche13.setText("jButton1");
        pnl_Lanche.add(btn_Lanche13);
        btn_Lanche13.setBounds(370, 270, 170, 120);

        btn_Lanche14.setText("jButton1");
        pnl_Lanche.add(btn_Lanche14);
        btn_Lanche14.setBounds(550, 270, 170, 120);

        btn_Lanche15.setText("jButton1");
        pnl_Lanche.add(btn_Lanche15);
        btn_Lanche15.setBounds(730, 270, 170, 120);

        btn_Lanche16.setText("jButton1");
        pnl_Lanche.add(btn_Lanche16);
        btn_Lanche16.setBounds(10, 400, 170, 120);

        btn_Lanche17.setText("jButton1");
        pnl_Lanche.add(btn_Lanche17);
        btn_Lanche17.setBounds(190, 400, 170, 120);

        btn_Lanche18.setText("jButton1");
        pnl_Lanche.add(btn_Lanche18);
        btn_Lanche18.setBounds(370, 400, 170, 120);

        btn_Lanche19.setText("jButton1");
        pnl_Lanche.add(btn_Lanche19);
        btn_Lanche19.setBounds(550, 400, 170, 120);

        btn_Lanche20.setText("jButton1");
        pnl_Lanche.add(btn_Lanche20);
        btn_Lanche20.setBounds(730, 400, 170, 120);

        tbp_Guias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/imagens/icone_lanche(final)_1.png")), pnl_Lanche); // NOI18N

        pnl_Bebida.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_Bebida.setLayout(null);

        btn_Bebida5.setText("jButton1");
        pnl_Bebida.add(btn_Bebida5);
        btn_Bebida5.setBounds(730, 10, 170, 120);

        btn_Bebida1.setText("jButton1");
        pnl_Bebida.add(btn_Bebida1);
        btn_Bebida1.setBounds(10, 10, 170, 120);

        btn_Bebida2.setText("jButton1");
        pnl_Bebida.add(btn_Bebida2);
        btn_Bebida2.setBounds(190, 10, 170, 120);

        btn_Bebida3.setText("jButton1");
        pnl_Bebida.add(btn_Bebida3);
        btn_Bebida3.setBounds(370, 10, 170, 120);

        btn_Bebida4.setText("jButton1");
        pnl_Bebida.add(btn_Bebida4);
        btn_Bebida4.setBounds(550, 10, 170, 120);

        btn_Bebida10.setText("jButton1");
        pnl_Bebida.add(btn_Bebida10);
        btn_Bebida10.setBounds(730, 140, 170, 120);

        btn_Bebida6.setText("jButton1");
        pnl_Bebida.add(btn_Bebida6);
        btn_Bebida6.setBounds(10, 140, 170, 120);

        btn_Bebida7.setText("jButton1");
        pnl_Bebida.add(btn_Bebida7);
        btn_Bebida7.setBounds(190, 140, 170, 120);

        btn_Bebida8.setText("jButton1");
        pnl_Bebida.add(btn_Bebida8);
        btn_Bebida8.setBounds(370, 140, 170, 120);

        btn_Bebida9.setText("jButton1");
        pnl_Bebida.add(btn_Bebida9);
        btn_Bebida9.setBounds(550, 140, 170, 120);

        btn_Bebida15.setText("jButton1");
        pnl_Bebida.add(btn_Bebida15);
        btn_Bebida15.setBounds(730, 270, 170, 120);

        btn_Bebida11.setText("jButton1");
        pnl_Bebida.add(btn_Bebida11);
        btn_Bebida11.setBounds(10, 270, 170, 120);

        btn_Bebida12.setText("jButton1");
        pnl_Bebida.add(btn_Bebida12);
        btn_Bebida12.setBounds(190, 270, 170, 120);

        btn_Bebida13.setText("jButton1");
        pnl_Bebida.add(btn_Bebida13);
        btn_Bebida13.setBounds(370, 270, 170, 120);

        btn_Bebida14.setText("jButton1");
        pnl_Bebida.add(btn_Bebida14);
        btn_Bebida14.setBounds(550, 270, 170, 120);

        btn_Bebida20.setText("jButton1");
        pnl_Bebida.add(btn_Bebida20);
        btn_Bebida20.setBounds(730, 400, 170, 120);

        btn_Bebida16.setText("jButton1");
        pnl_Bebida.add(btn_Bebida16);
        btn_Bebida16.setBounds(10, 400, 170, 120);

        btn_Bebida17.setText("jButton1");
        pnl_Bebida.add(btn_Bebida17);
        btn_Bebida17.setBounds(190, 400, 170, 120);

        btn_Bebida18.setText("jButton1");
        pnl_Bebida.add(btn_Bebida18);
        btn_Bebida18.setBounds(370, 400, 170, 120);

        btn_Bebida19.setText("jButton1");
        pnl_Bebida.add(btn_Bebida19);
        btn_Bebida19.setBounds(550, 400, 170, 120);

        tbp_Guias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/imagens/bebidaIcone.png")), pnl_Bebida); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(tbp_Venda, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(tbp_Guias, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbp_Venda)
                    .addComponent(tbp_Guias, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE))
                .addContainerGap())
        );

        jScrollPane4.setViewportView(jPanel2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = -1000;
        gridBagConstraints.ipady = -800;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jScrollPane4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Bebida1;
    private javax.swing.JButton btn_Bebida10;
    private javax.swing.JButton btn_Bebida11;
    private javax.swing.JButton btn_Bebida12;
    private javax.swing.JButton btn_Bebida13;
    private javax.swing.JButton btn_Bebida14;
    private javax.swing.JButton btn_Bebida15;
    private javax.swing.JButton btn_Bebida16;
    private javax.swing.JButton btn_Bebida17;
    private javax.swing.JButton btn_Bebida18;
    private javax.swing.JButton btn_Bebida19;
    private javax.swing.JButton btn_Bebida2;
    private javax.swing.JButton btn_Bebida20;
    private javax.swing.JButton btn_Bebida3;
    private javax.swing.JButton btn_Bebida4;
    private javax.swing.JButton btn_Bebida5;
    private javax.swing.JButton btn_Bebida6;
    private javax.swing.JButton btn_Bebida7;
    private javax.swing.JButton btn_Bebida8;
    private javax.swing.JButton btn_Bebida9;
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Finalizar;
    private javax.swing.JButton btn_Lanche1;
    private javax.swing.JButton btn_Lanche10;
    private javax.swing.JButton btn_Lanche11;
    private javax.swing.JButton btn_Lanche12;
    private javax.swing.JButton btn_Lanche13;
    private javax.swing.JButton btn_Lanche14;
    private javax.swing.JButton btn_Lanche15;
    private javax.swing.JButton btn_Lanche16;
    private javax.swing.JButton btn_Lanche17;
    private javax.swing.JButton btn_Lanche18;
    private javax.swing.JButton btn_Lanche19;
    private javax.swing.JButton btn_Lanche2;
    private javax.swing.JButton btn_Lanche20;
    private javax.swing.JButton btn_Lanche3;
    private javax.swing.JButton btn_Lanche4;
    private javax.swing.JButton btn_Lanche5;
    private javax.swing.JButton btn_Lanche6;
    private javax.swing.JButton btn_Lanche7;
    private javax.swing.JButton btn_Lanche8;
    private javax.swing.JButton btn_Lanche9;
    private javax.swing.JButton btn_Remover;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_Troco;
    private javax.swing.JLabel lbl_ValorCompra;
    private javax.swing.JPanel pnl_Bebida;
    private javax.swing.JPanel pnl_Lanche;
    private javax.swing.JPanel pnl_Pagamento;
    private javax.swing.JPanel pnl_Responsavel;
    private javax.swing.JPanel pnl_Venda;
    private javax.swing.JTable tbl_Carrinho;
    private javax.swing.JTabbedPane tbp_Guias;
    private javax.swing.JTabbedPane tbp_Venda;
    private javax.swing.JTextField txt_Dinheiro;
    private javax.swing.JTextField txt_Responsavel;
    // End of variables declaration//GEN-END:variables

    private void insereBotoes() {
        arrayBotoesBebidas.add(btn_Bebida1);
        arrayBotoesBebidas.add(btn_Bebida2);
        arrayBotoesBebidas.add(btn_Bebida3);
        arrayBotoesBebidas.add(btn_Bebida4);
        arrayBotoesBebidas.add(btn_Bebida5);
        arrayBotoesBebidas.add(btn_Bebida6);
        arrayBotoesBebidas.add(btn_Bebida7);
        arrayBotoesBebidas.add(btn_Bebida8);
        arrayBotoesBebidas.add(btn_Bebida9);
        arrayBotoesBebidas.add(btn_Bebida10);
        arrayBotoesBebidas.add(btn_Bebida11);
        arrayBotoesBebidas.add(btn_Bebida12);
        arrayBotoesBebidas.add(btn_Bebida13);
        arrayBotoesBebidas.add(btn_Bebida14);
        arrayBotoesBebidas.add(btn_Bebida15);
        arrayBotoesBebidas.add(btn_Bebida16);
        arrayBotoesBebidas.add(btn_Bebida17);
        arrayBotoesBebidas.add(btn_Bebida18);
        arrayBotoesBebidas.add(btn_Bebida19);
        arrayBotoesBebidas.add(btn_Bebida20);

        arrayBotoesLanches.add(btn_Lanche1);
        arrayBotoesLanches.add(btn_Lanche2);
        arrayBotoesLanches.add(btn_Lanche3);
        arrayBotoesLanches.add(btn_Lanche4);
        arrayBotoesLanches.add(btn_Lanche5);
        arrayBotoesLanches.add(btn_Lanche6);
        arrayBotoesLanches.add(btn_Lanche7);
        arrayBotoesLanches.add(btn_Lanche8);
        arrayBotoesLanches.add(btn_Lanche9);
        arrayBotoesLanches.add(btn_Lanche10);
        arrayBotoesLanches.add(btn_Lanche11);
        arrayBotoesLanches.add(btn_Lanche12);
        arrayBotoesLanches.add(btn_Lanche13);
        arrayBotoesLanches.add(btn_Lanche14);
        arrayBotoesLanches.add(btn_Lanche15);
        arrayBotoesLanches.add(btn_Lanche16);
        arrayBotoesLanches.add(btn_Lanche17);
        arrayBotoesLanches.add(btn_Lanche18);
        arrayBotoesLanches.add(btn_Lanche19);
        arrayBotoesLanches.add(btn_Lanche20);
        
        for (JButton lanche : arrayBotoesLanches) {
            lanche.setVisible(false);
        }
        for (JButton bebidas : arrayBotoesBebidas) {
            bebidas.setVisible(false);
        }
    }

    public ArrayList<JButton> getArrayBotoesLanches() {
        return arrayBotoesLanches;
    }

    public ArrayList<JButton> getArrayBotoesBebidas() {
        return arrayBotoesBebidas;
    }

    public JButton getBtn_Calcular() {
        return btn_Calcular;
    }

    public JButton getBtn_Cancelar() {
        return btn_Cancelar;
    }

    public JButton getBtn_Finalizar() {
        return btn_Finalizar;
    }

    public JButton getBtn_Remover() {
        return btn_Remover;
    }

    public JLabel getLbl_Troco() {
        return lbl_Troco;
    }

    public void setLbl_Troco(JLabel lbl_Troco) {
        this.lbl_Troco = lbl_Troco;
    }

    public JLabel getLbl_ValorCompra() {
        return lbl_ValorCompra;
    }

    public void setLbl_ValorCompra(JLabel lbl_ValorCompra) {
        this.lbl_ValorCompra = lbl_ValorCompra;
    }

    public JTable getTbl_Carrinho() {
        return tbl_Carrinho;
    }

    public void setTbl_Carrinho(JTable tbl_Carrinho) {
        this.tbl_Carrinho = tbl_Carrinho;
    }

    public JTextField getTxt_Dinheiro() {
        return txt_Dinheiro;
    }

    public void setTxt_Dinheiro(JTextField txt_Dinheiro) {
        this.txt_Dinheiro = txt_Dinheiro;
    }

    public JTextField getTxt_Responsavel() {
        return txt_Responsavel;
    }

    public void setTxt_Responsavel(JTextField txt_Responsavel) {
        this.txt_Responsavel = txt_Responsavel;
    }


}
