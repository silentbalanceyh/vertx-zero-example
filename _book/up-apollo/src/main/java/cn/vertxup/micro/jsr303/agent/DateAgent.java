package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
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
