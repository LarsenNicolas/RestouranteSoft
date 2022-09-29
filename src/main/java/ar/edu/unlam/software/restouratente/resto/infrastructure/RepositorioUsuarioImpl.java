package ar.edu.unlam.software.restouratente.resto.infrastructure;

import ar.edu.unlam.software.restouratente.resto.domain.usuarios.RepositorioUsuario;
import ar.edu.unlam.software.restouratente.resto.domain.usuarios.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repositorioUsuario")
public class RepositorioUsuarioImpl implements RepositorioUsuario {

    private SessionFactory sessionFactory;

    @Autowired
    public RepositorioUsuarioImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        final Session session = this.sessionFactory.getCurrentSession();
        session.save(usuario);
    }

    @Override
    public List<Usuario> consultarUsuariosPorDni(Integer dni) {
        final Session session = this.sessionFactory.getCurrentSession();
        return (List<Usuario>) session.createCriteria(Usuario.class)
                .add(Restrictions.eq("dni", dni))
                .list();
    }

    @Override
    public Usuario consultarUsuario(String email, String password) {
        return null;
    }

    @Override
    public Usuario buscarUsuario(String email, String password) {
        return null;
    }
}
