package cn.vertxup.micro.params;

import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

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
