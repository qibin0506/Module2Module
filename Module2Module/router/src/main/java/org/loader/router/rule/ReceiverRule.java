package org.loader.router.rule;

import android.content.BroadcastReceiver;

import org.loader.router.exception.ReceiverNotRouteException;

/**
 * receiver路由规则<br />
 * Created by qibin on 2016/10/8.
 */

public class ReceiverRule extends BaseIntentRule<BroadcastReceiver> {

    /** receiver路由scheme*/
    public static final String RECEIVER_SCHEME = "receiver://";

    @Override
    public void throwException(String pattern) {
        throw new ReceiverNotRouteException(pattern);
    }
}
