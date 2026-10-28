package com.google.android.gms.common;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import zc.h;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;

    @h
    private final String zzc;

    @h
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i4, boolean z4, @h String str2, @h Throwable th, @h com.google.android.gms.common.signatureverification.zza zzaVar) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = str2;
        this.zzd = th;
    }

    public static PackageVerificationResult zza(String str, @o0 String str2, @h Throwable th, @h com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, 1, false, str2, th, null);
    }

    public static PackageVerificationResult zzd(String str, int i4, @h com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, i4, true, null, null, null);
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final void zzc() {
        if (this.zzb) {
            return;
        }
        String str = this.zzc;
        Throwable th = this.zzd;
        String concat = ProtectedSandApp.s("즑").concat(String.valueOf(str));
        if (th == null) {
            throw new SecurityException(concat);
        }
        throw new SecurityException(concat, th);
    }
}
