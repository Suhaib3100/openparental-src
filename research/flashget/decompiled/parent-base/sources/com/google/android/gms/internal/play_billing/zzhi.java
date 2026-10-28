package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzhi extends zzgp implements zzhs {
    private static final zzhi zzb;
    private zzgu zzd = zzhz.zze();

    static {
        zzhi zzhiVar = new zzhi();
        zzb = zzhiVar;
        zzgp.zzB(zzhi.class, zzhiVar);
    }

    private zzhi() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new zzia(zzb, ProtectedSandApp.s("ퟴ"), new Object[]{ProtectedSandApp.s("ퟳ"), zzjf.class});
        }
        if (i5 == 3) {
            return new zzhi();
        }
        zzhh zzhhVar = null;
        if (i5 == 4) {
            return new zzhg(zzhhVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
