package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzkd extends zzgp implements zzhs {
    private static final zzkd zzb;
    private int zzd;
    private int zzf;
    private zzju zzi;
    private boolean zzj;
    private boolean zzk;
    private zzld zzl;
    private String zze = "";
    private zzgt zzg = zzgp.zzu();
    private zzgu zzh = zzgp.zzv();

    static {
        zzkd zzkdVar = new zzkd();
        zzb = zzkdVar;
        zzgp.zzB(zzkd.class, zzkdVar);
    }

    private zzkd() {
    }

    public static zzka zza() {
        return (zzka) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzkd zzkdVar, zzjz zzjzVar) {
        zzjzVar.getClass();
        zzgt zzgtVar = zzkdVar.zzg;
        if (!zzgtVar.zzc()) {
            int size = zzgtVar.size();
            zzkdVar.zzg = zzgtVar.zzd(size + size);
        }
        zzkdVar.zzg.zzh(zzjzVar.zza());
    }

    static /* synthetic */ void zze(zzkd zzkdVar, zzju zzjuVar) {
        zzjuVar.getClass();
        zzkdVar.zzi = zzjuVar;
        zzkdVar.zzd |= 4;
    }

    static /* synthetic */ void zzf(zzkd zzkdVar, String str) {
        zzkdVar.zzd |= 1;
        zzkdVar.zze = ProtectedSandApp.s("\ud91a");
    }

    static /* synthetic */ void zzg(zzkd zzkdVar, zzld zzldVar) {
        zzldVar.getClass();
        zzkdVar.zzl = zzldVar;
        zzkdVar.zzd |= 32;
    }

    static /* synthetic */ void zzh(zzkd zzkdVar, int i4) {
        zzkdVar.zzf = i4 - 1;
        zzkdVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud924"), new Object[]{ProtectedSandApp.s("\ud91d"), ProtectedSandApp.s("\ud91e"), ProtectedSandApp.s("\ud91f"), zzkb.zza, ProtectedSandApp.s("\ud920"), zzjy.zza, ProtectedSandApp.s("\ud921"), zzkz.class, ProtectedSandApp.s("\ud922"), ProtectedSandApp.s("\ud923"), ProtectedSandApp.s("\ud91b"), ProtectedSandApp.s("\ud91c")});
        }
        if (i5 == 3) {
            return new zzkd();
        }
        zzkc zzkcVar = null;
        if (i5 == 4) {
            return new zzka(zzkcVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
