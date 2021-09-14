package cn.vertxup.micro.params;

import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

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
