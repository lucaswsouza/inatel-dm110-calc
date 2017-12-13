package br.inatel.dm110.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.api.ClienteService;
import br.inatel.dm110.interfaces.ClienteRemote;

@RequestScoped
public class ClienteServiceImpl implements ClienteService {
	
	@EJB(lookup = "java:app/calculadora-ejb-1.0.0-SNAPSHOT/ClienteBean!br.inatel.dm110.interfaces.ClienteRemote")
	private ClienteRemote clienteBean;

	@Override
	public void adicionar(String name, String email) {
		clienteBean.adicionar(name, email);
	}

	@Override
	public String[] list() {
		return clienteBean.list();
	}

}
