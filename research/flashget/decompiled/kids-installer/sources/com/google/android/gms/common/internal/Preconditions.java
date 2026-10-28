package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError(ProtectedSandApp.s("\u0b78"));
    }

    @KeepForSdk
    public static void checkArgument(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    public static void checkHandlerThread(@o0 Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : ProtectedSandApp.s("\u0b79");
            throw new IllegalStateException(ProtectedSandApp.s("\u0b7a") + handler.getLooper().getThread().getName() + ProtectedSandApp.s("\u0b7b") + name + ProtectedSandApp.s("\u0b7c"));
        }
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread(ProtectedSandApp.s("\u0b7d"));
    }

    @EnsuresNonNull({"#1"})
    @o0
    @KeepForSdk
    public static String checkNotEmpty(@q0 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0b7e"));
        }
        return str;
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread(ProtectedSandApp.s("\u0b7f"));
    }

    @EnsuresNonNull({"#1"})
    @o0
    @KeepForSdk
    public static <T> T checkNotNull(@q0 T t5) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(ProtectedSandApp.s("\u0b80"));
    }

    @KeepForSdk
    public static int checkNotZero(int i5) {
        if (i5 != 0) {
            return i5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\u0b81"));
    }

    @KeepForSdk
    public static void checkState(boolean z5) {
        if (!z5) {
            throw new IllegalStateException();
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z5, @o0 Object obj) {
        if (!z5) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkMainThread(@o0 String str) {
        if (!com.google.android.gms.common.util.zzb.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkNotMainThread(@o0 String str) {
        if (com.google.android.gms.common.util.zzb.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @EnsuresNonNull({"#1"})
    @o0
    @KeepForSdk
    public static <T> T checkNotNull(@o0 T t5, @o0 Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkNotZero(int i5, @o0 Object obj) {
        if (i5 != 0) {
            return i5;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkState(boolean z5, @o0 Object obj) {
        if (!z5) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z5, @o0 String str, @o0 Object... objArr) {
        if (!z5) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @EnsuresNonNull({"#1"})
    @o0
    @KeepForSdk
    public static String checkNotEmpty(@q0 String str, @o0 Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @KeepForSdk
    public static long checkNotZero(long j5) {
        if (j5 != 0) {
            return j5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ஂ"));
    }

    @KeepForSdk
    public static void checkState(boolean z5, @o0 String str, @o0 Object... objArr) {
        if (!z5) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static long checkNotZero(long j5, @o0 Object obj) {
        if (j5 != 0) {
            return j5;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkHandlerThread(@o0 Handler handler, @o0 String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }
}
