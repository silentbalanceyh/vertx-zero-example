package cn.vertxup.worker;

import io.vertx.core.eventbus.Message;
import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.commune.Envelop;
import io.vertx.up.unity.Ux;

@Queue
public class CallActor {

    @Address("ZERO://WORKER/CALLBACK")
    public void hiCallback(final Message<Envelop> message) {
        final Envelop envelop = message.body();
        final String name = Ux.getString(envelop);
        message.reply(Envelop.success(new JsonObject().put("input", name)));
    }
}
