package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzey extends zzlb implements zzmj {
    private static final zzey zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private zzli zzh = zzlb.zzbH();

    static {
        zzey zzeyVar = new zzey();
        zza = zzeyVar;
        zzlb.zzbO(zzey.class, zzeyVar);
    }

    private zzey() {
    }

    public static zzey zzc() {
        return zza;
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final String zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    public final int zzj() {
        int zza2 = zzex.zza(this.zze);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⶬ"), new Object[]{ProtectedSandApp.s("\u2da7"), ProtectedSandApp.s("ⶨ"), zzew.zza, ProtectedSandApp.s("ⶩ"), ProtectedSandApp.s("ⶪ"), ProtectedSandApp.s("ⶫ")});
        }
        if (i6 == 3) {
            return new zzey();
        }
        zzeg zzegVar = null;
        if (i6 == 4) {
            return new zzeu(zzegVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
