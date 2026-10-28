package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzfn extends zzlb implements zzmj {
    private static final zzfn zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzfn zzfnVar = new zzfn();
        zza = zzfnVar;
        zzlb.zzbO(zzfn.class, zzfnVar);
    }

    private zzfn() {
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⷘ"), new Object[]{ProtectedSandApp.s("ⷐ"), ProtectedSandApp.s("ⷑ"), ProtectedSandApp.s("ⷒ"), ProtectedSandApp.s("ⷓ"), ProtectedSandApp.s("ⷔ"), ProtectedSandApp.s("ⷕ"), ProtectedSandApp.s("ⷖ"), ProtectedSandApp.s("\u2dd7")});
        }
        if (i6 == 3) {
            return new zzfn();
        }
        zzfk zzfkVar = null;
        if (i6 == 4) {
            return new zzfm(zzfkVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
