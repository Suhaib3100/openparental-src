package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzr extends zzal {
    private final zzv zzk;

    public zzr(zzv zzvVar) {
        super(ProtectedSandApp.s("홛"));
        this.zzk = zzvVar;
        Map<String, zzaq> map = this.zzb;
        zzu zzuVar = new zzu(this, false, true);
        String s4 = ProtectedSandApp.s("활");
        map.put(s4, zzuVar);
        Map<String, zzaq> map2 = this.zzb;
        String s5 = ProtectedSandApp.s("홝");
        map2.put(s5, new zzq(this, s5));
        ((zzal) this.zzb.get(s5)).zza(s4, new zzu(this, true, true));
        Map<String, zzaq> map3 = this.zzb;
        String s6 = ProtectedSandApp.s("홞");
        map3.put(s6, new zzt(this, s6));
        ((zzal) this.zzb.get(s6)).zza(s4, new zzu(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        return zzaq.zzc;
    }
}
