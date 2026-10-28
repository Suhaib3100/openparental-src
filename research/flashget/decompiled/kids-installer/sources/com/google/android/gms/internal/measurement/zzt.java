package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzt extends zzai {
    private final zzr zza;

    public zzt(zzr zzrVar) {
        super(ProtectedSandApp.s("\u2454"));
        this.zza = zzrVar;
        Map map = this.zze;
        zzs zzsVar = new zzs(this, false, true);
        String s5 = ProtectedSandApp.s("\u2455");
        map.put(s5, zzsVar);
        Map map2 = this.zze;
        String s6 = ProtectedSandApp.s("\u2456");
        map2.put(s6, new zzp(this, s6));
        ((zzai) this.zze.get(s6)).zzr(s5, new zzs(this, true, true));
        Map map3 = this.zze;
        String s7 = ProtectedSandApp.s("\u2457");
        map3.put(s7, new zzq(this, s7));
        ((zzai) this.zze.get(s7)).zzr(s5, new zzs(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        return zzap.zzf;
    }
}
