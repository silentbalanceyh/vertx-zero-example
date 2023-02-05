package cn.vertxup.micro.mode;

import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi/mode")
public class SyncAgent {
    @GET
    @Path("/sync")
    public String doSync(
            @QueryParam("name") final String name
    ) {
        return "Hi + " + name;
    }

    @GET
    @Path("/ping/{name}")
    public void doPing(
            @PathParam("name") final String name) {
        System.out.println("Ping Request");
    }
}
