package org.example.etude;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.stereotype.Component;

/**
 * @author YAMAMOTO, Keiji
 */
@Component
@Path("/")
public class HelloResource {

    @GET
    public String index() {
        return "Hello Spring Jersey!";
    }
}
