package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzkj extends zzgp implements zzhs {
    private static final zzkj zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzkj zzkjVar = new zzkj();
        zzb = zzkjVar;
        zzgp.zzB(zzkj.class, zzkjVar);
    }

    private zzkj() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud939"), new Object[]{ProtectedSandApp.s("\ud938"), ProtectedSandApp.s("\ud936"), ProtectedSandApp.s("\ud937")});
        }
        if (i5 == 3) {
            return new zzkj();
        }
        zzki zzkiVar = null;
        if (i5 == 4) {
            return new zzkh(zzkiVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
