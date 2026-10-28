package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzuz extends zzadk implements zzaes {
    private static final zzuz zzb;
    private int zze;
    private int zzf;

    static {
        zzuz zzuzVar = new zzuz();
        zzb = zzuzVar;
        zzadk.zzG(zzuz.class, zzuzVar);
    }

    private zzuz() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued19"), new Object[]{ProtectedSandApp.s("\ued17"), ProtectedSandApp.s("\ued18")});
        }
        if (i5 == 3) {
            return new zzuz();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zzuy(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
