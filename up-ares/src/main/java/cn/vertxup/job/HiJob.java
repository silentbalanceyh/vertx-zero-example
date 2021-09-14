package cn.vertxup.job;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.up.annotations.Contract;
import io.vertx.up.annotations.Job;
import io.vertx.up.annotations.On;
import io.vertx.up.commune.Envelop;
import io.vertx.up.eon.em.JobType;

@Job(JobType.ONCE)
public class HiJob {

    @Contract
    private transient Vertx vertx;

    @On
    public Future<String> on(final Envelop input) {
        System.out.println("Start: " + this.vertx.hashCode());
        return Future.succeededFuture("On");
    }

    public Future<String> off(final Envelop input) {
        System.out.println("End " + this.vertx.hashCode());
        return Future.succeededFuture("Off");
    }
}
