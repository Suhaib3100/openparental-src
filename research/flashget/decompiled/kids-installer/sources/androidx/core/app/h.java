package androidx.core.app;

import android.app.ActivityManager;

/* compiled from: ActivityManagerCompat.java */
/* loaded from: classes.dex */
public final class h {
    private h() {
    }

    public static boolean a(@androidx.annotation.o0 ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
