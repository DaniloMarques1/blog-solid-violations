package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;

import java.sql.*;
import java.util.List;

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
        Connection conexao = connect();
        try (PreparedStatement stmt = conexao.prepareStatement("INSERT INTO POSTAGEM( ID, TITULO, USUARIO_ID, MENSAGEM, TIPO) VALUES (?, ?, ?, ?, ?)")) {
            stmt.setLong(1, postagem.getId());
            stmt.setString(2, postagem.getTitulo());
            stmt.setLong(3, postagem.getUsuario().getId());
            stmt.setString(4, postagem.getMensagem());
            stmt.setString(5, postagem.getPostagemTipo());
            stmt.execute();
        } catch (SQLException ex) {
            this.trataExcecao(ex);
        }
    }

    private void trataExcecao(SQLException ex) {
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
