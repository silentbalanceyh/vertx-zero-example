package cn.vertxup.micro.jsr303.extension;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Codex;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@EndPoint
@Path("/hi/jsr303")
public class BodyAgent {

    @POST
    @Path("/advanced")
    public JsonObject testCodex(
            @BodyParam @Codex final JsonObject user
    ) {
        return user;
    }
}
