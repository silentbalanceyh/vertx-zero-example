package cn.vertxup.pojo;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.BodyParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@EndPoint
@Path("/hi/pojo")
public interface PojoAgent {

    @POST
    @Path("/user")
    @Address("ZERO://WORKER/POJO/USER")
    String hiSync(@BodyParam JsonObject data);
}
