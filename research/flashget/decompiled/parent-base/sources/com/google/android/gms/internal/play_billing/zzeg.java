package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzeg extends zzgp implements zzhs {
    private static final zzeg zzb;
    private int zzd;
    private String zze = "";

    static {
        zzeg zzegVar = new zzeg();
        zzb = zzegVar;
        zzgp.zzB(zzeg.class, zzegVar);
    }

    private zzeg() {
    }

    public static zzeg zzb() {
        return zzb;
    }

    public final String zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("흩"), new Object[]{ProtectedSandApp.s("흧"), ProtectedSandApp.s("흨")});
        }
        if (i5 == 3) {
            return new zzeg();
        }
        zzef zzefVar = null;
        if (i5 == 4) {
            return new zzee(zzefVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
