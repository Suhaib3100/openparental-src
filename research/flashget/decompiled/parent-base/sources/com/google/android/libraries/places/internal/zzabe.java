package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzabe extends zzadk implements zzaes {
    private static final zzabe zzb;
    private zzadr zze = zzadk.zzB();

    static {
        zzabe zzabeVar = new zzabe();
        zzb = zzabeVar;
        zzadk.zzG(zzabe.class, zzabeVar);
    }

    private zzabe() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ue6ef"), new Object[]{ProtectedSandApp.s("\ue6ee"), zzabp.class});
        }
        if (i5 == 3) {
            return new zzabe();
        }
        zzabc zzabcVar = null;
        if (i5 == 4) {
            return new zzabd(zzabcVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
