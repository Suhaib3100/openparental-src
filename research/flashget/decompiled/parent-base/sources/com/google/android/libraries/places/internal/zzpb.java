package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzpb extends zzadk implements zzaes {
    private static final zzpb zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzpb zzpbVar = new zzpb();
        zzb = zzpbVar;
        zzadk.zzG(zzpb.class, zzpbVar);
    }

    private zzpb() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb39"), new Object[]{ProtectedSandApp.s("\ueb37"), ProtectedSandApp.s("\ueb38"), ProtectedSandApp.s("\ueb35"), ProtectedSandApp.s("\ueb36")});
        }
        if (i5 == 3) {
            return new zzpb();
        }
        zzos zzosVar = null;
        if (i5 == 4) {
            return new zzpa(zzosVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
