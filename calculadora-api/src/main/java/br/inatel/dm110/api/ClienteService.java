package br.inatel.dm110.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cliente")
public interface ClienteService {
	
	@POST
	void adicionar(@FormParam("name") String name, @FormParam("email") String email);

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	String[] list();

}
