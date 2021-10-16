package cn.vertxup.demo.case1;

import cn.vertxup.demo.domain.tables.pojos.XTabular;
import cn.vertxup.demo.util.AbstractJq;
import io.vertx.ext.unit.TestContext;
import io.vertx.up.uca.jooq.UxJooq;
import org.junit.Test;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class InsertTTc extends AbstractJq {

    @Test
    public void testSyncInsert(final TestContext context) {
        final XTabular entity = this.data("data-single.json");
        /*
         * insert(T)
         */
        final UxJooq dao = this.dao();
        final XTabular inserted = dao.insert(entity);
        if (Objects.nonNull(inserted)) {
            this.getLogger().info("[TC1] Generated key: {0}", inserted.toJson().encodePrettily());
        }
    }
}
