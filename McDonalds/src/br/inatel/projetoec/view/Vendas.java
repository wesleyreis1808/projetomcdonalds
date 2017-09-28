/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.view;

import br.inatel.projetoec.model.*;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WesleyReis
 */
public class Vendas extends javax.swing.JFrame {

    // Crinando variaveis da tela de vendas
    private AlteracaoLanche alteracao;
    private ArrayList<Lanche> lanches = new ArrayList<>();  //Array que contem todos lanche cadastraddos
    private ArrayList<Bebida> bebidas = new ArrayList<>();  //Array que contem todas bebidas cadastradas
    private ArrayList<JButton> botoesLanche = new ArrayList<>();
    private ArrayList<JButton> botoesBebidas = new ArrayList<>();
    private ArquivoLanche arqLanche = new ArquivoLanche();
    private ArquivoBebidas arqBebida = new ArquivoBebidas();
    private DefaultTableModel dtm = new DefaultTableModel();

    private ArrayList<Produto> produtos; // Array para guardar todos os produtos de uma venda 

    /**
     * Creates new form Vendas
     */
    public Vendas() {
        initComponents();

        criarArrayProdutos();

        inicializarBotoes();

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);  // abre a tela maximizada

        lanches = arqLanche.resgatarArquivo();
        bebidas = arqBebida.resgatarArquivo();

        dtm = (DefaultTableModel) tbl_Carrinho.getModel();
        ativarBotoes();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projetoec/imagens/images.png")));
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
        tbp_Entrega = new javax.swing.JTabbedPane();
        pnl_Entrega = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Endereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Numero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Telefone = new javax.swing.JTextField();
        clb_Entregar = new javax.swing.JCheckBox();
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
                "Produto", "Preço", "Adicional", "Repartir", "Modificações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        jScrollPane2.setBounds(10, 10, 370, 190);

        tbp_Entrega.setEnabled(false);

        pnl_Entrega.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_Entrega.setEnabled(false);

        jLabel1.setText("Endereço:");

        txt_Endereco.setEnabled(false);
        txt_Endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EnderecoActionPerformed(evt);
            }
        });

        jLabel2.setText("Número: ");

        txt_Numero.setEnabled(false);

        jLabel4.setText("Telefone: ");

        txt_Telefone.setEnabled(false);
        txt_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefoneActionPerformed(evt);
            }
        });

        clb_Entregar.setText("Entregar");
        clb_Entregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clb_EntregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_EntregaLayout = new javax.swing.GroupLayout(pnl_Entrega);
        pnl_Entrega.setLayout(pnl_EntregaLayout);
        pnl_EntregaLayout.setHorizontalGroup(
            pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_EntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_EntregaLayout.createSequentialGroup()
                        .addGroup(pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_EntregaLayout.createSequentialGroup()
                        .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clb_Entregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_EntregaLayout.setVerticalGroup(
            pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_EntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_EntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(clb_Entregar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbp_Entrega.addTab("Entrega", pnl_Entrega);

        pnl_Venda.add(tbp_Entrega);
        tbp_Entrega.setBounds(10, 230, 370, 120);

        btn_Remover.setText("Remover");
        btn_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverActionPerformed(evt);
            }
        });
        pnl_Venda.add(btn_Remover);
        btn_Remover.setBounds(283, 210, 90, 23);

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
        btn_Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FinalizarActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        btn_Calcular.setText("Calcular");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });

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

        txt_Responsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ResponsavelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ResponsavelLayout = new javax.swing.GroupLayout(pnl_Responsavel);
        pnl_Responsavel.setLayout(pnl_ResponsavelLayout);
        pnl_ResponsavelLayout.setHorizontalGroup(
            pnl_ResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ResponsavelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        btn_Lanche5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche5ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche5);
        btn_Lanche5.setBounds(730, 10, 170, 120);

        btn_Lanche1.setText("jButton1");
        btn_Lanche1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche1ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche1);
        btn_Lanche1.setBounds(10, 10, 170, 120);

        btn_Lanche2.setText("jButton1");
        btn_Lanche2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche2ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche2);
        btn_Lanche2.setBounds(190, 10, 170, 120);

        btn_Lanche3.setText("jButton1");
        btn_Lanche3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche3ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche3);
        btn_Lanche3.setBounds(370, 10, 170, 120);

        btn_Lanche4.setText("jButton1");
        btn_Lanche4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche4ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche4);
        btn_Lanche4.setBounds(550, 10, 170, 120);

        btn_Lanche6.setText("jButton1");
        btn_Lanche6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche6ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche6);
        btn_Lanche6.setBounds(10, 140, 170, 120);

        btn_Lanche7.setText("jButton1");
        btn_Lanche7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche7ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche7);
        btn_Lanche7.setBounds(190, 140, 170, 120);

        btn_Lanche8.setText("jButton1");
        btn_Lanche8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche8ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche8);
        btn_Lanche8.setBounds(370, 140, 170, 120);

        btn_Lanche9.setText("jButton1");
        btn_Lanche9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche9ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche9);
        btn_Lanche9.setBounds(550, 140, 170, 120);

        btn_Lanche10.setText("jButton1");
        btn_Lanche10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche10ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche10);
        btn_Lanche10.setBounds(730, 140, 170, 120);

        btn_Lanche11.setText("jButton1");
        btn_Lanche11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche11ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche11);
        btn_Lanche11.setBounds(10, 270, 170, 120);

        btn_Lanche12.setText("jButton1");
        btn_Lanche12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche12ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche12);
        btn_Lanche12.setBounds(190, 270, 170, 120);

        btn_Lanche13.setText("jButton1");
        btn_Lanche13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche13ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche13);
        btn_Lanche13.setBounds(370, 270, 170, 120);

        btn_Lanche14.setText("jButton1");
        btn_Lanche14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche14ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche14);
        btn_Lanche14.setBounds(550, 270, 170, 120);

        btn_Lanche15.setText("jButton1");
        btn_Lanche15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche15ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche15);
        btn_Lanche15.setBounds(730, 270, 170, 120);

        btn_Lanche16.setText("jButton1");
        btn_Lanche16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche16ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche16);
        btn_Lanche16.setBounds(10, 400, 170, 120);

        btn_Lanche17.setText("jButton1");
        btn_Lanche17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche17ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche17);
        btn_Lanche17.setBounds(190, 400, 170, 120);

        btn_Lanche18.setText("jButton1");
        btn_Lanche18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche18ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche18);
        btn_Lanche18.setBounds(370, 400, 170, 120);

        btn_Lanche19.setText("jButton1");
        btn_Lanche19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche19ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche19);
        btn_Lanche19.setBounds(550, 400, 170, 120);

        btn_Lanche20.setText("jButton1");
        btn_Lanche20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Lanche20ActionPerformed(evt);
            }
        });
        pnl_Lanche.add(btn_Lanche20);
        btn_Lanche20.setBounds(730, 400, 170, 120);

        tbp_Guias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projetoec/imagens/icone_lanche(final)_1.png")), pnl_Lanche); // NOI18N

        pnl_Bebida.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnl_Bebida.setLayout(null);

        btn_Bebida5.setText("jButton1");
        btn_Bebida5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida5ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida5);
        btn_Bebida5.setBounds(730, 10, 170, 120);

        btn_Bebida1.setText("jButton1");
        btn_Bebida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida1ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida1);
        btn_Bebida1.setBounds(10, 10, 170, 120);

        btn_Bebida2.setText("jButton1");
        btn_Bebida2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida2ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida2);
        btn_Bebida2.setBounds(190, 10, 170, 120);

        btn_Bebida3.setText("jButton1");
        btn_Bebida3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida3ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida3);
        btn_Bebida3.setBounds(370, 10, 170, 120);

        btn_Bebida4.setText("jButton1");
        btn_Bebida4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida4ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida4);
        btn_Bebida4.setBounds(550, 10, 170, 120);

        btn_Bebida10.setText("jButton1");
        btn_Bebida10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida10ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida10);
        btn_Bebida10.setBounds(730, 140, 170, 120);

        btn_Bebida6.setText("jButton1");
        btn_Bebida6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida6ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida6);
        btn_Bebida6.setBounds(10, 140, 170, 120);

        btn_Bebida7.setText("jButton1");
        btn_Bebida7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida7ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida7);
        btn_Bebida7.setBounds(190, 140, 170, 120);

        btn_Bebida8.setText("jButton1");
        btn_Bebida8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida8ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida8);
        btn_Bebida8.setBounds(370, 140, 170, 120);

        btn_Bebida9.setText("jButton1");
        btn_Bebida9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida9ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida9);
        btn_Bebida9.setBounds(550, 140, 170, 120);

        btn_Bebida15.setText("jButton1");
        btn_Bebida15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida15ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida15);
        btn_Bebida15.setBounds(730, 270, 170, 120);

        btn_Bebida11.setText("jButton1");
        btn_Bebida11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida11ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida11);
        btn_Bebida11.setBounds(10, 270, 170, 120);

        btn_Bebida12.setText("jButton1");
        btn_Bebida12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida12ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida12);
        btn_Bebida12.setBounds(190, 270, 170, 120);

        btn_Bebida13.setText("jButton1");
        btn_Bebida13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida13ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida13);
        btn_Bebida13.setBounds(370, 270, 170, 120);

        btn_Bebida14.setText("jButton1");
        btn_Bebida14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida14ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida14);
        btn_Bebida14.setBounds(550, 270, 170, 120);

        btn_Bebida20.setText("jButton1");
        btn_Bebida20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida20ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida20);
        btn_Bebida20.setBounds(730, 400, 170, 120);

        btn_Bebida16.setText("jButton1");
        btn_Bebida16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida16ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida16);
        btn_Bebida16.setBounds(10, 400, 170, 120);

        btn_Bebida17.setText("jButton1");
        btn_Bebida17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida17ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida17);
        btn_Bebida17.setBounds(190, 400, 170, 120);

        btn_Bebida18.setText("jButton1");
        btn_Bebida18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida18ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida18);
        btn_Bebida18.setBounds(370, 400, 170, 120);

        btn_Bebida19.setText("jButton1");
        btn_Bebida19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Bebida19ActionPerformed(evt);
            }
        });
        pnl_Bebida.add(btn_Bebida19);
        btn_Bebida19.setBounds(550, 400, 170, 120);

        tbp_Guias.addTab("", new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projetoec/imagens/bebidaIcone.png")), pnl_Bebida); // NOI18N

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

    private void btn_Lanche5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche5ActionPerformed
        alteraLanche(btn_Lanche5.getText());
    }//GEN-LAST:event_btn_Lanche5ActionPerformed

    private void btn_Lanche1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche1ActionPerformed
        alteraLanche(btn_Lanche1.getText());

    }//GEN-LAST:event_btn_Lanche1ActionPerformed

    private void btn_Lanche2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche2ActionPerformed
        alteraLanche(btn_Lanche2.getText());
    }//GEN-LAST:event_btn_Lanche2ActionPerformed

    private void btn_Lanche3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche3ActionPerformed
        alteraLanche(btn_Lanche3.getText());
    }//GEN-LAST:event_btn_Lanche3ActionPerformed

    private void btn_Lanche4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche4ActionPerformed
        alteraLanche(btn_Lanche4.getText());
    }//GEN-LAST:event_btn_Lanche4ActionPerformed

    private void btn_Lanche6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche6ActionPerformed
        alteraLanche(btn_Lanche6.getText());
    }//GEN-LAST:event_btn_Lanche6ActionPerformed

    private void btn_Lanche7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche7ActionPerformed
        alteraLanche(btn_Lanche7.getText());
    }//GEN-LAST:event_btn_Lanche7ActionPerformed

    private void btn_Lanche8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche8ActionPerformed
        alteraLanche(btn_Lanche8.getText());
    }//GEN-LAST:event_btn_Lanche8ActionPerformed

    private void btn_Lanche9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche9ActionPerformed
        alteraLanche(btn_Lanche9.getText());
    }//GEN-LAST:event_btn_Lanche9ActionPerformed

    private void btn_Lanche10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche10ActionPerformed
        alteraLanche(btn_Lanche10.getText());
    }//GEN-LAST:event_btn_Lanche10ActionPerformed

    private void btn_Lanche11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche11ActionPerformed
        alteraLanche(btn_Lanche11.getText());
    }//GEN-LAST:event_btn_Lanche11ActionPerformed

    private void btn_Lanche12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche12ActionPerformed
        alteraLanche(btn_Lanche12.getText());
    }//GEN-LAST:event_btn_Lanche12ActionPerformed

    private void btn_Lanche13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche13ActionPerformed
        alteraLanche(btn_Lanche13.getText());
    }//GEN-LAST:event_btn_Lanche13ActionPerformed

    private void btn_Lanche14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche14ActionPerformed
        alteraLanche(btn_Lanche14.getText());
    }//GEN-LAST:event_btn_Lanche14ActionPerformed

    private void btn_Lanche15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche15ActionPerformed
        alteraLanche(btn_Lanche15.getText());
    }//GEN-LAST:event_btn_Lanche15ActionPerformed

    private void btn_Lanche16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche16ActionPerformed
        alteraLanche(btn_Lanche16.getText());
    }//GEN-LAST:event_btn_Lanche16ActionPerformed

    private void btn_Lanche17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche17ActionPerformed
        alteraLanche(btn_Lanche17.getText());
    }//GEN-LAST:event_btn_Lanche17ActionPerformed

    private void btn_Lanche18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche18ActionPerformed
        alteraLanche(btn_Lanche18.getText());
    }//GEN-LAST:event_btn_Lanche18ActionPerformed

    private void btn_Lanche19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche19ActionPerformed
        alteraLanche(btn_Lanche19.getText());
    }//GEN-LAST:event_btn_Lanche19ActionPerformed

    private void btn_Lanche20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Lanche20ActionPerformed
        alteraLanche(btn_Lanche20.getText());
    }//GEN-LAST:event_btn_Lanche20ActionPerformed

    private void btn_Bebida5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida5ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida5.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida5.getText()));
    }//GEN-LAST:event_btn_Bebida5ActionPerformed

    private void btn_Bebida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida1ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida1.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida1.getText()));

    }//GEN-LAST:event_btn_Bebida1ActionPerformed

    private void btn_Bebida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida2ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida2.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida2.getText()));
    }//GEN-LAST:event_btn_Bebida2ActionPerformed

    private void btn_Bebida3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida3ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida3.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida3.getText()));
    }//GEN-LAST:event_btn_Bebida3ActionPerformed

    private void btn_Bebida4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida4ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida4.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida4.getText()));
    }//GEN-LAST:event_btn_Bebida4ActionPerformed

    private void btn_Bebida10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida10ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida10.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida10.getText()));
    }//GEN-LAST:event_btn_Bebida10ActionPerformed

    private void btn_Bebida6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida6ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida6.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida6.getText()));
    }//GEN-LAST:event_btn_Bebida6ActionPerformed

    private void btn_Bebida7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida7ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida7.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida7.getText()));
    }//GEN-LAST:event_btn_Bebida7ActionPerformed

    private void btn_Bebida8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida8ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida8.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida8.getText()));
    }//GEN-LAST:event_btn_Bebida8ActionPerformed

    private void btn_Bebida9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida9ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida9.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida9.getText()));
    }//GEN-LAST:event_btn_Bebida9ActionPerformed

    private void btn_Bebida15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida15ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida15.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida15.getText()));
    }//GEN-LAST:event_btn_Bebida15ActionPerformed

    private void btn_Bebida11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida11ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida11.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida11.getText()));
    }//GEN-LAST:event_btn_Bebida11ActionPerformed

    private void btn_Bebida12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida12ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida12.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida12.getText()));
    }//GEN-LAST:event_btn_Bebida12ActionPerformed

    private void btn_Bebida13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida13ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida13.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida13.getText()));
    }//GEN-LAST:event_btn_Bebida13ActionPerformed

    private void btn_Bebida14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida14ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida14.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida14.getText()));
    }//GEN-LAST:event_btn_Bebida14ActionPerformed

    private void btn_Bebida20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida20ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida20.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida20.getText()));
    }//GEN-LAST:event_btn_Bebida20ActionPerformed

    private void btn_Bebida16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida16ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida16.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida16.getText()));
    }//GEN-LAST:event_btn_Bebida16ActionPerformed

    private void btn_Bebida17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida17ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida17.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida17.getText()));
    }//GEN-LAST:event_btn_Bebida17ActionPerformed

    private void btn_Bebida18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida18ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida18.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida18.getText()));
    }//GEN-LAST:event_btn_Bebida18ActionPerformed

    private void btn_Bebida19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Bebida19ActionPerformed
        this.produtos.add(bebidaEcolhida(btn_Bebida19.getText()));
        adicionaTabela(bebidaEcolhida(btn_Bebida19.getText()));
    }//GEN-LAST:event_btn_Bebida19ActionPerformed

    private void txt_ResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ResponsavelActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        limpar();
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FinalizarActionPerformed
        if (this.produtos.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum produto adicionado!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (clb_Entregar.isSelected()) {
            if (txt_Endereco.getText().equals("") || txt_Numero.getText().equals("") || txt_Telefone.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Todos os dados de entrega devem ser preenchidos", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        if (!txt_Responsavel.getText().equals("")) {
            float troco = Float.parseFloat(lbl_Troco.getText());
            if (troco < 0) {
                JOptionPane.showMessageDialog(rootPane, "Troco inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                float dinheiro = Float.parseFloat(txt_Dinheiro.getText());

                finaliza();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "Dinheiro inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Informe o responsável!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_FinalizarActionPerformed

    private void clb_EntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clb_EntregarActionPerformed
        if (clb_Entregar.isSelected()) {
            pnl_Entrega.setEnabled(true);
            tbp_Entrega.setEnabled(true);
            txt_Endereco.setEnabled(true);
            txt_Numero.setEnabled(true);
            txt_Telefone.setEnabled(true);

        } else {
            pnl_Entrega.setEnabled(false);
            tbp_Entrega.setEnabled(false);
            txt_Endereco.setEnabled(false);
            txt_Numero.setEnabled(false);
            txt_Telefone.setEnabled(false);
        }
    }//GEN-LAST:event_clb_EntregarActionPerformed

    private void txt_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefoneActionPerformed

    private void txt_EnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EnderecoActionPerformed

    private void btn_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");

        if (tbl_Carrinho.getSelectedRow() >= 0) {
            this.produtos.remove(tbl_Carrinho.getSelectedRow());
            dtm.removeRow(tbl_Carrinho.getSelectedRow());
            tbl_Carrinho.setModel(dtm);
            tbl_Carrinho.repaint();

            lbl_ValorCompra.setText(df.format(calculaTotal()));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhuma linha não selecionada!");
        }
    }//GEN-LAST:event_btn_RemoverActionPerformed

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
        try{
            String troco = txt_Dinheiro.getText().replace(",", ".");
            lbl_Troco.setText("" + (Float.parseFloat(troco) - calculaTotal()));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Dinheiro inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_CalcularActionPerformed

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
    private javax.swing.JCheckBox clb_Entregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_Troco;
    private javax.swing.JLabel lbl_ValorCompra;
    private javax.swing.JPanel pnl_Bebida;
    private javax.swing.JPanel pnl_Entrega;
    private javax.swing.JPanel pnl_Lanche;
    private javax.swing.JPanel pnl_Pagamento;
    private javax.swing.JPanel pnl_Responsavel;
    private javax.swing.JPanel pnl_Venda;
    private javax.swing.JTable tbl_Carrinho;
    private javax.swing.JTabbedPane tbp_Entrega;
    private javax.swing.JTabbedPane tbp_Guias;
    private javax.swing.JTabbedPane tbp_Venda;
    private javax.swing.JTextField txt_Dinheiro;
    private javax.swing.JTextField txt_Endereco;
    private javax.swing.JTextField txt_Numero;
    private javax.swing.JTextField txt_Responsavel;
    private javax.swing.JTextField txt_Telefone;
    // End of variables declaration//GEN-END:variables

    // Método que oculta os botoes e os adiciona em um array
    private void inicializarBotoes() {

        botoesLanche.add(btn_Lanche1);
        botoesLanche.add(btn_Lanche2);
        botoesLanche.add(btn_Lanche3);
        botoesLanche.add(btn_Lanche4);
        botoesLanche.add(btn_Lanche5);
        botoesLanche.add(btn_Lanche6);
        botoesLanche.add(btn_Lanche7);
        botoesLanche.add(btn_Lanche8);
        botoesLanche.add(btn_Lanche9);
        botoesLanche.add(btn_Lanche10);
        botoesLanche.add(btn_Lanche11);
        botoesLanche.add(btn_Lanche12);
        botoesLanche.add(btn_Lanche13);
        botoesLanche.add(btn_Lanche14);
        botoesLanche.add(btn_Lanche15);
        botoesLanche.add(btn_Lanche16);
        botoesLanche.add(btn_Lanche17);
        botoesLanche.add(btn_Lanche18);
        botoesLanche.add(btn_Lanche19);
        botoesLanche.add(btn_Lanche20);

        botoesBebidas.add(btn_Bebida1);
        botoesBebidas.add(btn_Bebida2);
        botoesBebidas.add(btn_Bebida3);
        botoesBebidas.add(btn_Bebida4);
        botoesBebidas.add(btn_Bebida5);
        botoesBebidas.add(btn_Bebida6);
        botoesBebidas.add(btn_Bebida7);
        botoesBebidas.add(btn_Bebida8);
        botoesBebidas.add(btn_Bebida9);
        botoesBebidas.add(btn_Bebida10);
        botoesBebidas.add(btn_Bebida11);
        botoesBebidas.add(btn_Bebida12);
        botoesBebidas.add(btn_Bebida13);
        botoesBebidas.add(btn_Bebida14);
        botoesBebidas.add(btn_Bebida15);
        botoesBebidas.add(btn_Bebida16);
        botoesBebidas.add(btn_Bebida17);
        botoesBebidas.add(btn_Bebida18);
        botoesBebidas.add(btn_Bebida19);
        botoesBebidas.add(btn_Bebida20);

        for (int i = 0; i < botoesLanche.size(); i++) {
            botoesLanche.get(i).setVisible(false);
            botoesBebidas.get(i).setVisible(false);
        }
    }

    // método para adicionar lanche e bebida aos botoes
    private void ativarBotoes() {
        DecimalFormat df = new DecimalFormat("00.00");
        for (int i = 0; i < this.lanches.size(); i++) {
            if (lanches.get(i) != null) {
                botoesLanche.get(i).setVisible(true);
                botoesLanche.get(i).setText(this.lanches.get(i).getNome());
            }
        }
        for (int i = 0; i < this.bebidas.size(); i++) {
            if (bebidas.get(i) != null) {
                botoesBebidas.get(i).setVisible(true);
                botoesBebidas.get(i).setText(this.bebidas.get(i).getNome() + "  " + this.bebidas.get(i).getTamanho());
            }
        }
    }

    private Lanche lancheEscolhido(String nome) {
        Lanche lanche = new Lanche();

        for (Lanche lan : this.lanches) {
            if (lan.getNome().equalsIgnoreCase(nome)) {
                lanche.setNome(lan.getNome());
                lanche.setPreco(lan.getPreco());
                lanche.setTipo(lan.getTipo());
                lanche.setIngredientes(lan.getIngredientes());
                break;
            }
        }

        return lanche;
    }

    private Bebida bebidaEcolhida(String nome) {
        Bebida bebida = new Bebida();

        for (Bebida beb : bebidas) {
            if (nome.contains(beb.getNome())) {
                bebida.setNome(beb.getNome());
                bebida.setPreco((float) beb.getPreco());
                bebida.setTipo(beb.getTipo());
                bebida.setTamanho(beb.getTamanho());
                break;
            }
        }

        return bebida;
    }

    private void limpar() {
        lbl_Troco.setText("0,00");
        txt_Dinheiro.setText("");
        lbl_ValorCompra.setText("");

        txt_Endereco.setText("");
        txt_Numero.setText("");
        txt_Telefone.setText("");
        txt_Responsavel.setText("");
        clb_Entregar.setSelected(false);

        produtos.removeAll(produtos);
        dtm.getDataVector().removeAllElements();

        this.repaint();
    }

    private void alteraLanche(String nomeLanche) {

        Lanche lanche = lancheEscolhido(nomeLanche);

        alteracao = new AlteracaoLanche(lanche, this);

        alteracao.toFront();
        alteracao.setLocationRelativeTo(this);
        alteracao.setVisible(true);

    }

    public void adicionaTabela(Produto produ) {
        DecimalFormat df = new DecimalFormat("0.00");

        if (produ instanceof Lanche) {

            String op = (((Lanche) produ).isRepartir()) ? "Sim" : "Não";
            String op2 = (((AlteracaoLanche) alteracao).isModificacao()) ? "Não" : "Sim";
            ((Lanche) produ).setModificacao(op2);

            dtm.insertRow(dtm.getRowCount(), new Object[]{
                produ.getNome(),
                ((float) produ.getPreco()),
                ((float) ((Lanche) produ).getAdicional()),
                op,
                op2
            });
            lbl_ValorCompra.setText(df.format(calculaTotal()));

        } else if (produ instanceof Bebida) {
            dtm.insertRow(dtm.getRowCount(), new Object[]{
                produ.getNome(),
                produ.getPreco(),
                0,
                "Não",
                "Não"
            });
            lbl_ValorCompra.setText(df.format(calculaTotal()));
        }

        // mostrarProdutos();
    }

    private float calculaTotal() {
        float total = 0;
        for (Produto prod : this.produtos) {
            if (prod instanceof Lanche) {
                total += prod.getPreco() + ((Lanche) prod).getAdicional();
            } else if (prod instanceof Bebida) {
                total += prod.getPreco();
            }
        }
        return total;
    }

    private void mostraTotal() {
        lbl_ValorCompra.setText("" + calculaTotal());
    }

    private void mostrarProdutos() {
        for (Produto prod : this.produtos) {
            if (prod instanceof Lanche) {
                System.out.println(" \n\n" + prod.getNome());
                System.out.println(prod.getPreco());
                System.out.println(((Lanche) prod).getAdicional());
                System.out.println(prod.getTipo());
                for (Ingrediente ing : ((Lanche) prod).getIngredientes()) {
                    System.out.println("\t" + ing.getNome());
                    System.out.println("\t" + ing.getPrecoAdicional());
                }
            } else if (prod instanceof Bebida) {
                System.out.println("\n\n" + prod.getNome());
                System.out.println(prod.getPreco());
                System.out.println(prod.getTipo());
                System.out.println(((Bebida) prod).getTamanho());
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    private void criarArrayProdutos() {
        produtos = new ArrayList<>();
    }

    private void finaliza() {
        ArrayList<Venda> venda = new ArrayList<>();
        ArquivoVendas arqVendas = new ArquivoVendas();

        venda = arqVendas.resgatarArquivo();

        Venda ven = new Venda();

        if (clb_Entregar.isSelected()) {
            Entrega entrega = new Entrega();
            entrega.setEndereco(txt_Endereco.getText());
            entrega.setNum(txt_Numero.getText());
            entrega.setTelefone(txt_Telefone.getText());
            ven.setEntrega(entrega);
        }

        ven.setComprador(txt_Responsavel.getText());
        ven.setTotal(calculaTotal());
        ven.setProdutos(produtos);

        venda.add(ven);

        arqVendas.salvarArquivo(venda, false);

        limpar();
        criarArrayProdutos();

        JOptionPane.showMessageDialog(rootPane, "Venda Concluída!", "Venda", JOptionPane.INFORMATION_MESSAGE);
    }
}
