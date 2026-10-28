package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzsv extends zzadk implements zzaes {
    private static final zzsv zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        zzsv zzsvVar = new zzsv();
        zzb = zzsvVar;
        zzadk.zzG(zzsv.class, zzsvVar);
    }

    private zzsv() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec92"), new Object[]{ProtectedSandApp.s("\uec8f"), ProtectedSandApp.s("\uec90"), ProtectedSandApp.s("\uec91"), zzsu.zza, ProtectedSandApp.s("\uec8e")});
        }
        if (i5 == 3) {
            return new zzsv();
        }
        zzss zzssVar = null;
        if (i5 == 4) {
            return new zzst(zzssVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
