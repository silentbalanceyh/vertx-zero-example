package cn.vertxup.inject;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;

import javax.inject.Inject;
import javax.inject.Named;

@Queue
public class MultiActor {

    @Inject
    @Named("ServiceB")
    private transient MultiStub stub;

    @Address("ZERO://INJECT/MULTI")
    public Future<JsonObject> process(final JsonObject user) {
        final JsonObject processed = this.stub.getData(user);

        return Future.succeededFuture(processed);
    }
}
