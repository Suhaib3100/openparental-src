package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzfb extends zzlb implements zzmj {
    private static final zzfb zza;
    private int zzd;
    private String zze = "";
    private zzli zzf = zzlb.zzbH();
    private boolean zzg;

    static {
        zzfb zzfbVar = new zzfb();
        zza = zzfbVar;
        zzlb.zzbO(zzfb.class, zzfbVar);
    }

    private zzfb() {
    }

    public final String zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⶱ"), new Object[]{ProtectedSandApp.s("ⶭ"), ProtectedSandApp.s("ⶮ"), ProtectedSandApp.s("\u2daf"), zzfh.class, ProtectedSandApp.s("ⶰ")});
        }
        if (i6 == 3) {
            return new zzfb();
        }
        zzez zzezVar = null;
        if (i6 == 4) {
            return new zzfa(zzezVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
