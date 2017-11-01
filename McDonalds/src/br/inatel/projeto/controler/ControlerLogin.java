/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.Inicial;
import br.inatel.projeto.view.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aluno
 */
public class ControlerLogin implements ActionListener{

    Login login;
    
    public ControlerLogin(Login login) {
        this.login = login;
        
        this.login.getbtn_entrar().addActionListener(this);
        
        this.login.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
       
        if(obj == this.login.getbtn_entrar()){
            
            
            Inicial inicial = new Inicial();
            new ControlerInicial(inicial);
            
            this.login.setVisible(false);
            
        }

    }
    
}
