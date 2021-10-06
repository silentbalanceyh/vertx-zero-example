package io.vertx.up.secure;

import io.vertx.core.json.JsonObject;
import io.vertx.up.atom.secure.AegisItem;
import io.vertx.up.eon.em.AuthWall;
import io.vertx.up.util.Ut;
import org.junit.Test;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TokenTc {
    @Test
    public void testBasic() {
        final AegisItem item = AegisItem.configMap(AuthWall.BASIC);
        final Lee lee = Ut.service(LeeBuiltIn.class);
        final String code = lee.encode(new JsonObject()
                .put("username", "lang")
                .put("password", "111111"),
            item);
        System.out.println(code);
    }

    @Test
    public void testJwt() {
        final AegisItem item = AegisItem.configMap(AuthWall.JWT);
        final Lee lee = Ut.service(LeeBuiltIn.class);
        final String code = lee.encode(new JsonObject()
                .put("username", "lang")
                .put("password", "111111"),
            item);
        System.out.println(code);
        final JsonObject data = lee.decode(code, item);
        System.out.println(data);
    }
}
