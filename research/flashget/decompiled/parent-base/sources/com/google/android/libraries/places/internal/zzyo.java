package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzyo extends zzadk implements zzaes {
    private static final zzyo zzb;
    private int zze;
    private zzwy zzf;
    private int zzg;
    private int zzh;
    private zzzg zzi;

    static {
        zzyo zzyoVar = new zzyo();
        zzb = zzyoVar;
        zzadk.zzG(zzyo.class, zzyoVar);
    }

    private zzyo() {
    }

    public static zzym zza() {
        return (zzym) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzyo zzyoVar, int i4) {
        zzyoVar.zze |= 4;
        zzyoVar.zzh = i4;
    }

    static /* synthetic */ void zze(zzyo zzyoVar, zzzg zzzgVar) {
        zzzgVar.getClass();
        zzyoVar.zzi = zzzgVar;
        zzyoVar.zze |= 8;
    }

    static /* synthetic */ void zzf(zzyo zzyoVar, int i4) {
        zzyoVar.zzg = i4 - 1;
        zzyoVar.zze |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uede9"), new Object[]{ProtectedSandApp.s("\uede6"), ProtectedSandApp.s("\uede7"), ProtectedSandApp.s("\uede8"), zzyn.zza, ProtectedSandApp.s("\uede4"), ProtectedSandApp.s("\uede5")});
        }
        if (i5 == 3) {
            return new zzyo();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzym(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
