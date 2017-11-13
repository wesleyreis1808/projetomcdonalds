/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.FuncionarioDAO;
import br.inatel.projeto.model.Funcionarios;
import br.inatel.projeto.model.Tabela;
import br.inatel.projeto.view.CadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class ControlerCadastroFuncionario implements ActionListener, Tabela {

    CadastroFuncionario cadastroFuncionario;
    FuncionarioDAO funcBD = new FuncionarioDAO();
    DefaultTableModel dtm;
    ArrayList<Funcionarios> funcionarios;
    Object[][] dados;
    private int posiSelect;

    public ControlerCadastroFuncionario(CadastroFuncionario cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;

        this.cadastroFuncionario.getBtn_salvar().addActionListener(this);
        this.cadastroFuncionario.getBtn_delete().addActionListener(this);
        this.cadastroFuncionario.getBtn_salvarEdicao().addActionListener(this);
        this.cadastroFuncionario.getjTable1().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        getDados();
        preencheTabela();

        this.cadastroFuncionario.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.cadastroFuncionario.getBtn_salvar()) {
            if (verificaCampos()) {
                salvaCadastro();
            }
        } else if (obj == this.cadastroFuncionario.getBtn_delete()) {
            removerItemSelecionado();
        }else if(obj == this.cadastroFuncionario.getBtn_salvarEdicao()){
            atualizarCadastro();
        }
    }

    @Override
    public boolean verificaCampos() {
        boolean teste = true;

        if (this.cadastroFuncionario.getTxt_nome().equals("")) {
            JOptionPane.showMessageDialog(this.cadastroFuncionario, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (this.cadastroFuncionario.getTxt_senha().equals("")) {
            JOptionPane.showMessageDialog(this.cadastroFuncionario, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (this.cadastroFuncionario.getTxt_cpf().equals("")) {
            JOptionPane.showMessageDialog(this.cadastroFuncionario, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (this.cadastroFuncionario.getTxt_telefone().equals("")) {
            JOptionPane.showMessageDialog(this.cadastroFuncionario, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!this.cadastroFuncionario.getRd_gerente().isSelected() && !this.cadastroFuncionario.getRd_vendedor().isSelected()) {
            JOptionPane.showMessageDialog(this.cadastroFuncionario, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return teste;
    }

    @Override
    public void preencheTabela() {

        dtm = (DefaultTableModel) this.cadastroFuncionario.getjTable1().getModel();
        for (Funcionarios func : funcionarios) {
            dtm.insertRow(dtm.getRowCount(), new Object[]{
                func.getNome(),
                func.getCpf(),
                func.getTelefone(),
                (func.getNivel_acesso() == 1) ? "Vendedor" : "Gerente"
            });
        }

    }

    @Override
    public void removerItemSelecionado() {
        limpaCampos();
        //this.produtos.remove(tbl_Carrinho.getSelectedRow());
        if (this.cadastroFuncionario.getjTable1().getSelectedRow() >= 0) {
            //Passa o funcionario que sera removido
            funcBD.remover(funcionarios.get(posiSelect));
            this.funcionarios.remove(posiSelect);
            dtm.removeRow(posiSelect);
            this.cadastroFuncionario.getjTable1().setModel(dtm);
            this.cadastroFuncionario.getjTable1().repaint();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha não selecionada!");
        }
    }

    @Override
    public void getDados() {
        funcionarios = funcBD.listar();
    }

    @Override
    public void salvaCadastro() {
        Funcionarios func = new Funcionarios();

        func.setNome(this.cadastroFuncionario.getTxt_nome().getText());
        func.setCpf(this.cadastroFuncionario.getTxt_cpf().getText());
        func.setTelefone(this.cadastroFuncionario.getTxt_telefone().getText());
        func.setSenha(this.cadastroFuncionario.getTxt_senha().getText());
        func.setNivel_acesso((this.cadastroFuncionario.getRd_vendedor().isSelected()) ? 1 : 2);

        funcionarios.add(func);

        //Grava no Banco de Dados
        funcBD.cadastrar(func);

        dtm.insertRow(dtm.getRowCount(), new Object[]{
            func.getNome(),
            func.getCpf(),
            func.getTelefone(),
            (func.getNivel_acesso() == 1) ? "Vendedor" : "Gerente"
        });

        // salva banco;
        limpaCampos();
    }

    @Override
    public void limpaCampos() {

        this.cadastroFuncionario.getTxt_nome().setText("");
        this.cadastroFuncionario.getTxt_cpf().setText("");
        this.cadastroFuncionario.getTxt_telefone().setText("");
        this.cadastroFuncionario.getTxt_senha().setText("");
        this.cadastroFuncionario.getButtonGroup2().clearSelection();
    }

    private void jTable1MouseClicked(MouseEvent evt) {

        limpaCampos();
        posiSelect = this.cadastroFuncionario.getjTable1().getSelectedRow();
        System.out.println(posiSelect);
        if (posiSelect >= 0) {

            Funcionarios func = this.funcionarios.get(this.cadastroFuncionario.getjTable1().getSelectedRow());

            this.cadastroFuncionario.getTxt_nome().setText(func.getNome());
            this.cadastroFuncionario.getTxt_cpf().setText(func.getCpf());
            this.cadastroFuncionario.getTxt_telefone().setText(func.getTelefone());
            this.cadastroFuncionario.getTxt_senha().setText(func.getSenha());
            if (func.getNivel_acesso() == 1) {
                this.cadastroFuncionario.getRd_vendedor().setSelected(true);
            } else {
                this.cadastroFuncionario.getRd_gerente().setSelected(true);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha não selecionada!");
        }
    }

    @Override
    public void atualizarCadastro() {

        if (posiSelect >= 0) {
            Funcionarios f = new Funcionarios();
            f.setNome(this.cadastroFuncionario.getTxt_nome().getText());
            f.setCpf(this.cadastroFuncionario.getTxt_cpf().getText());
            f.setTelefone(this.cadastroFuncionario.getTxt_telefone().getText());
            f.setSenha(this.cadastroFuncionario.getTxt_senha().getText());
            f.setId(this.funcionarios.get(posiSelect).getId());
            if (this.cadastroFuncionario.getRd_vendedor().isSelected()) {
                f.setNivel_acesso(1);
            } else {
                f.setNivel_acesso(2);
            }
            
            funcBD.editar(f);
            
            //limpa tabela e insere a atualização
//            this.funcionarios.remove(posiSelect);
//            dtm.removeRow(posiSelect);
//            this.cadastroFuncionario.getjTable1().setModel(dtm);
//            this.cadastroFuncionario.getjTable1().repaint();
//            
//            dtm.insertRow(dtm.getRowCount(), new Object[]{
//            f.getNome(),
//            f.getCpf(),
//            f.getTelefone(),
//            (f.getNivel_acesso() == 1) ? "Vendedor" : "Gerente"
//        });
            
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma linha não selecionada!");
        }
    }
}
