package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.flashget.kidsdownloader.ProtectedSandApp;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhy {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    private zzhy(String str, Uri uri, String str2, String str3, boolean z5, boolean z6, boolean z7, boolean z8, @Nullable zzig zzigVar) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z5;
        this.zze = z7;
    }

    public final zzhy zza() {
        return new zzhy(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }

    public final zzhy zzb() {
        if (this.zzb.isEmpty()) {
            return new zzhy(null, this.zza, this.zzb, this.zzc, true, false, this.zze, false, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("ට"));
    }

    public final zzib zzc(String str, double d6) {
        return new zzhw(this, ProtectedSandApp.s("ඨ"), Double.valueOf(-3.0d), true);
    }

    public final zzib zzd(String str, long j5) {
        return new zzhu(this, str, Long.valueOf(j5), true);
    }

    public final zzib zze(String str, String str2) {
        return new zzhx(this, str, str2, true);
    }

    public final zzib zzf(String str, boolean z5) {
        return new zzhv(this, str, Boolean.valueOf(z5), true);
    }

    public zzhy(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
