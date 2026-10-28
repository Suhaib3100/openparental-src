package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzvv extends zzadk implements zzaes {
    private static final zzvv zzb;
    private int zze;
    private int zzf;

    static {
        zzvv zzvvVar = new zzvv();
        zzb = zzvvVar;
        zzadk.zzG(zzvv.class, zzvvVar);
    }

    private zzvv() {
    }

    public static zzvu zza() {
        return (zzvu) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzvv zzvvVar, int i4) {
        zzvvVar.zze |= 1;
        zzvvVar.zzf = i4;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued3b"), new Object[]{ProtectedSandApp.s("\ued39"), ProtectedSandApp.s("\ued3a")});
        }
        if (i5 == 3) {
            return new zzvv();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzvu(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
