package cn.vertxup.advanced;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi/worker")
public interface ExtensionApi {
    @GET
    @Path("/extension-api")
    @Address("ZERO://WORKER/EXTENSION/API")
    String hiExtension(
            @QueryParam("name") final String name,
            @QueryParam("email") final String email);
}
