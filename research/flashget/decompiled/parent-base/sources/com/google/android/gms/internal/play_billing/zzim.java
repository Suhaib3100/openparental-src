package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzim extends zzgp implements zzhs {
    private static final zzim zzb;
    private zzhm zzd = zzhm.zza();

    static {
        zzim zzimVar = new zzim();
        zzb = zzimVar;
        zzgp.zzB(zzim.class, zzimVar);
    }

    private zzim() {
    }

    public static zzij zza() {
        return (zzij) zzb.zzp();
    }

    static /* synthetic */ Map zzc(zzim zzimVar) {
        if (!zzimVar.zzd.zze()) {
            zzimVar.zzd = zzimVar.zzd.zzb();
        }
        return zzimVar.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new zzia(zzb, ProtectedSandApp.s("\ud822"), new Object[]{ProtectedSandApp.s("\ud821"), zzik.zza});
        }
        if (i5 == 3) {
            return new zzim();
        }
        zzil zzilVar = null;
        if (i5 == 4) {
            return new zzij(zzilVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
