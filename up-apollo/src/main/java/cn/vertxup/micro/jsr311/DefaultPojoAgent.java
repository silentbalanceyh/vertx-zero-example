package cn.vertxup.micro.jsr311;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.BodyParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@EndPoint
public class DefaultPojoAgent {
    @POST
    @Path("/hi/jsr311/default-pojo")
    public JsonObject sayDefault(
            @BodyParam @DefaultValue("{\"username\":\"test\"}") final PojoUser user) {
        return new JsonObject().put("serialized", user.toString());
    }
}
