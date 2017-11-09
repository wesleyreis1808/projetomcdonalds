/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.view.CadastroIngrediente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author WesleyReis
 */
public class ControlerCadastroIngrediente implements ActionListener {

    CadastroIngrediente cadastroIngredientes;

    public ControlerCadastroIngrediente(CadastroIngrediente cadastroIngredientes) {
        this.cadastroIngredientes = cadastroIngredientes;

        this.cadastroIngredientes.getBtm_cancelar().addActionListener(this);
        this.cadastroIngredientes.getBtm_salvar().addActionListener(this);

        this.cadastroIngredientes.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.cadastroIngredientes.getBtm_cancelar()) {
            this.cadastroIngredientes.setVisible(false);
        } else if (obj == this.cadastroIngredientes.getBtm_salvar()) {
            if(checaCampos()){
                salvaCadastro();
            }
        }

    }

    public void salvaCadastro() {
        limparCampos();
        // salva em algum lugar
        

    }

    public boolean checaCampos() {

        if (this.cadastroIngredientes.getTxf_Nome().getText().equals("")) {
            JOptionPane.showMessageDialog(this.cadastroIngredientes, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (this.cadastroIngredientes.getTxf_precoAdd().getText().equals(" ")) {
            JOptionPane.showMessageDialog(this.cadastroIngredientes, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            try {
                Float.parseFloat(this.cadastroIngredientes.getTxf_precoAdd().getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this.cadastroIngredientes, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        return true;
    }
    void limparCampos(){
        this.cadastroIngredientes.getTxf_Nome().setText("");
        this.cadastroIngredientes.getTxf_precoAdd().setText("");
    }
}
