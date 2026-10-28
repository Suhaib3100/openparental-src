package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzb = new androidx.collection.a();
        this.zza = new androidx.collection.a();
    }

    static /* synthetic */ void zza(zzd zzdVar, String str, long j5) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j5;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            b.a(zzdVar.zzt, ProtectedSandApp.s("〫"));
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j5));
        }
    }

    static /* synthetic */ void zzb(zzd zzdVar, String str, long j5) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num == null) {
            zzdVar.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("〮"), str);
            return;
        }
        zzir zzj = zzdVar.zzt.zzs().zzj(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzb.remove(str);
        Long l5 = (Long) zzdVar.zza.get(str);
        if (l5 == null) {
            a.a(zzdVar.zzt, ProtectedSandApp.s("〬"));
        } else {
            long longValue = j5 - l5.longValue();
            zzdVar.zza.remove(str);
            zzdVar.zzi(str, longValue, zzj);
        }
        if (zzdVar.zzb.isEmpty()) {
            long j6 = zzdVar.zzc;
            if (j6 == 0) {
                a.a(zzdVar.zzt, ProtectedSandApp.s("〭"));
            } else {
                zzdVar.zzh(j5 - j6, zzj);
                zzdVar.zzc = 0L;
            }
        }
    }

    @n1
    private final void zzh(long j5, zzir zzirVar) {
        if (zzirVar == null) {
            c.a(this.zzt, ProtectedSandApp.s("〯"));
            return;
        }
        if (j5 < 1000) {
            this.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("〰"), Long.valueOf(j5));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong(ProtectedSandApp.s("〱"), j5);
        zzlp.zzK(zzirVar, bundle, true);
        this.zzt.zzq().zzG(ProtectedSandApp.s("〲"), ProtectedSandApp.s("〳"), bundle);
    }

    @n1
    private final void zzi(String str, long j5, zzir zzirVar) {
        if (zzirVar == null) {
            c.a(this.zzt, ProtectedSandApp.s("〴"));
            return;
        }
        if (j5 < 1000) {
            this.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("〵"), Long.valueOf(j5));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(ProtectedSandApp.s("〶"), str);
        bundle.putLong(ProtectedSandApp.s("〷"), j5);
        zzlp.zzK(zzirVar, bundle, true);
        this.zzt.zzq().zzG(ProtectedSandApp.s("〸"), ProtectedSandApp.s("〹"), bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzj(long j5) {
        Iterator it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put((String) it.next(), Long.valueOf(j5));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j5;
    }

    public final void zzd(String str, long j5) {
        if (str == null || str.length() == 0) {
            a.a(this.zzt, ProtectedSandApp.s("〺"));
        } else {
            this.zzt.zzaB().zzp(new zza(this, str, j5));
        }
    }

    public final void zze(String str, long j5) {
        if (str == null || str.length() == 0) {
            a.a(this.zzt, ProtectedSandApp.s("〻"));
        } else {
            this.zzt.zzaB().zzp(new zzb(this, str, j5));
        }
    }

    @n1
    public final void zzf(long j5) {
        zzir zzj = this.zzt.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j5 - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j5 - this.zzc, zzj);
        }
        zzj(j5);
    }
}
