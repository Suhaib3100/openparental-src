package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzzg extends zzadk implements zzaes {
    private static final zzzg zzb;
    private zzadr zze = zzadk.zzB();

    static {
        zzzg zzzgVar = new zzzg();
        zzb = zzzgVar;
        zzadk.zzG(zzzg.class, zzzgVar);
    }

    private zzzg() {
    }

    public static zzzf zza() {
        return (zzzf) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzzg zzzgVar, Iterable iterable) {
        zzadr zzadrVar = zzzgVar.zze;
        if (!zzadrVar.zzc()) {
            zzzgVar.zze = zzadk.zzC(zzadrVar);
        }
        zzacc.zzt(iterable, zzzgVar.zze);
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee0e"), new Object[]{ProtectedSandApp.s("\uee0d")});
        }
        if (i5 == 3) {
            return new zzzg();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzzf(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
