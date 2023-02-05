package cn.vertxup.micro.method;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@EndPoint
public class ErrorAgent {

    @GET
    @Path("/hi/error/500")
    public JsonObject sayError() {
        final Integer integer = Integer.parseInt("HX");
        return new JsonObject().put("error", integer);
    }
}
