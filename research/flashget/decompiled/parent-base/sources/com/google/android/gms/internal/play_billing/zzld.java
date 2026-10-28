package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzld extends zzgp implements zzhs {
    private static final zzld zzb;
    private int zzd;
    private int zze;

    static {
        zzld zzldVar = new zzld();
        zzb = zzldVar;
        zzgp.zzB(zzld.class, zzldVar);
    }

    private zzld() {
    }

    public static zzla zza() {
        return (zzla) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzld zzldVar, int i4) {
        zzldVar.zze = i4 - 1;
        zzldVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud953"), new Object[]{ProtectedSandApp.s("\ud952"), ProtectedSandApp.s("\ud951"), zzlb.zza});
        }
        if (i5 == 3) {
            return new zzld();
        }
        zzlc zzlcVar = null;
        if (i5 == 4) {
            return new zzla(zzlcVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
