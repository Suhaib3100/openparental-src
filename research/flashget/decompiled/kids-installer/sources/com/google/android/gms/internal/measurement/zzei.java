package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzei extends zzlb implements zzmj {
    private static final zzei zza;
    private int zzd;
    private int zze;
    private zzli zzf = zzlb.zzbH();
    private zzli zzg = zzlb.zzbH();
    private boolean zzh;
    private boolean zzi;

    static {
        zzei zzeiVar = new zzei();
        zza = zzeiVar;
        zzlb.zzbO(zzei.class, zzeiVar);
    }

    private zzei() {
    }

    static /* synthetic */ void zzi(zzei zzeiVar, int i5, zzet zzetVar) {
        zzetVar.getClass();
        zzli zzliVar = zzeiVar.zzf;
        if (!zzliVar.zzc()) {
            zzeiVar.zzf = zzlb.zzbI(zzliVar);
        }
        zzeiVar.zzf.set(i5, zzetVar);
    }

    static /* synthetic */ void zzj(zzei zzeiVar, int i5, zzek zzekVar) {
        zzekVar.getClass();
        zzli zzliVar = zzeiVar.zzg;
        if (!zzliVar.zzc()) {
            zzeiVar.zzg = zzlb.zzbI(zzliVar);
        }
        zzeiVar.zzg.set(i5, zzekVar);
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzg.size();
    }

    public final int zzc() {
        return this.zzf.size();
    }

    public final zzek zze(int i5) {
        return (zzek) this.zzg.get(i5);
    }

    public final zzet zzf(int i5) {
        return (zzet) this.zzf.get(i5);
    }

    public final List zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzf;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⶇ"), new Object[]{ProtectedSandApp.s("ⶁ"), ProtectedSandApp.s("ⶂ"), ProtectedSandApp.s("ⶃ"), zzet.class, ProtectedSandApp.s("ⶄ"), zzek.class, ProtectedSandApp.s("ⶅ"), ProtectedSandApp.s("ⶆ")});
        }
        if (i6 == 3) {
            return new zzei();
        }
        zzeg zzegVar = null;
        if (i6 == 4) {
            return new zzeh(zzegVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
