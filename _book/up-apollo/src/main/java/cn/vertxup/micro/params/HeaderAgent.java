package cn.vertxup.micro.params;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;

@EndPoint
public class HeaderAgent {

    @GET
    @Path("/hi/param/header-value")
    public JsonObject sayBody(@HeaderParam("X-Sigma") final String sigma,
                              @HeaderParam("Authorization") final String authorization) {
        return new JsonObject().put("sigma", sigma).put("authorization", authorization);
    }
}
