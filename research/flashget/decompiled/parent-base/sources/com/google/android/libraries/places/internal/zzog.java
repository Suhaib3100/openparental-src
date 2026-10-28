package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzog extends zzadk implements zzaes {
    private static final zzog zzb;

    static {
        zzog zzogVar = new zzog();
        zzb = zzogVar;
        zzadk.zzG(zzog.class, zzogVar);
    }

    private zzog() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        zzoe zzoeVar = null;
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueaf7"), null);
        }
        if (i5 == 3) {
            return new zzog();
        }
        if (i5 == 4) {
            return new zzof(zzoeVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
