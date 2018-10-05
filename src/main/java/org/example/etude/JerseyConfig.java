package org.example.etude;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * @author YAMAMOTO, Keiji
 */
@Component
@ApplicationPath("/rs")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloResource.class);
    }

}
