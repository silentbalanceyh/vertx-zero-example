package cn.vertxup.advanced;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.unity.Ux;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi/jwt")
public class JwtAgent {
    @GET
    @Path("/generate")
    public String hiJwt(
            @QueryParam("name") final String name,
            @QueryParam("email") final String email) {
        // Encoding
        final JsonObject tokenJson = new JsonObject()
                .put("name", name)
                .put("email", email);
        return Ux.Jwt.token(tokenJson);
    }
}
