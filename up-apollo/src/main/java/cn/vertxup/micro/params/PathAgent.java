package cn.vertxup.micro.params;

import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@EndPoint
public class PathAgent {
    /*
     * 响应信息
     * {
     *      "data": "Hi <name>"
     * }
     */
    @GET
    @Path("/hi/param/name/:name")
    public String sayName(@PathParam("name") final String name) {
        return "Hi " + name;
    }

    /*
     * 响应信息
     * {
     *      "data": "Hi , the Email is <email>"
     * }
     */
    @GET
    @Path("/hi/param/email/{email}")
    public String sayEmail(@PathParam("email") final String email) {
        return "Hi , the Email is " + email;
    }
}
