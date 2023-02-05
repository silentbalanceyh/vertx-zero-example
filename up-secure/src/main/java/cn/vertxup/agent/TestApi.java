package cn.vertxup.agent;

import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@EndPoint
public class TestApi {

    @Path("/non/hello")
    @GET
    public String sayVV() {
        return "Hello VV!";
    }
}
