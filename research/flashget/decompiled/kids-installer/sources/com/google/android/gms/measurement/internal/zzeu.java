package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeu {

    @o0
    public final String zza;

    @o0
    public final String zzb;
    public final long zzc;

    @o0
    public final Bundle zzd;

    public zzeu(@o0 String str, @o0 String str2, @q0 Bundle bundle, long j5) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j5;
    }

    public static zzeu zzb(zzau zzauVar) {
        return new zzeu(zzauVar.zza, zzauVar.zzc, zzauVar.zzb.zzc(), zzauVar.zzd);
    }

    public final String toString() {
        return ProtectedSandApp.s("ྲྀ") + this.zzb + ProtectedSandApp.s("ཷ") + this.zza + ProtectedSandApp.s("ླྀ") + this.zzd.toString();
    }

    public final zzau zza() {
        return new zzau(this.zza, new zzas(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
