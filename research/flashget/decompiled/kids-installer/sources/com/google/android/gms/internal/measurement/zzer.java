package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzer extends zzlb implements zzmj {
    private static final zzer zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzer zzerVar = new zzer();
        zza = zzerVar;
        zzlb.zzbO(zzer.class, zzerVar);
    }

    private zzer() {
    }

    public static zzer zzb() {
        return zza;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("\u2d9e"), new Object[]{ProtectedSandApp.s("\u2d98"), ProtectedSandApp.s("\u2d99"), zzep.zza, ProtectedSandApp.s("\u2d9a"), ProtectedSandApp.s("\u2d9b"), ProtectedSandApp.s("\u2d9c"), ProtectedSandApp.s("\u2d9d")});
        }
        if (i6 == 3) {
            return new zzer();
        }
        zzeg zzegVar = null;
        if (i6 == 4) {
            return new zzen(zzegVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }

    public final int zzm() {
        int zza2 = zzeq.zza(this.zze);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }
}
