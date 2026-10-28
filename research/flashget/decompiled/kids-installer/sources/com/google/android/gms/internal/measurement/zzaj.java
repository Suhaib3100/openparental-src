package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzaj {
    public static zzap zza(zzal zzalVar, zzap zzapVar, zzg zzgVar, List list) {
        if (zzalVar.zzt(zzapVar.zzi())) {
            zzap zzf = zzalVar.zzf(zzapVar.zzi());
            if (zzf instanceof zzai) {
                return ((zzai) zzf).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ആ"), zzapVar.zzi()));
        }
        String zzi = zzapVar.zzi();
        String s5 = ProtectedSandApp.s("ഇ");
        if (!s5.equals(zzi)) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ഈ"), zzapVar.zzi()));
        }
        zzh.zzh(s5, 1, list);
        return zzalVar.zzt(zzgVar.zzb((zzap) list.get(0)).zzi()) ? zzap.zzk : zzap.zzl;
    }

    public static Iterator zzb(Map map) {
        return new zzak(map.keySet().iterator());
    }
}
