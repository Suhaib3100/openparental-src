package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzze extends zzadk implements zzaes {
    private static final zzze zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        zzze zzzeVar = new zzze();
        zzb = zzzeVar;
        zzadk.zzG(zzze.class, zzzeVar);
    }

    private zzze() {
    }

    public static zzzc zza() {
        return (zzzc) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzze zzzeVar, int i4) {
        zzzeVar.zzf = 1;
        zzzeVar.zze = 1 | zzzeVar.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\uee0c"), new Object[]{ProtectedSandApp.s("\uee0a"), ProtectedSandApp.s("\uee0b"), zzzd.zza, ProtectedSandApp.s("\uee08"), ProtectedSandApp.s("\uee09")});
        }
        if (i5 == 3) {
            return new zzze();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzzc(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
