package cn.vertxup.demo.cache;

import cn.vertxup.demo.util.AbstractJq;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.unit.TestContext;
import org.junit.Test;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class ExistAsyncTc extends AbstractJq {

    /*
     * 场景8：按主键检查数据
     */
    @Test
    public void testExist1(final TestContext context) throws Throwable {
        /*
         * 同步测试
         */
        final Boolean existing = this.dao().existById(HelpData.ID_OK);
        context.assertTrue(existing);
        /*
         * 异步测试
         */
        this.async(context, this.dao().existByIdAsync(HelpData.ID_OK), actual -> {
            System.out.println(actual);
            context.assertTrue(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景9：按主键查询不存在
     */
    @Test
    public void testExist2(final TestContext context) throws Throwable {
        this.async(context, this.dao().existByIdAsync(HelpData.ID_KO), actual -> {
            System.out.println(actual);
            context.assertFalse(actual);
        });
        Thread.sleep(2000);
    }

    /*
     * 场景10：按条件查询是否存在
     */
    @Test
    public void testExist3(final TestContext context) throws Throwable {
        final JsonObject condition = new JsonObject();
        condition.put("type", "test.type1");
        this.async(context, this.dao().existAsync(condition), actual -> {
            System.out.println(actual);
            context.assertTrue(actual);
        });
        Thread.sleep(2000);
    }


    /*
     * 场景10：按条件查询不存在
     */
    @Test
    public void testExist4(final TestContext context) throws Throwable {
        final JsonObject condition = new JsonObject();
        condition.put("type", "test.type2");
        this.async(context, this.dao().existAsync(condition), actual -> {
            System.out.println(actual);
            context.assertFalse(actual);
        });
        Thread.sleep(2000);
    }
}
