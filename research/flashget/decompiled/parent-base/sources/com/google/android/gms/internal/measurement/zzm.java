package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzm extends zzal {
    public zzm(String str, zzo zzoVar) {
        super(str);
        Map<String, zzaq> map = this.zzb;
        String s4 = ProtectedSandApp.s("핆");
        map.put(s4, new zzp(this, s4, zzoVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        return zzaq.zzc;
    }
}
