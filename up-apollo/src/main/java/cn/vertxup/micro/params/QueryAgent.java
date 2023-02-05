package cn.vertxup.micro.params;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

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
