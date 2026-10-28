package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaaj extends zzadk implements zzaes {
    private static final zzaaj zzb;
    private int zze;
    private String zzf = "";
    private int zzg;

    static {
        zzaaj zzaajVar = new zzaaj();
        zzb = zzaajVar;
        zzadk.zzG(zzaaj.class, zzaajVar);
    }

    private zzaaj() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6ca"), new Object[]{ProtectedSandApp.s("\ue6c9"), ProtectedSandApp.s("\ue6c7"), ProtectedSandApp.s("\ue6c8")});
        }
        if (i5 == 3) {
            return new zzaaj();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzaai(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
