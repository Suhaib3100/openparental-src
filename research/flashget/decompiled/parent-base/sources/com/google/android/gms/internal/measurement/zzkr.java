package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzkr implements zzkz {
    private zzkz[] zza;

    zzkr(zzkz... zzkzVarArr) {
        this.zza = zzkzVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final zzla zza(Class<?> cls) {
        for (zzkz zzkzVar : this.zza) {
            if (zzkzVar.zzb(cls)) {
                return zzkzVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("픤").concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzkz
    public final boolean zzb(Class<?> cls) {
        for (zzkz zzkzVar : this.zza) {
            if (zzkzVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
