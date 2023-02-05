package cn.vertxup.inject;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi")
public class SimpleAgent {

    @Path("inject/simple")
    @GET
    @Address("ZERO://INJECT/SIMPLE")
    public JsonObject sayInject(
            @QueryParam("username") final String username
    ) {
        return new JsonObject()
                .put("age", 33)
                .put("username", username);
    }
}
