package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
final class zzfs implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfu zza;

    zzfs(zzfu zzfuVar) {
        this.zza = zzfuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i5, String str, List list, boolean z5, boolean z6) {
        int i6 = i5 - 1;
        zzer zzi = i6 != 0 ? i6 != 1 ? i6 != 3 ? i6 != 4 ? this.zza.zzt.zzaA().zzi() : z5 ? this.zza.zzt.zzaA().zzm() : !z6 ? this.zza.zzt.zzaA().zzl() : this.zza.zzt.zzaA().zzk() : this.zza.zzt.zzaA().zzj() : z5 ? this.zza.zzt.zzaA().zzh() : !z6 ? this.zza.zzt.zzaA().zze() : this.zza.zzt.zzaA().zzd() : this.zza.zzt.zzaA().zzc();
        int size = list.size();
        if (size == 1) {
            zzi.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzi.zza(str);
        } else {
            zzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
