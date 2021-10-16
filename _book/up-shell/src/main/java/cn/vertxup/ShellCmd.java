package cn.vertxup;

import io.vertx.tp.plugin.shell.ConsoleFramework;
import io.vertx.up.unity.Ux;

public class ShellCmd {
    public static void main(final String[] args) {
        ConsoleFramework
                // Ux.nativeVertx() 返回一个根据配置创建的Vertx实例
                .start(Ux.nativeVertx())
                // 绑定命令 start 专用的 Consumer（原Zero入口）
                .bind(input -> ShellUp.main(args))
                // 直接运行
                .run(args);
    }
}
