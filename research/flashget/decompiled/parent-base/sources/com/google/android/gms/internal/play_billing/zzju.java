package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzju extends zzgp implements zzhs {
    private static final zzju zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        zzju zzjuVar = new zzju();
        zzb = zzjuVar;
        zzgp.zzB(zzju.class, zzjuVar);
    }

    private zzju() {
    }

    static /* synthetic */ void zzG(zzju zzjuVar, int i4) {
        zzjuVar.zzd |= 1;
        zzjuVar.zze = i4;
    }

    public static zzjq zza() {
        return (zzjq) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzju zzjuVar, String str) {
        zzjuVar.zzd |= 8;
        zzjuVar.zzh = str;
    }

    static /* synthetic */ void zze(zzju zzjuVar, String str) {
        str.getClass();
        zzjuVar.zzd |= 2;
        zzjuVar.zzf = str;
    }

    static /* synthetic */ void zzf(zzju zzjuVar, int i4) {
        zzjuVar.zzd |= 32;
        zzjuVar.zzj = i4;
    }

    static /* synthetic */ void zzg(zzju zzjuVar, int i4) {
        zzjuVar.zzd |= 16;
        zzjuVar.zzi = i4;
    }

    static /* synthetic */ void zzh(zzju zzjuVar, zzjs zzjsVar) {
        zzjuVar.zzg = zzjsVar.zza();
        zzjuVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud911"), new Object[]{ProtectedSandApp.s("\ud90c"), ProtectedSandApp.s("\ud90d"), ProtectedSandApp.s("\ud90e"), ProtectedSandApp.s("\ud90f"), zzjr.zza, ProtectedSandApp.s("\ud910"), ProtectedSandApp.s("\ud90a"), ProtectedSandApp.s("\ud90b")});
        }
        if (i5 == 3) {
            return new zzju();
        }
        zzjt zzjtVar = null;
        if (i5 == 4) {
            return new zzjq(zzjtVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
