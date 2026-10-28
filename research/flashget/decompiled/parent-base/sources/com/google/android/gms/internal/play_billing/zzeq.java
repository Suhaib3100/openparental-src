package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzeq extends zzgp implements zzhs {
    private static final zzeq zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzeq zzeqVar = new zzeq();
        zzb = zzeqVar;
        zzgp.zzB(zzeq.class, zzeqVar);
    }

    private zzeq() {
    }

    public static zzeq zzc(byte[] bArr) throws zzhb {
        return (zzeq) zzgp.zzt(zzb, bArr);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("흸"), new Object[]{ProtectedSandApp.s("흷"), ProtectedSandApp.s("흵"), ProtectedSandApp.s("흶")});
        }
        if (i5 == 3) {
            return new zzeq();
        }
        zzet zzetVar = null;
        if (i5 == 4) {
            return new zzep(zzetVar);
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
