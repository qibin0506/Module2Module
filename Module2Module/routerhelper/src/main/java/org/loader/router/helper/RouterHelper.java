package org.loader.router.helper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RouterHelper {

    public static void install() {
        try {
            Class<?> klass = Class.forName(Config.PACKAGE_NAME + "." + Config.ROUTER_MANAGER);
            Method method = klass.getDeclaredMethod(Config.ROUTER_MANAGER_METHOD);
            method.invoke(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
