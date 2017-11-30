package br.inatel.dm110.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalculadoraService {
	
	@GET
	@Path("/soma/{numberOne}/{numberTwo}")
	@Produces(MediaType.APPLICATION_JSON)
	Resultado soma(@PathParam("numberOne")int numberOne, @PathParam("numberTwo") int numberTwo);
	
	@POST
	@Path("/subtracao")
	@Produces(MediaType.APPLICATION_JSON)
	Resultado subtracao(@FormParam("numberOne") int numberOne, @FormParam("numberTwo") int numberTwo);

}
