package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzqw extends zzadk implements zzaes {
    private static final zzqw zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzi;

    static {
        zzqw zzqwVar = new zzqw();
        zzb = zzqwVar;
        zzadk.zzG(zzqw.class, zzqwVar);
    }

    private zzqw() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uebe6"), new Object[]{ProtectedSandApp.s("\uebe3"), ProtectedSandApp.s("\uebe4"), ProtectedSandApp.s("\uebe5"), ProtectedSandApp.s("\uebe1"), ProtectedSandApp.s("\uebe2")});
        }
        if (i5 == 3) {
            return new zzqw();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzqv(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
