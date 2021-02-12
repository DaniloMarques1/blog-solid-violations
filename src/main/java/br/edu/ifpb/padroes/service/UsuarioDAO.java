package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Usuario;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

public interface UsuarioDAO {
    public void addUsuario(Usuario usuario);
    public void updateUsuario(Usuario usuario);
    public void deleteUsuario(Usuario usuario);
    public Usuario getUsuario(Long id);
    public List<Usuario> listUsuarios();
}
