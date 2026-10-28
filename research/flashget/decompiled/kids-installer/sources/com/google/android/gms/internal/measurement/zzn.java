package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzn extends zzai {
    private final zzo zza;

    public zzn(String str, zzo zzoVar) {
        super(ProtectedSandApp.s("⎱"));
        this.zza = zzoVar;
        Map map = this.zze;
        String s5 = ProtectedSandApp.s("⎲");
        map.put(s5, new zzm(this, s5, zzoVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        return zzap.zzf;
    }
}
