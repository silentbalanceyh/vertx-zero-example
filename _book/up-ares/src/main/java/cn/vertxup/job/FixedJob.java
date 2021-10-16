package cn.vertxup.job;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.up.annotations.Contract;
import io.vertx.up.annotations.Job;
import io.vertx.up.annotations.On;
import io.vertx.up.commune.Envelop;
import io.vertx.up.eon.em.JobType;

import java.util.concurrent.TimeUnit;

@Job(
        value = JobType.FIXED, name = "Fixed",
        duration = 1, durationUnit = TimeUnit.DAYS,
        runAt = "D,18:20"
)
public class FixedJob {
    @Contract
    private transient Vertx vertx;
    private transient int counter = 0;

    @On
    public Future<String> on(final Envelop envelop) {
        this.counter++;
        System.out.println("第 " + this.counter + " 次执行: "
                + this.vertx.hashCode());
        return Future.succeededFuture("On");
    }
}
