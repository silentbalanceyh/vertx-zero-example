package cn.vertxup.command;

import io.vertx.core.json.JsonObject;
import io.vertx.tp.plugin.shell.AbstractCommander;
import io.vertx.tp.plugin.shell.atom.CommandInput;
import io.vertx.tp.plugin.shell.cv.em.TermStatus;

public class ParamCommand extends AbstractCommander {
    /* 同步执行 */
    @Override
    public TermStatus execute(final CommandInput args) {
        final String env = this.inString(args, "e");
        final String required = this.inString(args, "r");
        final JsonObject config = this.atom.getConfig();
        System.out.println(env + "," + required + "," + config.encode());
        return TermStatus.SUCCESS;
    }
}
