package appbookelandia.dal;

import appbookelandia.model.Cliente;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

public class ClienteDAO implements ICrud<Cliente> {

    private Conexao conexao;

    public ClienteDAO() {
        this.conexao = new Conexao();
    }

    @Override
    public Cliente recupera(String id) throws SQLException {
        //cria string consulta
        String sql = "select cpf, nome, endereco, telefone, dataDeCadastro from clientes where cpf = ?;";
        //cria a declaração sql
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        // inclui parametro da consulta na declaracao sql
        ps.setString(1, id);
        // executa a consulta no DB
        ps.execute();

        //recupera os dados do DB
        ResultSet resultado = ps.getResultSet();
        //move o cursor do db para a próxima linda (1ª linha da tabela)
        resultado.next();

        //cria o objeto cliebte oara ser preenchido com dados do DB
        Cliente c = new Cliente();
        c.setCpf(resultado.getString("cpf"));
        c.setNome(resultado.getString("nome"));
        c.setEndereco(resultado.getString("endereco"));
        c.setTelefone(resultado.getString("telefone"));
        c.setDataDeCadastro(resultado.getDate("dataDeCadastro").toLocalDate());

        //fecha conexao
        conexao.fecha();

        //retorna a conexão
        return c;
    }

    @Override
    public void adiciona(Cliente t) throws SQLException {
        //string sql
        String sql = "insert into clientes (cpf, nome, endereco, telefone, dataDeCadastro) values (?, ?, ?, ?, ?);";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, t.getCpf());
        ps.setString(2, t.getNome());
        ps.setString(3, t.getEndereco());
        ps.setString(4, t.getTelefone());
        ps.setDate(5, Date.valueOf(t.getDataDeCadastro()));
        ps.execute();
        conexao.fecha();
    }

    @Override
    public void altera(Cliente t) throws SQLException {
        //string sql
        String sql = "update clientes set cpf, nome, endereco, telefone,";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, t.getCpf());
        ps.setString(2, t.getNome());
        ps.setString(3, t.getEndereco());
        ps.setString(4, t.getTelefone());
        ps.execute();
        conexao.fecha();
    }

    @Override
    public void exclui(Cliente t) throws SQLException {
        String sql = "delete from clientes cpf = '?' ";
        PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
        ps.setString(1, t.getCpf());
        ps.setString(2, t.getNome());
        ps.setString(3, t.getEndereco());
        ps.setString(4, t.getTelefone());
        ps.setDate(5, Date.valueOf(t.getDataDeCadastro()));
        ps.execute();
        conexao.fecha();
    }

}
