package cn.vertxup.micro.jsr311;

import io.vertx.ext.web.RoutingContext;
import io.vertx.up.atom.Epsilon;
import io.vertx.up.exception.web._400BadRequestException;
import io.vertx.up.uca.rs.mime.Resolver;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

public class UserResolver implements Resolver<PojoUser> {
    @Override
    public Epsilon<PojoUser> resolve(
            final RoutingContext context,
            final Epsilon<PojoUser> income) {
        /*
         * 在您的方法中定义的 @BodyParam 类型
         */
        if (PojoUser.class != income.getArgType()) {
            /*
             * 常用 400
             */
            throw new _400BadRequestException(this.getClass());
        } else {
            final String content = context.getBodyAsString();
            /*
             * 执行转换，Resolver的核心逻辑
             */
            PojoUser user = new PojoUser();
            user.setEmail("lang.yu@hpe.com");
            if (Ut.notNil(content)) {
                user = Ux.fromJson(Ut.toJObject(content), PojoUser.class);
            }
            income.setValue(user);
            return income;
        }
    }
}
