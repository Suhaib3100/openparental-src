package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzu extends zzal {
    private boolean zzk;
    private boolean zzl;
    private final /* synthetic */ zzr zzm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzr zzrVar, boolean z4, boolean z5) {
        super(ProtectedSandApp.s("홤"));
        this.zzm = zzrVar;
        this.zzk = z4;
        this.zzl = z5;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzv zzvVar;
        zzv zzvVar2;
        zzv zzvVar3;
        zzg.zzb(ProtectedSandApp.s("홤"), 1, list);
        if (list.size() == 1) {
            zzvVar3 = this.zzm.zzk;
            zzvVar3.zza(zzs.zzc, zzhVar.zza(list.get(0)).zzf(), Collections.emptyList(), this.zzk, this.zzl);
            return zzaq.zzc;
        }
        zzs zza = zzs.zza(zzg.zzb(zzhVar.zza(list.get(0)).zze().doubleValue()));
        String zzf = zzhVar.zza(list.get(1)).zzf();
        if (list.size() == 2) {
            zzvVar2 = this.zzm.zzk;
            zzvVar2.zza(zza, zzf, Collections.emptyList(), this.zzk, this.zzl);
            return zzaq.zzc;
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 2; i4 < Math.min(list.size(), 5); i4++) {
            arrayList.add(zzhVar.zza(list.get(i4)).zzf());
        }
        zzvVar = this.zzm.zzk;
        zzvVar.zza(zza, zzf, arrayList, this.zzk, this.zzl);
        return zzaq.zzc;
    }
}
