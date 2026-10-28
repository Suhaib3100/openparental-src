package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzql extends zzadk implements zzaes {
    private static final zzql zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;

    static {
        zzql zzqlVar = new zzql();
        zzb = zzqlVar;
        zzadk.zzG(zzql.class, zzqlVar);
    }

    private zzql() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueba8"), new Object[]{ProtectedSandApp.s("\ueba5"), ProtectedSandApp.s("\ueba6"), ProtectedSandApp.s("\ueba7"), ProtectedSandApp.s("\ueba3"), ProtectedSandApp.s("\ueba4")});
        }
        if (i5 == 3) {
            return new zzql();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzqk(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
