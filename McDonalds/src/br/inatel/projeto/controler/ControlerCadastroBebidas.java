/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.CadastroBebida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WesleyReis
 */
public class ControlerCadastroBebidas implements ActionListener{

    CadastroBebida cadastroBebida;
    
    public ControlerCadastroBebidas(CadastroBebida cadastroBebida) {
        this.cadastroBebida = cadastroBebida;
        
        this.cadastroBebida.getBtm_cancelar().addActionListener(this);
        this.cadastroBebida.getBtm_salvar().addActionListener(this);
        
        this.cadastroBebida.setVisible(true);
    }   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.cadastroBebida.getBtm_cancelar()){
            cancelar();
        }else if(obj == this.cadastroBebida.getBtm_salvar()){
            
        }
    }
    
    private void cancelar(){
        
    }
    
    
}
