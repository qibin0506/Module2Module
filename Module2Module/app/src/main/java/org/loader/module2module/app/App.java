package org.loader.module2module.app;

import android.support.multidex.MultiDexApplication;

import org.loader.annotation.Components;
import org.loader.router.helper.RouterRegister;
import org.loader.utilslib.Logger;

@Components({"shop", "bbs"})
public class App extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        setupRouter();
        Logger.dump("TAG", "application: " + getClass().getName());
    }

    private void setupRouter() {
        RouterRegister.register();
//        AR.route();
//        Router.router(ActivityRule.ACTIVITY_SCHEME + "shop.main", ShopActivity.class);
//        Router.router(ActivityRule.ACTIVITY_SCHEME + "bbs.main", BBSActivity.class);
    }
}
