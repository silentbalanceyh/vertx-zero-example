package cn.vertxup.worker;

import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.commune.Envelop;
import io.vertx.up.unity.Ux;

@Queue
public class ModeActor {
    @Address("ZERO://WORKER/STANDARD")
    public void hiWorker(final Envelop envelop) {
        final String strData = Ux.getString(envelop);
        System.out.println(strData);
    }
}
