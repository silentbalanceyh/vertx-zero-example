package cn.vertxup.micro.path;

import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@EndPoint
public class MethodPathAgent {
    /*
     * 响应：
     * {
     *      "data": 300
     * }
     */
    @Path("path/300")
    @GET
    public Integer say300() {
        return 300;
    }

    /*
     * 响应：
     * {
     *      "data": 400
     * }
     */
    @Path("/path/400")
    @GET
    public Integer say400() {
        return 400;
    }
}
