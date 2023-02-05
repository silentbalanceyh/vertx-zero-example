package cn.vertxup.secure;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@EndPoint
@Path("/api")
public class SecAgent {
    @GET
    @Path("/hi/secure")
    public String sendOneWay(
            @BodyParam final JsonObject json) {
        return "Hello World";
    }
}
