package cn.vertxup.micro.jsr311;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@EndPoint
public class PojoAgent {
    @POST
    @Path("/hi/jsr311/pojo")
    public JsonObject sayPojo(@BodyParam final PojoUser user) {
        return new JsonObject().put("content", user.toString());
    }
}
