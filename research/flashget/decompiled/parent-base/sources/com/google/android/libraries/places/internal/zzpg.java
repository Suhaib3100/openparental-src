package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzpg extends zzadk implements zzaes {
    private static final zzpg zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    static {
        zzpg zzpgVar = new zzpg();
        zzb = zzpgVar;
        zzadk.zzG(zzpg.class, zzpgVar);
    }

    private zzpg() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueb47"), new Object[]{ProtectedSandApp.s("\ueb3f"), ProtectedSandApp.s("\ueb40"), ProtectedSandApp.s("\ueb41"), ProtectedSandApp.s("\ueb42"), ProtectedSandApp.s("\ueb43"), ProtectedSandApp.s("\ueb44"), ProtectedSandApp.s("\ueb45"), ProtectedSandApp.s("\ueb46"), ProtectedSandApp.s("\ueb3d"), ProtectedSandApp.s("\ueb3e")});
        }
        if (i5 == 3) {
            return new zzpg();
        }
        zzos zzosVar = null;
        if (i5 == 4) {
            return new zzpf(zzosVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
