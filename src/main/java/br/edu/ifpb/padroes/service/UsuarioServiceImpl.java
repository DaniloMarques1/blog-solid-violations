package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.modelo.Usuario;

import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioDAO usuarioDAO;

    // qualquer tipo que implemente a interface
    // UsuarioDAO pode ser passado aqui
    public UsuarioServiceImpl(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public void criarUsuario(Usuario usuario) {
        usuarioDAO.addUsuario(usuario);
    }

    @Override
    public void atualizarUsuario(Usuario usuario) {
        usuarioDAO.updateUsuario(usuario);
    }

    @Override
    public void removerUsuario(Usuario usuario) {
        usuarioDAO.deleteUsuario(usuario);
    }

    @Override
    public List<Usuario> listarUsuarios(Usuario usuario) {
        return usuarioDAO.listUsuarios();
    }

    @Override
    public Usuario recuperarUsuario(Long id) {
        return usuarioDAO.getUsuario(id);
    }

}
