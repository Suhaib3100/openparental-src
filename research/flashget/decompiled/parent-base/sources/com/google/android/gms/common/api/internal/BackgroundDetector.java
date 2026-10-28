package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final BackgroundDetector zza = new BackgroundDetector();
    private final AtomicBoolean zzb = new AtomicBoolean();
    private final AtomicBoolean zzc = new AtomicBoolean();
    private final ArrayList zzd = new ArrayList();
    private boolean zze = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z4);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    @o0
    @KeepForSdk
    public static BackgroundDetector getInstance() {
        return zza;
    }

    @KeepForSdk
    public static void initialize(@o0 Application application) {
        BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            try {
                if (!backgroundDetector.zze) {
                    application.registerActivityLifecycleCallbacks(backgroundDetector);
                    application.registerComponentCallbacks(backgroundDetector);
                    backgroundDetector.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zza(boolean z4) {
        synchronized (zza) {
            try {
                Iterator it = this.zzd.iterator();
                while (it.hasNext()) {
                    ((BackgroundStateChangeListener) it.next()).onBackgroundStateChanged(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public void addListener(@o0 BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (zza) {
            this.zzd.add(backgroundStateChangeListener);
        }
    }

    @KeepForSdk
    public boolean isInBackground() {
        return this.zzb.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@o0 Activity activity, @q0 Bundle bundle) {
        AtomicBoolean atomicBoolean = this.zzc;
        boolean compareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@o0 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@o0 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@o0 Activity activity) {
        AtomicBoolean atomicBoolean = this.zzc;
        boolean compareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@o0 Activity activity, @o0 Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@o0 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@o0 Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@o0 Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        if (i4 == 20 && this.zzb.compareAndSet(false, true)) {
            this.zzc.set(true);
            zza(true);
        }
    }

    @KeepForSdk
    public boolean readCurrentStateIfPossible(boolean z4) {
        AtomicBoolean atomicBoolean = this.zzc;
        if (!atomicBoolean.get()) {
            if (ProcessUtils.zza()) {
                return z4;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.zzb.set(true);
            }
        }
        return isInBackground();
    }
}
