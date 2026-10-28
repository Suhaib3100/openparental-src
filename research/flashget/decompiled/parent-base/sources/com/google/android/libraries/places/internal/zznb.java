package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zznb extends zzadk implements zzaes {
    private static final zznb zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        zznb zznbVar = new zznb();
        zzb = zznbVar;
        zzadk.zzG(zznb.class, zznbVar);
    }

    private zznb() {
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueab7"), new Object[]{ProtectedSandApp.s("\ueab5"), ProtectedSandApp.s("\ueab6"), zzna.zza, ProtectedSandApp.s("\ueab3"), ProtectedSandApp.s("\ueab4")});
        }
        if (i5 == 3) {
            return new zznb();
        }
        zzmw zzmwVar = null;
        if (i5 == 4) {
            return new zzmz(zzmwVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
