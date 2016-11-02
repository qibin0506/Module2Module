package org.loader.router.exception;

/**
 * Created by qibin on 2016/10/8.
 */

public class ServiceNotRouteException extends NotRouteException {

    public ServiceNotRouteException(String pattern) {
        super("service", pattern);
    }
}
