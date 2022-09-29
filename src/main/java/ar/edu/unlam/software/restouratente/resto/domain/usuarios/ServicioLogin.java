package ar.edu.unlam.software.restouratente.resto.domain.usuarios;

public interface ServicioLogin {

    Usuario consultarUsuario(String email, String password);
}