package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

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
