package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzjp extends zzgp implements zzhs {
    private static final zzjp zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        zzjp zzjpVar = new zzjp();
        zzb = zzjpVar;
        zzgp.zzB(zzjp.class, zzjpVar);
    }

    private zzjp() {
    }

    static /* synthetic */ void zzG(zzjp zzjpVar, int i4) {
        zzjpVar.zzg = i4 - 1;
        zzjpVar.zzd |= 1;
    }

    public static zzjn zza() {
        return (zzjn) zzb.zzp();
    }

    static /* synthetic */ void zze(zzjp zzjpVar, zzjz zzjzVar) {
        zzjpVar.zzh = zzjzVar.zza();
        zzjpVar.zzd |= 2;
    }

    static /* synthetic */ void zzf(zzjp zzjpVar, zzkn zzknVar) {
        zzknVar.getClass();
        zzjpVar.zzf = zzknVar;
        zzjpVar.zze = 2;
    }

    static /* synthetic */ void zzg(zzjp zzjpVar, zzkt zzktVar) {
        zzktVar.getClass();
        zzjpVar.zzf = zzktVar;
        zzjpVar.zze = 4;
    }

    static /* synthetic */ void zzh(zzjp zzjpVar, zzln zzlnVar) {
        zzlnVar.getClass();
        zzjpVar.zzf = zzlnVar;
        zzjpVar.zze = 3;
    }

    public final zzkt zzc() {
        return this.zze == 4 ? (zzkt) this.zzf : zzkt.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud877"), new Object[]{ProtectedSandApp.s("\ud873"), ProtectedSandApp.s("\ud874"), ProtectedSandApp.s("\ud875"), ProtectedSandApp.s("\ud876"), zzjm.zza, zzkn.class, zzln.class, zzkt.class, ProtectedSandApp.s("\ud872"), zzjy.zza});
        }
        if (i5 == 3) {
            return new zzjp();
        }
        zzjo zzjoVar = null;
        if (i5 == 4) {
            return new zzjn(zzjoVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
