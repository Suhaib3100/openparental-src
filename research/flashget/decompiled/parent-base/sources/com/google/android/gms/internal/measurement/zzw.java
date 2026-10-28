package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzw extends zzal {
    private zzaa zzk;

    public zzw(zzaa zzaaVar) {
        super(ProtectedSandApp.s("홥"));
        this.zzk = zzaaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zza(this.zza, 3, list);
        String zzf = zzhVar.zza(list.get(0)).zzf();
        zzaq zza = zzhVar.zza(list.get(1));
        if (!(zza instanceof zzar)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("홪"));
        }
        zzaq zza2 = zzhVar.zza(list.get(2));
        if (!(zza2 instanceof zzap)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("황"));
        }
        zzap zzapVar = (zzap) zza2;
        String s4 = ProtectedSandApp.s("홦");
        if (!zzapVar.zzc(s4)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("홨"));
        }
        String zzf2 = zzapVar.zza(s4).zzf();
        String s5 = ProtectedSandApp.s("홧");
        this.zzk.zza(zzf, zzapVar.zzc(s5) ? zzg.zzb(zzapVar.zza(s5).zze().doubleValue()) : 1000, (zzar) zza, zzf2);
        return zzaq.zzc;
    }
}
