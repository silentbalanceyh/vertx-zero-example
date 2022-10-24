package cn.vertxup.job;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.annotations.Plugin;
import io.vertx.up.uca.job.plugin.JobClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@EndPoint
@Path("/hi/job")
public class JobAgent {
    @Plugin
    private transient JobClient client;

    @GET
    @Path("/status")
    public JsonObject status() {
        return this.client.status(null);
    }
}
