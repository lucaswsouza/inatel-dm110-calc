package br.inatel.dm110.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.dm110.impl.CalculadoraServiceImpl;
import br.inatel.dm110.impl.ClienteServiceImpl;

@ApplicationPath("/api")
public class RestApplication extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(CalculadoraServiceImpl.class);
		classes.add(ClienteServiceImpl.class);
		return classes;
	}

}
