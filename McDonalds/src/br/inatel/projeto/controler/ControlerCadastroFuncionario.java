/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.CadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aluno
 */
public class ControlerCadastroFuncionario implements ActionListener{

    CadastroFuncionario cadastroFuncionario;

    public ControlerCadastroFuncionario(CadastroFuncionario cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
        
        this.cadastroFuncionario.getBtn_salvar().addActionListener(this);
        
        this.cadastroFuncionario.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.cadastroFuncionario.getBtn_salvar()){
            
            
            
            
            
        }
    }    

}
