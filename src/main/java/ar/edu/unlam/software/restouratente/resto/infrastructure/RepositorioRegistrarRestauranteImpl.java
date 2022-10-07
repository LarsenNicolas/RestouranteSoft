package ar.edu.unlam.software.restouratente.resto.infrastructure;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.software.restouratente.resto.domain.restaurante.Restaurante;

@Repository
public class RepositorioRegistrarRestauranteImpl implements RepositorioRestaurante{

	private SessionFactory sessionFactory;
	
	@Autowired
	public RepositorioRegistrarRestauranteImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Restaurante> buscarPor(Administrador administrador) {
		
		return this.sessionFactory.getCurrentSession().createCriteria(Restaurante.class)
				.add(Restrictions.eq("administrador", administrador)).list();
	}

}
