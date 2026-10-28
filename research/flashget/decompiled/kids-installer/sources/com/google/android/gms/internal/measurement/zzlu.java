package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzlu extends zzlw {
    /* synthetic */ zzlu(zzlt zzltVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    final void zza(Object obj, long j5) {
        ((zzli) zznu.zzf(obj, j5)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzlw
    final void zzb(Object obj, Object obj2, long j5) {
        zzli zzliVar = (zzli) zznu.zzf(obj, j5);
        zzli zzliVar2 = (zzli) zznu.zzf(obj2, j5);
        int size = zzliVar.size();
        int size2 = zzliVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzliVar.zzc()) {
                zzliVar = zzliVar.zzd(size2 + size);
            }
            zzliVar.addAll(zzliVar2);
        }
        if (size > 0) {
            zzliVar2 = zzliVar;
        }
        zznu.zzs(obj, j5, zzliVar2);
    }

    private zzlu() {
        super(null);
    }
}
