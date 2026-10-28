package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzxp extends zzadk implements zzaes {
    private static final zzxp zzb;
    private int zze;
    private int zzf;
    private int zzg = 1;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private int zzs;
    private int zzt;
    private int zzu;

    static {
        zzxp zzxpVar = new zzxp();
        zzb = zzxpVar;
        zzadk.zzG(zzxp.class, zzxpVar);
    }

    private zzxp() {
    }

    public static zzxm zza() {
        return (zzxm) zzb.zzx();
    }

    static /* synthetic */ void zzd(zzxp zzxpVar, boolean z4) {
        zzxpVar.zze |= 4;
        zzxpVar.zzh = z4;
    }

    static /* synthetic */ void zze(zzxp zzxpVar, boolean z4) {
        zzxpVar.zze |= 8;
        zzxpVar.zzi = z4;
    }

    static /* synthetic */ void zzf(zzxp zzxpVar, boolean z4) {
        zzxpVar.zze |= 16;
        zzxpVar.zzj = z4;
    }

    static /* synthetic */ void zzg(zzxp zzxpVar, int i4) {
        zzxpVar.zze |= 32;
        zzxpVar.zzk = i4;
    }

    static /* synthetic */ void zzh(zzxp zzxpVar, int i4) {
        zzxpVar.zze |= 64;
        zzxpVar.zzl = i4;
    }

    static /* synthetic */ void zzi(zzxp zzxpVar, int i4) {
        zzxpVar.zze |= 128;
        zzxpVar.zzm = i4;
    }

    static /* synthetic */ void zzj(zzxp zzxpVar, int i4) {
        zzxpVar.zze |= 256;
        zzxpVar.zzn = i4;
    }

    static /* synthetic */ void zzk(zzxp zzxpVar, int i4) {
        zzxpVar.zze |= 512;
        zzxpVar.zzo = i4;
    }

    static /* synthetic */ void zzl(zzxp zzxpVar, int i4) {
        zzxpVar.zze |= 1024;
        zzxpVar.zzp = i4;
    }

    static /* synthetic */ void zzm(zzxp zzxpVar, int i4) {
        zzxpVar.zze |= 2048;
        zzxpVar.zzq = i4;
    }

    static /* synthetic */ void zzn(zzxp zzxpVar, boolean z4) {
        zzxpVar.zze |= 4096;
        zzxpVar.zzr = z4;
    }

    static /* synthetic */ void zzo(zzxp zzxpVar, int i4) {
        zzxpVar.zze |= 8192;
        zzxpVar.zzs = i4;
    }

    static /* synthetic */ void zzp(zzxp zzxpVar, int i4) {
        zzxpVar.zzf = i4 - 1;
        zzxpVar.zze |= 1;
    }

    static /* synthetic */ void zzq(zzxp zzxpVar, int i4) {
        zzxpVar.zzg = i4;
        zzxpVar.zze |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzadk
    protected final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzadk.zzF(zzb, ProtectedSandApp.s("\ueda4"), new Object[]{ProtectedSandApp.s("\ued94"), ProtectedSandApp.s("\ued95"), zzxo.zza, ProtectedSandApp.s("\ued96"), zzxl.zza, ProtectedSandApp.s("\ued97"), ProtectedSandApp.s("\ued98"), ProtectedSandApp.s("\ued99"), ProtectedSandApp.s("\ued9a"), ProtectedSandApp.s("\ued9b"), ProtectedSandApp.s("\ued9c"), ProtectedSandApp.s("\ued9d"), ProtectedSandApp.s("\ued9e"), ProtectedSandApp.s("\ued9f"), ProtectedSandApp.s("\ueda0"), ProtectedSandApp.s("\ueda1"), ProtectedSandApp.s("\ueda2"), ProtectedSandApp.s("\ueda3"), ProtectedSandApp.s("\ued93"), zzxn.zza});
        }
        if (i5 == 3) {
            return new zzxp();
        }
        zzvo zzvoVar = null;
        if (i5 == 4) {
            return new zzxm(zzvoVar);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
