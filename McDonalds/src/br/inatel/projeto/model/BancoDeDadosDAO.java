
package br.inatel.projeto.model;
import java.sql.*;

public class BancoDeDadosDAO {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String _url = "jdbc:mysql://sql122.main-hosting.eu:3306/u295754093_smart";

    private static final String _user = "u295754093_root";
    private static final String _password = "u_Root#2017";
    
    private Connection _con = null;
    private ResultSet _rs = null;
    private Statement _st = null;
    private PreparedStatement _pst = null;
    
    public boolean abrirConexao(){
        try {
            _con = DriverManager.getConnection(_url, _user, _password);
            System.out.println("Conexão Banco! :)");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro: Conexão Banco! :(");
            return false;
        }
    }
    
    public void fecharConexao(){
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
    
    public void buscarDados(){
        try {
            // Conecto com o Banco
            abrirConexao();
            // O metodo createStatement() cria um objeto Statement que permite enviar comandosSQL para o banco
            _st = _con.createStatement();
            // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
            _rs = _st.executeQuery("SELECT * FROM estudantes");
            // O metodo next() caminha entre as linhas da tabela de resultados retornada.
            while (_rs.next()) {
                System.out.println("Nome: " + _rs.getString(1));
                System.out.println("Tradução: " + _rs.getString(2)); 
                System.out.println("Dificuldade: " + _rs.getInt(3));
            }
        } catch (SQLException ex) {
            System.out.println("Erro seleciona todos: Conexão Banco! :(");
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
            fecharConexao();
        }
    }
    
}
