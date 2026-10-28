package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzv extends zzai {
    private final zzz zza;

    public zzv(zzz zzzVar) {
        super(ProtectedSandApp.s("\u2459"));
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh(this.zzd, 3, list);
        String zzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        zzap zzb = zzgVar.zzb((zzap) list.get(1));
        if (!(zzb instanceof zzao)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u245e"));
        }
        zzap zzb2 = zzgVar.zzb((zzap) list.get(2));
        if (!(zzb2 instanceof zzam)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u245d"));
        }
        zzam zzamVar = (zzam) zzb2;
        String s5 = ProtectedSandApp.s("\u245a");
        if (!zzamVar.zzt(s5)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u245c"));
        }
        String zzi2 = zzamVar.zzf(s5).zzi();
        String s6 = ProtectedSandApp.s("\u245b");
        this.zza.zza(zzi, zzamVar.zzt(s6) ? zzh.zzb(zzamVar.zzf(s6).zzh().doubleValue()) : 1000, (zzao) zzb, zzi2);
        return zzap.zzf;
    }
}
