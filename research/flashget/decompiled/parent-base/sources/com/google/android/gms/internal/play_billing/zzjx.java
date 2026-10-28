package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzjx extends zzgp implements zzhs {
    private static final zzjx zzb;

    static {
        zzjx zzjxVar = new zzjx();
        zzb = zzjxVar;
        zzgp.zzB(zzjx.class, zzjxVar);
    }

    private zzjx() {
    }

    public static zzjx zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        zzjw zzjwVar = null;
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud912"), null);
        }
        if (i5 == 3) {
            return new zzjx();
        }
        if (i5 == 4) {
            return new zzjv(zzjwVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
