package cn.vertxup.micro.jsr303.agent;

import io.vertx.up.annotations.EndPoint;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@EndPoint
@Path("/hi/jsr303")
public class NullableAgent {
    /*
     * HTTP 方法为GET，提供参数则抛异常
     * 参数位于 `/api/jsr303/null?name=`位置
     */
    @GET
    @Path("/null")
    public String nullNo(@Null @QueryParam("name") final String name) {
        return "Hi, Null: " + name;
    }

    /* 对应 vertx-validation.properties 文件中的 nullable.null 值！*/
    @GET
    @Path("/null-msg")
    public String nullMsg(@Null(message = "{nullable.null}")
                          @QueryParam("name") final String name) {
        return "Hi, Null: " + name;
    }

    /*
     * HTTP 方法为GET，不提供参数则抛异常
     * 参数位于 `/api/jsr303/notnull?name=`位置
     */
    @POST
    @Path("/notnull")
    public String notnull(@NotNull @QueryParam("name") final String name) {
        return "Hi, Value: " + name;
    }

    /* 对应 vertx-validation.properties 文件中的 nullable.notnull 值！*/
    @POST
    @Path("/notnull-msg")
    public String notnullMsg(@NotNull(message = "{nullable.notnull}")
                             @QueryParam("name") final String name) {
        return "Hi, Value: " + name;
    }
}
