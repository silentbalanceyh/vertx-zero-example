package cn.vertxup.worker;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

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
