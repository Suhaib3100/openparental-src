package com.google.android.gms.common;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import javax.annotation.Nullable;
import x1.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@b
/* loaded from: classes2.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i5, boolean z5, @Nullable String str2, @Nullable Throwable th) {
        this.zza = str;
        this.zzb = z5;
        this.zzc = str2;
        this.zzd = th;
    }

    @o0
    public static PackageVerificationResult zza(@o0 String str, @o0 String str2, @Nullable Throwable th) {
        return new PackageVerificationResult(str, 1, false, str2, th);
    }

    @o0
    public static PackageVerificationResult zzd(@o0 String str, int i5) {
        return new PackageVerificationResult(str, i5, true, null, null);
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        String concat = ProtectedSandApp.s("੭").concat(String.valueOf(this.zzc));
        Throwable th = this.zzd;
        if (th == null) {
            throw new SecurityException(concat);
        }
        throw new SecurityException(concat, th);
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
