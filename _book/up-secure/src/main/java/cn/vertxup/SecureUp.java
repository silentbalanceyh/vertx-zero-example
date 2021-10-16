package cn.vertxup;

import io.vertx.up.VertxApplication;
import io.vertx.up.annotations.Up;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@Up
public class SecureUp {
    public static void main(final String[] args) {
        VertxApplication.run(SecureUp.class);
    }
}
