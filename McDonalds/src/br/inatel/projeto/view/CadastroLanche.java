package br.inatel.projeto.view;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CadastroLanche extends javax.swing.JFrame {

    public CadastroLanche() {

        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/inatel/projeto/imagens/images.png")));
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
        jLabel1 = new javax.swing.JLabel();
        btm_remover = new javax.swing.JButton();
        _lblLancheImagem = new javax.swing.JLabel();
        btm_imagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        painel_cadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        painel_cadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btm_salvar.setText("SALVAR");
        painel_cadastro.add(btm_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        btm_cancelar.setText("CANCELAR");
        painel_cadastro.add(btm_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        jScrollPane1.setViewportView(lista_ingredientes);

        painel_cadastro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 210, -1));

        btm_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/imagens/right-arrow.png"))); // NOI18N
        painel_cadastro.add(btm_adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 110, -1));

        txf_preco.setText("0,00 ");
        painel_cadastro.add(txf_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 164, -1));

        label_preco.setText("PREÇO R$");
        painel_cadastro.add(label_preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        label_ingredientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_ingredientes.setText("INGREDIENTES");
        painel_cadastro.add(label_ingredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));
        painel_cadastro.add(txf_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 164, -1));

        label_nome.setText("NOME");
        painel_cadastro.add(label_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, -1));

        jScrollPane2.setViewportView(lista_lanche);

        painel_cadastro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 210, -1));

        label_lanche.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_lanche.setText("LANCHE");
        painel_cadastro.add(label_lanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));
        painel_cadastro.add(label_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 90, -1, 100));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE LANCHES");
        painel_cadastro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btm_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/imagens/left-pointing-arrow.png"))); // NOI18N
        painel_cadastro.add(btm_remover, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 110, -1));
        painel_cadastro.add(_lblLancheImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 130, 90));

        btm_imagem.setText("Imagem");
        painel_cadastro.add(btm_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 130, -1));

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
    private javax.swing.JLabel _lblLancheImagem;
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

    public JButton getBtm_imagem() {
        return btm_imagem;
    }

    public JButton getBtm_adicionar() {
        return btm_adicionar;
    }

    public JButton getBtm_cancelar() {
        return btm_cancelar;
    }

    public JButton getBtm_remover() {
        return btm_remover;
    }

    public JButton getBtm_salvar() {
        return btm_salvar;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JLabel getLabel_imagem() {
        return label_imagem;
    }

    public JLabel getLabel_ingredientes() {
        return label_ingredientes;
    }

    public JLabel getLabel_lanche() {
        return label_lanche;
    }

    public JLabel getLabel_nome() {
        return label_nome;
    }

    public JLabel getLabel_preco() {
        return label_preco;
    }

    public JList<String> getLista_ingredientes() {
        return lista_ingredientes;
    }

    public JList<String> getLista_lanche() {
        return lista_lanche;
    }

    public JPanel getPainel_cadastro() {
        return painel_cadastro;
    }

    public JTextField getTxf_nome() {
        return txf_nome;
    }

    public JTextField getTxf_preco() {
        return txf_preco;
    }

    public JLabel getLblLancheImagem() {
        return _lblLancheImagem;
    }

}
