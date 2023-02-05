package cn.vertxup.excel;

import io.vertx.core.json.JsonObject;
import io.vertx.tp.plugin.excel.ExcelClient;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.annotations.Plugin;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi")
public class ExcelAgent {
    @Plugin
    private transient ExcelClient client;

    @Path("/excel/hello")
    @GET
    public JsonObject sayHi(
            @QueryParam("name") final String name) {
        final JsonObject response = new JsonObject();
        response.put("name", name);
        response.put("client", this.client.toString());
        return response;
    }
}
