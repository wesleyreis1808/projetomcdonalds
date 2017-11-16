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
public interface Tabela {
    boolean verificaCampos();
    void preencheTabela();
    void removerItemSelecionado();
    void getDados();
    void salvaCadastro();
    void limpaCampos();
    void atualizarCadastro();
    
}
