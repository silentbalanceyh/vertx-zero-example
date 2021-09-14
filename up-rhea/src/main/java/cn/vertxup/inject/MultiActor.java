package cn.vertxup.inject;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Qualifier;
import io.vertx.up.annotations.Queue;

import javax.inject.Inject;

@Queue
public class MultiActor {

    @Inject
    @Qualifier("ServiceB")
    private transient MultiStub stub;

    @Address("ZERO://INJECT/MULTI")
    public Future<JsonObject> process(final JsonObject user) {
        final JsonObject processed = this.stub.getData(user);

        return Future.succeededFuture(processed);
    }
}
