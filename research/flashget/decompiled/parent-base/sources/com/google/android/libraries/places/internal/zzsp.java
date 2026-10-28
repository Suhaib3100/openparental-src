package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzsp extends zzadk implements zzaes {
    private static final zzsp zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";

    static {
        zzsp zzspVar = new zzsp();
        zzb = zzspVar;
        zzadk.zzG(zzsp.class, zzspVar);
    }

    private zzsp() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec88"), new Object[]{ProtectedSandApp.s("\uec86"), ProtectedSandApp.s("\uec87"), zzso.zza, ProtectedSandApp.s("\uec84"), ProtectedSandApp.s("\uec85")});
        }
        if (i5 == 3) {
            return new zzsp();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzsn(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
