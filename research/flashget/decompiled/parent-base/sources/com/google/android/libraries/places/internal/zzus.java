package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzus extends zzadk implements zzaes {
    private static final zzus zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzus zzusVar = new zzus();
        zzb = zzusVar;
        zzadk.zzG(zzus.class, zzusVar);
    }

    private zzus() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uecf3"), new Object[]{ProtectedSandApp.s("\uecf1"), ProtectedSandApp.s("\uecf2"), ProtectedSandApp.s("\uecef"), ProtectedSandApp.s("\uecf0")});
        }
        if (i5 == 3) {
            return new zzus();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzur(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
