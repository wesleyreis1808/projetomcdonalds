
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
public class VendasDAO {
    
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String _url = "jdbc:mysql://sql122.main-hosting.eu:3306/u295754093_smart";

    private static final String _user = "u295754093_root";
    private static final String _password = "u_Root#2017";

    private Connection _con = null;
    private ResultSet _rs = null;
    private Statement _st = null;
    private PreparedStatement _pst = null;
    
    
    public ArrayList<Lanche> listar() {
        ArrayList<Lanche> lanc = new ArrayList<>();
        try {
            // Conecto com o Banco
            abrirConexao();
            // O metodo createStatement() cria um objeto Statement que permite enviar comandosSQL para o banco
            _st = _con.createStatement();
            // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
            _rs = _st.executeQuery("SELECT * FROM Vendas");
            // O metodo next() caminha entre as linhas da tabela de resultados retornada.
            
            while (_rs.next()) {
                Lanche l = new Lanche();
                l.setId(_rs.getInt(1));
                l.setNome(_rs.getString(2));
                l.setPreco(_rs.getFloat(3));
                l.setImage_path(_rs.getString(4));
                lanc.add(l);
            }
            
            for (int i = 0; i < lanc.size(); i++) {
//               _rsIng = _st.executeQuery("SELECT *FROM Lanche_has_Ingredientes AS l INNER JOIN Ingredientes AS i ON l.Ingredientes_idIngredientes = i.idIngredientes where l.Lanche_idLanche ="+lanc.get(i).getId()+"");
//                ArrayList<Ingredientes> ingArray = new ArrayList<>();
//                lanc.get(i).setIngredientes(ingArray);
//                // O metodo next() caminha entre as linhas da tabela de resultados retornada.
//                while (_rsIng.next()) {
//                    Ingredientes ing = new Ingredientes();
//                    ing.setId(_rsIng.getInt(3));
//                    ing.setNome(_rsIng.getString(4));
//                    ing.setPreco(_rsIng.getFloat(5));
//                    ingArray.add(ing);
//                } 
            }   
        } catch (SQLException ex) {
            System.out.println("Erro seleciona todos: Conexão Banco! :(");
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
            fecharConexao();
        }
        return lanc;
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
