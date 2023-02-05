package cn.vertxup.worker;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi/worker")
public class AsyncAgent {
    @GET
    @Path("/async-envelop")
    @Address("ZERO://WORKER/ASYNC/ENVELOP")
    public String hiEnvelop(@QueryParam("name") final String name) {
        return name;
    }

    @GET
    @Path("/async-t")
    @Address("ZERO://WORKER/ASYNC/T")
    public String hiT(@QueryParam("name") final String name) {
        return name;
    }
}
