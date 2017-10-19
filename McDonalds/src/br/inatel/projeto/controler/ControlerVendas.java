/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.Vendas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author WesleyReis
 */
public class ControlerVendas implements ActionListener{

    Vendas vendas;
    public ControlerVendas(Vendas vendas) {
        this.vendas = vendas;
        
        
        for(JButton botao:this.vendas.getArrayBotoesBebidas()){
            botao.addActionListener(this);
            //botao.setVisible(false);
        }
        for(JButton botao:this.vendas.getArrayBotoesLanches()){
            botao.addActionListener(this);
            //botao.setVisible(false);
        }
        this.vendas.getBtn_Calcular().addActionListener(this);
        this.vendas.getBtn_Cancelar().addActionListener(this);
        this.vendas.getBtn_Finalizar().addActionListener(this);
        this.vendas.getBtn_Remover().addActionListener(this);
        
        this.vendas.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.vendas.getBtn_Calcular()){
            
        }else if(obj == this.vendas.getBtn_Cancelar()){
            
        }else if(obj == this.vendas.getBtn_Finalizar()){
            
        }else if(obj == this.vendas.getBtn_Remover()){
            
        }else if(this.vendas.getArrayBotoesBebidas().contains(obj)){
            System.out.println("Bebidas");
        }else if(this.vendas.getArrayBotoesLanches().contains(obj)){
            System.out.println("Lanches");
        }
        
        for(JButton botao:this.vendas.getArrayBotoesBebidas()){
            if(obj == botao){
                System.out.println(botao.getText());
            }
        }
        for(JButton botao:this.vendas.getArrayBotoesLanches()){
            if(obj == botao){
                System.out.println(botao.getText());
            }
        }
    }
    
}
