package ar.edu.unlam.software.restouratente.resto.domain.usuarios;

import java.util.List;

public interface RepositorioUsuario {

    public void guardarUsuario(Usuario usuario);

    public List<Usuario> consultarUsuariosPorDni(Integer dni);

    public Usuario consultarUsuario (String email, String password);
    Usuario buscarUsuario(String email, String password);
}
