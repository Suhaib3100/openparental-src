package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import d9.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzaa {

    @d
    private final TreeMap<Integer, zzar> zza = new TreeMap<>();

    @d
    private final TreeMap<Integer, zzar> zzb = new TreeMap<>();

    private static int zza(zzh zzhVar, zzar zzarVar, zzaq zzaqVar) {
        zzaq zza = zzarVar.zza(zzhVar, Collections.singletonList(zzaqVar));
        if (zza instanceof zzai) {
            return zzg.zzb(zza.zze().doubleValue());
        }
        return -1;
    }

    public final void zza(String str, int i4, zzar zzarVar, String str2) {
        TreeMap<Integer, zzar> treeMap;
        if (ProtectedSandApp.s("퇌").equals(str2)) {
            treeMap = this.zzb;
        } else if (ProtectedSandApp.s("퇍").equals(str2)) {
            treeMap = this.zza;
        } else {
            throw new IllegalStateException(c.a(ProtectedSandApp.s("퇎"), str2));
        }
        if (treeMap.containsKey(Integer.valueOf(i4))) {
            i4 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i4), zzarVar);
    }

    public final void zza(zzh zzhVar, zzac zzacVar) {
        zzn zznVar = new zzn(zzacVar);
        for (Integer num : this.zza.keySet()) {
            zzad zzadVar = (zzad) zzacVar.zzb().clone();
            int zza = zza(zzhVar, this.zza.get(num), zznVar);
            if (zza == 2 || zza == -1) {
                zzacVar.zzb(zzadVar);
            }
        }
        Iterator<Integer> it = this.zzb.keySet().iterator();
        while (it.hasNext()) {
            zza(zzhVar, this.zzb.get(it.next()), zznVar);
        }
    }
}
