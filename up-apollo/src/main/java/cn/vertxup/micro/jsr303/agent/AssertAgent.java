package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

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
