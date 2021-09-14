package cn.vertxup.excel;

import io.vertx.core.json.JsonObject;
import io.vertx.tp.plugin.excel.ExcelClient;
import io.vertx.up.annotations.EndPoint;
import io.vertx.up.annotations.Plugin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

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
