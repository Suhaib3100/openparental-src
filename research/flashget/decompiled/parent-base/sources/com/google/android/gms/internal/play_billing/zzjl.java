package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzjl extends zzgp implements zzhs {
    private static final zzjl zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzju zzh;
    private int zzi;

    static {
        zzjl zzjlVar = new zzjl();
        zzb = zzjlVar;
        zzgp.zzB(zzjl.class, zzjlVar);
    }

    private zzjl() {
    }

    static /* synthetic */ void zzG(zzjl zzjlVar, zzkt zzktVar) {
        zzktVar.getClass();
        zzjlVar.zzf = zzktVar;
        zzjlVar.zze = 7;
    }

    static /* synthetic */ void zzH(zzjl zzjlVar, zzln zzlnVar) {
        zzlnVar.getClass();
        zzjlVar.zzf = zzlnVar;
        zzjlVar.zze = 6;
    }

    static /* synthetic */ void zzI(zzjl zzjlVar, int i4) {
        zzjlVar.zzg = i4 - 1;
        zzjlVar.zzd |= 1;
    }

    public static zzjj zza() {
        return (zzjj) zzb.zzp();
    }

    public static zzjl zzc(byte[] bArr) throws zzhb {
        return (zzjl) zzgp.zzt(zzb, bArr);
    }

    static /* synthetic */ void zzf(zzjl zzjlVar, zzjz zzjzVar) {
        zzjlVar.zzi = zzjzVar.zza();
        zzjlVar.zzd |= 4;
    }

    static /* synthetic */ void zzg(zzjl zzjlVar, zzju zzjuVar) {
        zzjuVar.getClass();
        zzjlVar.zzh = zzjuVar;
        zzjlVar.zzd |= 2;
    }

    static /* synthetic */ void zzh(zzjl zzjlVar, zzkn zzknVar) {
        zzknVar.getClass();
        zzjlVar.zzf = zzknVar;
        zzjlVar.zze = 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud871"), new Object[]{ProtectedSandApp.s("\ud86b"), ProtectedSandApp.s("\ud86c"), ProtectedSandApp.s("\ud86d"), ProtectedSandApp.s("\ud86e"), zzjm.zza, ProtectedSandApp.s("\ud86f"), zzkn.class, ProtectedSandApp.s("\ud870"), zzjy.zza, zzln.class, zzkt.class});
        }
        if (i5 == 3) {
            return new zzjl();
        }
        zzjk zzjkVar = null;
        if (i5 == 4) {
            return new zzjj(zzjkVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzkt zze() {
        return this.zze == 7 ? (zzkt) this.zzf : zzkt.zzb();
    }
}
