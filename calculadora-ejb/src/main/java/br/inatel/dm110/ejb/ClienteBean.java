package br.inatel.dm110.ejb;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.dao.ClienteDAO;
import br.inatel.dm110.entities.Cliente;
import br.inatel.dm110.interfaces.ClienteLocal;
import br.inatel.dm110.interfaces.ClienteRemote;

@Stateless
@Local(ClienteLocal.class)
@Remote(ClienteRemote.class)
public class ClienteBean implements ClienteLocal, ClienteRemote {
	
	@EJB
	private ClienteDAO dao;

	@Override
	public void adicionar(String name, String email) {
		Cliente cliente = new Cliente();
		cliente.setName(name);
		cliente.setEmail(email);
		dao.insert(cliente);
	}

	@Override
	public String[] list() {
		return dao.findAll().stream().map(Cliente::toString).collect(Collectors.toList()).toArray(new String[0]);
	}

}
