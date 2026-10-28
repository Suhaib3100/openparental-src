package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzww extends zzadk implements zzaes {
    private static final zzww zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzww zzwwVar = new zzww();
        zzb = zzwwVar;
        zzadk.zzG(zzww.class, zzwwVar);
    }

    private zzww() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued6e"), new Object[]{ProtectedSandApp.s("\ued6b"), ProtectedSandApp.s("\ued6c"), ProtectedSandApp.s("\ued6d"), ProtectedSandApp.s("\ued6a"), zzwv.zza});
        }
        if (i5 == 3) {
            return new zzww();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzwu(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
