package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zztr extends zzadk implements zzaes {
    private static final zztr zzb;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        zztr zztrVar = new zztr();
        zzb = zztrVar;
        zzadk.zzG(zztr.class, zztrVar);
    }

    private zztr() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uecb7"), new Object[]{ProtectedSandApp.s("\uecb5"), ProtectedSandApp.s("\uecb6"), zztq.zza, ProtectedSandApp.s("\uecb3"), ProtectedSandApp.s("\uecb4")});
        }
        if (i5 == 3) {
            return new zztr();
        }
        zzsz zzszVar = null;
        if (i5 == 4) {
            return new zztp(zzszVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
