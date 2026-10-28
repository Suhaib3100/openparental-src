package com.tencent.beacon.c.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.tencent.beacon.module.StatModule;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PageTimeLifeCallbacks.java */
@TargetApi(14)
/* loaded from: classes6.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private long f71385a = System.currentTimeMillis();

    /* renamed from: b, reason: collision with root package name */
    private Map<Activity, Long> f71386b = new HashMap(3);

    /* renamed from: c, reason: collision with root package name */
    private StatModule f71387c;

    public d(StatModule statModule) {
        this.f71387c = statModule;
    }

    private void a(Activity activity) {
        Long l4 = this.f71386b.get(activity);
        if (l4 == null) {
            l4 = Long.valueOf(this.f71385a);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f71387c.b(activity.getLocalClassName(), currentTimeMillis - l4.longValue(), currentTimeMillis);
        this.f71386b.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f71386b.put(activity, Long.valueOf(System.currentTimeMillis()));
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
}
