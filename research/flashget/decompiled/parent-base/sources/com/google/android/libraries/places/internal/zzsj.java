package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzsj extends zzadk implements zzaes {
    private static final zzsj zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private float zzh;

    static {
        zzsj zzsjVar = new zzsj();
        zzb = zzsjVar;
        zzadk.zzG(zzsj.class, zzsjVar);
    }

    private zzsj() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec7f"), new Object[]{ProtectedSandApp.s("\uec7d"), ProtectedSandApp.s("\uec7e"), zzsf.zza, ProtectedSandApp.s("\uec7b"), ProtectedSandApp.s("\uec7c")});
        }
        if (i5 == 3) {
            return new zzsj();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzsi(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
