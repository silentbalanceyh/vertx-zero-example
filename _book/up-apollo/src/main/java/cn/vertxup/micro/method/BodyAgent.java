package cn.vertxup.micro.method;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@EndPoint
public class BodyAgent {
    /*
     * 返回值：
     * {
     *     "data": {
     *         ???
     *     }
     * }
     */
    @GET
    @Path("/hi/body/get")
    public JsonObject sayPost(@BodyParam final JsonObject body) {
        final JsonObject response = new JsonObject();
        response.mergeIn(body, true);
        return response;
    }

    /*
     * 返回值：
     * {
     *     "data": {
     *         ???
     *     }
     * }
     */
    @DELETE
    @Path("/hi/body/delete")
    public JsonObject sayDelete(@BodyParam final JsonObject body) {
        final JsonObject response = new JsonObject();
        response.mergeIn(body, true);
        return response;
    }
}
