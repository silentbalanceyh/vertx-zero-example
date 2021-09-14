package cn.vertxup.advanced;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

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
