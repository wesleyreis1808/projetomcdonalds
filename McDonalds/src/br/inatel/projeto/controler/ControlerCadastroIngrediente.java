/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.CadastroIngrediente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WesleyReis
 */
public class ControlerCadastroIngrediente implements ActionListener{

    CadastroIngrediente cadastroIngredientes;
    
    public ControlerCadastroIngrediente(CadastroIngrediente cadastroIngredientes) {
        this.cadastroIngredientes = cadastroIngredientes;
        
        this.cadastroIngredientes.getBtm_cancelar().addActionListener(this);
        this.cadastroIngredientes.getBtm_salvar().addActionListener(this);
        
        this.cadastroIngredientes.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.cadastroIngredientes.getBtm_cancelar()){
            
        }else if(obj == this.cadastroIngredientes.getBtm_salvar()){
            
        }

    }
    
    
    
}
