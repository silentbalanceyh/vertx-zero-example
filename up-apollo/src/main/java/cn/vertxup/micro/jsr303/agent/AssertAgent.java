package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@EndPoint
@Path("/hi/jsr303")
public class AssertAgent {
    @Path("/assert")
    @GET
    public String sayBoolean(
            @NotNull @AssertTrue @QueryParam("male") final Boolean isMale,
            @NotNull @AssertFalse @QueryParam("female") final Boolean isFemale) {
        return "Hi, Lang, the parameters is 'male' = " + isMale +
                ", 'female' = " + isFemale;
    }
}
