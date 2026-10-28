package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzpx extends zzadk implements zzaes {
    private static final zzpx zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private zzpl zzh;
    private long zzi;
    private int zzj;
    private zzado zzk = zzadk.zzz();
    private zzado zzl = zzadk.zzz();
    private int zzm;

    static {
        zzpx zzpxVar = new zzpx();
        zzb = zzpxVar;
        zzadk.zzG(zzpx.class, zzpxVar);
    }

    private zzpx() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb76"), new Object[]{ProtectedSandApp.s("\ueb6f"), ProtectedSandApp.s("\ueb70"), zzpw.zza, ProtectedSandApp.s("\ueb71"), ProtectedSandApp.s("\ueb72"), ProtectedSandApp.s("\ueb73"), ProtectedSandApp.s("\ueb74"), ProtectedSandApp.s("\ueb75"), ProtectedSandApp.s("\ueb6d"), ProtectedSandApp.s("\ueb6e")});
        }
        if (i5 == 3) {
            return new zzpx();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzpv(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
