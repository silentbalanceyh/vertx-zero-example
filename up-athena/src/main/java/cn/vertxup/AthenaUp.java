package cn.vertxup;

import io.vertx.boot.VertxApplication;
import io.vertx.up.annotations.Up;

@Up
public class AthenaUp {
    public static void main(final String[] args) {
        VertxApplication.run(AthenaUp.class);
    }
}
