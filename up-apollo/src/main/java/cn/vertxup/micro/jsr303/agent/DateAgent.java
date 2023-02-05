package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Past;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import java.util.Date;

@EndPoint
@Path("/hi/jsr303")
public class DateAgent {

    @Path("date")
    @GET
    public String sayDate(
            @Future
            @QueryParam("to") final Date future,
            @Past
            @QueryParam("from") final Date past
    ) {
        return "Hi, Future = " + future + ", Past = " + past;
    }
}
