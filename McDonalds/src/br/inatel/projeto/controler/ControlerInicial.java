/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author WesleyReis
 */
public class ControlerInicial implements ActionListener {

    Inicial inicial;
    
    public ControlerInicial(Inicial inicial) {
        this.inicial = inicial;
        
        this.inicial.getMnu_Pedidos().addActionListener(this);
        this.inicial.getMnu_Vendas().addActionListener(this);
        this.inicial.getMnu_alterar_imagem().addActionListener(this);
        this.inicial.getMnu_cadastro_bebidas().addActionListener(this);
        this.inicial.getMnu_cadastro_ingredientes().addActionListener(this);
        this.inicial.getMnu_cadastro_lanches().addActionListener(this);
        this.inicial.getMnu_historico().addActionListener(this);
        this.inicial.getMnu_remover_cadastros().addActionListener(this);
        this.inicial.getMnu_sobre().addActionListener(this);
        this.inicial.getMnu_cadastroFuncionario().addActionListener(this);
       
        
        inicial.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.inicial.getMnu_Pedidos()){
            mnu_Pedidos();
        }else if(obj == this.inicial.getMnu_Vendas()){
            mnu_Vendas();
        }else if(obj == this.inicial.getMnu_alterar_imagem()){
            
        }else if(obj == this.inicial.getMnu_cadastro_bebidas()){
            mnu_cadastro_bebidas();
        }else if(obj == this.inicial.getMnu_cadastro_ingredientes()){
            mnu_cadastro_ingredientes();
        }else if(obj == this.inicial.getMnu_cadastro_lanches()){
            mnu_cadastro_lanche();
        }else if(obj == this.inicial.getMnu_historico()){
            mnu_historico();
        }else if(obj == this.inicial.getMnu_remover_cadastros()){
            mnu_remover_cadastros();
        }
        else if(obj == this.inicial.getMnu_sobre()){
            
        }
        else if(obj == this.inicial.getMnu_cadastroFuncionario()){
            mnu_cadastro_funcionarios();
        }
    }
    
    
    private void mnu_Pedidos(){
        new ControlerPedidos(new Pedidos());
    }
    
    private void mnu_historico(){
        new ControlerHistorico(new Historico());
    }
    
    private void mnu_remover_cadastros(){
        new ControlerRemove(new Remove());
    }
    
    private void mnu_cadastro_lanche(){
        new ControlerCadastroLanche(new CadastroLanche());
    }

    private void mnu_cadastro_ingredientes() {
        new ControlerCadastroIngrediente(new CadastroIngrediente());
    }

    private void mnu_cadastro_bebidas() {
        new ControlerCadastroBebidas(new CadastroBebida());
    }

    private void mnu_Vendas() {
        new ControlerVendas(new Vendas());
    }

    private void mnu_cadastro_funcionarios() {
        new ControlerCadastroFuncionario(new CadastroFuncionario());
    }
}
