package cn.vertxup.secure;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.BodyParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

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
