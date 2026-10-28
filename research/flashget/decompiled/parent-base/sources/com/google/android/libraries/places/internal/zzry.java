package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzry extends zzadk implements zzaes {
    private static final zzry zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzry zzryVar = new zzry();
        zzb = zzryVar;
        zzadk.zzG(zzry.class, zzryVar);
    }

    private zzry() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec4d"), new Object[]{ProtectedSandApp.s("\uec49"), ProtectedSandApp.s("\uec4a"), ProtectedSandApp.s("\uec4b"), ProtectedSandApp.s("\uec4c"), ProtectedSandApp.s("\uec47"), ProtectedSandApp.s("\uec48")});
        }
        if (i5 == 3) {
            return new zzry();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzrx(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
