package br.inatel.projeto.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jefferson
 */
public class FuncionarioDAO {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String _url = "jdbc:mysql://sql122.main-hosting.eu:3306/u295754093_smart";

    private static final String _user = "u295754093_root";
    private static final String _password = "u_Root#2017";

    private Connection _con = null;
    private ResultSet _rs = null;
    private Statement _st = null;
    private PreparedStatement _pst = null;

    public boolean cadastrar(Funcionarios f) {
        boolean gravou = false;
        // Conecto com o Banco
        gravou = abrirConexao();

        try {

            // Preparo a insercao
            _pst = _con.prepareStatement("INSERT INTO Funcionarios(cpfFuncionario, nomeFuncionario, senha, telefone, nivelAcesso) VALUES( ?,  ?,  ?, ?, ?)");

            // Cada numero indica a posicao que o valor sera inserido nas ? acima
            _pst.setString(1, f.getCpf());
            _pst.setString(2, f.getNome());
            _pst.setString(3, f.getSenha());
            _pst.setString(4, f.getTelefone());
            _pst.setInt(5, f.getNivel_acesso());

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

    public void editar() {

    }

    public void remover() {

    }

    public ArrayList<Funcionarios> listar() {
        ArrayList<Funcionarios> func = new ArrayList<>();

        try {
            // Conecto com o Banco
            abrirConexao();
            // O metodo createStatement() cria um objeto Statement que permite enviar comandosSQL para o banco
            _st = _con.createStatement();
            // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
            _rs = _st.executeQuery("SELECT * FROM Funcionarios");
            // O metodo next() caminha entre as linhas da tabela de resultados retornada.
            while (_rs.next()) {
                Funcionarios f = new Funcionarios();
                f.setId(_rs.getInt(1));
                f.setCpf(_rs.getString(2));
                f.setNome(_rs.getString(3));
                f.setSenha(_rs.getString(4));
                f.setTelefone(_rs.getString(5));
                f.setNivel_acesso(_rs.getInt(6));
                func.add(f);
            }
        } catch (SQLException ex) {
            System.out.println("Erro seleciona todos: Conexão Banco! :(");
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
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
        return func;
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
