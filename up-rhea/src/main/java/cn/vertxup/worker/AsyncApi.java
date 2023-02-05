package cn.vertxup.worker;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi/worker")
public interface AsyncApi {
    @GET
    @Path("/async-api")
    @Address("ZERO://WORKER/ASYNC/API")
    String hiApi(@QueryParam("name") final String name,
                 @QueryParam("email") final String email);


    @GET
    @Path("/async-seek")
    @Address("ZERO://WORKER/ASYNC/SEEK")
    String hiSeek(@QueryParam("name") final String name,
                  @QueryParam("email") final String email);
}
