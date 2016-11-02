package org.loader.utilslib;

import android.content.Context;

public class UseContext {
    public static void use(Context ctx) {
        Logger.dump("TAG", ctx.getClass().getName());
    }
}
