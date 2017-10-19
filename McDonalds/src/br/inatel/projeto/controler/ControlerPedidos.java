/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.Pedidos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WesleyReis
 */
public class ControlerPedidos implements ActionListener{

    Pedidos pedidos;
    
    public ControlerPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
        
        this.pedidos.getBtn_Anterior().addActionListener(this);
        this.pedidos.getBtn_Cancelar().addActionListener(this);
        this.pedidos.getBtn_Entregue().addActionListener(this);
        this.pedidos.getBtn_Primeiro().addActionListener(this);
        this.pedidos.getBtn_Proximo().addActionListener(this);
        this.pedidos.getBtn_Ultimo().addActionListener(this);
        this.pedidos.getMnu_atualizar_pedidos().addActionListener(this);
        
        
        this.pedidos.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.pedidos.getBtn_Anterior()){
            
        }else if(obj == this.pedidos.getBtn_Cancelar()){
            
        }else if(obj == this.pedidos.getBtn_Entregue()){
            
        }else if(obj == this.pedidos.getBtn_Primeiro()){
            
        }else if(obj == this.pedidos.getBtn_Proximo()){
            
        }else if(obj == this.pedidos.getBtn_Ultimo()){
            
        }else if(obj == this.pedidos.getMnu_atualizar_pedidos()){
            
        }
        
    }
    
}
