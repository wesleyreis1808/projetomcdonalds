/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Funcionarios;
import br.inatel.projeto.model.Ingredientes;
import br.inatel.projeto.model.Lanche;
import br.inatel.projeto.model.Tabela;
import br.inatel.projeto.view.CadastroLanche;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WesleyReis
 */
public class ControlerCadastroLanche implements ActionListener, Tabela{

    CadastroLanche cadastroLanche;
    DefaultTableModel dtm;
    DefaultListModel dlmIng = new DefaultListModel();
    DefaultListModel dlmLan = new DefaultListModel();
    Object[][] dados;
    ArrayList<Lanche> lanches;
    ArrayList<Ingredientes> ingredientes;
    
    public ControlerCadastroLanche(CadastroLanche cadastroLanche) {
        this.cadastroLanche = cadastroLanche;
        
        this.cadastroLanche.getBtm_adicionar().addActionListener(this);
        this.cadastroLanche.getBtm_cancelar().addActionListener(this);
        this.cadastroLanche.getBtm_imagem().addActionListener(this);
        this.cadastroLanche.getBtm_remover().addActionListener(this);
        this.cadastroLanche.getBtm_salvar().addActionListener(this);
        this.cadastroLanche. getBtn_deletar().addActionListener(this);
        
        getDados(); 
        preencheTabela();
        this.cadastroLanche.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        
        if(obj == this.cadastroLanche.getBtm_adicionar()){
        
        }else if(obj == this.cadastroLanche.getBtm_cancelar()){
            
        }else if(obj == this.cadastroLanche.getBtm_imagem()){
            
        }else if(obj == this.cadastroLanche.getBtm_remover()){
            
        }else if(obj == this.cadastroLanche.getBtm_salvar()){
            
        }else if(obj == this.cadastroLanche.getBtn_deletar()){
            
        }
        
    }

    @Override
    public boolean verificaCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void preencheTabela() {
        dtm = (DefaultTableModel) this.cadastroLanche.getjTable1().getModel();

        for (Lanche lan : lanches) {
            dtm.insertRow(dtm.getRowCount(), new Object[]{
                lan.getNome(),
                lan.getPreco()
            });
        }
        
        this.cadastroLanche.getLista_ingredientes().setModel(dlmIng);
        this.cadastroLanche.getLista_lanche().setModel(dlmLan);
        
        
        for(int i = 0; i < this.ingredientes.size();i++){
            dlmIng.add(i, this.ingredientes.get(i).getNome());
        }
        
        
    }

    @Override
    public void removerItemSelecionado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getDados() {

        ArrayList<Lanche> lanche = new ArrayList<>();
        ArrayList<Ingredientes> ingredientes = new ArrayList<>();
        
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
        
        
        this.ingredientes = ingredientes;
        this.lanches = lanche;
    }

    @Override
    public void salvaCadastro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limpaCampos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizarCadastro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
