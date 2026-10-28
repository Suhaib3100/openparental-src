package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzls extends zzadk implements zzaes {
    private static final zzls zzb;
    private int zze;
    private zzlw zzf;
    private zzlu zzg;

    static {
        zzls zzlsVar = new zzls();
        zzb = zzlsVar;
        zzadk.zzG(zzls.class, zzlsVar);
    }

    private zzls() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uea63"), new Object[]{ProtectedSandApp.s("\uea62"), ProtectedSandApp.s("\uea60"), ProtectedSandApp.s("\uea61")});
        }
        if (i5 == 3) {
            return new zzls();
        }
        zzlo zzloVar = null;
        if (i5 == 4) {
            return new zzlr(zzloVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
