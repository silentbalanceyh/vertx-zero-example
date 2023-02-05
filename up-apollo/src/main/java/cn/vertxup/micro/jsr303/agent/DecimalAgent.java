package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

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
