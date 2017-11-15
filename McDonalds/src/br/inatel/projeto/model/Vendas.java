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
public class Vendas {

    private int id;
    private int vendedor;
    private String data;
    private String hora;
    private String modificacao;
    private float valortotal;
    private ArrayList produtos;
    private String comprador;
    private int entregue;

    public Vendas() {
        this.entregue = 0;
        data = new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date());
        hora = new java.text.SimpleDateFormat("HH:mm:ss").format(java.util.Calendar.getInstance().getTime());
        
    }
    
    public String getDate(){
        return this.data + " " + this.hora;
    }
    
    public void setDate(String date){
        String[] array = date.split(" ");
        data = array[0];
        hora = array[1];
    }
    
    public int getEntregue() {
        return entregue;
    }

    public void setEntregue(int entregue) {
        this.entregue = entregue;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public int getVendedor() {
        return vendedor;
    }

    public void setVendedor(int vendedor) {
        this.vendedor = vendedor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getModificacao() {
        return modificacao;
    }

    public void setModificacao(String modificacao) {
        this.modificacao = modificacao;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList produtos) {
        this.produtos = produtos;
    }


}
