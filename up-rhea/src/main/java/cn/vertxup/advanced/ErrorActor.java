package cn.vertxup.advanced;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.commune.Envelop;
import io.vertx.up.exception.WebException;
import io.vertx.up.exception.web._500InternalServerException;

@Queue
public class ErrorActor {
    @Address("ZERO://WORKER/ERROR/SYNC")
    public Envelop hiSync(final String name,
                          final String email) {
        final WebException error =
                new _500InternalServerException(this.getClass(), "Sync Error");
        throw error;
    }

    @Address("ZERO://WORKER/ERROR/ASYNC")
    public Future<JsonObject> hiAsync(final String name,
                                      final String email) {
        final WebException error =
                new _500InternalServerException(this.getClass(), "Async Error");
        throw error;
    }
}
