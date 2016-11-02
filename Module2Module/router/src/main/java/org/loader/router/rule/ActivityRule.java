package org.loader.router.rule;

import android.app.Activity;

import org.loader.router.exception.ActivityNotRouteException;

/**
 * activity路由规则<br />
 * Created by qibin on 2016/10/8.
 */

public class ActivityRule extends BaseIntentRule<Activity> {

    /** activity路由scheme*/
    public static final String ACTIVITY_SCHEME = "activity://";

    /**
     * {@inheritDoc}
     */
    @Override
    public void throwException(String pattern) {
        throw new ActivityNotRouteException(pattern);
    }
}
