package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzmi extends zzadk implements zzaes {
    private static final zzmi zzb;
    private int zze;
    private int zzf;
    private zzmk zzg;
    private zzms zzh;
    private zzmn zzi;
    private zzmq zzj;

    static {
        zzmi zzmiVar = new zzmi();
        zzb = zzmiVar;
        zzadk.zzG(zzmi.class, zzmiVar);
    }

    private zzmi() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea9d"), new Object[]{ProtectedSandApp.s("\uea99"), ProtectedSandApp.s("\uea9a"), zzmh.zza, ProtectedSandApp.s("\uea9b"), ProtectedSandApp.s("\uea9c"), ProtectedSandApp.s("\uea97"), ProtectedSandApp.s("\uea98")});
        }
        if (i5 == 3) {
            return new zzmi();
        }
        zzmd zzmdVar = null;
        if (i5 == 4) {
            return new zzmg(zzmdVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
