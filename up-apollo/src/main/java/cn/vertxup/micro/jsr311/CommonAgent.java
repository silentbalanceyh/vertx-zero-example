package cn.vertxup.micro.jsr311;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.*;
import javax.ws.rs.core.HttpHeaders;

/**
 * `javax.ws.rs.QueryParam`
 * `javax.ws.rs.PathParam`
 * `javax.ws.rs.HeaderParam`
 */
@EndPoint
public class CommonAgent {

    @GET
    @Path("/hi/jsr311/query")
    public JsonObject sayQuery(@QueryParam("name") final String name) {
        return new JsonObject().put("name", name);
    }

    @GET
    @Path("/hi/jsr311/path/:path")
    public JsonObject sayPath(@PathParam("path") final String path) {
        return new JsonObject().put("path", path);
    }

    @GET
    @Path("/hi/jsr311/header")
    public JsonObject sayHeader(
            @HeaderParam(HttpHeaders.CONTENT_TYPE) final String contentType) {
        return new JsonObject().put("content-type", contentType);
    }
}
