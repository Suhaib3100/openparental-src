package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzed extends zzgp implements zzhs {
    private static final zzed zzb;
    private int zzd;
    private String zze = "";

    static {
        zzed zzedVar = new zzed();
        zzb = zzedVar;
        zzgp.zzB(zzed.class, zzedVar);
    }

    private zzed() {
    }

    public static zzed zzb(byte[] bArr) throws zzhb {
        return (zzed) zzgp.zzt(zzb, bArr);
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
            return zzgp.zzy(zzb, ProtectedSandApp.s("흦"), new Object[]{ProtectedSandApp.s("흤"), ProtectedSandApp.s("흥")});
        }
        if (i5 == 3) {
            return new zzed();
        }
        zzec zzecVar = null;
        if (i5 == 4) {
            return new zzeb(zzecVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
