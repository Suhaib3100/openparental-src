package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzlz implements zzmg {
    private final zzmg[] zza;

    zzlz(zzmg... zzmgVarArr) {
        this.zza = zzmgVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final zzmf zzb(Class cls) {
        zzmg[] zzmgVarArr = this.zza;
        for (int i5 = 0; i5 < 2; i5++) {
            zzmg zzmgVar = zzmgVarArr[i5];
            if (zzmgVar.zzc(cls)) {
                return zzmgVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("⎢").concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzmg
    public final boolean zzc(Class cls) {
        zzmg[] zzmgVarArr = this.zza;
        for (int i5 = 0; i5 < 2; i5++) {
            if (zzmgVarArr[i5].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
