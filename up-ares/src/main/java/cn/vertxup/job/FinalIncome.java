package cn.vertxup.job;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.up.annotations.Contract;
import io.vertx.up.atom.worker.Mission;
import io.vertx.up.commune.Envelop;
import io.vertx.up.uca.job.plugin.JobIncome;
import io.vertx.up.unity.Ux;

public class FinalIncome implements JobIncome {
    @Contract
    private transient Vertx vertx;
    @Contract
    private transient Mission mission;

    @Override
    public Future<Envelop> beforeAsync(final Envelop envelop) {
        return Ux.future(Envelop.success("Hello Income"));
    }
}
