/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Ingredientes;
import br.inatel.projeto.view.Remove;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author WesleyReis
 */
public class ControlerRemove implements ActionListener {

    Remove remove;
    ArrayList<Ingredientes> ing = new ArrayList<>();
    DefaultListModel dlm = new DefaultListModel();

    public ControlerRemove(Remove remove) {
        this.remove = remove;

        this.remove.getBtm_removeIngredientes().addActionListener(this);

        getDados();
        preencheLista();

        this.remove.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.remove.getBtm_removeIngredientes()) {
            removeIng();
        }

    }

    private void preencheLista() {
        this.remove.getLista_ingrediente().setModel(dlm);

        for (int i = 0; i < this.ing.size(); i++) {
            dlm.add(i, this.ing.get(i).getNome());
        }

    }

    private void getDados() {
        //this.ing;
        ArrayList<Ingredientes> ingredientes = this.ing;
        
        Ingredientes i1 = new Ingredientes();
        i1.setNome("Presunto");
        i1.setPreco((float) 0.50);
        ingredientes.add(i1);

        Ingredientes i2 = new Ingredientes();
        i2.setNome("Hamburger");
        i2.setPreco((float) 1.50);
        ingredientes.add(i2);
    }

    private void removeIng() {
        if (this.remove.getLista_ingrediente().getSelectedIndex() != -1) {

            int indice = this.remove.getLista_ingrediente().getSelectedIndex();
            this.ing.remove(indice);

            for (Ingredientes inge : this.ing) {
                System.out.println(inge.getNome());
            }
            System.out.println("==============================");

            dlm.clear();
            for (int i = 0; i < this.ing.size(); i++) {
                dlm.add(i, this.ing.get(i).getNome());
            }
        }
    }

}
