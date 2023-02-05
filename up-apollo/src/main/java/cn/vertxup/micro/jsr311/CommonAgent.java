package cn.vertxup.micro.jsr311;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.HttpHeaders;

/**
 * `jakarta.ws.rs.QueryParam`
 * `jakarta.ws.rs.PathParam`
 * `jakarta.ws.rs.HeaderParam`
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
