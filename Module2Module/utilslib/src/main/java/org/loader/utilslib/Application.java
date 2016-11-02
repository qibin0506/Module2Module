package org.loader.utilslib;

public class Application {

    private static android.app.Application sInstance;

    public static android.app.Application get() {
        if (sInstance == null) {
            android.app.Application app = null;
            try {
                app = (android.app.Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication").invoke(null);
                if (app == null) {
                    throw new IllegalStateException("Static initialization of Applications must be on main thread.");
                }
            } catch (final Exception e) {
                try {
                    app = (android.app.Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication").invoke(null);
                } catch (final Exception ex) {
                    e.printStackTrace();
                }
            } finally {
                sInstance = app;
            }
        }

        return sInstance;
    }
}
