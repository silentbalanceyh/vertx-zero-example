package cn.vertxup.advanced;

import io.vertx.core.Future;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.unity.Ux;

@Queue
public class ExtensionActor {
    @Address("ZERO://WORKER/EXTENSION/API")
    public Future<JsonObject> hiExtension(final String name,
                                          final HttpServerRequest request,
                                          final String email) {
        System.out.println(request);
        return Ux.future(new JsonObject().put("name", name).put("email", email));
    }
}
