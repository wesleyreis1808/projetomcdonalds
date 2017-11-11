/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Lanche;
import br.inatel.projeto.view.AlteracaoLanche;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author WesleyReis
 */
public class ControlerAlteracaoLanche implements ActionListener {

    AlteracaoLanche alteracaoLanche;
    JFrame tela;
    
    public ControlerAlteracaoLanche(AlteracaoLanche alteracaoLanche,Lanche lanche, JFrame tela) {
        this.alteracaoLanche = alteracaoLanche;
        
        this.alteracaoLanche.getBtn_Cancelar().addActionListener(this);
        this.alteracaoLanche.getBtn_Finalizar().addActionListener(this);
        
        
        
        
        
        this.alteracaoLanche.setVisible(true);
        this.alteracaoLanche.toFront();
        this.alteracaoLanche.setLocationRelativeTo(this.tela);
        this.alteracaoLanche.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.alteracaoLanche.getBtn_Cancelar()){
            
        }else if(obj == this.alteracaoLanche.getBtn_Finalizar()){
            
        }
       
    }
    
}
