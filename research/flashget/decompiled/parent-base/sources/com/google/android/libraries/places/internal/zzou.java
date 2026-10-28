package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzou extends zzadk implements zzaes {
    private static final zzou zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzou zzouVar = new zzou();
        zzb = zzouVar;
        zzadk.zzG(zzou.class, zzouVar);
    }

    private zzou() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb14"), new Object[]{ProtectedSandApp.s("\ueb0e"), ProtectedSandApp.s("\ueb0f"), ProtectedSandApp.s("\ueb10"), ProtectedSandApp.s("\ueb11"), ProtectedSandApp.s("\ueb12"), ProtectedSandApp.s("\ueb13"), ProtectedSandApp.s("\ueb0c"), ProtectedSandApp.s("\ueb0d")});
        }
        if (i5 == 3) {
            return new zzou();
        }
        zzos zzosVar = null;
        if (i5 == 4) {
            return new zzot(zzosVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
