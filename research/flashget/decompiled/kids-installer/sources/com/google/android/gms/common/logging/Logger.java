package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(@o0 String str, @o0 String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(ProtectedSandApp.s("\u0bd5"));
                }
                sb2.append(str2);
            }
            sb2.append(ProtectedSandApp.s("\u0bd6"));
            sb = sb2.toString();
        }
        this.zzb = sb;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i5 = 2;
        while (i5 <= 7 && !Log.isLoggable(this.zza, i5)) {
            i5++;
        }
        this.zzd = i5;
    }

    @KeepForSdk
    public void d(@o0 String str, @o0 Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void e(@o0 String str, @o0 Throwable th, @o0 Object... objArr) {
        format(str, objArr);
    }

    @o0
    @KeepForSdk
    protected String format(@o0 String str, @o0 Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    @o0
    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    public void i(@o0 String str, @o0 Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public boolean isLoggable(int i5) {
        return this.zzd <= i5;
    }

    @KeepForSdk
    public void v(@o0 String str, @o0 Throwable th, @o0 Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void w(@o0 String str, @o0 Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(@o0 String str, @o0 Throwable th, @o0 Object... objArr) {
        Log.wtf(this.zza, format(str, objArr), th);
    }

    @KeepForSdk
    public void e(@o0 String str, @o0 Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(@o0 Throwable th) {
        Log.wtf(this.zza, th);
    }

    @KeepForSdk
    public void v(@o0 String str, @o0 Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }
}
