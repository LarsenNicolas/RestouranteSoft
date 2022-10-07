package ar.edu.unlam.software.restouratente.resto.domain.usuarios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrador extends Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private final Integer legajo;
	
	 public Administrador(String nombre, String apellido, Integer dni, Integer legajo) {
	        super(nombre,apellido,dni);
	        this.legajo =  legajo;
	    }

	public Long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Integer getLegajo() {
		return legajo;
	}
	
	public void setNombre(String nombre) {
		String aCambiar=this.getNombre();
		aCambiar=nombre;
	}
	
}
