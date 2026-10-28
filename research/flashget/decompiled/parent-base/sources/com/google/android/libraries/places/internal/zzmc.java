package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzmc extends zzadk implements zzaes {
    private static final zzmc zzb;
    private int zze;
    private zzly zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzmc zzmcVar = new zzmc();
        zzb = zzmcVar;
        zzadk.zzG(zzmc.class, zzmcVar);
    }

    private zzmc() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea92"), new Object[]{ProtectedSandApp.s("\uea8c"), ProtectedSandApp.s("\uea8d"), ProtectedSandApp.s("\uea8e"), ProtectedSandApp.s("\uea8f"), ProtectedSandApp.s("\uea90"), ProtectedSandApp.s("\uea91"), ProtectedSandApp.s("\uea8a"), ProtectedSandApp.s("\uea8b")});
        }
        if (i5 == 3) {
            return new zzmc();
        }
        zzlo zzloVar = null;
        if (i5 == 4) {
            return new zzmb(zzloVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
