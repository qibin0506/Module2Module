package org.loader.router.exception;

/**
 * Created by qibin on 2016/10/8.
 */

public class ActivityNotRouteException extends NotRouteException {

    public ActivityNotRouteException(String pattern) {
        super("activity", pattern);
    }
}
