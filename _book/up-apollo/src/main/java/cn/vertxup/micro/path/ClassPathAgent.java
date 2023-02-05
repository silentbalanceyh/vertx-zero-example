package cn.vertxup.micro.path;

import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@EndPoint
@Path("/path")
public class ClassPathAgent {
    /*
     * 响应：
     * {
     *      "data": 100
     * }
     */
    @Path("100")
    @GET
    public Integer say100() {
        return 100;
    }

    /*
     * 响应：
     * {
     *      "data": 200
     * }
     */
    @Path("//200")
    @GET
    public Integer say200() {
        return 200;
    }
}
