package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import javax.validation.constraints.Size;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@EndPoint
@Path("/hi/jsr303")
public class SizeAgent {

    @Path("size")
    @GET
    public String saySize(
            @Size(min = 1, max = 20)
            @QueryParam("size") final String size
    ) {
        return "Hi, Size = " + size;
    }
}
