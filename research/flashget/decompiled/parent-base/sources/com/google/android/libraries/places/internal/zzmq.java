package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzmq extends zzadk implements zzaes {
    private static final zzmq zzb;
    private int zze;
    private zzmf zzf;
    private int zzg;
    private int zzh;

    static {
        zzmq zzmqVar = new zzmq();
        zzb = zzmqVar;
        zzadk.zzG(zzmq.class, zzmqVar);
    }

    private zzmq() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueaaa"), new Object[]{ProtectedSandApp.s("\ueaa7"), ProtectedSandApp.s("\ueaa8"), ProtectedSandApp.s("\ueaa9"), zzmp.zza, ProtectedSandApp.s("\ueaa6")});
        }
        if (i5 == 3) {
            return new zzmq();
        }
        zzmd zzmdVar = null;
        if (i5 == 4) {
            return new zzmo(zzmdVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
