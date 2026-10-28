package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzlk extends zzgp implements zzhs {
    private static final zzlk zzb;
    private int zzd;
    private int zze;

    static {
        zzlk zzlkVar = new zzlk();
        zzb = zzlkVar;
        zzgp.zzB(zzlk.class, zzlkVar);
    }

    private zzlk() {
    }

    public static zzlk zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud95a"), new Object[]{ProtectedSandApp.s("\ud959"), ProtectedSandApp.s("\ud958"), zzli.zza});
        }
        if (i5 == 3) {
            return new zzlk();
        }
        zzlj zzljVar = null;
        if (i5 == 4) {
            return new zzlh(zzljVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
