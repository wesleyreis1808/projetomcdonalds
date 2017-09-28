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
public interface Arquivo {
    
    public void salvarArquivo(ArrayList ing, boolean salva);
    public ArrayList resgatarArquivo();
    
}
