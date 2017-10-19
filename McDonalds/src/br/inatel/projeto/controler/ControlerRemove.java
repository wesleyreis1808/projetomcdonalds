/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.Remove;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WesleyReis
 */
public class ControlerRemove implements ActionListener {

    Remove remove;
    
    public ControlerRemove(Remove remove) {
        this.remove = remove;
    
        this.remove.getBtm_removeBebida().addActionListener(this);
        this.remove.getBtm_removeIngredientes().addActionListener(this);
        this.remove.getBtm_removerLanche().addActionListener(this);
    
        this.remove.setVisible(true);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.remove.getBtm_removeBebida()){
            
        }else if(obj == this.remove.getBtm_removeIngredientes()){
            
        }else if(obj == this.remove.getBtm_removerLanche()){
            
        }
        
    }
    
}
