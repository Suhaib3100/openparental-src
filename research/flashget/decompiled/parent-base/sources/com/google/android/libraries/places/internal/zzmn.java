package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzmn extends zzadk implements zzaes {
    private static final zzmn zzb;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        zzmn zzmnVar = new zzmn();
        zzb = zzmnVar;
        zzadk.zzG(zzmn.class, zzmnVar);
    }

    private zzmn() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueaa5"), new Object[]{ProtectedSandApp.s("\ueaa3"), ProtectedSandApp.s("\ueaa4"), zzmm.zza, ProtectedSandApp.s("\ueaa2")});
        }
        if (i5 == 3) {
            return new zzmn();
        }
        zzmd zzmdVar = null;
        if (i5 == 4) {
            return new zzml(zzmdVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
