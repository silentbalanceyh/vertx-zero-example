package cn.vertxup.inject;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@EndPoint
@Path("/hi")
public class OneAgent {

    @Path("inject/one")
    @PUT
    @Address("ZERO://INJECT/ONE")
    public JsonObject sayInject(final JsonObject data) {
        return new JsonObject()
                .put("age", 33)
                .mergeIn(data);
    }
}
