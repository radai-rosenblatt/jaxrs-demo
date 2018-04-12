package net.radai.jaxrsdemo.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/greet")
public interface GreetService {
    
    @GET
    String sayHi(@QueryParam("name") String name);
}
