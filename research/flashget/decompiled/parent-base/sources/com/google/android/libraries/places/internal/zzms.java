package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzms extends zzadk implements zzaes {
    private static final zzms zzb;
    private int zze;
    private long zzf;

    static {
        zzms zzmsVar = new zzms();
        zzb = zzmsVar;
        zzadk.zzG(zzms.class, zzmsVar);
    }

    private zzms() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueaad"), new Object[]{ProtectedSandApp.s("\ueaab"), ProtectedSandApp.s("\ueaac")});
        }
        if (i5 == 3) {
            return new zzms();
        }
        zzmd zzmdVar = null;
        if (i5 == 4) {
            return new zzmr(zzmdVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
