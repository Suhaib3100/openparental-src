package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzet extends zzlb implements zzmj {
    private static final zzet zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzem zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzet zzetVar = new zzet();
        zza = zzetVar;
        zzlb.zzbO(zzet.class, zzetVar);
    }

    private zzet() {
    }

    public static zzes zzc() {
        return (zzes) zza.zzbA();
    }

    static /* synthetic */ void zzf(zzet zzetVar, String str) {
        zzetVar.zzd |= 2;
        zzetVar.zzf = str;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzem zzb() {
        zzem zzemVar = this.zzg;
        return zzemVar == null ? zzem.zzb() : zzemVar;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final boolean zzj() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⶦ"), new Object[]{ProtectedSandApp.s("\u2d9f"), ProtectedSandApp.s("ⶠ"), ProtectedSandApp.s("ⶡ"), ProtectedSandApp.s("ⶢ"), ProtectedSandApp.s("ⶣ"), ProtectedSandApp.s("ⶤ"), ProtectedSandApp.s("ⶥ")});
        }
        if (i6 == 3) {
            return new zzet();
        }
        zzeg zzegVar = null;
        if (i6 == 4) {
            return new zzes(zzegVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
