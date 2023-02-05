package cn.vertxup.advanced;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@EndPoint
@Path("/hi/worker")
public interface Jsr303Api {
    @GET
    @Path("/jsr303-api")
    @Address("ZERO://WORKER/JSR303/API")
    String hiApi(
            @NotNull(message = "{field.notnull}")
            @QueryParam("name") final String name,
            @Null(message = "{field.null}")
            @QueryParam("email") final String email);
}
