package cn.vertxup.job;

import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.up.annotations.Contract;
import io.vertx.up.annotations.Job;
import io.vertx.up.annotations.On;
import io.vertx.up.commune.Envelop;
import io.vertx.up.eon.em.JobType;

@Job(value = JobType.ONCE, duration = 10, name = "Final")
public class FinalJob {

    @Contract
    private transient Vertx vertx;

    @On(address = "JOB://INCOME/FINAL", income = FinalIncome.class)
    public Future<String> on(final Envelop input) {
        System.out.println("Income: " + input.data());
        System.out.println("Start: " + this.vertx.hashCode());
        return Future.succeededFuture("On");
    }
}
