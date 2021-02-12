package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

public class PostagemSqliteDAO implements PostagemDAO {

    private String arquivoBanco;
    public PostagemSqliteDAO(String arquivoBanco) {
        this.arquivoBanco = arquivoBanco;
    }

    private Connection connect() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:"+this.arquivoBanco)) {
            Statement statement = connection.createStatement();

            //Criando tabela de usuários
            statement.execute("CREATE TABLE IF NOT EXISTS POSTAGEM( ID INTEGER, TITULO VARCHAR, USUARIO_ID VARCHAR, MENSAGEM VARCHAR, TIPO VARCHAR )");

            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void addPostagem(Postagem postagem) {

    }

    @Override
    public void addPostagemResposta(PostagemResposta postagemResposta) {

    }

    @Override
    public void updatePostagem(Postagem postagem) {

    }

    @Override
    public void deletePostagem(Postagem postagem) {

    }

    @Override
    public List<Postagem> listPostagens() {
        return null;
    }

    @Override
    public Postagem getPostagem(Long id) {
        return null;
    }
}
