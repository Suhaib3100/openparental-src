package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import x1.h;
import x1.i;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
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

    @h
    private final String zzb(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.zzb;
        return str2 == null ? format : str2.concat(format);
    }

    @KeepForSdk
    public boolean canLog(int i5) {
        return Log.isLoggable(this.zza, i5);
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
    @h
    public void efmt(@o0 String str, @o0 @i String str2, @o0 Object... objArr) {
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
    @h
    public void wfmt(@o0 String str, @o0 @i String str2, @o0 Object... objArr) {
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
        Preconditions.checkNotNull(str, ProtectedSandApp.s("୨"));
        Preconditions.checkArgument(str.length() <= 23, ProtectedSandApp.s("୩"), str, 23);
        this.zza = str;
        if (str2 == null || str2.length() <= 0) {
            this.zzb = null;
        } else {
            this.zzb = str2;
        }
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
