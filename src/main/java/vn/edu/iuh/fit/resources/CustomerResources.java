package vn.edu.iuh.fit.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/customers")
public class CustomerResources {
    @GET
    @Produces("text/plain")
    public String get() {
        return "asfadsfasd";
    }
}
