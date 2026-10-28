package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzkn extends zzgp implements zzhs {
    private static final zzkn zzb;
    private int zzd;
    private int zze;

    static {
        zzkn zzknVar = new zzkn();
        zzb = zzknVar;
        zzgp.zzB(zzkn.class, zzknVar);
    }

    private zzkn() {
    }

    public static zzkk zza() {
        return (zzkk) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzkn zzknVar, int i4) {
        zzknVar.zze = i4 - 1;
        zzknVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud93c"), new Object[]{ProtectedSandApp.s("\ud93b"), ProtectedSandApp.s("\ud93a"), zzkl.zza});
        }
        if (i5 == 3) {
            return new zzkn();
        }
        zzkm zzkmVar = null;
        if (i5 == 4) {
            return new zzkk(zzkmVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
