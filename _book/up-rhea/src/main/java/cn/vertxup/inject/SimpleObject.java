package cn.vertxup.inject;

import io.vertx.core.json.JsonObject;

public class SimpleObject {

    public JsonObject getData(final JsonObject data) {
        data.put("className", this.getClass().getName());
        return data;
    }
}