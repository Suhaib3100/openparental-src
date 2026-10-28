package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GservicesValue<T> {
    private static final Object zzc = new Object();

    @o0
    protected final String zza;

    @o0
    protected final Object zzb;

    @q0
    private Object zzd = null;

    protected GservicesValue(@o0 String str, @o0 Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    @o0
    @KeepForSdk
    public static GservicesValue<Float> value(@o0 String str, @o0 Float f6) {
        return new zzd(str, f6);
    }

    @o0
    @KeepForSdk
    public final T get() {
        T t5 = (T) this.zzd;
        if (t5 != null) {
            return t5;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
            try {
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        }
        try {
            T t6 = (T) zza(this.zza);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return t6;
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                T t7 = (T) zza(this.zza);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return t7;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    @o0
    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @VisibleForTesting
    @KeepForSdk
    public void override(@o0 T t5) {
        this.zzd = t5;
        Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public void resetOverride() {
        this.zzd = null;
    }

    @o0
    protected abstract Object zza(@o0 String str);

    @o0
    @KeepForSdk
    public static GservicesValue<Integer> value(@o0 String str, @o0 Integer num) {
        return new zzc(str, num);
    }

    @o0
    @KeepForSdk
    public static GservicesValue<Long> value(@o0 String str, @o0 Long l5) {
        return new zzb(str, l5);
    }

    @o0
    @KeepForSdk
    public static GservicesValue<String> value(@o0 String str, @o0 String str2) {
        return new zze(str, str2);
    }

    @o0
    @KeepForSdk
    public static GservicesValue<Boolean> value(@o0 String str, boolean z5) {
        return new zza(str, Boolean.valueOf(z5));
    }
}
