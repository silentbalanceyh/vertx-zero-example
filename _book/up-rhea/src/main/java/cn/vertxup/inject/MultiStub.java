package cn.vertxup.inject;

import io.vertx.core.json.JsonObject;

public interface MultiStub {

    JsonObject getData(JsonObject input);
}
