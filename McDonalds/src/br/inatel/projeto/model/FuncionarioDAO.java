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

    public Funcionarios login(String usr, String pwd) {
        Funcionarios f = new Funcionarios();
        //se não encontrar o id fica com -1
        f.setId(-1);
        try {
            // Conecto com o Banco
            abrirConexao();
            // O metodo createStatement() cria um objeto Statement que permite enviar comandosSQL para o banco
            _st = _con.createStatement();
            // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
            _rs = _st.executeQuery("SELECT * FROM Funcionarios where nomeFuncionario='"+usr+"' AND senha='"+pwd+"'");
            // O metodo next() caminha entre as linhas da tabela de resultados retornada.
            
            while (_rs.next()) {
                f.setId(_rs.getInt(1));
                f.setCpf(_rs.getString(2));
                f.setNome(_rs.getString(3));
                f.setSenha(_rs.getString(4));
                f.setTelefone(_rs.getString(5));
                f.setNivel_acesso(_rs.getInt(6));
            }
        } catch (SQLException ex) {
            System.out.println("Erro seleciona todos: Conexão Banco! :(");
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
            fecharConexao();
        }
        return f;
    }

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

    public void editar(Funcionarios func) {
        abrirConexao();
        try {
            // Preparo a atualizacao
            _pst = _con.prepareStatement("UPDATE Funcionarios SET cpfFuncionario = ?,nomeFuncionario = ?,senha = ?,telefone = ?, nivelAcesso = ? where idFuncionarios = ?");
            _pst.setString(1, func.getCpf());
            _pst.setString(2, func.getNome());
            _pst.setString(3, func.getSenha());
            _pst.setString(4, func.getTelefone());
            _pst.setInt(5, func.getNivel_acesso());
            _pst.setInt(6, func.getId());
            // Executo a atualizacao
            _pst.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: Conexão Banco! :(");
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
            fecharConexao();
        }
    }

    public void remover(Funcionarios func) {
        abrirConexao();
        try {
            // Preparo a exclusao
            _pst = _con.prepareStatement("DELETE FROM Funcionarios WHERE idFuncionarios = ?");
            // Indico que a ? significa o Codigo do Autor
            _pst.setInt(1, func.getId());
            // Executo a exclusao
            _pst.executeUpdate();
            //System.out.println("Sucesso! ;)");
        } catch (SQLException ex) {
            System.out.println("Erro: Conexão Banco! :(");
        } finally {
            fecharConexao();
        }
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
            fecharConexao();
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
