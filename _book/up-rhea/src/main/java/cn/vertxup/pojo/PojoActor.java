package cn.vertxup.pojo;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.unity.Ux;

@Queue
public class PojoActor {

    @Address("ZERO://WORKER/POJO/USER")
    public Future<JsonObject> hiPojo(final OldUser user) {
        return Ux.future(user).compose(Ux.futureJ("user"));
    }
}
