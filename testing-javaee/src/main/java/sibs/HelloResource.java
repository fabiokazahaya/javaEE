package sibs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello") // Resource path: /api/hello
public class HelloResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN) // Response content type
    public String hello() {
        return "Hello, World!";
    }
}

