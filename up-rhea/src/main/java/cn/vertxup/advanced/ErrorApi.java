package cn.vertxup.advanced;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi/worker")
public interface ErrorApi {

    @GET
    @Path("/error-sync")
    @Address("ZERO://WORKER/ERROR/SYNC")
    String hiSync(
            @QueryParam("name") final String name,
            @QueryParam("email") final String email);

    @GET
    @Path("/error-async")
    @Address("ZERO://WORKER/ERROR/ASYNC")
    String hiAsync(
            @QueryParam("name") final String name,
            @QueryParam("email") final String email);
}
