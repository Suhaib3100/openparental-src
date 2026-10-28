package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzzx extends zzadk implements zzaes {
    private static final zzzx zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzzx zzzxVar = new zzzx();
        zzb = zzzxVar;
        zzadk.zzG(zzzx.class, zzzxVar);
    }

    private zzzx() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee3c"), new Object[]{ProtectedSandApp.s("\uee3a"), ProtectedSandApp.s("\uee3b"), zzvq.zza, ProtectedSandApp.s("\uee38"), ProtectedSandApp.s("\uee39")});
        }
        if (i5 == 3) {
            return new zzzx();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzzw(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
