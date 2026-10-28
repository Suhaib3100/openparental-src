package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzqy extends zzadk implements zzaes {
    private static final zzqy zzb;
    private int zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private long zzi;

    static {
        zzqy zzqyVar = new zzqy();
        zzb = zzqyVar;
        zzadk.zzG(zzqy.class, zzqyVar);
    }

    private zzqy() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uebec"), new Object[]{ProtectedSandApp.s("\uebe9"), ProtectedSandApp.s("\uebea"), ProtectedSandApp.s("\uebeb"), ProtectedSandApp.s("\uebe7"), ProtectedSandApp.s("\uebe8")});
        }
        if (i5 == 3) {
            return new zzqy();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzqx(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
