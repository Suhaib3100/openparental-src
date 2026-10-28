package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzyl extends zzadk implements zzaes {
    private static final zzyl zzb;

    static {
        zzyl zzylVar = new zzyl();
        zzb = zzylVar;
        zzadk.zzG(zzyl.class, zzylVar);
    }

    private zzyl() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        zzvo zzvoVar = null;
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uede3"), null);
        }
        if (i5 == 3) {
            return new zzyl();
        }
        if (i5 == 4) {
            return new zzyk(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
