package cn.vertxup.micro.method;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.HEAD;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
public class OtherAgent {
    /*
     * 响应数据：204 - No Content
     */
    @HEAD
    @Path("/hi/method/header")
    public JsonObject sayGet(@QueryParam("name") final String name) {
        final JsonObject header = new JsonObject();
        header.put("name", name);
        return header;
    }
}
