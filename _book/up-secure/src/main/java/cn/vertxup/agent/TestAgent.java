package cn.vertxup.agent;

import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@EndPoint
public class TestAgent {

    @Path("/api/basic/hello")
    @GET
    public String sayBasic() {
        return "Hello Basic!";
    }

    @Path("/api/jwt/hello")
    @GET
    public String sayJwt() {
        return "Hello Jwt!";
    }

    @Path("/api/oauth2/hello")
    @GET
    public String sayRedirect() {
        return "Hello Redirect!";
    }
}
