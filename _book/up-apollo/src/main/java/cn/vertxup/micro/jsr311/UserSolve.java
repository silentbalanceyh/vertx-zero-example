package cn.vertxup.micro.jsr311;

import io.vertx.up.uca.rs.mime.Solve;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;

public class UserSolve implements Solve<PojoUser> {
    @Override
    public PojoUser resolve(final String content) {
        /*
         * 执行转换，Resolver的核心逻辑
         */
        final PojoUser user = Ux.fromJson(Ut.toJObject(content), PojoUser.class);
        if (Objects.isNull(user.getEmail())) {
            user.setEmail("lang.yu@hpe.com");
        }
        return user;
    }
}
