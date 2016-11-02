package org.loader.router;

import android.content.Context;

import org.loader.router.rule.Rule;

/**
 * Usage: <br />
 * <pre>
 * step 1. 调用Router.router方法添加路由
 * step 2. 调用Router.invoke方法根据pattern调用路由
 * </pre>
 * Created by qibin on 2016/10/9.
 */

public class Router {

    /**
     * 添加自定义路由规则
     * @param scheme 路由scheme
     * @param rule 路由规则
     * @return {@code RouterInternal} Router真实调用类
     */
    public static RouterInternal addRule(String scheme, Rule rule) {
        RouterInternal router = RouterInternal.get();
        router.addRule(scheme, rule);
        return router;
    }

    /**
     * 添加路由
     * @param pattern 路由uri
     * @param klass 路由class
     * @return {@code RouterInternal} Router真实调用类
     */
    public static <T> RouterInternal router(String pattern, Class<T> klass) {
        return RouterInternal.get().router(pattern, klass);
    }

    /**
     * 路由调用
     * @param ctx Context
     * @param pattern 路由uri
     * @return {@code V} 返回对应的返回值
     */
    public static <V> V invoke(Context ctx, String pattern) {
        return RouterInternal.get().invoke(ctx, pattern);
    }
}
