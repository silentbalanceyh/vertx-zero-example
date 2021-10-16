package cn.vertxup.micro.jsr311;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.BodyParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@EndPoint
public class PojoAgent {
    @POST
    @Path("/hi/jsr311/pojo")
    public JsonObject sayPojo(@BodyParam final PojoUser user) {
        return new JsonObject().put("content", user.toString());
    }
}
