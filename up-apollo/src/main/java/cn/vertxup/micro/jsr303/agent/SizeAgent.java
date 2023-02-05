package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import jakarta.validation.constraints.Size;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

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
