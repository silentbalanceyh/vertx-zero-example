package cn.vertxup.micro.hello;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@EndPoint
public class HiAgent {
    /*
     * 返回值：
     * {
     *     "data": "Hello Zero"
     * }
     */
    @GET
    @Path("/hi/zero-string")
    public String sayHello() {
        return "Hello Zero";
    }

    /*
     * 返回值：
     * {
     *     "data": {
     *         "message": "Hello Zero"
     *     }
     * }
     */
    @GET
    @Path("/hi/zero-json")
    public JsonObject sayHelloJ() {
        return new JsonObject().put("message", "Hello Zero");
    }
}
