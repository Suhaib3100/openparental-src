package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzea extends zzgp implements zzhs {
    private static final zzea zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzea zzeaVar = new zzea();
        zzb = zzeaVar;
        zzgp.zzB(zzea.class, zzeaVar);
    }

    private zzea() {
    }

    public static zzea zzb(byte[] bArr) throws zzhb {
        return (zzea) zzgp.zzt(zzb, bArr);
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
            return zzgp.zzy(zzb, ProtectedSandApp.s("흣"), new Object[]{ProtectedSandApp.s("흢"), ProtectedSandApp.s("흠"), ProtectedSandApp.s("흡")});
        }
        if (i5 == 3) {
            return new zzea();
        }
        zzdz zzdzVar = null;
        if (i5 == 4) {
            return new zzdy(zzdzVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String zze() {
        return this.zzf;
    }
}
