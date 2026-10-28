package com.google.android.libraries.places.internal;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaed extends zzaef {
    /* synthetic */ zzaed(zzaec zzaecVar) {
        super(null);
    }

    @Override // com.google.android.libraries.places.internal.zzaef
    final void zza(Object obj, long j4) {
        ((zzadr) zzagd.zzf(obj, j4)).zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzaef
    final void zzb(Object obj, Object obj2, long j4) {
        zzadr zzadrVar = (zzadr) zzagd.zzf(obj, j4);
        zzadr zzadrVar2 = (zzadr) zzagd.zzf(obj2, j4);
        int size = zzadrVar.size();
        int size2 = zzadrVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzadrVar.zzc()) {
                zzadrVar = zzadrVar.zzf(size2 + size);
            }
            zzadrVar.addAll(zzadrVar2);
        }
        if (size > 0) {
            zzadrVar2 = zzadrVar;
        }
        zzagd.zzs(obj, j4, zzadrVar2);
    }

    private zzaed() {
        super(null);
    }
}
