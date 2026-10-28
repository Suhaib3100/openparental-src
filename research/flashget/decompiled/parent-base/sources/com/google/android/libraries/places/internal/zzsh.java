package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzsh extends zzadk implements zzaes {
    private static final zzsh zzb;
    private int zze;
    private long zzf;
    private zzry zzg;
    private zzry zzh;
    private zzsm zzi;
    private zzse zzj;
    private zzro zzk;
    private zzsp zzl;
    private zzsr zzm;
    private zzsj zzn;
    private zzrk zzo;
    private zzrq zzp;

    static {
        zzsh zzshVar = new zzsh();
        zzb = zzshVar;
        zzadk.zzG(zzsh.class, zzshVar);
    }

    private zzsh() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec7a"), new Object[]{ProtectedSandApp.s("\uec70"), ProtectedSandApp.s("\uec71"), ProtectedSandApp.s("\uec72"), ProtectedSandApp.s("\uec73"), ProtectedSandApp.s("\uec74"), ProtectedSandApp.s("\uec75"), ProtectedSandApp.s("\uec76"), ProtectedSandApp.s("\uec77"), ProtectedSandApp.s("\uec78"), ProtectedSandApp.s("\uec79"), ProtectedSandApp.s("\uec6e"), ProtectedSandApp.s("\uec6f")});
        }
        if (i5 == 3) {
            return new zzsh();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzsg(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
