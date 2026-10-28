package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final /* synthetic */ class zzan {
    public static zzaq zza(zzak zzakVar, zzaq zzaqVar, zzh zzhVar, List<zzaq> list) {
        if (zzakVar.zzc(zzaqVar.zzf())) {
            zzaq zza = zzakVar.zza(zzaqVar.zzf());
            if (zza instanceof zzal) {
                return ((zzal) zza).zza(zzhVar, list);
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("툇"), zzaqVar.zzf()));
        }
        String zzf = zzaqVar.zzf();
        String s4 = ProtectedSandApp.s("툈");
        if (!s4.equals(zzf)) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("툉"), zzaqVar.zzf()));
        }
        zzg.zza(s4, 1, list);
        return zzakVar.zzc(zzhVar.zza(list.get(0)).zzf()) ? zzaq.zzh : zzaq.zzi;
    }

    public static Iterator<zzaq> zza(Map<String, zzaq> map) {
        return new zzam(map.keySet().iterator());
    }
}
