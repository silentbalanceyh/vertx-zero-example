package cn.vertxup.advanced;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.EndPoint;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

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
