package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzp extends zzal {
    private final /* synthetic */ zzo zzk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzp(zzm zzmVar, String str, zzo zzoVar) {
        super(str);
        this.zzk = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zza(ProtectedSandApp.s("혞"), 2, list);
        zzaq zza = zzhVar.zza(list.get(0));
        zzaq zza2 = zzhVar.zza(list.get(1));
        String zza3 = this.zzk.zza(zza.zzf());
        return zza3 != null ? new zzas(zza3) : zza2;
    }
}
