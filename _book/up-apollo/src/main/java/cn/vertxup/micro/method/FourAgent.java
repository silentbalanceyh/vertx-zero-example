package cn.vertxup.micro.method;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.*;

@EndPoint
public class FourAgent {
    /*
     * 返回值：
     * {
     *     "data": {
     *         "name": ???
     *     }
     * }
     */
    @GET
    @Path("/hi/method/get")
    public JsonObject sayGet(@QueryParam("name") final String name) {
        final JsonObject response = new JsonObject();
        response.put("name", name);
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
    @POST
    @Path("/hi/method/post")
    public JsonObject sayPost(@BodyParam final JsonObject body) {
        final JsonObject response = new JsonObject();
        response.mergeIn(body, true);
        return response;
    }

    /*
     * 返回值：
     * {
     *     "data": {
     *         "key": "???",
     *         ???
     *     }
     * }
     */
    @PUT
    @Path("/hi/method/put/:id")
    public JsonObject sayPut(@BodyParam final JsonObject body,
                             @PathParam("id") final String id) {
        final JsonObject response = new JsonObject();
        response.mergeIn(body, true);
        response.put("key", id);
        return response;
    }

    /*
     * 返回值：
     * {
     *     "data": {
     *         "deleted": ???
     *     }
     * }
     */
    @DELETE
    @Path("/hi/method/delete/:id")
    public JsonObject sayDelete(@PathParam("id") final String id) {
        final JsonObject response = new JsonObject();
        response.put("deleted", id);
        return response;
    }
}
