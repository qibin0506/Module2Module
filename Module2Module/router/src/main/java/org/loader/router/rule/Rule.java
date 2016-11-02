package org.loader.router.rule;

import android.content.Context;

/**
 * 路由规则接口<br/>
 * Created by qibin on 2016/10/8.
 */

public interface Rule<T, V> {
    /**
     * 添加路由
     * @param pattern 路由uri
     * @param klass 路由class
     */
    void router(String pattern, Class<T> klass);

    /**
     * 路由调用
     * @param ctx Context
     * @param pattern 路由uri
     * @return {@code V} 返回对应的返回值
     */
    V invoke(Context ctx, String pattern);
}
