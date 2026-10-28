package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzkr extends zzgp implements zzhs {
    private static final zzkr zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzkr zzkrVar = new zzkr();
        zzb = zzkrVar;
        zzgp.zzB(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud940"), new Object[]{ProtectedSandApp.s("\ud93e"), ProtectedSandApp.s("\ud93f"), zzkq.zza, ProtectedSandApp.s("\ud93d")});
        }
        if (i5 == 3) {
            return new zzkr();
        }
        zzks zzksVar = null;
        if (i5 == 4) {
            return new zzkp(zzksVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
