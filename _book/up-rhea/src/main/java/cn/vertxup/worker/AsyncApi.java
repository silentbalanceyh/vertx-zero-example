package cn.vertxup.worker;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

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
