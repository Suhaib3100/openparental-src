package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzfh extends zzlb implements zzmj {
    private static final zzfh zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzfh zzfhVar = new zzfh();
        zza = zzfhVar;
        zzlb.zzbO(zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⷋ"), new Object[]{ProtectedSandApp.s("ⷈ"), ProtectedSandApp.s("ⷉ"), ProtectedSandApp.s("ⷊ")});
        }
        if (i6 == 3) {
            return new zzfh();
        }
        zzez zzezVar = null;
        if (i6 == 4) {
            return new zzfg(zzezVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
