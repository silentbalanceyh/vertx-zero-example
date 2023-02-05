package cn.vertxup.micro.jsr303.agent;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.util.Ut;

import jakarta.validation.Valid;
import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@EndPoint
@Path("/hi/jsr303")
public class PojoAgent {

    @Path("pojo")
    @POST
    public JsonObject sayPojo(
            @BodyParam @Valid final JavaJson json
    ) {
        return Ut.serializeJson(json);
    }
}
