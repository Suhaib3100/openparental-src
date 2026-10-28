package com.google.android.gms.measurement.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzjc implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlk zzc;
    final /* synthetic */ zzjz zzd;

    zzjc(zzjz zzjzVar, zzq zzqVar, boolean z5, zzlk zzlkVar) {
        this.zzd = zzjzVar;
        this.zza = zzqVar;
        this.zzb = z5;
        this.zzc = zzlkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzjz zzjzVar = this.zzd;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            a.a(zzjzVar.zzt, ProtectedSandApp.s("ᅍ"));
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzejVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
