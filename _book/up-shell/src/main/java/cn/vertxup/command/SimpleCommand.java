package cn.vertxup.command;

import io.vertx.tp.plugin.shell.AbstractCommander;
import io.vertx.tp.plugin.shell.atom.CommandInput;
import io.vertx.tp.plugin.shell.cv.em.TermStatus;

public class SimpleCommand extends AbstractCommander {
    /* 同步执行 */
    @Override
    public TermStatus execute(final CommandInput args) {
        System.out.println("执行指令");
        return TermStatus.SUCCESS;
    }
}
