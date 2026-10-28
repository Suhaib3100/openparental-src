package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzfz extends zzlb implements zzmj {
    private static final zzfz zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzfn zzg;

    static {
        zzfz zzfzVar = new zzfz();
        zza = zzfzVar;
        zzlb.zzbO(zzfz.class, zzfzVar);
    }

    private zzfz() {
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⷺ"), new Object[]{ProtectedSandApp.s("ⷶ"), ProtectedSandApp.s("ⷷ"), ProtectedSandApp.s("ⷸ"), ProtectedSandApp.s("ⷹ")});
        }
        if (i6 == 3) {
            return new zzfz();
        }
        zzfk zzfkVar = null;
        if (i6 == 4) {
            return new zzfy(zzfkVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
