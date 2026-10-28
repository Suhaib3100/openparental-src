package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaei implements zzaep {
    private final zzaep[] zza;

    zzaei(zzaep... zzaepVarArr) {
        this.zza = zzaepVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzaep
    public final zzaeo zzb(Class cls) {
        zzaep[] zzaepVarArr = this.zza;
        for (int i4 = 0; i4 < 2; i4++) {
            zzaep zzaepVar = zzaepVarArr[i4];
            if (zzaepVar.zzc(cls)) {
                return zzaepVar.zzb(cls);
            }
        }
        String name = cls.getName();
        int length = name.length();
        String s4 = ProtectedSandApp.s("\ue7a7");
        throw new UnsupportedOperationException(length != 0 ? s4.concat(name) : new String(s4));
    }

    @Override // com.google.android.libraries.places.internal.zzaep
    public final boolean zzc(Class cls) {
        zzaep[] zzaepVarArr = this.zza;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzaepVarArr[i4].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
