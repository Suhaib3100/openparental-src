package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzzv extends zzadk implements zzaes {
    private static final zzzv zzb;
    private int zze;
    private zzor zzf;
    private int zzg;
    private int zzh;
    private int zzj;
    private byte zzk = 2;
    private String zzi = "";

    static {
        zzzv zzzvVar = new zzzv();
        zzb = zzzvVar;
        zzadk.zzG(zzzv.class, zzzvVar);
    }

    private zzzv() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee37"), new Object[]{ProtectedSandApp.s("\uee32"), ProtectedSandApp.s("\uee33"), ProtectedSandApp.s("\uee34"), ProtectedSandApp.s("\uee35"), ProtectedSandApp.s("\uee36"), ProtectedSandApp.s("\uee31"), zzzu.zza});
        }
        if (i5 == 3) {
            return new zzzv();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzzt(zzvoVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
