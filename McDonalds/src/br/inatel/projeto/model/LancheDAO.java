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

/**
 *
 * @author Jefferson
 */
public class LancheDAO {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String _url = "jdbc:mysql://sql122.main-hosting.eu:3306/u295754093_smart";

    private static final String _user = "u295754093_root";
    private static final String _password = "u_Root#2017";

    private Connection _con = null;
    private ResultSet _rs = null;
    private Statement _st = null;
    private PreparedStatement _pst = null;

    public boolean cadastrar(Lanche l) {

        boolean gravou = false;
        // Conecto com o Banco
        gravou = abrirConexao();

        try {

            // Preparo a insercao
            _pst = _con.prepareStatement("INSERT INTO Lanche(nomeLanches, precoLanches, imgPathLanches) VALUES( ?,  ?,  ?)");
            // Cada numero indica a posicao que o valor sera inserido nas ? acima
            _pst.setString(1, l.getNome());
            _pst.setFloat(2, l.getPreco());
            _pst.setString(3, l.getImage_path());

            // Executo a pesquisa
            _pst.executeUpdate();
            //System.out.println("Sucesso! ;)");

            // O metodo createStatement() cria um objeto Statement que permite enviar comandosSQL para o banco
            _st = _con.createStatement();
            // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
            _rs = _st.executeQuery("SELECT idLanche FROM Lanche ORDER BY idLanche DESC LIMIT 1;");

            Lanche rt = new Lanche();
            
            while (_rs.next()) rt.setId(_rs.getInt(1));

            for (int i = 0; i < l.getIngredientes().size(); i++) {
                // Preparo a insercao
                _pst = _con.prepareStatement("INSERT INTO Lanche_Has_Ingredientes (Lanche_idLanche, Ingredientes_idIngredientes) VALUES( ?,  ?)");
                // Cada numero indica a posicao que o valor sera inserido nas ? acima
                _pst.setInt(1, l.getId());
                _pst.setInt(2, rt.getIngredientes().get(i).getId());
            }

        } catch (SQLException ex) {
            System.out.println("Falha: Conexão Banco! :(" + ex);
            gravou = false;
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
            fecharConexao();
        }
        return gravou;
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
