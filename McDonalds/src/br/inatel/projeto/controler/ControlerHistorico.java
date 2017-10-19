/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.Historico;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WesleyReis
 */
public class ControlerHistorico implements ActionListener {

    Historico historico;

    public ControlerHistorico(Historico historico) {
        this.historico = historico;
        
        this.historico.getBtn_Cancelar().addActionListener(this);
        this.historico.getBtn_Limpar().addActionListener(this);
        this.historico.getBtn_Ok().addActionListener(this);
        
        this.historico.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.historico.getBtn_Cancelar()){
            
        }else if(obj == this.historico.getBtn_Limpar()){
            
        }else if(obj == this.historico.getBtn_Ok()){
            
        }
    }
    
}
