package cn.vertxup.worker;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.commune.Envelop;
import io.vertx.up.unity.Ux;

@Queue
public class AsyncActor {

    @Address("ZERO://WORKER/ASYNC/ENVELOP")
    public Future<String> hiEnvelop(final Envelop envelop) {
        final String name = envelop.data();
        return Ux.future(name);
    }


    @Address("ZERO://WORKER/ASYNC/T")
    public Future<String> hiT(final String name) {
        return Ux.future(name);
    }


    @Address("ZERO://WORKER/ASYNC/API")
    public Future<JsonObject> hiApi(final Envelop envelop) {
        final String name = Ux.getString(envelop);
        final String email = Ux.getString1(envelop);
        return Ux.future(new JsonObject().put("name", name).put("email", email));
    }

    @Address("ZERO://WORKER/ASYNC/SEEK")
    public Future<JsonObject> hiSeek(final String email, final String name) {
        return Ux.future(new JsonObject().put("name", name).put("email", email));
    }
}
