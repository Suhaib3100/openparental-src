package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzdx extends zzgp implements zzhs {
    private static final zzdx zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzdx zzdxVar = new zzdx();
        zzb = zzdxVar;
        zzgp.zzB(zzdx.class, zzdxVar);
    }

    private zzdx() {
    }

    public static zzdx zzb(byte[] bArr) throws zzhb {
        return (zzdx) zzgp.zzt(zzb, bArr);
    }

    public final zzeg zzc() {
        return this.zzd == 2 ? (zzeg) this.zze : zzeg.zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("흟"), new Object[]{ProtectedSandApp.s("흞"), ProtectedSandApp.s("흝"), zzeg.class});
        }
        if (i5 == 3) {
            return new zzdx();
        }
        zzdw zzdwVar = null;
        if (i5 == 4) {
            return new zzdv(zzdwVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
