package net.yslibrary.android.keyboardvisibilityevent;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AutoActivityLifecycleCallback.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0005J\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\tH$¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lnet/yslibrary/android/keyboardvisibilityevent/a;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "targetActivity", "<init>", "(Landroid/app/Activity;)V", "activity", "Landroid/os/Bundle;", "bundle", "Lkotlin/k2;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "a", "()V", "b", "Landroid/app/Activity;", "keyboardvisibilityevent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public abstract class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Activity targetActivity;

    public a(@l Activity activity) {
        l0.p(activity, ProtectedSandApp.s("鸎\u0001"));
        this.targetActivity = activity;
    }

    protected abstract void a();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@l Activity activity, @m Bundle bundle) {
        l0.p(activity, ProtectedSandApp.s("鸏\u0001"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@l Activity activity) {
        l0.p(activity, ProtectedSandApp.s("鸏\u0001"));
        Activity activity2 = this.targetActivity;
        if (activity == activity2) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@l Activity activity) {
        l0.p(activity, ProtectedSandApp.s("鸏\u0001"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@l Activity activity) {
        l0.p(activity, ProtectedSandApp.s("鸏\u0001"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@l Activity activity, @l Bundle bundle) {
        l0.p(activity, ProtectedSandApp.s("鸏\u0001"));
        l0.p(bundle, ProtectedSandApp.s("鸐\u0001"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@l Activity activity) {
        l0.p(activity, ProtectedSandApp.s("鸏\u0001"));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@l Activity activity) {
        l0.p(activity, ProtectedSandApp.s("鸏\u0001"));
    }
}
