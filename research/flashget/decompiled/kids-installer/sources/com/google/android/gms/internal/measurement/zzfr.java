package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzfr extends zzlb implements zzmj {
    private static final zzfr zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzfr zzfrVar = new zzfr();
        zza = zzfrVar;
        zzlb.zzbO(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static zzfq zzc() {
        return (zzfq) zza.zzbA();
    }

    static /* synthetic */ void zze(zzfr zzfrVar, int i5) {
        zzfrVar.zzd |= 1;
        zzfrVar.zze = i5;
    }

    static /* synthetic */ void zzf(zzfr zzfrVar, long j5) {
        zzfrVar.zzd |= 2;
        zzfrVar.zzf = j5;
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⷢ"), new Object[]{ProtectedSandApp.s("\u2ddf"), ProtectedSandApp.s("ⷠ"), ProtectedSandApp.s("ⷡ")});
        }
        if (i6 == 3) {
            return new zzfr();
        }
        zzfk zzfkVar = null;
        if (i6 == 4) {
            return new zzfq(zzfkVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
