/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.model;

import java.util.ArrayList;

/**
 *
 * @author WesleyReis
 */
public class Lanche extends Produtos {
    
    private String image_path;
    private ArrayList<Ingredientes> ingredientes;

    public Lanche() {
        this.ingredientes = new ArrayList<>();
    }
    
    
    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }
    
    public void addIngrediente(Ingredientes i){
        ingredientes.add(i);
    }
           
    
}
