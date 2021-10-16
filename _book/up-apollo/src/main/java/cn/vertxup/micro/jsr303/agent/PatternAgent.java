package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@EndPoint
@Path("/hi/jsr303")
public class PatternAgent {

    @Path("pattern")
    @GET
    public String sayRegex(
            @Pattern(regexp = "^$|^[a-zA-Z]+$",
                    message = "must be a letter ")
            @QueryParam("pattern") final String size
    ) {
        return "Hi, Size = " + size;
    }

    @Path("email")
    @GET
    public String sayEmail(
            @Email
            @QueryParam("email") final String email
    ) {
        return "Hi, email = " + email;
    }
}
