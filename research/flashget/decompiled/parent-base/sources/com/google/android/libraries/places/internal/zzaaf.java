package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaaf extends zzadk implements zzaes {
    private static final zzaaf zzb;
    private int zze;
    private String zzf = "";
    private int zzg;

    static {
        zzaaf zzaafVar = new zzaaf();
        zzb = zzaafVar;
        zzadk.zzG(zzaaf.class, zzaafVar);
    }

    private zzaaf() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6c0"), new Object[]{ProtectedSandApp.s("\ue6bf"), ProtectedSandApp.s("\ue6bd"), ProtectedSandApp.s("\ue6be")});
        }
        if (i5 == 3) {
            return new zzaaf();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzaae(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
