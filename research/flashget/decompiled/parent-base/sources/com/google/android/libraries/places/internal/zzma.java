package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzma extends zzadk implements zzaes {
    private static final zzma zzb;
    private int zze;
    private zzly zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzma zzmaVar = new zzma();
        zzb = zzmaVar;
        zzadk.zzG(zzma.class, zzmaVar);
    }

    private zzma() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea89"), new Object[]{ProtectedSandApp.s("\uea85"), ProtectedSandApp.s("\uea86"), ProtectedSandApp.s("\uea87"), ProtectedSandApp.s("\uea88"), ProtectedSandApp.s("\uea83"), ProtectedSandApp.s("\uea84")});
        }
        if (i5 == 3) {
            return new zzma();
        }
        zzlo zzloVar = null;
        if (i5 == 4) {
            return new zzlz(zzloVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
