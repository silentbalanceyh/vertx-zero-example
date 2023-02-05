package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi/jsr303")
public class NumericAgent {

    @Path("/numeric")
    @GET
    public String sayNum(
            @Min(10) @Max(100)
            @QueryParam("age") final Integer age,
            @Min(1)
            @QueryParam("test") final Integer test
    ) {
        return "Hello, please check your age. " + age;
    }
}
