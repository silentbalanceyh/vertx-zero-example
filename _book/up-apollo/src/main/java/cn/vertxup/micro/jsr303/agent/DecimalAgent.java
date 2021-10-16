package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@EndPoint
@Path("/hi/jsr303")
public class DecimalAgent {

    @Path("decimal")
    @GET
    public String sayDecimal(
            @DecimalMin("0.3")
            @QueryParam("min") final Double min,
            @DecimalMax("0.7")
            @QueryParam("max") final Double max
    ) {
        return "Hi, min = " + min + ", max = " + max;
    }
}
