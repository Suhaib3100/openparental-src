package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaab extends zzadk implements zzaes {
    private static final zzaab zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzaab zzaabVar = new zzaab();
        zzb = zzaabVar;
        zzadk.zzG(zzaab.class, zzaabVar);
    }

    private zzaab() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6b7"), new Object[]{ProtectedSandApp.s("\ue6b6"), ProtectedSandApp.s("\ue6b4"), ProtectedSandApp.s("\ue6b5")});
        }
        if (i5 == 3) {
            return new zzaab();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzaaa(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
