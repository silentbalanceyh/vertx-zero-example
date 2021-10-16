package cn.vertxup.inject;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;

import javax.inject.Inject;

@Queue
public class SimpleActor {

    @Inject
    private transient SimpleObject simple;

    @Address("ZERO://INJECT/SIMPLE")
    public Future<String> process(final JsonObject user) {
        final JsonObject processed = this.simple.getData(user);
        return Future.succeededFuture(processed)
                .compose(item -> Future.succeededFuture(item.encode()));
    }
}
