package cn.vertxup.micro.jsr311;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.Date;

@EndPoint
public class DefaultAgent {
    @GET
    @Path("/hi/jsr311/default")
    public JsonObject sayDefault(@QueryParam("month")
                                 @DefaultValue("13") final Integer month) {
        return new JsonObject().put("month", month);
    }

    @GET
    @Path("/hi/jsr311/default-date")
    public JsonObject sayDate(
            @QueryParam("from") @DefaultValue("2011-08-15") final Date from,
            @QueryParam("to") @DefaultValue("2013-11-11") final Date to) {
        return new JsonObject()
                .put("from", from.toInstant())
                .put("to", to.toInstant());
    }
}
