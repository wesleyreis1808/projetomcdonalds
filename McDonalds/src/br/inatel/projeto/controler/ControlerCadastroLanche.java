/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Ingredientes;
import br.inatel.projeto.model.IngredientesDAO;
import br.inatel.projeto.model.Lanche;
import br.inatel.projeto.model.LancheDAO;
import br.inatel.projeto.model.Tabela;
import br.inatel.projeto.view.CadastroLanche;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WesleyReis
 */
public class ControlerCadastroLanche implements ActionListener, Tabela {

    CadastroLanche cadastroLanche;
    DefaultTableModel dtm;
    DefaultListModel dlmIng = new DefaultListModel();
    DefaultListModel dlmLan = new DefaultListModel();
    Object[][] dados;
    ArrayList<Lanche> lanches = new ArrayList<>();
    ArrayList<Ingredientes> ingredientes = new ArrayList(); // todos Ingredientes
    ArrayList<Ingredientes> ingredientesLanche = new ArrayList();
    LancheDAO lancheBD = new LancheDAO();
    private int posiSelect;

    public ControlerCadastroLanche(CadastroLanche cadastroLanche) {
        this.cadastroLanche = cadastroLanche;

        this.cadastroLanche.getBtm_adicionar().addActionListener(this);
        this.cadastroLanche.getBtm_cancelar().addActionListener(this);
        this.cadastroLanche.getBtm_imagem().addActionListener(this);
        this.cadastroLanche.getBtm_remover().addActionListener(this);
        this.cadastroLanche.getBtm_salvar().addActionListener(this);
        this.cadastroLanche.getBtn_deletar().addActionListener(this);
        this.cadastroLanche.getBtn_update().addActionListener(this);
        this.cadastroLanche.getjTable1().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });

        getDados();
        preencheTabela();
        this.cadastroLanche.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.cadastroLanche.getBtm_adicionar()) {
            adicionarIngrediente();
        } else if (obj == this.cadastroLanche.getBtm_cancelar()) {
            this.cadastroLanche.dispose();
        } else if (obj == this.cadastroLanche.getBtm_imagem()) {

        } else if (obj == this.cadastroLanche.getBtm_remover()) {
            removerIngrediente();
        } else if (obj == this.cadastroLanche.getBtm_salvar()) {
            if (verificaCampos()) {
                salvaCadastro();
            }
        } else if (obj == this.cadastroLanche.getBtn_deletar()) {
            removerItemSelecionado();
            limpaCampos();
        }else if(obj == this.cadastroLanche.getBtn_update()){
            atualizarCadastro();
        }

    }

    @Override
    public boolean verificaCampos() {

        if (this.cadastroLanche.getTxf_nome().getText().equals("")) {
            JOptionPane.showMessageDialog(this.cadastroLanche, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (this.cadastroLanche.getTxf_preco().getText().equals("")) {
            JOptionPane.showMessageDialog(this.cadastroLanche, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (this.ingredientesLanche.isEmpty()) {
            JOptionPane.showMessageDialog(this.cadastroLanche, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            Float.parseFloat(this.cadastroLanche.getTxf_preco().getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.cadastroLanche, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    @Override
    public void preencheTabela() {
        dtm = (DefaultTableModel) this.cadastroLanche.getjTable1().getModel();

        if (this.lanches != null) {
            for (Lanche lan : lanches) {
                dtm.insertRow(dtm.getRowCount(), new Object[]{
                    lan.getNome(),
                    lan.getPreco()
                });
            }
        }
        this.cadastroLanche.getLista_ingredientes().setModel(dlmIng);
        this.cadastroLanche.getLista_lanche().setModel(dlmLan);

        for (int i = 0; i < this.ingredientes.size(); i++) {
            dlmIng.add(i, this.ingredientes.get(i).getNome());
        }

    }

    @Override
    public void removerItemSelecionado() {
        limpaCampos();
        //this.produtos.remove(tbl_Carrinho.getSelectedRow());
        if (this.cadastroLanche.getjTable1().getSelectedRow() >= 0) {
            dtm.removeRow(posiSelect);
            //BD remove
            lancheBD.remover(lanches.get(posiSelect));
            this.lanches.remove(posiSelect);
            if (this.ingredientesLanche != null) {
                this.ingredientesLanche.clear();
            }

            // remover banco
            this.cadastroLanche.getjTable1().setModel(dtm);
            this.cadastroLanche.getjTable1().repaint();
        } else {
            JOptionPane.showMessageDialog(this.cadastroLanche, "Nenhuma linha não selecionada!");
        }

    }

    @Override
    public void getDados() {

        ArrayList<Lanche> lanche = new ArrayList<>();
        ArrayList<Ingredientes> ingredientes = new ArrayList<>();

        IngredientesDAO bd = new IngredientesDAO();
        ingredientes = bd.listar();
        
        LancheDAO lanc = new LancheDAO();
        lanche = lanc.listar();

        /*
        Ingredientes i1 = new Ingredientes();
        i1.setNome("Presunto");
        i1.setPreco((float) 0.50);
        ingredientes.add(i1);

        Ingredientes i2 = new Ingredientes();
        i2.setNome("Hamburger");
        i2.setPreco((float) 1.50);
        ingredientes.add(i2);

        Lanche l1 = new Lanche();
        l1.setNome("X-Tudo");
        l1.setPreco((float) 10.50);
        l1.addIngrediente(i1);
        l1.addIngrediente(i2);
        lanche.add(l1);

        Lanche l2 = new Lanche();
        l2.setNome("X-Nada");
        l2.setPreco((float) 5.50);
        l2.addIngrediente(i2);
        lanche.add(l2);
         */
        this.ingredientes = ingredientes;
        this.lanches = lanche;
    }

    @Override
    public void salvaCadastro() {

        ArrayList<Ingredientes> ingrediente = new ArrayList();
        Lanche lanche = new Lanche();

        ingrediente = this.ingredientesLanche;

        lanche.setNome(this.cadastroLanche.getTxf_nome().getText());
        lanche.setPreco(Float.parseFloat(this.cadastroLanche.getTxf_preco().getText()));
        lanche.setImage_path("VAZIO");
        lanche.setIngredientes(ingrediente);

        this.lanches.add(lanche);
        
        lancheBD.cadastrar(lanche);

        dtm.insertRow(dtm.getRowCount(), new Object[]{
            lanche.getNome(),
            "" + lanche.getPreco()
        });

        // salva banco
        limpaCampos();

    }

    @Override
    public void limpaCampos() {
        this.cadastroLanche.getTxf_nome().setText("");
        this.cadastroLanche.getTxf_preco().setText("");
        this.cadastroLanche.getLista_ingredientes().clearSelection();
        this.dlmLan.removeAllElements();
        this.ingredientesLanche = null;

    }

    private void adicionarIngrediente() {
        if (this.ingredientesLanche == null) {
            this.ingredientesLanche = new ArrayList();
        }
        if (this.cadastroLanche.getLista_ingredientes().getSelectedIndex() != -1) {
            int indice = this.cadastroLanche.getLista_ingredientes().getSelectedIndex();
            Ingredientes ing = ingredientes.get(indice);
            this.ingredientesLanche.add(ing);

            for (Ingredientes inge : this.ingredientesLanche) {
                System.out.println(inge.getNome());
            }
            System.out.println("==============================");

            dlmLan.clear();
            for (int i = 0; i < this.ingredientesLanche.size(); i++) {
                dlmLan.add(i, this.ingredientesLanche.get(i).getNome());
            }
        }
    }

    private void removerIngrediente() {
        if (this.cadastroLanche.getLista_lanche().getSelectedIndex() != -1) {

            int indice = this.cadastroLanche.getLista_lanche().getSelectedIndex();
            this.ingredientesLanche.remove(indice);

            for (Ingredientes inge : this.ingredientesLanche) {
                System.out.println(inge.getNome());
            }
            System.out.println("==============================");

            dlmLan.clear();
            for (int i = 0; i < this.ingredientesLanche.size(); i++) {
                dlmLan.add(i, this.ingredientesLanche.get(i).getNome());
            }
        }
    }

    private void jTable1MouseClicked(MouseEvent evt) {

        limpaCampos();

        if (this.cadastroLanche.getjTable1().getSelectedRow() >= 0) {
            System.out.println(this.cadastroLanche.getjTable1().getSelectedRow());
            Lanche lanche = this.lanches.get(this.cadastroLanche.getjTable1().getSelectedRow());
            posiSelect = this.cadastroLanche.getjTable1().getSelectedRow();
            this.cadastroLanche.getTxf_nome().setText(lanche.getNome());
            this.cadastroLanche.getTxf_preco().setText("" + lanche.getPreco());

            this.ingredientesLanche = lanche.getIngredientes();
            for (int i = 0; i < this.ingredientesLanche.size(); i++) {
                dlmLan.add(i, this.ingredientesLanche.get(i).getNome());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha não selecionada!");
        }
    }

    @Override
    public void atualizarCadastro() {
        
        Lanche lanche = lanches.get(posiSelect);
        lanche.setNome(this.cadastroLanche.getTxf_nome().getText());
        lanche.setPreco(Float.parseFloat(this.cadastroLanche.getTxf_preco().getText()));
        lanche.setImage_path("VAZIO");

        lancheBD.editar(lanches.get(posiSelect));
    }
}
