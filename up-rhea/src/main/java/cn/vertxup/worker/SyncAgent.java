package cn.vertxup.worker;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi/worker")
public class SyncAgent {

    @GET
    @Path("/sync-one")
    @Address("ZERO://WORKER/SYNC/ONE-WAY")
    public String hiOneWay(@QueryParam("name") final String name) {
        return name;
    }

    @GET
    @Path("/sync-one1")
    @Address("ZERO://WORKER/SYNC/ONE-WAY1")
    public String hiOneWay1(@QueryParam("name") final String name) {
        return name;
    }

    @GET
    @Path("/sync-one2")
    @Address("ZERO://WORKER/SYNC/ONE-WAY2")
    public String hiOneWay2(@QueryParam("name") final String name) {
        return name;
    }

    @GET
    @Path("/sync-adjust")
    @Address("ZERO://WORKER/SYNC/ONE-ADJUST")
    public String hiAdjust(@QueryParam("name") final String name) {
        return name;
    }

    @GET
    @Path("/sync-adjust1")
    @Address("ZERO://WORKER/SYNC/ONE-ADJUST1")
    public String hiAdjust1(@QueryParam("name") final String name) {
        return name;
    }

    @GET
    @Path("/sync-adjust2")
    @Address("ZERO://WORKER/SYNC/ONE-ADJUST2")
    public String hiAdjust2(@QueryParam("name") final String name) {
        return name;
    }
}
