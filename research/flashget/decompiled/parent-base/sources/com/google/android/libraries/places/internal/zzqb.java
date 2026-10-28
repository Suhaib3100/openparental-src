package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzqb extends zzadk implements zzaes {
    private static final zzqb zzb;
    private int zze;
    private long zzf;
    private zzpl zzg;
    private long zzh;
    private int zzi;
    private boolean zzj;

    static {
        zzqb zzqbVar = new zzqb();
        zzb = zzqbVar;
        zzadk.zzG(zzqb.class, zzqbVar);
    }

    private zzqb() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb8f"), new Object[]{ProtectedSandApp.s("\ueb8b"), ProtectedSandApp.s("\ueb8c"), ProtectedSandApp.s("\ueb8d"), ProtectedSandApp.s("\ueb8e"), ProtectedSandApp.s("\ueb89"), ProtectedSandApp.s("\ueb8a")});
        }
        if (i5 == 3) {
            return new zzqb();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzqa(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
