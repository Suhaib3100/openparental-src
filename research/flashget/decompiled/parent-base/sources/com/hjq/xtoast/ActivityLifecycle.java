package com.hjq.xtoast;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class ActivityLifecycle implements Application.ActivityLifecycleCallbacks {
    private Activity mActivity;
    private XToast<?> mToast;

    ActivityLifecycle(XToast<?> xToast, Activity activity) {
        this.mActivity = activity;
        this.mToast = xToast;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.mActivity != activity) {
            return;
        }
        this.mActivity = null;
        XToast<?> xToast = this.mToast;
        if (xToast == null) {
            return;
        }
        xToast.recycle();
        this.mToast = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        XToast<?> xToast;
        Activity activity2 = this.mActivity;
        if (activity2 == activity && activity2.isFinishing() && (xToast = this.mToast) != null && xToast.isShowing()) {
            this.mToast.cancel();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    void register() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(this);
        } else {
            activity.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    void unregister() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            activity.unregisterActivityLifecycleCallbacks(this);
        } else {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }
}
