package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzfv extends zzlb implements zzmj {
    private static final zzfv zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        zzfv zzfvVar = new zzfv();
        zza = zzfvVar;
        zzlb.zzbO(zzfv.class, zzfvVar);
    }

    private zzfv() {
    }

    public static zzfu zza() {
        return (zzfu) zza.zzbA();
    }

    static /* synthetic */ void zzc(zzfv zzfvVar, String str) {
        str.getClass();
        zzfvVar.zzd |= 1;
        zzfvVar.zze = str;
    }

    static /* synthetic */ void zzd(zzfv zzfvVar, long j5) {
        zzfvVar.zzd |= 2;
        zzfvVar.zzf = j5;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⷭ"), new Object[]{ProtectedSandApp.s("ⷪ"), ProtectedSandApp.s("ⷫ"), ProtectedSandApp.s("ⷬ")});
        }
        if (i6 == 3) {
            return new zzfv();
        }
        zzfk zzfkVar = null;
        if (i6 == 4) {
            return new zzfu(zzfkVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
