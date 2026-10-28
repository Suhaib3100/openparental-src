package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import javax.annotation.Nullable;
import x1.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@b
/* loaded from: classes2.dex */
class zzx {
    private static final zzx zze = new zzx(true, 3, 1, null, null);
    final boolean zza;

    @Nullable
    final String zzb;

    @Nullable
    final Throwable zzc;
    final int zzd;

    private zzx(boolean z5, int i5, int i6, @Nullable String str, @Nullable Throwable th) {
        this.zza = z5;
        this.zzd = i5;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    static zzx zzb() {
        return zze;
    }

    static zzx zzc(@o0 String str) {
        return new zzx(false, 1, 5, str, null);
    }

    static zzx zzd(@o0 String str, @o0 Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    static zzx zzf(int i5) {
        return new zzx(true, i5, 1, null, null);
    }

    static zzx zzg(int i5, int i6, @o0 String str, @Nullable Throwable th) {
        return new zzx(false, i5, i6, str, th);
    }

    @Nullable
    String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !Log.isLoggable(ProtectedSandApp.s("ಫ"), 3)) {
            return;
        }
        if (this.zzc != null) {
            zza();
        } else {
            zza();
        }
    }
}
