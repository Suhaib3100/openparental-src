package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzpj extends zzadk implements zzaes {
    private static final zzpj zzb;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzpj zzpjVar = new zzpj();
        zzb = zzpjVar;
        zzadk.zzG(zzpj.class, zzpjVar);
    }

    private zzpj() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb4b"), new Object[]{ProtectedSandApp.s("\ueb4a"), ProtectedSandApp.s("\ueb48"), ProtectedSandApp.s("\ueb49")});
        }
        if (i5 == 3) {
            return new zzpj();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzpi(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
