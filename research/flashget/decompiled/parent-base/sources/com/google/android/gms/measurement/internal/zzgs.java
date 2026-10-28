package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzgs {

    @o0
    public String zza;

    @o0
    public String zzb;

    @o0
    public Bundle zzc;
    private long zzd;

    public zzgs(@o0 String str, @o0 String str2, @q0 Bundle bundle, long j4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = j4;
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzc);
        StringBuilder a5 = androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("\ude7f"), str, ProtectedSandApp.s("\ude80"), str2, ProtectedSandApp.s("\ude81"));
        a5.append(valueOf);
        return a5.toString();
    }

    public final zzbf zza() {
        return new zzbf(this.zza, new zzbe(new Bundle(this.zzc)), this.zzb, this.zzd);
    }

    public static zzgs zza(zzbf zzbfVar) {
        return new zzgs(zzbfVar.zza, zzbfVar.zzc, zzbfVar.zzb.zzb(), zzbfVar.zzd);
    }
}
