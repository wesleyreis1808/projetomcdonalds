/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.model;

import java.io.Serializable;

/**
 *
 * @author WesleyReis
 */
public class Ingrediente implements Serializable {
    
    private String nome;
    private float precoAdicional;

    public float getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(float precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
