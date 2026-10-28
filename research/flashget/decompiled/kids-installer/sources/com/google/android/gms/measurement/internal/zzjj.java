package com.google.android.gms.measurement.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
final class zzjj extends zzan {
    final /* synthetic */ zzjz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjj(zzjz zzjzVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzjzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        zzjz zzjzVar = this.zza;
        zzjzVar.zzg();
        if (zzjzVar.zzL()) {
            zzjzVar.zzt.zzaA().zzj().zza(ProtectedSandApp.s("⓳"));
            zzjzVar.zzs();
        }
    }
}
