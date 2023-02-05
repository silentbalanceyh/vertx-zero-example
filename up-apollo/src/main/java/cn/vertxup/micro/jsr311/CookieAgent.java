package cn.vertxup.micro.jsr311;

import io.vertx.core.http.Cookie;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@EndPoint
public class CookieAgent {

    @GET
    @Path("/hi/jsr311/cookie")
    public JsonObject sayCookie(@CookieParam("vertx") final String cookie,
                                @CookieParam("vertx") final Cookie cookieOjb) {
        return new JsonObject().put("first", cookie)
                .put("second", new JsonObject()
                        .put("name", cookieOjb.getName())
                        .put("value", cookieOjb.getValue()));
    }
}
