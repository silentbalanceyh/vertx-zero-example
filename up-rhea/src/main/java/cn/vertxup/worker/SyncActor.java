package cn.vertxup.worker;

import io.vertx.core.json.JsonObject;
import io.vertx.up.annotations.Address;
import io.vertx.up.annotations.Queue;
import io.vertx.up.commune.Envelop;
import io.vertx.up.unity.Ux;

@Queue
public class SyncActor {

    @Address("ZERO://WORKER/SYNC/ONE-WAY")
    public void hiOneWay(final Envelop envelop) {
        final String strData = Ux.getString(envelop);
        System.out.println(strData);
    }

    @Address("ZERO://WORKER/SYNC/ONE-WAY2")
    public void hiOneWay2(final String name) {
        System.out.println(name);
    }

    @Address("ZERO://WORKER/SYNC/ONE-WAY1")
    public Envelop hiOneWay1(final Envelop envelop) {
        final String strData = Ux.getString(envelop);
        return Envelop.success(new JsonObject().put("input", strData));
    }

    @Address("ZERO://WORKER/SYNC/ONE-ADJUST")
    public JsonObject hiAdjust(final Envelop envelop) {
        final String strData = Ux.getString(envelop);
        return new JsonObject().put("input", strData);
    }

    @Address("ZERO://WORKER/SYNC/ONE-ADJUST1")
    public JsonObject hiAdjust1(final String name) {
        return new JsonObject().put("input", name);
    }

    @Address("ZERO://WORKER/SYNC/ONE-ADJUST2")
    public Envelop hiAdjust2(final String name) {
        return Envelop.success(new JsonObject().put("input", name));
    }
}
