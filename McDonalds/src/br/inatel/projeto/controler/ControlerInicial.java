/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Funcionarios;
import br.inatel.projeto.view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author WesleyReis
 */
public class ControlerInicial implements ActionListener {

    Inicial inicial;
    Funcionarios funcionario;

    public ControlerInicial(Inicial inicial, Funcionarios funcionario) {
        this.inicial = inicial;
        this.funcionario = funcionario;

        this.inicial.getMnu_Pedidos().addActionListener(this);
        this.inicial.getMnu_Vendas().addActionListener(this);
        this.inicial.getMnu_alterar_imagem().addActionListener(this);
        this.inicial.getMnu_cadastro_bebidas().addActionListener(this);
        this.inicial.getMnu_cadastro_ingredientes().addActionListener(this);
        this.inicial.getMnu_cadastro_lanches().addActionListener(this);
        this.inicial.getMnu_historico().addActionListener(this);
        this.inicial.getMnu_remover_cadastros().addActionListener(this);
        this.inicial.getMnu_sobre().addActionListener(this);
        this.inicial.getMnu_cadastroFuncionario().addActionListener(this);
        this.inicial.getMnuSair().addActionListener(this);
        inicial.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.inicial.getMnu_Pedidos()) {
            if (this.funcionario.getNivel_acesso() == 1 || this.funcionario.getNome().equals("Admin")) { // vendedor
                mnu_Pedidos();
            } else {                                        // gerente
                JOptionPane.showMessageDialog(this.inicial, "Acesso permitido apenas para vendedores!", "Acesso Inválido", JOptionPane.WARNING_MESSAGE);
            }
        } else if (obj == this.inicial.getMnu_Vendas()) {
            if (this.funcionario.getNivel_acesso() == 1 || this.funcionario.getNome().equals("Admin")) { // vendedor
                mnu_Vendas();
            } else {                                        // gerente
                JOptionPane.showMessageDialog(this.inicial, "Acesso permitido apenas para vendedores!", "Acesso Inválido", JOptionPane.WARNING_MESSAGE);
            }
        } else if (obj == this.inicial.getMnu_alterar_imagem()) {
            alterarImagem();
        } else if (obj == this.inicial.getMnu_cadastro_bebidas()) {
            if (this.funcionario.getNivel_acesso() == 1) { // vendedor
                JOptionPane.showMessageDialog(this.inicial, "Acesso permitido apenas para gerentes!", "Acesso Inválido", JOptionPane.WARNING_MESSAGE);
            } else {                                        // gerente
                mnu_cadastro_bebidas();
            }

        } else if (obj == this.inicial.getMnu_cadastro_ingredientes()) {
            if (this.funcionario.getNivel_acesso() == 1) { // vendedor
                JOptionPane.showMessageDialog(this.inicial, "Acesso permitido apenas para gerentes!", "Acesso Inválido", JOptionPane.WARNING_MESSAGE);
            } else {                                        // gerente
                mnu_cadastro_ingredientes();
            }
        } else if (obj == this.inicial.getMnu_cadastro_lanches()) {
            if (this.funcionario.getNivel_acesso() == 1) { // vendedor
                JOptionPane.showMessageDialog(this.inicial, "Acesso permitido apenas para gerentes!", "Acesso Inválido", JOptionPane.WARNING_MESSAGE);
            } else {                                        // gerente
                mnu_cadastro_lanche();
            }
        } else if (obj == this.inicial.getMnu_historico()) {
            if (this.funcionario.getNivel_acesso() == 1) { // vendedor
                JOptionPane.showMessageDialog(this.inicial, "Acesso permitido apenas para gerentes!", "Acesso Inválido", JOptionPane.WARNING_MESSAGE);
            } else {                                        // gerente
                mnu_historico();
            }
        } else if (obj == this.inicial.getMnu_remover_cadastros()) {
            if (this.funcionario.getNivel_acesso() == 1) { // vendedor
                JOptionPane.showMessageDialog(this.inicial, "Acesso permitido apenas para gerentes!", "Acesso Inválido", JOptionPane.WARNING_MESSAGE);
            } else {                                        // gerente
                mnu_remover_cadastros();
            }
        } else if (obj == this.inicial.getMnu_sobre()) {

        } else if (obj == this.inicial.getMnu_cadastroFuncionario()) {
            if (this.funcionario.getNivel_acesso() == 1) { // vendedor
                JOptionPane.showMessageDialog(this.inicial, "Acesso permitido apenas para gerentes!", "Acesso Inválido", JOptionPane.WARNING_MESSAGE);
            } else {                                        // gerente
               mnu_cadastro_funcionarios();
            }
        }else if (obj == this.inicial.getMnuSair()) {
            Login login = new Login();
            new ControlerLogin(login);
            
            this.inicial.dispose();
        }
    }

    private void mnu_Pedidos() {
        new ControlerPedidos(new Pedidos());
    }

    private void mnu_historico() {
        new ControlerHistorico(new Historico());
    }

    private void mnu_remover_cadastros() {
        new ControlerRemove(new Remove());
    }

    private void mnu_cadastro_lanche() {
        new ControlerCadastroLanche(new CadastroLanche());
    }

    private void mnu_cadastro_ingredientes() {
        new ControlerCadastroIngrediente(new CadastroIngrediente());
    }

    private void mnu_cadastro_bebidas() {
        new ControlerCadastroBebidas(new CadastroBebida());
    }

    private void mnu_Vendas() {
        new ControlerVendas(new Vendas(),this.funcionario);
    }

    private void mnu_cadastro_funcionarios() {
        new ControlerCadastroFuncionario(new CadastroFuncionario());
    }

    private void alterarImagem() {

        // seta imagens
        try {
            // TODO add your handling code here:    
            JFileChooser chooser = new JFileChooser();//cria uma instancia do JFileChooser
            //filtro para as imagend
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG & GIF & PNG Images", "jpg", "gif", "png");
            //altera o filtro
            chooser.setFileFilter(filtro);

            String local = "";
            int returnVal = chooser.showOpenDialog(this.inicial.getLbl_imagem());//abre JFileChooser
            if (returnVal == JFileChooser.APPROVE_OPTION) {//verifica se clicou em ok
                local = (chooser.getSelectedFile().getAbsolutePath());//local recebe a localização da imagem           
            }

            File origem = new File(local);
            File destino = new File("C:\\Users\\Public\\Pictures\\telaFundo.png");
            copiarArquivo(origem, destino);

            ImageIcon img = new javax.swing.ImageIcon("C:\\Users\\Public\\Pictures\\telaFundo.png");
            img.setImage(img.getImage().getScaledInstance(617, 447, 100));

            this.inicial.getLbl_imagem().setIcon(img);
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }

// copia arquivo para pasta
    }

    public void copiarArquivo(File source, File destination) throws IOException {
        if (destination.exists()) {
            destination.delete();
        }
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(),
                    destinationChannel);
        } finally {
            if (sourceChannel != null && sourceChannel.isOpen()) {
                sourceChannel.close();
            }
            if (destinationChannel != null && destinationChannel.isOpen()) {
                destinationChannel.close();
            }
        }
    }
}
