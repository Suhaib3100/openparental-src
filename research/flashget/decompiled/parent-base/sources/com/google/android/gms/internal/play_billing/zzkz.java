package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzkz extends zzgp implements zzhs {
    private static final zzkz zzb;
    private int zzd;
    private int zzf;
    private zzgu zze = zzgp.zzv();
    private String zzg = "";

    static {
        zzkz zzkzVar = new zzkz();
        zzb = zzkzVar;
        zzgp.zzB(zzkz.class, zzkzVar);
    }

    private zzkz() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzgp.zzy(zzb, ProtectedSandApp.s("\ud950"), new Object[]{ProtectedSandApp.s("\ud94e"), ProtectedSandApp.s("\ud94f"), ProtectedSandApp.s("\ud94c"), ProtectedSandApp.s("\ud94d")});
        }
        if (i5 == 3) {
            return new zzkz();
        }
        zzky zzkyVar = null;
        if (i5 == 4) {
            return new zzkx(zzkyVar);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
