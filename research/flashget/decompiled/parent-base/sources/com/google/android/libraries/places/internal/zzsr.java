package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzsr extends zzadk implements zzaes {
    private static final zzsr zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        zzsr zzsrVar = new zzsr();
        zzb = zzsrVar;
        zzadk.zzG(zzsr.class, zzsrVar);
    }

    private zzsr() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec8d"), new Object[]{ProtectedSandApp.s("\uec8b"), ProtectedSandApp.s("\uec8c"), zzsf.zza, ProtectedSandApp.s("\uec89"), ProtectedSandApp.s("\uec8a")});
        }
        if (i5 == 3) {
            return new zzsr();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzsq(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
