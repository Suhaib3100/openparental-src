package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzkw extends zzgp implements zzhs {
    private static final zzkw zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzkg zzg;
    private zzkj zzh;

    static {
        zzkw zzkwVar = new zzkw();
        zzb = zzkwVar;
        zzgp.zzB(zzkw.class, zzkwVar);
    }

    private zzkw() {
    }

    static /* synthetic */ void zzG(zzkw zzkwVar, zzlg zzlgVar) {
        zzlgVar.getClass();
        zzkwVar.zzf = zzlgVar;
        zzkwVar.zze = 8;
    }

    static /* synthetic */ void zzH(zzkw zzkwVar, zzlk zzlkVar) {
        zzkwVar.zzf = zzlkVar;
        zzkwVar.zze = 4;
    }

    public static zzku zza() {
        return (zzku) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzkw zzkwVar, zzjl zzjlVar) {
        zzkwVar.zzf = zzjlVar;
        zzkwVar.zze = 2;
    }

    static /* synthetic */ void zze(zzkw zzkwVar, zzjp zzjpVar) {
        zzkwVar.zzf = zzjpVar;
        zzkwVar.zze = 3;
    }

    static /* synthetic */ void zzf(zzkw zzkwVar, zzjx zzjxVar) {
        zzjxVar.getClass();
        zzkwVar.zzf = zzjxVar;
        zzkwVar.zze = 7;
    }

    static /* synthetic */ void zzg(zzkw zzkwVar, zzkd zzkdVar) {
        zzkdVar.getClass();
        zzkwVar.zzf = zzkdVar;
        zzkwVar.zze = 5;
    }

    static /* synthetic */ void zzh(zzkw zzkwVar, zzkg zzkgVar) {
        zzkgVar.getClass();
        zzkwVar.zzg = zzkgVar;
        zzkwVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud94b"), new Object[]{ProtectedSandApp.s("\ud946"), ProtectedSandApp.s("\ud947"), ProtectedSandApp.s("\ud948"), ProtectedSandApp.s("\ud949"), zzjl.class, zzjp.class, zzlk.class, zzkd.class, ProtectedSandApp.s("\ud94a"), zzjx.class, zzlg.class});
        }
        if (i5 == 3) {
            return new zzkw();
        }
        zzkv zzkvVar = null;
        if (i5 == 4) {
            return new zzku(zzkvVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
