package cn.vertxup.pojo;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@EndPoint
@Path("/hi/pojo")
public interface PojoAgent {

    @POST
    @Path("/user")
    @Address("ZERO://WORKER/POJO/USER")
    String hiSync(@BodyParam JsonObject data);
}
