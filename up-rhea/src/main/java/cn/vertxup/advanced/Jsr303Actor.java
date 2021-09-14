package cn.vertxup.advanced;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.unity.Ux;

@Queue
public class Jsr303Actor {
    @Address("ZERO://WORKER/JSR303/API")
    public Future<JsonObject> hiApi(final String name, final String email) {
        return Ux.future(new JsonObject().put("name", name).put("email", email));
    }
}
