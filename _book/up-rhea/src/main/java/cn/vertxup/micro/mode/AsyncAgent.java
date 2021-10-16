package cn.vertxup.micro.mode;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.BodyParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@EndPoint
@Path("/hi/mode")
public class AsyncAgent {
    @POST
    @Path("/one-way")
    @Address("ZERO://MODE/ONE-WAY")
    public String sendOneWay(
            @BodyParam final JsonObject json) {
        return json.encode();
    }

    @POST
    @Path("/async")
    @Address("ZERO://MODE/ASYNC")
    public JsonObject sendAsync(
            @BodyParam final JsonObject json) {
        return json;
    }

    @Path("/callback")
    @POST
    @Address("ZERO://MODE/CALLBACK")
    public JsonObject sayCallback(
            @BodyParam final JsonObject data) {
        return data;
    }
}
