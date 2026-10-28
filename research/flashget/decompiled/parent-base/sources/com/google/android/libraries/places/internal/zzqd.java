package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzqd extends zzadk implements zzaes {
    private static final zzqd zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private float zzj;
    private float zzk;

    static {
        zzqd zzqdVar = new zzqd();
        zzb = zzqdVar;
        zzadk.zzG(zzqd.class, zzqdVar);
    }

    private zzqd() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb97"), new Object[]{ProtectedSandApp.s("\ueb92"), ProtectedSandApp.s("\ueb93"), ProtectedSandApp.s("\ueb94"), ProtectedSandApp.s("\ueb95"), ProtectedSandApp.s("\ueb96"), ProtectedSandApp.s("\ueb90"), ProtectedSandApp.s("\ueb91")});
        }
        if (i5 == 3) {
            return new zzqd();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzqc(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
