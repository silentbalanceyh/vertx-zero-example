package cn.vertxup.micro.jsr311;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@EndPoint
public class DefaultPojoAgent {
    @POST
    @Path("/hi/jsr311/default-pojo")
    public JsonObject sayDefault(
            @BodyParam @DefaultValue("{\"username\":\"test\"}") final PojoUser user) {
        return new JsonObject().put("serialized", user.toString());
    }
}
