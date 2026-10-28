package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.firebase.remoteconfig.p;
import d9.d;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzf {

    @d
    final zzh zza;

    @d
    final zzh zzb;

    @d
    private final zzbb zzc;

    @d
    private final zzl zzd;

    public zzf() {
        zzbb zzbbVar = new zzbb();
        this.zzc = zzbbVar;
        zzh zzhVar = new zzh(null, zzbbVar);
        this.zzb = zzhVar;
        this.zza = zzhVar.zza();
        zzl zzlVar = new zzl();
        this.zzd = zzlVar;
        zzhVar.zzc(ProtectedSandApp.s("틾"), new zzz(zzlVar));
        zzlVar.zza(ProtectedSandApp.s("틿"), new Callable() { // from class: com.google.android.gms.internal.measurement.zze
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzy();
            }
        });
        zzhVar.zzc(ProtectedSandApp.s("팀"), new zzai(Double.valueOf(p.f60679p)));
    }

    public final zzaq zza(zzh zzhVar, zzgd.zzd... zzdVarArr) {
        zzaq zzaqVar = zzaq.zzc;
        for (zzgd.zzd zzdVar : zzdVarArr) {
            zzaqVar = zzj.zza(zzdVar);
            zzg.zza(this.zzb);
            if ((zzaqVar instanceof zzat) || (zzaqVar instanceof zzar)) {
                zzaqVar = this.zzc.zza(zzhVar, zzaqVar);
            }
        }
        return zzaqVar;
    }

    public final void zza(String str, Callable<? extends zzal> callable) {
        this.zzd.zza(str, callable);
    }
}
