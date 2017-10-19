/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.CadastroLanche;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WesleyReis
 */
public class ControlerCadastroLanche implements ActionListener{

    CadastroLanche cadastroLanche;
    
    public ControlerCadastroLanche(CadastroLanche cadastroLanche) {
        this.cadastroLanche = cadastroLanche;
        
        this.cadastroLanche.getBtm_adicionar().addActionListener(this);
        this.cadastroLanche.getBtm_cancelar().addActionListener(this);
        this.cadastroLanche.getBtm_imagem().addActionListener(this);
        this.cadastroLanche.getBtm_remover().addActionListener(this);
        this.cadastroLanche.getBtm_salvar().addActionListener(this);
        
        this.cadastroLanche.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.cadastroLanche.getBtm_adicionar()){
        
        }else if(obj == this.cadastroLanche.getBtm_cancelar()){
            
        }else if(obj == this.cadastroLanche.getBtm_imagem()){
            
        }else if(obj == this.cadastroLanche.getBtm_remover()){
            
        }else if(obj == this.cadastroLanche.getBtm_salvar()){
            
        }
        
    }
}
