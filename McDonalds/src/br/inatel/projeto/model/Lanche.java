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
    private float adicional;

    public Lanche() {
        this.ingredientes = new ArrayList<>();
    }

    
    

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }

    
    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public void addIngrediente(Ingredientes i) {
        ingredientes.add(i);
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

}
