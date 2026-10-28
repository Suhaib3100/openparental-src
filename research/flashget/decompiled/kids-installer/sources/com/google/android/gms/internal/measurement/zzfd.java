package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzfd extends zzlb implements zzmj {
    private static final zzfd zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzfd zzfdVar = new zzfd();
        zza = zzfdVar;
        zzlb.zzbO(zzfd.class, zzfdVar);
    }

    private zzfd() {
    }

    static /* synthetic */ void zzd(zzfd zzfdVar, String str) {
        str.getClass();
        zzfdVar.zzd |= 1;
        zzfdVar.zze = str;
    }

    public final int zza() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("\u2db7"), new Object[]{ProtectedSandApp.s("ⶲ"), ProtectedSandApp.s("ⶳ"), ProtectedSandApp.s("ⶴ"), ProtectedSandApp.s("ⶵ"), ProtectedSandApp.s("ⶶ")});
        }
        if (i6 == 3) {
            return new zzfd();
        }
        zzez zzezVar = null;
        if (i6 == 4) {
            return new zzfc(zzezVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
