package cn.vertxup.mysql;

import io.vertx.core.json.JsonObject;
import io.vertx.ext.sql.SQLClient;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.annotations.Plugin;

import javax.inject.infix.MySql;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@EndPoint
@Path("/hi/mysql")
public class MySqlAgent {
    @Plugin
    private transient SQLClient clientA;

    @MySql
    private transient SQLClient clientB;

    @GET
    @Path("/client")
    public JsonObject hiAgent() {
        final JsonObject response = new JsonObject();
        response.put("clientA", this.clientA.toString());
        response.put("clientB", this.clientB.toString());
        return response;
    }
}
