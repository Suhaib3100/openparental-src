package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzwh extends zzadk implements zzaes {
    private static final zzwh zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzwh zzwhVar = new zzwh();
        zzb = zzwhVar;
        zzadk.zzG(zzwh.class, zzwhVar);
    }

    private zzwh() {
    }

    public static zzwg zza() {
        return (zzwg) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzwh zzwhVar, int i4) {
        zzwhVar.zze |= 1;
        zzwhVar.zzf = 1;
    }

    static /* synthetic */ void zze(zzwh zzwhVar, int i4) {
        zzwhVar.zze |= 2;
        zzwhVar.zzg = i4;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ued4d"), new Object[]{ProtectedSandApp.s("\ued4c"), ProtectedSandApp.s("\ued4a"), ProtectedSandApp.s("\ued4b")});
        }
        if (i5 == 3) {
            return new zzwh();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzwg(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
