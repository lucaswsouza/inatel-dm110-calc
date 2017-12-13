package br.inatel.dm110.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.dm110.entities.Cliente;

@Stateless
public class ClienteDAO {

	@PersistenceContext(unitName = "calculadora")
	private EntityManager em;

	public void insert(Cliente cliente) {
		em.persist(cliente);
	}

	public List<Cliente> findAll() {
		return em.createQuery("from Cliente c", Cliente.class).getResultList();
	}
	
}
