package ar.edu.unlam.software.restouratente.resto.domain.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("servicioLogin")
@Transactional
public class ServicioLoginImpl implements ServicioLogin {

    private RepositorioUsuario servicioLoginDao;

    @Autowired
    public ServicioLoginImpl(RepositorioUsuario servicioLoginDao){
        this.servicioLoginDao = servicioLoginDao;
    }

    @Override
    public Usuario consultarUsuario (String email, String password) {
        return servicioLoginDao.buscarUsuario(email, password);
    }

}