/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.model;

import java.util.ArrayList;

/**
 *
 * @author WesleyReis
 */
public class Teste {
    public static void main(String[] args) {
        
        ArquivoLanche mi = new ArquivoLanche();
        ArrayList<Ingrediente> ing = new ArrayList<>();
        ArrayList<Lanche> lan = new ArrayList<>();
        
        Ingrediente n1 = new Ingrediente();
        n1.setNome("Bacon");
        n1.setPrecoAdicional((float) 2.00);
        
        Ingrediente n2 = new Ingrediente();
        n2.setNome("Ovo");
        n2.setPrecoAdicional((float) 1.00);
        
        Ingrediente n3 = new Ingrediente();
        n3.setNome("Hamburger");
        n3.setPrecoAdicional((float) 1.50);
        
        ing.add(n1);
        ing.add(n2);
        
        
        Lanche l1 = new Lanche();
        l1.setNome("Americano");
        l1.setPreco((float) 8.00);
        l1.setTipo("Lanche");
        l1.setIngredientes(ing);
        
        Lanche l2 = new Lanche();
        l2.setNome("X-Tudo");
        l2.setPreco((float) 11.00);
        l2.setTipo("Lanche");
        l2.setIngredientes(ing);
        
        ing.add(n3);
        
        lan.add(l1);
        lan.add(l2);
        
        mi.salvarArquivo(lan,false);
        mi.escreverArray(mi.resgatarArquivo());
        
        ArrayList<Bebida> beb = new ArrayList<>();
        
        Bebida b1 = new Bebida();
        b1.setNome("Coca-Cola");
        b1.setTipo("Bebida");
        b1.setTamanho("600ml");
        b1.setPreco((float) 5.00);
        
        Bebida b2 = new Bebida();
        b2.setNome("Sprit");
        b2.setTipo("Bebida");
        b2.setTamanho("Lata");
        b2.setPreco((float) 3.50);
        
        Bebida b3 = new Bebida();
        b3.setNome("Fanta");
        b3.setTipo("Bebida");
        b3.setTamanho("600ml");
        b3.setPreco((float) 5.00);
        
        beb.add(b1);
        beb.add(b2);
        beb.add(b3);
        
        ArquivoBebidas be = new ArquivoBebidas();
        be.salvarArquivo(beb, false);
        be.escreverArray(be.resgatarArquivo());
    }
    
}
