package cn.vertxup.micro.params;

import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@EndPoint
public class PathWrong {
    /*
     *  {
     *      "data": "Hi , Your age is <age>"
     *  }
     */
    @GET
    @Path("hi//param/age/:age/")
    public String sayAge(@PathParam("age") final Integer age) {
        return "Hi , Your age is " + age;
    }

    /*
     *  {
     *      "data": "Hi, Your current is <currency>"
     *  }
     */
    @GET
    @Path("hi//param///currency///:currency")
    public String sayCurrent(@PathParam("currency") final double currency) {
        return "Hi, Your current is " + currency;
    }
}
