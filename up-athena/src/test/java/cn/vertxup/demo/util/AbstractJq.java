package cn.vertxup.demo.util;

import cn.vertxup.demo.domain.tables.daos.XTabularDao;
import cn.vertxup.demo.domain.tables.pojos.XTabular;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.quiz.ZeroBase;
import io.vertx.up.plugin.jooq.JooqInfix;
import io.vertx.up.uca.jooq.UxJooq;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.List;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
public class AbstractJq extends ZeroBase {
    static {
        JooqInfix.init(VERTX);
    }

    /*
     * UxJooq Dao Process
     */
    protected UxJooq dao() {
        return Ux.Jooq.on(XTabularDao.class);
    }

    /*
     * Setup data processing
     */
    protected void installData() {
        final JsonArray dataJson = this.ioJArray("setup.json");
        this.dao().insert(dataJson);
    }

    /*
     * --> T
     */
    protected XTabular data(final String file) {
        final JsonObject dataJson = this.ioJObject(file);
        return Ut.deserialize(dataJson, XTabular.class);
    }

    /*
     * --> List<T>
     */
    protected List<XTabular> dataList(final String file) {
        final JsonArray dataJson = this.ioJArray(file);
        return (List<XTabular>) Ut.deserialize(dataJson, List.class);
    }
}
