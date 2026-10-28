package com.google.android.gms.common.internal;

import android.os.Looper;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError(ProtectedSandApp.s("ଭ"));
    }

    @KeepForSdk
    public static void checkMainThread(@o0 String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        String.valueOf(Thread.currentThread());
        String.valueOf(Looper.getMainLooper().getThread());
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(@o0 String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        String.valueOf(Thread.currentThread());
        String.valueOf(Looper.getMainLooper().getThread());
        throw new IllegalStateException(str);
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static void checkNotNull(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ମ"));
        }
    }

    @KeepForSdk
    public static void checkNull(@o0 Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ଯ"));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z5) {
        if (!z5) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static void checkNotNull(@Nullable Object obj, @o0 Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z5, @o0 Object obj) {
        if (!z5) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
