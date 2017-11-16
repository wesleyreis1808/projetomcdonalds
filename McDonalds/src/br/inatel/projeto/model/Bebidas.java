/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.model;

/**
 *
 * @author WesleyReis
 */
public class Bebidas extends Produtos {

    private String tamanho;
    private String image_path;

    public String getTamanho() {
        return tamanho;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

}
