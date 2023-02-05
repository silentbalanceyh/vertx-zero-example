package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import jakarta.validation.constraints.Digits;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi/jsr303")
public class DigitAgent {

    @Path("digit")
    @GET
    public String sayDigit(
            @Digits(integer = 2, fraction = 2)
            @QueryParam("digit") final Double currency
    ) {
        return "Hi, Currency is " + currency;
    }
}
