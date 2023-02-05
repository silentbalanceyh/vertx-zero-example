package cn.vertxup.mongo;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.mongo.MongoClient;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.annotations.Plugin;

import javax.inject.infix.Mongo;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@EndPoint
@Path("/hi/mysql")
public class MongoAgent {
    @Plugin
    private transient MongoClient clientA;

    @Mongo
    private transient MongoClient clientB;

    @GET
    @Path("/client")
    public JsonObject hiAgent() {
        final JsonObject response = new JsonObject();
        response.put("clientA", this.clientA.toString());
        response.put("clientB", this.clientB.toString());
        return response;
    }
}
