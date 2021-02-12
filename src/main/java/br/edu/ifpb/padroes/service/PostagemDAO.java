package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Postagem;
import br.edu.ifpb.padroes.modelo.PostagemResposta;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

public interface PostagemDAO {
    public void addPostagem(Postagem postagem);
    public void addPostagemResposta(PostagemResposta postagemResposta);
    public void updatePostagem(Postagem postagem);
    public void deletePostagem(Postagem postagem);
    public List<Postagem> listPostagens();
    public Postagem getPostagem(Long id);
}
