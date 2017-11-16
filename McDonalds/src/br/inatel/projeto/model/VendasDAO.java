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

    public ArrayList<Vendas> listar() {
        ArrayList<Vendas> vend = new ArrayList<>();
        try {
            // Conecto com o Banco
            abrirConexao();
            // O metodo createStatement() cria um objeto Statement que permite enviar comandosSQL para o banco
            _st = _con.createStatement();
            // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
            _rs = _st.executeQuery("SELECT Vendas.idVendas, Vendas.vendaResponsavel,Vendas.vendaData, Vendas.vendaPreco,Vendas.vendaConcluida FROM Vendas");
            // O metodo next() caminha entre as linhas da tabela de resultados retornada.
            while (_rs.next()) {
                Vendas v = new Vendas();
                v.setId(_rs.getInt(1));
                v.setComprador(_rs.getString(2));
                v.setDate(_rs.getString(3));
                v.setValortotal(_rs.getFloat(4));
                v.setEntregue(_rs.getInt(5));
                v.setProdutos(new ArrayList<>());
                vend.add(v);
            }

            for (Vendas vendas : vend) {
                _rs = _st.executeQuery("SELECT Lanche.nomeLanches, Vendas_has_Lanche.modificacao  from Vendas INNER JOIN Vendas_has_Lanche ON Vendas.idVendas = Vendas_has_Lanche.Vendas_idVendas INNER JOIN Lanche ON Vendas_has_Lanche.Lanche_idLanche= Lanche.idLanche WHERE Vendas.idVendas = " + vendas.getId());
                while (_rs.next()) {
                    Lanche l = new Lanche();
                    l.setNome(_rs.getString(1));
                    l.setModificacao(_rs.getString(2));
                    vendas.getProdutos().add(l);
                }
            }
            for (Vendas vendas : vend) {
                _rs = _st.executeQuery("SELECT Bebidas.nomeBebida, Bebidas.tamanhoBebidas from Vendas INNER JOIN Vendas_has_Lanche ON Vendas.idVendas = Vendas_has_Lanche.Vendas_idVendas INNER JOIN Vendas_has_Bebidas ON Vendas.idVendas = Vendas_has_Bebidas.Vendas_idVendas INNER JOIN Bebidas ON Vendas_has_Bebidas.Bebidas_idBebidas=Bebidas.idBebidas WHERE Vendas.idVendas = " + vendas.getId());
                while (_rs.next()) {
                    Bebidas b = new Bebidas();
                    b.setNome(_rs.getString(1));
                    b.setTamanho(_rs.getString(2));
                    vendas.getProdutos().add(b);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro seleciona todos: Conexão Banco! :(");
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
            fecharConexao();
        }
        return vend;
    }

    public boolean cadastrar(Vendas v) {

        boolean gravou = false;
        // Conecto com o Banco
        gravou = abrirConexao();

        try {

            // Preparo a insercao
            _pst = _con.prepareStatement("INSERT INTO Vendas(vendaPreco, vendaModificar, vendaConcluida, vendaData, vendaResponsavel, Funcionarios_idFuncionarios) VALUES( ?,  ?,  ?, ?, ?, ?)");
            // Cada numero indica a posicao que o valor sera inserido nas ? acima
            _pst.setFloat(1, v.getValortotal());
            _pst.setString(2, v.getModificacao());
            _pst.setInt(3, v.getEntregue());
            _pst.setString(4, v.getDate());
            _pst.setString(5, v.getComprador());
            _pst.setInt(6, v.getVendedor());
            // Executo a pesquisa
            _pst.executeUpdate();
            
            
            //========================== pegar ultimo id
             _st = _con.createStatement();
            // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
            _rs = _st.executeQuery("SELECT idVendas FROM Vendas ORDER BY idVendas DESC LIMIT 1;");


            while (_rs.next()) {
                v.setId(_rs.getInt(1));
                //System.out.println(v.getId());
            }
            
            //========================== 
            _pst = _con.prepareStatement("INSERT INTO Vendas_has_Bebidas(Vendas_idVendas, Bebidas_idBebidas) VALUES(?, ?)");

            for (Produtos p : v.getProdutos()) {
                if (p instanceof Bebidas) {
                    _pst.setInt(1, v.getId());
                    _pst.setInt(2, p.getId());
                    _pst.executeUpdate();
                }
            }

            _pst = _con.prepareStatement("INSERT INTO Vendas_has_Lanche(Vendas_idVendas, Lanche_idLanche,modificacao) VALUES(?, ?,?)");

            for (Produtos p : v.getProdutos()) {
                if (p instanceof Lanche) {
                    System.out.printf("Lache %d midificacao %s",p.getId(), p.getModificacao());
                    _pst.setInt(1, v.getId());
                    _pst.setInt(2, p.getId());
                    _pst.setString(3, p.getModificacao());
                    _pst.executeUpdate();
                }
            }

            //System.out.println("Sucesso! ;)");
            // O metodo createStatement() cria um objeto Statement que permite enviar comandosSQL para o banco
            _st = _con.createStatement();
            // O ResultSet gera uma tabela de dados retornados por uma pesquisa SQL.
            _rs = _st.executeQuery("SELECT idLanche FROM Lanche ORDER BY idLanche DESC LIMIT 1;");

        } catch (SQLException ex) {
            System.out.println("Falha: Conexão Banco! :'(" + ex);
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
    
    public void updatePedido(Vendas v){
        abrirConexao();
        try {
            // Preparo a atualizacao
            _pst = _con.prepareStatement("UPDATE Vendas SET vendaConcluida = ? where idVendas = ?");
            _pst.setInt(1, 1);
            _pst.setInt(2, v.getId());;
            // Executo a atualizacao
            _pst.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro: Conexão Banco! :(");
        } finally {
            // Independente se a conexao deu certo ou errado, fecha as conexoes pendentes
            fecharConexao();
        }
    }
}
