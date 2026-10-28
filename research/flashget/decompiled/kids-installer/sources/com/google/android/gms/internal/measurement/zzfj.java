package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzfj extends zzlb implements zzmj {
    private static final zzfj zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzfj zzfjVar = new zzfj();
        zza = zzfjVar;
        zzlb.zzbO(zzfj.class, zzfjVar);
    }

    private zzfj() {
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("\u2dcf"), new Object[]{ProtectedSandApp.s("ⷌ"), ProtectedSandApp.s("ⷍ"), ProtectedSandApp.s("ⷎ")});
        }
        if (i6 == 3) {
            return new zzfj();
        }
        zzez zzezVar = null;
        if (i6 == 4) {
            return new zzfi(zzezVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
