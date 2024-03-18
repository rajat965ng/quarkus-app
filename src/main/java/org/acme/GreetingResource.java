package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name = "greeting.message.v1")
    private String message_v1;

    @ConfigProperty(name = "greeting.message.v2")
    private String message_v2;

    @GET
    @Path("/v1")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloV1() {
        return message_v1;
    }
    @GET
    @Path("/v2")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloV2() {
        return message_v2;
    }

}
