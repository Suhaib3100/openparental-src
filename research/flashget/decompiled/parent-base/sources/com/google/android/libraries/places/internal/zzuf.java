package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzuf extends zzadk implements zzaes {
    private static final zzuf zzb;
    private int zze;
    private int zzf;

    static {
        zzuf zzufVar = new zzuf();
        zzb = zzufVar;
        zzadk.zzG(zzuf.class, zzufVar);
    }

    private zzuf() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uecce"), new Object[]{ProtectedSandApp.s("\ueccc"), ProtectedSandApp.s("\ueccd")});
        }
        if (i5 == 3) {
            return new zzuf();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzue(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
