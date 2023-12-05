package cn.vertxup;

import io.mature.exploit.PulseOn;

public class AthenaLoader {
    public static void main(final String[] args) {
//        Bt.load("init/");
        PulseOn.runOob(AthenaLoader.class, "init/");
    }
}
