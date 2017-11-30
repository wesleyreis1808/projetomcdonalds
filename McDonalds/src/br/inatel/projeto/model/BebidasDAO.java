/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jefferson
 */
public class BebidasDAO {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String _url = "jdbc:mysql://sql122.main-hosting.eu:3306/u295754093_smart";

    private static final String _user = "u295754093_root";
    private static final String _password = "u_Root#2017";

    private Connection _con = null;
    private ResultSet _rs = null;
    private Statement _st = null;
    private PreparedStatement _pst = null;
    
    
    
    public ArrayList<Bebidas> listar() {
        ArrayList<Bebidas> bebidasBD = new ArrayList<>();

        try {
            // Conecto com o Banco
            abrirConexao();
            // O metodo createStatement() cria um objeto Statement que permite enviar comandosSQL para o banco
            _st = _con.createStatement();
            // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
            _rs = _st.executeQuery("SELECT * FROM Bebidas");
            // O metodo next() caminha entre as linhas da tabela de resultados retornada.
            while (_rs.next()) {
                Bebidas bebidas = new Bebidas();
                bebidas.setId(_rs.getInt(1));
                bebidas.setTamanho(_rs.getString(2));
                bebidas.setImage_path(_rs.getString(3));
                bebidas.setNome(_rs.getString(4));
                bebidas.setPreco(_rs.getFloat(5));
                bebidasBD.add(bebidas);
            }
        } catch (SQLException ex) {
            System.out.println("Erro seleciona todos: Conexão Banco! :(");
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
            fecharConexao();
        }
        return bebidasBD;
    }
    
    
    public boolean cadastrar(Bebidas b) {
        boolean gravou = false;
        // Conecto com o Banco
        gravou = abrirConexao();
        try {

            // Preparo a insercao
            _pst = _con.prepareStatement("INSERT INTO Bebidas(tamanhoBebidas, imgPathBebidas, nomeBebida, precos) VALUES( ?,  ?,  ?, ?)");
            // Cada numero indica a posicao que o valor sera inserido nas ? acima
            _pst.setString(1, b.getTamanho());
            _pst.setString(2, b.getImage_path());
            _pst.setString(3, b.getNome());
            _pst.setFloat(4, b.getPreco());

            // Executo a pesquisa
            _pst.executeUpdate();
            //System.out.println("Sucesso! ;)");
        } catch (SQLException ex) {
            System.out.println("Falha: Conexão Banco! :(" + ex);
            gravou = false;
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
            fecharConexao();
        }
        return gravou;
    }
    
    public void editar(Bebidas b) {
        abrirConexao();
        try {
            // Preparo a atualizacao
            _pst = _con.prepareStatement("UPDATE Bebidas SET tamanhoBebidas = ?,imgPathBebidas = ?,nomeBebida = ?,precos = ? where idBebidas = ?");
            _pst.setString(1, b.getTamanho());
            _pst.setString(2, b.getImage_path());
            _pst.setString(3, b.getNome());
            _pst.setFloat(4, b.getPreco());
            _pst.setInt(5, b.getId());
            // Executo a atualizacao
            _pst.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: Conexão Banco! :(");
            System.out.println(ex);
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
            fecharConexao();
        }
    }

    public void remover(Bebidas b) {
        abrirConexao();
        try {
            // Preparo a exclusao
            _pst = _con.prepareStatement("DELETE FROM Bebidas WHERE idBebidas = ?");
            // Indico que a ? significa o Codigo do Autor
            _pst.setInt(1, b.getId());
            // Executo a exclusao
            _pst.executeUpdate();
            //System.out.println("Sucesso! ;)");
        } catch (SQLException ex) {
            System.out.println("Erro: Conexão Banco! :(");
        } finally {
            fecharConexao();
        }
    }
    
    public boolean abrirConexao() {
        try {
            _con = DriverManager.getConnection(_url, _user, _password);
            System.out.println("Conexão Banco! :)");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro: Conexão Banco! :(");
            return false;
        }
    }

    public void fecharConexao() {
        try {
            if (_rs != null) {
                _rs.close();
            }
            if (_st != null) {
                _st.close();
            }
            if (_con != null) {
                _con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Erro seleciona todos: Conexão não pode ser fechada! :(");
        }
    }
}
