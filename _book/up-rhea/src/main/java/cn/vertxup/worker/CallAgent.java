package cn.vertxup.worker;


import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@EndPoint
@Path("/hi/worker")
public class CallAgent {
    @GET
    @Path("/callback")
    @Address("ZERO://WORKER/CALLBACK")
    public String hiAdjust(@QueryParam("name") final String name) {
        return name;
    }
}
