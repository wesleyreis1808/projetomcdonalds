/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.FuncionarioDAO;
import br.inatel.projeto.model.Funcionarios;
import br.inatel.projeto.view.Inicial;
import br.inatel.projeto.view.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ControlerLogin implements ActionListener {

    Login login;
    FuncionarioDAO funcDB = new FuncionarioDAO();

    public ControlerLogin(Login login) {
        this.login = login;

        this.login.getbtn_entrar().addActionListener(this);
        this.login.getTxt_senha().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_senhaKeyPressed(evt);
            }

            private void txt_senhaKeyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    verificaLogin();
                }
            }
        });
        

        this.login.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.login.getbtn_entrar()) {
            verificaLogin();
        }
    }

    public void verificaLogin() {
        Funcionarios f = new Funcionarios();
        f = funcDB.login(this.login.getTxt_email().getText(), this.login.getTxt_senha().getText());
        //ID -1 quer dizer que não existe funcionario com usuario/login no banco de dados
        if (f.getId() != -1) {
            if (f.getNome().equals(this.login.getTxt_email().getText()) && f.getSenha().equals(this.login.getTxt_senha().getText())) {
                
                Inicial inicial = new Inicial();
                new ControlerInicial(inicial,f);
                this.login.dispose();
                
            } else {
                JOptionPane.showMessageDialog(this.login, "Usuário/Senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this.login, "Usuário/Senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
}
