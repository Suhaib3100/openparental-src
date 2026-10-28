package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzpu extends zzadk implements zzaes {
    private static final zzpu zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzln zzl;
    private zzadr zzm = zzadk.zzB();

    static {
        zzpu zzpuVar = new zzpu();
        zzb = zzpuVar;
        zzadk.zzG(zzpu.class, zzpuVar);
    }

    private zzpu() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb6c"), new Object[]{ProtectedSandApp.s("\ueb64"), ProtectedSandApp.s("\ueb65"), ProtectedSandApp.s("\ueb66"), ProtectedSandApp.s("\ueb67"), ProtectedSandApp.s("\ueb68"), ProtectedSandApp.s("\ueb69"), ProtectedSandApp.s("\ueb6a"), ProtectedSandApp.s("\ueb6b"), ProtectedSandApp.s("\ueb63"), zzln.class});
        }
        if (i5 == 3) {
            return new zzpu();
        }
        zzph zzphVar = null;
        if (i5 == 4) {
            return new zzpt(zzphVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
