package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzaah extends zzadk implements zzaes {
    private static final zzaah zzb;
    private int zze;
    private int zzf;
    private zzadr zzg = zzadk.zzB();
    private zzadr zzh = zzadk.zzB();
    private zzadr zzi = zzadk.zzB();

    static {
        zzaah zzaahVar = new zzaah();
        zzb = zzaahVar;
        zzadk.zzG(zzaah.class, zzaahVar);
    }

    private zzaah() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6c6"), new Object[]{ProtectedSandApp.s("\ue6c2"), ProtectedSandApp.s("\ue6c3"), ProtectedSandApp.s("\ue6c4"), ProtectedSandApp.s("\ue6c5"), zzaaj.class, ProtectedSandApp.s("\ue6c1"), zzvt.class});
        }
        if (i5 == 3) {
            return new zzaah();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzaag(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
