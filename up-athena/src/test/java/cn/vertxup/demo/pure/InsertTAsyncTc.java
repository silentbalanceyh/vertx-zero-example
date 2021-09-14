package cn.vertxup.demo.pure;

import cn.vertxup.demo.domain.tables.pojos.XTabular;
import cn.vertxup.demo.util.AbstractJq;
import io.vertx.ext.unit.TestContext;
import io.vertx.up.uca.jooq.UxJooq;
import org.junit.Test;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class InsertTAsyncTc extends AbstractJq {
    /*
     * 直接的增删改测试大场景
     */
    @Test
    public void testInsertT(final TestContext context) {
        final XTabular entity = this.data("insert-case1-cache.json");
        /*
         * insert(T)
         */
        final UxJooq dao = this.dao();
        final XTabular inserted = dao.insert(entity);
        final String genKey = inserted.getKey();
        this.getLogger().info("[TC1] Generated key: {0}", genKey);
        context.assertNotNull(genKey);
        /*
         * deleteById(T)
         */
        final boolean deleted = dao.deleteById(genKey);
        context.assertTrue(deleted);
        this.getLogger().info("[TC1] Deleted key: {0}", genKey);
        /*
         * fetchById(ID)
         */
        final XTabular fetched = dao.fetchById(genKey);
        context.assertNull(fetched);
        this.getLogger().info("[TC1] Fetched null of key: {0}", genKey);
    }
}
