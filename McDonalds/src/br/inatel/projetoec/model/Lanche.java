/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author WesleyReis
 */
public class Lanche extends Produto implements Serializable{
    
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    private boolean repartir;
    private boolean levar;
    private float adicional;
    private String observacao;
    private String modificacao;

    public String getModificacao() {
        return modificacao;
    }

    public void setModificacao(String modificacao) {
        this.modificacao = modificacao;
    }

 

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isRepartir() {
        return repartir;
    }

    public void setRepartir(boolean repartir) {
        this.repartir = repartir;
    }

    public boolean isLevar() {
        return levar;
    }

    public void setLevar(boolean levar) {
        this.levar = levar;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }
    
    
}
