package cn.vertxup.secure;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.up.annotations.Authenticate;
import io.vertx.up.annotations.Authorized;
import io.vertx.up.annotations.AuthorizedResource;
import io.vertx.up.annotations.Wall;
import io.vertx.up.eon.em.AuthWord;

import java.util.HashSet;
import java.util.Set;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@Wall(path = "/api/oauth2/*", value = "oauth2")
public class OAuth2Wall {
    @Authenticate
    public Future<Boolean> verify(final JsonObject data) {
        System.out.println(data.encodePrettily());
        return Future.succeededFuture(Boolean.TRUE);
    }

    @Authorized
    public Future<Set<String>> authorize(final User user) {
        final Set<String> item = new HashSet<>();
        item.add("p1");
        item.add("p2");
        return Future.succeededFuture(item);
    }

    @AuthorizedResource(AuthWord.OR)
    public Future<Set<String>> resource(final JsonObject params) {
        final Set<String> item = new HashSet<>();
        item.add("p1");
        item.add("p3");
        return Future.succeededFuture(item);
    }
}
