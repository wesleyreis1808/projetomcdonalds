/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.*;


/**
 *
 * @author WesleyReis
 */
public class Main {
    
    public static void main(String[] args) {
        Inicial inicial = new Inicial();
        new ControlerInicial(inicial);
    }
    
}