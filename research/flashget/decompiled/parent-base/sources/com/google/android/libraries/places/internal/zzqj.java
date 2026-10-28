package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzqj extends zzadk implements zzaes {
    private static final zzqj zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzqj zzqjVar = new zzqj();
        zzb = zzqjVar;
        zzadk.zzG(zzqj.class, zzqjVar);
    }

    private zzqj() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueba2"), new Object[]{ProtectedSandApp.s("\ueb9f"), ProtectedSandApp.s("\ueba0"), zzqi.zza, ProtectedSandApp.s("\ueba1"), zzqh.zza, ProtectedSandApp.s("\ueb9d"), ProtectedSandApp.s("\ueb9e")});
        }
        if (i5 == 3) {
            return new zzqj();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzqg(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
