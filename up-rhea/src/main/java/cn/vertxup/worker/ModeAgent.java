package cn.vertxup.worker;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.BodyParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@EndPoint
@Path("/hi/worker")
public class ModeAgent {
    @POST
    @Path("/standard")
    @Address("ZERO://WORKER/STANDARD")
    public String hiWorker(@BodyParam final JsonObject json) {
        return json.encode();
    }
}
