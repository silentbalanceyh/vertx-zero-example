package cn.vertxup.demo.util;


import io.vertx.up.plugin.redis.RedisInfix;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class AbstractJqCache extends AbstractJq {
    static {
        RedisInfix.init(VERTX);
    }
}
