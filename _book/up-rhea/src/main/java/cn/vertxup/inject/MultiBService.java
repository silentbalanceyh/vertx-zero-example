package cn.vertxup.inject;

import io.vertx.core.json.JsonObject;

import javax.inject.Named;

@Named("ServiceB")
public class MultiBService implements MultiStub {
    @Override
    public JsonObject getData(final JsonObject input) {
        input.put("className", this.getClass().getName());
        return input;
    }
}
