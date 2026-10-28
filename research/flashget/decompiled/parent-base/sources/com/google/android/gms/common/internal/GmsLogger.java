package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class GmsLogger {
    private final String zza;

    @q0
    private final String zzb;

    @KeepForSdk
    public GmsLogger(@o0 String str) {
        this(str, null);
    }

    private final String zza(String str) {
        String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    private final String zzb(String str, Object... objArr) {
        String str2 = this.zzb;
        String format = String.format(str, objArr);
        return str2 == null ? format : str2.concat(format);
    }

    @KeepForSdk
    public boolean canLog(int i4) {
        return Log.isLoggable(this.zza, i4);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    public void d(@o0 String str, @o0 String str2) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void e(@o0 String str, @o0 String str2) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void efmt(@o0 String str, @o0 String str2, @o0 Object... objArr) {
        if (canLog(6)) {
            zzb(str2, objArr);
        }
    }

    @KeepForSdk
    public void i(@o0 String str, @o0 String str2) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void pii(@o0 String str, @o0 String str2) {
    }

    @KeepForSdk
    public void v(@o0 String str, @o0 String str2) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void w(@o0 String str, @o0 String str2) {
        if (canLog(5)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void wfmt(@o0 String str, @o0 String str2, @o0 Object... objArr) {
        if (canLog(5)) {
            zzb(str2, objArr);
        }
    }

    @KeepForSdk
    public void wtf(@o0 String str, @o0 String str2, @o0 Throwable th) {
        if (canLog(7)) {
            zza(str2);
            Log.wtf(str, zza(str2), th);
        }
    }

    @KeepForSdk
    public GmsLogger(@o0 String str, @q0 String str2) {
        Preconditions.checkNotNull(str, ProtectedSandApp.s("쫙"));
        Preconditions.checkArgument(str.length() <= 23, ProtectedSandApp.s("쫚"), str, 23);
        this.zza = str;
        this.zzb = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    @KeepForSdk
    public void pii(@o0 String str, @o0 String str2, @o0 Throwable th) {
    }

    @KeepForSdk
    public void d(@o0 String str, @o0 String str2, @o0 Throwable th) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void e(@o0 String str, @o0 String str2, @o0 Throwable th) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void i(@o0 String str, @o0 String str2, @o0 Throwable th) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void v(@o0 String str, @o0 String str2, @o0 Throwable th) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void w(@o0 String str, @o0 String str2, @o0 Throwable th) {
        if (canLog(5)) {
            zza(str2);
        }
    }
}
