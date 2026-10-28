package androidx.core.app;

import android.app.ActivityManager;

/* compiled from: ActivityManagerCompat.java */
/* loaded from: classes3.dex */
public final class d {
    private d() {
    }

    @androidx.annotation.w0(expression = "activityManager.isLowRamDevice()")
    @Deprecated
    public static boolean a(@androidx.annotation.o0 ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
