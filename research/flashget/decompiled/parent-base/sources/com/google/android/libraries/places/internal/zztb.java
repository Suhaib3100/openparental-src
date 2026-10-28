package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zztb extends zzadk implements zzaes {
    private static final zztb zzb;
    private int zze;
    private int zzf;

    static {
        zztb zztbVar = new zztb();
        zzb = zztbVar;
        zzadk.zzG(zztb.class, zztbVar);
    }

    private zztb() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec99"), new Object[]{ProtectedSandApp.s("\uec97"), ProtectedSandApp.s("\uec98")});
        }
        if (i5 == 3) {
            return new zztb();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzta(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
