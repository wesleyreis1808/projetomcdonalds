/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.controler;

import br.inatel.projeto.model.Funcionarios;
import br.inatel.projeto.view.CadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class ControlerCadastroFuncionario implements ActionListener {

    CadastroFuncionario cadastroFuncionario;
    DefaultTableModel dtm;
    Object[][] dados;

    public ControlerCadastroFuncionario(CadastroFuncionario cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;

        this.cadastroFuncionario.getBtn_salvar().addActionListener(this);
        this.cadastroFuncionario.getBtn_delete().addActionListener(this);
        
        preencheTabela();

        this.cadastroFuncionario.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == this.cadastroFuncionario.getBtn_salvar()) {
            if (verificaCampos()) {
                // salva banco
            }
        } else if (obj == this.cadastroFuncionario.getBtn_delete()) {
            removerItemSelecionado();
        }
    }

    private boolean verificaCampos() {
        boolean teste = true;

        if (this.cadastroFuncionario.getTxt_nome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (this.cadastroFuncionario.getTxt_senha().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (this.cadastroFuncionario.getTxt_cpf().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (this.cadastroFuncionario.getTxt_telefone().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (!this.cadastroFuncionario.getRd_gerente().isSelected() && !this.cadastroFuncionario.getRd_vendedor().isSelected()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return teste;
    }

    private void preencheTabela() {

        dtm = (DefaultTableModel) this.cadastroFuncionario.getjTable1().getModel();

        ArrayList<Funcionarios> lista = getDados();

        for (Funcionarios func : lista) {
            dtm.insertRow(dtm.getRowCount(), new Object[]{
                func.getNome(),
                func.getCpf(),
                func.getTelefone(),
                (func.getNivel_acesso() == 1) ? "Vendedor" : "Gerente"
            });
        }

    }

    private void removerItemSelecionado() {
        //this.produtos.remove(tbl_Carrinho.getSelectedRow());
        dtm.removeRow(this.cadastroFuncionario.getjTable1().getSelectedRow());
        this.cadastroFuncionario.getjTable1().setModel(dtm);
        this.cadastroFuncionario.getjTable1().repaint();
    }

    private ArrayList getDados() {
        ArrayList<Funcionarios> funcs = new ArrayList<>();

        Funcionarios f1 = new Funcionarios();
        f1.setNome("Wesley Silva");
        f1.setNivel_acesso(2);
        f1.setCpf("1234567890");
        f1.setSenha("1234");
        f1.setTelefone("9901-2726");
        f1.setId(1);
        funcs.add(f1);

        Funcionarios f2 = new Funcionarios();
        f2.setNome("Gefão do Code");
        f2.setNivel_acesso(1);
        f2.setCpf("1234567890");
        f2.setSenha("1234");
        f2.setTelefone("9901-2726");
        f2.setId(2);
        funcs.add(f2);

        return funcs;
    }

}
