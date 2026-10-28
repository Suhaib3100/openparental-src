package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzlw extends zzadk implements zzaes {
    private static final zzlw zzb;
    private int zze;
    private zzlq zzf;
    private zzma zzg;
    private zzmc zzh;
    private zzox zzi;
    private int zzj;

    static {
        zzlw zzlwVar = new zzlw();
        zzb = zzlwVar;
        zzadk.zzG(zzlw.class, zzlwVar);
    }

    private zzlw() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea7a"), new Object[]{ProtectedSandApp.s("\uea76"), ProtectedSandApp.s("\uea77"), ProtectedSandApp.s("\uea78"), ProtectedSandApp.s("\uea79"), ProtectedSandApp.s("\uea74"), ProtectedSandApp.s("\uea75")});
        }
        if (i5 == 3) {
            return new zzlw();
        }
        zzlo zzloVar = null;
        if (i5 == 4) {
            return new zzlv(zzloVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
