package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zznp extends zzadk implements zzaes {
    private static final zznp zzb;
    private int zze;
    private boolean zzf;
    private long zzg;
    private zzln zzh;
    private int zzi;

    static {
        zznp zznpVar = new zznp();
        zzb = zznpVar;
        zzadk.zzG(zznp.class, zznpVar);
    }

    private zznp() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uead5"), new Object[]{ProtectedSandApp.s("\uead2"), ProtectedSandApp.s("\uead3"), ProtectedSandApp.s("\uead4"), ProtectedSandApp.s("\uead0"), ProtectedSandApp.s("\uead1")});
        }
        if (i5 == 3) {
            return new zznp();
        }
        zznn zznnVar = null;
        if (i5 == 4) {
            return new zzno(zznnVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
