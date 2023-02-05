package cn.vertxup.filter;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.EndPoint;

import jakarta.ws.rs.BodyParam;
import jakarta.ws.rs.ContextParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@EndPoint
@Path("/hi/jsr340")
public class FilterAgent {
    @POST
    @Path("/filter")
    public JsonObject filter(@BodyParam final JsonObject data,
                             @ContextParam("contextKey") final String filtered) {
        return new JsonObject()
                .put("filter", filtered)
                .mergeIn(data);
    }

    @POST
    @Path("/filter2")
    public JsonObject filter2(@BodyParam final JsonObject data,
                              @ContextParam("contextKey") final String key1,
                              @ContextParam("nextKey") final String key2) {
        return new JsonObject()
                .put("contextKey", key1)
                .put("nextKey", key2)
                .mergeIn(data);
    }
}
