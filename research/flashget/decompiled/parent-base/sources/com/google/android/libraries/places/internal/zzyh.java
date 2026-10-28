package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzyh extends zzadk implements zzaes {
    private static final zzyh zzb;
    private int zze;
    private zzadr zzf = zzadk.zzB();
    private int zzg;
    private int zzh;
    private zzzg zzi;

    static {
        zzyh zzyhVar = new zzyh();
        zzb = zzyhVar;
        zzadk.zzG(zzyh.class, zzyhVar);
    }

    private zzyh() {
    }

    public static zzyg zza() {
        return (zzyg) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzyh zzyhVar, int i4) {
        zzyhVar.zze |= 2;
        zzyhVar.zzh = 1;
    }

    static /* synthetic */ void zze(zzyh zzyhVar, zzzg zzzgVar) {
        zzzgVar.getClass();
        zzyhVar.zzi = zzzgVar;
        zzyhVar.zze |= 4;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueddf"), new Object[]{ProtectedSandApp.s("\ueddc"), ProtectedSandApp.s("\ueddd"), ProtectedSandApp.s("\uedde"), zzwd.zza, ProtectedSandApp.s("\uedda"), ProtectedSandApp.s("\ueddb")});
        }
        if (i5 == 3) {
            return new zzyh();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzyg(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
