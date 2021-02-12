package br.edu.ifpb.padroes.service;

import java.sql.*;
import java.util.List;

import br.edu.ifpb.padroes.modelo.Usuario;

public class UsuarioSqliteDAO implements UsuarioDAO {

    private String arquivoBanco;
    public UsuarioSqliteDAO(String arquivoBanco) {
        this.arquivoBanco = arquivoBanco;
    }

    private Connection connect() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:"+this.arquivoBanco)) {
            Statement statement = connection.createStatement();

            //Criando tabela de usuários
            statement.execute("CREATE TABLE IF NOT EXISTS USUARIO( ID INTEGER, NOME VARCHAR, LOGIN VARCHAR, SENHA VARCHAR )");
            statement.execute("INSERT INTO USUARIO( ID, NOME, LOGIN, SENHA) VALUES (1, 'admin', 'admin', '123')");

            //Criando tabela de produtos
            statement.execute("CREATE TABLE IF NOT EXISTS USUARIO( ID INTEGER, NOME VARCHAR, LOGIN VARCHAR, SENHA VARCHAR )");
            statement.execute("INSERT INTO USUARIO( ID, NOME, LOGIN, SENHA) VALUES (1, 'admin', 'admin', '123')");

            PreparedStatement stmt = connection.prepareStatement("select * from USUARIO");
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Integer id = resultSet.getInt("ID");
                String nome = resultSet.getString("NOME");

                System.out.println( id + " - " + nome);
            }

            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void addUsuario(Usuario usuario) {

    }

    @Override
    public void updateUsuario(Usuario usuario) {

    }

    @Override
    public void deleteUsuario(Usuario usuario) {

    }

    @Override
    public Usuario getUsuario(Long id) {
        return null;
    }

    @Override
    public List<Usuario> listUsuarios() {
        return null;
    }
}
