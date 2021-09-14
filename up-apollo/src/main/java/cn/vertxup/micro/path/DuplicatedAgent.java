package cn.vertxup.micro.path;

import io.vertx.up.annotations.Adjust;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@EndPoint
@Path("/path")
public class DuplicatedAgent {

    /*
     * 响应：
     * {
     *      "data": false
     * }
     */
    @Path("500")
    @GET
    @Adjust(4_999_999)
    public boolean sayFalse() {
        return false;
    }

    /*
     * 响应：
     * {
     *      "data": "Hello World"
     * }
     */
    @Path("500")
    @GET
    public String sayHello() {
        return "Hello World";
    }
}
