package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzzz extends zzadk implements zzaes {
    private static final zzzz zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzzz zzzzVar = new zzzz();
        zzb = zzzzVar;
        zzadk.zzG(zzzz.class, zzzzVar);
    }

    private zzzz() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee40"), new Object[]{ProtectedSandApp.s("\uee3f"), ProtectedSandApp.s("\uee3d"), ProtectedSandApp.s("\uee3e")});
        }
        if (i5 == 3) {
            return new zzzz();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzzy(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
