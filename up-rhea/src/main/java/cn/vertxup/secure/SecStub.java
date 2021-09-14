package cn.vertxup.secure;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.secure.Security;

public class SecStub implements Security {

    @Override
    public Future<Boolean> verify(final JsonObject data) {
        return Future.succeededFuture(Boolean.TRUE);
    }
}
