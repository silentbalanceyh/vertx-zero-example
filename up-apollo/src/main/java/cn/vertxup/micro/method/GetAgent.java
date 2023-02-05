package cn.vertxup.micro.method;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
public class GetAgent {
    /*
     * 返回值：
     * {
     *     "data": {
     *         "name": ???
     *     }
     * }
     */
    @GET
    @Path("/hi/method/get-first")
    public JsonObject sayGet(@QueryParam("name") final String name) {
        final JsonObject response = new JsonObject();
        response.put("name", name);
        return response;
    }
}
