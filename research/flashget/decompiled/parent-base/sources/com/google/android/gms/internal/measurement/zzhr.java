package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.x;
import zc.h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhr {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;

    @h
    final x<Context, Boolean> zzh;
    private final boolean zzi;

    public zzhr(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzhr zza() {
        return new zzhr(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzhr zzb() {
        if (!this.zzc.isEmpty()) {
            throw new IllegalStateException(ProtectedSandApp.s("풔"));
        }
        x<Context, Boolean> xVar = this.zzh;
        if (xVar == null) {
            return new zzhr(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, xVar);
        }
        throw new IllegalStateException(ProtectedSandApp.s("풓"));
    }

    private zzhr(String str, Uri uri, String str2, String str3, boolean z4, boolean z5, boolean z6, boolean z7, @h x<Context, Boolean> xVar) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z4;
        this.zzf = z5;
        this.zzi = z6;
        this.zzg = z7;
        this.zzh = xVar;
    }

    public final zzhj<Double> zza(String str, double d5) {
        return zzhj.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzhj<Long> zza(String str, long j4) {
        return zzhj.zza(this, str, Long.valueOf(j4), true);
    }

    public final zzhj<String> zza(String str, String str2) {
        return zzhj.zza(this, str, str2, true);
    }

    public final zzhj<Boolean> zza(String str, boolean z4) {
        return zzhj.zza(this, str, Boolean.valueOf(z4), true);
    }
}
