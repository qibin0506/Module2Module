package org.loader.router.exception;

/**
 * Created by qibin on 2016/10/8.
 */

public class NotRouteException extends RuntimeException {

    public NotRouteException(String name, String pattern) {
        super(String.format("%s cannot be resolved with pattern %s, have you declared it in your Router?", name, pattern));
    }
}
