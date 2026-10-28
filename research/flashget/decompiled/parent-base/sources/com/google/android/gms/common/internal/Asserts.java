package com.google.android.gms.common.internal;

import android.os.Looper;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import zc.h;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError(ProtectedSandApp.s("쫉"));
    }

    @KeepForSdk
    public static void checkMainThread(@o0 String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        new StringBuilder(valueOf2.length() + valueOf.length() + 56 + 1);
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@o0 String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String valueOf = String.valueOf(Thread.currentThread());
        String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
        new StringBuilder(valueOf2.length() + valueOf.length() + 55 + 1);
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotNull(@h Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쫊"));
        }
    }

    @KeepForSdk
    public static void checkNull(@h Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쫋"));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    public static void checkNotNull(@h Object obj, @o0 Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @KeepForSdk
    public static void checkNull(@h Object obj, @o0 Object obj2) {
        if (obj != null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z4, @o0 Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
