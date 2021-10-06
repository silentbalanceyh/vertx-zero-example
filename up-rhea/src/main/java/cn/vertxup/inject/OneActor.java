package cn.vertxup.inject;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.plugin.excel.ExcelClient;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Plugin;
import io.vertx.up.annotations.Queue;

import javax.inject.Inject;

@Queue
public class OneActor {

    @Inject
    private transient OneStub stub;

    @Plugin
    private transient ExcelClient client;

    @Address("ZERO://INJECT/ONE")
    public Future<JsonObject> process(final JsonObject user) {
        System.out.println(this.client);
        final JsonObject processed = this.stub.getData(user);
        return Future.succeededFuture(processed);
    }
}
