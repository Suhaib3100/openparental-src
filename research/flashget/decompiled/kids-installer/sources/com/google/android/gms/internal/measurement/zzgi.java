package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzgi extends zzlb implements zzmj {
    private static final zzgi zza;
    private zzlh zzd = zzlb.zzbF();
    private zzlh zze = zzlb.zzbF();
    private zzli zzf = zzlb.zzbH();
    private zzli zzg = zzlb.zzbH();

    static {
        zzgi zzgiVar = new zzgi();
        zza = zzgiVar;
        zzlb.zzbO(zzgi.class, zzgiVar);
    }

    private zzgi() {
    }

    public static zzgh zze() {
        return (zzgh) zza.zzbA();
    }

    public static zzgi zzg() {
        return zza;
    }

    static /* synthetic */ void zzm(zzgi zzgiVar, Iterable iterable) {
        zzlh zzlhVar = zzgiVar.zzd;
        if (!zzlhVar.zzc()) {
            zzgiVar.zzd = zzlb.zzbG(zzlhVar);
        }
        zzjk.zzbw(iterable, zzgiVar.zzd);
    }

    static /* synthetic */ void zzo(zzgi zzgiVar, Iterable iterable) {
        zzlh zzlhVar = zzgiVar.zze;
        if (!zzlhVar.zzc()) {
            zzgiVar.zze = zzlb.zzbG(zzlhVar);
        }
        zzjk.zzbw(iterable, zzgiVar.zze);
    }

    static /* synthetic */ void zzq(zzgi zzgiVar, Iterable iterable) {
        zzli zzliVar = zzgiVar.zzf;
        if (!zzliVar.zzc()) {
            zzgiVar.zzf = zzlb.zzbI(zzliVar);
        }
        zzjk.zzbw(iterable, zzgiVar.zzf);
    }

    static /* synthetic */ void zzs(zzgi zzgiVar, Iterable iterable) {
        zzli zzliVar = zzgiVar.zzg;
        if (!zzliVar.zzc()) {
            zzgiVar.zzg = zzlb.zzbI(zzliVar);
        }
        zzjk.zzbw(iterable, zzgiVar.zzg);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final int zzd() {
        return this.zzd.size();
    }

    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }

    public final List zzj() {
        return this.zzg;
    }

    public final List zzk() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("⸿"), new Object[]{ProtectedSandApp.s("⸻"), ProtectedSandApp.s("⸼"), ProtectedSandApp.s("⸽"), zzfr.class, ProtectedSandApp.s("⸾"), zzgk.class});
        }
        if (i6 == 3) {
            return new zzgi();
        }
        zzfk zzfkVar = null;
        if (i6 == 4) {
            return new zzgh(zzfkVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }
}
