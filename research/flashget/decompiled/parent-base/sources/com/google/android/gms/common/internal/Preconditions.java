package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError(ProtectedSandApp.s("쫩"));
    }

    @KeepForSdk
    public static void checkArgument(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    public static double checkArgumentInRange(double d5, double d6, double d7, @o0 String str) {
        if (d5 < d6) {
            throw new IllegalArgumentException(zza(ProtectedSandApp.s("쫫"), str, Double.valueOf(d6), Double.valueOf(d7)));
        }
        if (d5 <= d7) {
            return d5;
        }
        throw new IllegalArgumentException(zza(ProtectedSandApp.s("쫪"), str, Double.valueOf(d6), Double.valueOf(d7)));
    }

    @g0(from = 0)
    @KeepForSdk
    public static int checkArgumentNonnegative(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("쫮"));
    }

    @KeepForSdk
    public static void checkHandlerThread(@o0 Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : ProtectedSandApp.s("쫯");
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            l0.a(sb, ProtectedSandApp.s("쫰"), name2, ProtectedSandApp.s("쫱"), name);
            sb.append(ProtectedSandApp.s("쫲"));
            throw new IllegalStateException(sb.toString());
        }
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread(ProtectedSandApp.s("쫳"));
    }

    @o0
    @KeepForSdk
    public static String checkNotEmpty(@q0 String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("쫴"));
        }
        return str;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread(ProtectedSandApp.s("쫵"));
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread(ProtectedSandApp.s("쫷"));
    }

    @o0
    @KeepForSdk
    public static <T> T checkNotNull(@q0 T t4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(ProtectedSandApp.s("쫸"));
    }

    @KeepForSdk
    public static int checkNotZero(int i4) {
        if (i4 != 0) {
            return i4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("쫹"));
    }

    @KeepForSdk
    public static void checkState(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    static String zza(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i4 = 0;
        int i5 = 0;
        while (i4 < 3 && (indexOf = str.indexOf(ProtectedSandApp.s("쫻"), i5)) != -1) {
            sb.append(str.substring(i5, indexOf));
            sb.append(objArr[i4]);
            i5 = indexOf + 2;
            i4++;
        }
        sb.append(str.substring(i5));
        if (i4 < 3) {
            sb.append(ProtectedSandApp.s("쫼"));
            sb.append(objArr[i4]);
            for (int i6 = i4 + 1; i6 < 3; i6++) {
                sb.append(ProtectedSandApp.s("쫽"));
                sb.append(objArr[i6]);
            }
            sb.append(ProtectedSandApp.s("쫾"));
        }
        return sb.toString();
    }

    @KeepForSdk
    public static void checkArgument(boolean z4, @o0 Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @g0(from = 0)
    @KeepForSdk
    public static int checkArgumentNonnegative(int i4, @o0 String str) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(str);
    }

    @KeepForSdk
    public static void checkMainThread(@o0 String str) {
        if (!com.google.android.gms.common.util.zze.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread(@o0 String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && java.util.Objects.equals(myLooper.getThread().getName(), ProtectedSandApp.s("쫶"))) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkNotMainThread(@o0 String str) {
        if (com.google.android.gms.common.util.zze.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @o0
    @KeepForSdk
    public static <T> T checkNotNull(@o0 T t4, @o0 Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkNotZero(int i4, @o0 Object obj) {
        if (i4 != 0) {
            return i4;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkState(boolean z4, @o0 Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z4, @o0 String str, @o0 Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static long checkArgumentNonnegative(long j4) {
        if (j4 >= 0) {
            return j4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("쫮"));
    }

    @o0
    @KeepForSdk
    public static String checkNotEmpty(@q0 String str, @o0 Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @KeepForSdk
    public static long checkNotZero(long j4) {
        if (j4 != 0) {
            return j4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("쫺"));
    }

    @KeepForSdk
    public static void checkState(boolean z4, @o0 String str, @o0 Object... objArr) {
        if (!z4) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static float checkArgumentInRange(float f4, float f5, float f6, @o0 String str) {
        if (f4 < f5) {
            throw new IllegalArgumentException(zza(ProtectedSandApp.s("쫫"), str, Float.valueOf(f5), Float.valueOf(f6)));
        }
        if (f4 <= f6) {
            return f4;
        }
        throw new IllegalArgumentException(zza(ProtectedSandApp.s("쫪"), str, Float.valueOf(f5), Float.valueOf(f6)));
    }

    @KeepForSdk
    public static long checkArgumentNonnegative(long j4, @o0 String str) {
        if (j4 >= 0) {
            return j4;
        }
        throw new IllegalArgumentException(str);
    }

    @KeepForSdk
    public static long checkNotZero(long j4, @o0 Object obj) {
        if (j4 != 0) {
            return j4;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkArgumentInRange(int i4, int i5, int i6, @o0 String str) {
        if (i4 < i5) {
            throw new IllegalArgumentException(zza(ProtectedSandApp.s("쫭"), str, Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        if (i4 <= i6) {
            return i4;
        }
        throw new IllegalArgumentException(zza(ProtectedSandApp.s("쫬"), str, Integer.valueOf(i5), Integer.valueOf(i6)));
    }

    @KeepForSdk
    public static long checkArgumentInRange(long j4, long j5, long j6, @o0 String str) {
        if (j4 < j5) {
            throw new IllegalArgumentException(zza(ProtectedSandApp.s("쫭"), str, Long.valueOf(j5), Long.valueOf(j6)));
        }
        if (j4 <= j6) {
            return j4;
        }
        throw new IllegalArgumentException(zza(ProtectedSandApp.s("쫬"), str, Long.valueOf(j5), Long.valueOf(j6)));
    }

    @KeepForSdk
    public static void checkHandlerThread(@o0 Handler handler, @o0 String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }
}
