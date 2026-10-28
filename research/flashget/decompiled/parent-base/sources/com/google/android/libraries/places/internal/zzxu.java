package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzxu extends zzadk implements zzaes {
    private static final zzxu zzb;
    private int zze;
    private int zzf;

    static {
        zzxu zzxuVar = new zzxu();
        zzb = zzxuVar;
        zzadk.zzG(zzxu.class, zzxuVar);
    }

    private zzxu() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uedab"), new Object[]{ProtectedSandApp.s("\uedaa"), ProtectedSandApp.s("\ueda9"), zzvq.zza});
        }
        if (i5 == 3) {
            return new zzxu();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzxt(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
