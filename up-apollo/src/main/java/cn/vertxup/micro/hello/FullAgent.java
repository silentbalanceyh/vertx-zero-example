package cn.vertxup.micro.hello;

import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.*;

@EndPoint
public class FullAgent {
    /*
     * 响应：
     * {
     *      "data": "Hello Get"
     * }
     */
    @GET
    @Path("/hi/zero-four")
    public String sayGet() {
        return "Hello Get";
    }

    /*
     * 响应：
     * {
     *      "data": "Hello Post"
     * }
     */
    @POST
    @Path("/hi/zero-four")
    public String sayPost() {
        return "Hello Post";
    }

    /*
     * 响应：
     * {
     *      "data": "Hello Delete"
     * }
     */
    @DELETE
    @Path("/hi/zero-four")
    public String sayDelete() {
        return "Hello Delete";
    }

    /*
     * 响应：
     * {
     *      "data": "Hello Put"
     * }
     */
    @PUT
    @Path("/hi/zero-four")
    public String sayPut() {
        return "Hello Put";
    }

    /*
     * 响应：
     * {
     *      "data": true
     * }
     */
    @GET
    @Path("/hi/zero-oneway")
    public void sayOneWay() {
        System.err.println("No Response");
    }
}
