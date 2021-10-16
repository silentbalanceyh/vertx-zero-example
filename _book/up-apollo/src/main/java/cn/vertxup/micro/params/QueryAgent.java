package cn.vertxup.micro.params;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import javax.ws.rs.BodyParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@EndPoint
public class QueryAgent {
    /*
     * {
     *      "data": "Hi Lang"
     * }
     */
    @GET
    @Path("/hi/param/query-string")
    public String sayQuery(@QueryParam("name") final String name) {
        return "Hi " + name;
    }

    /*
     * {
     *      "data": {
     *          "name": "Lang",
     *          "data": {
     *              "email": "lang.yu@hpe.com",
     *              "age": 12
     *          }
     *      }
     *  }
     */
    @GET
    @Path("/hi/param/query-body")
    public JsonObject sayQBody(@QueryParam("name") final String name,
                               @BodyParam final JsonObject data) {
        return new JsonObject().put("name", name).put("data", data);
    }
}
