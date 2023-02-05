package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

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
