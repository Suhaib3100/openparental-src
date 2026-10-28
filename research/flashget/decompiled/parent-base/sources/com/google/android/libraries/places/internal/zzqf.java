package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzqf extends zzadk implements zzaes {
    private static final zzqf zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        zzqf zzqfVar = new zzqf();
        zzb = zzqfVar;
        zzadk.zzG(zzqf.class, zzqfVar);
    }

    private zzqf() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb9c"), new Object[]{ProtectedSandApp.s("\ueb9a"), ProtectedSandApp.s("\ueb9b"), ProtectedSandApp.s("\ueb98"), ProtectedSandApp.s("\ueb99")});
        }
        if (i5 == 3) {
            return new zzqf();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzqe(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
