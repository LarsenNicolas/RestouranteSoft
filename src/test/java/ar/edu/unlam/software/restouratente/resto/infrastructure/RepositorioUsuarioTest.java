package ar.edu.unlam.software.restouratente.resto.infrastructure;

import ar.edu.unlam.software.restouratente.resto.SpringTest;
import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Usuario;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class RepositorioUsuarioTest extends SpringTest {

    @Autowired
    private RepositorioUsuarioImpl repositorioUsuarioImpl;

    @Test
    @Transactional @Rollback
    public void pruebaConexion(){
        Assertions.assertThat(session().isConnected()).isTrue();
    }

    @Test
    @Rollback
    @Transactional
    public void debeDevolverUnoCuandoPreguntoPorCantidadDeUsuariosGuardados() {
        dadoQueTenemosUnUsuarioEnNuestraBaseDeDatos();
        List<Usuario> usuarios = consultoPorElUsuarioConDni(12345678);
        entoncesObtengoUnUsuario(usuarios);
    }

    private void dadoQueTenemosUnUsuarioEnNuestraBaseDeDatos() {
        Usuario usuario = new Usuario("Juan", "Perez", 12345678);
        this.session().save(usuario);
    }

    private void entoncesObtengoUnUsuario(List<Usuario> usuarios) {
        assertThat(usuarios.size()).isEqualTo(1);
    }

    private List<Usuario> consultoPorElUsuarioConDni(int dni) {
        return this.repositorioUsuarioImpl.consultarUsuariosPorDni(dni);
    }
}
