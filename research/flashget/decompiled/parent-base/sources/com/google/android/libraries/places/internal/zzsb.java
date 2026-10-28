package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzsb extends zzadk implements zzaes {
    private static final zzsb zzb;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzsb zzsbVar = new zzsb();
        zzb = zzsbVar;
        zzadk.zzG(zzsb.class, zzsbVar);
    }

    private zzsb() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uec65"), new Object[]{ProtectedSandApp.s("\uec63"), ProtectedSandApp.s("\uec64"), zzsf.zza, ProtectedSandApp.s("\uec62")});
        }
        if (i5 == 3) {
            return new zzsb();
        }
        zzri zzriVar = null;
        if (i5 == 4) {
            return new zzsa(zzriVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
