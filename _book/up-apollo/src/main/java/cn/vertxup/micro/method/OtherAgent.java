package cn.vertxup.micro.method;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.HEAD;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

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
