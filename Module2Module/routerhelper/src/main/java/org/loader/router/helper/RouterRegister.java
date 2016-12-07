package org.loader.router.helper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RouterRegister {

    public static void register() {
        try {
            Class<?> klass = Class.forName("org.loader.router.RouterInstaller");
            Method method = klass.getDeclaredMethod("install");
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
