package cn.vertxup;

import io.vertx.core.json.JsonObject;
import io.vertx.up.uca.yaml.ZeroUniform;

public class NodeUp {
    public static void main(final String[] args) {
        final JsonObject data = new ZeroUniform().read();
        System.out.println(data.encodePrettily());
    }
}
