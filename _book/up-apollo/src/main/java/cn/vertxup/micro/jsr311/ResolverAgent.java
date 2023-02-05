package cn.vertxup.micro.jsr311;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@EndPoint
public class ResolverAgent {

    @POST
    @Path("/hi/jsr311/resolver")
    public JsonObject sayResolver(
            @BodyParam(resolver = UserResolver.class) final PojoUser user) {
        return new JsonObject().put("content", user.toString());
    }

    @POST
    @Path("/hi/jsr311/resolver-small")
    public JsonObject setSolve(
            @BodyParam(resolver = UserSolve.class) final PojoUser user) {
        return new JsonObject().put("content", user.toString());
    }
}
