/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetoec.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author WesleyReis
 */
public class Venda implements Serializable {
    
    private static long generator = 1;
    private String comprador;
    private long codigo;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private float total;
    private String data;
    private String hora;
    private Entrega entrega;
    private boolean entregue;
    
    
    public Venda(){
        this.entregue = false;
        codigo = generator;
        generator++;
        data = new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date());
        hora = new java.text.SimpleDateFormat("HH:mm:ss").format(java.util.Calendar.getInstance().getTime());
    }

    
    public long getCodigo() {
        return codigo;
    }

    public String getHora() {
        return hora;
    }

    public String getData() {
        return data;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }
    
    
       
}
