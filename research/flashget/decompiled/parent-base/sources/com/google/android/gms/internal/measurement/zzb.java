package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.firebase.remoteconfig.p;
import d9.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzb {

    @d
    zzac zza;

    @d
    private final zzf zzb;

    @d
    private zzh zzc;
    private final zzaa zzd;

    public zzb() {
        this(new zzf());
    }

    public final zzac zza() {
        return this.zza;
    }

    final /* synthetic */ zzal zzb() throws Exception {
        return new zzw(this.zzd);
    }

    public final boolean zzc() {
        return !this.zza.zzc().isEmpty();
    }

    public final boolean zzd() {
        return !this.zza.zzb().equals(this.zza.zza());
    }

    private zzb(zzf zzfVar) {
        this.zzb = zzfVar;
        this.zzc = zzfVar.zza.zza();
        this.zza = new zzac();
        this.zzd = new zzaa();
        zzfVar.zza(ProtectedSandApp.s("툰"), new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzb.this.zzb();
            }
        });
        zzfVar.zza(ProtectedSandApp.s("툱"), new Callable() { // from class: com.google.android.gms.internal.measurement.zzd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzk(zzb.this.zza);
            }
        });
    }

    public final void zza(zzgd.zzc zzcVar) throws zzc {
        zzal zzalVar;
        try {
            this.zzc = this.zzb.zza.zza();
            if (this.zzb.zza(this.zzc, (zzgd.zzd[]) zzcVar.zzc().toArray(new zzgd.zzd[0])) instanceof zzaj) {
                throw new IllegalStateException(ProtectedSandApp.s("툵"));
            }
            for (zzgd.zzb zzbVar : zzcVar.zza().zzd()) {
                List<zzgd.zzd> zzc = zzbVar.zzc();
                String zzb = zzbVar.zzb();
                Iterator<zzgd.zzd> it = zzc.iterator();
                while (it.hasNext()) {
                    zzaq zza = this.zzb.zza(this.zzc, it.next());
                    if (!(zza instanceof zzap)) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("툴"));
                    }
                    zzh zzhVar = this.zzc;
                    if (zzhVar.zzb(zzb)) {
                        zzaq zza2 = zzhVar.zza(zzb);
                        if (!(zza2 instanceof zzal)) {
                            throw new IllegalStateException(ProtectedSandApp.s("툳") + zzb);
                        }
                        zzalVar = (zzal) zza2;
                    } else {
                        zzalVar = null;
                    }
                    if (zzalVar == null) {
                        throw new IllegalStateException(ProtectedSandApp.s("툲") + zzb);
                    }
                    zzalVar.zza(this.zzc, Collections.singletonList(zza));
                }
            }
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final void zza(String str, Callable<? extends zzal> callable) {
        this.zzb.zza(str, callable);
    }

    public final boolean zza(zzad zzadVar) throws zzc {
        try {
            this.zza.zza(zzadVar);
            this.zzb.zzb.zzc(ProtectedSandApp.s("툶"), new zzai(Double.valueOf(p.f60679p)));
            this.zzd.zza(this.zzc.zza(), this.zza);
            if (zzd()) {
                return true;
            }
            return zzc();
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }
}
