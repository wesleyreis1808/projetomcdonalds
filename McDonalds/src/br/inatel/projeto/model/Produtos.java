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
public class Produtos {

    private int id;
    private String nome;
    private float preco;
    private String modificacao;

    public String getModificacao() {
        return modificacao;
    }

    public void setModificacao(String modificacao) {
        this.modificacao = modificacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
