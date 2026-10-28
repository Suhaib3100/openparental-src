package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaal extends zzadk implements zzaes {
    private static final zzaal zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzaal zzaalVar = new zzaal();
        zzb = zzaalVar;
        zzadk.zzG(zzaal.class, zzaalVar);
    }

    private zzaal() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6ce"), new Object[]{ProtectedSandApp.s("\ue6cd"), ProtectedSandApp.s("\ue6cb"), ProtectedSandApp.s("\ue6cc")});
        }
        if (i5 == 3) {
            return new zzaal();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzaak(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
