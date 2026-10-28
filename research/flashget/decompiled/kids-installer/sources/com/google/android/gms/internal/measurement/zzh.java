package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzh {
    public static double zza(double d6) {
        if (Double.isNaN(d6)) {
            return p.f18289o;
        }
        if (Double.isInfinite(d6) || d6 == p.f18289o || d6 == p.f18289o) {
            return d6;
        }
        return (d6 > p.f18289o ? 1 : -1) * Math.floor(Math.abs(d6));
    }

    public static int zzb(double d6) {
        if (Double.isNaN(d6) || Double.isInfinite(d6) || d6 == p.f18289o) {
            return 0;
        }
        return (int) (((d6 > p.f18289o ? 1 : -1) * Math.floor(Math.abs(d6))) % 4.294967296E9d);
    }

    public static int zzc(zzg zzgVar) {
        String s5 = ProtectedSandApp.s("ඍ");
        int zzb = zzb(zzgVar.zzd(s5).zzh().doubleValue() + 1.0d);
        if (zzb > 1000000) {
            throw new IllegalStateException(ProtectedSandApp.s("ඎ"));
        }
        zzgVar.zzg(s5, new zzah(Double.valueOf(zzb)));
        return zzb;
    }

    public static long zzd(double d6) {
        return zzb(d6) & 4294967295L;
    }

    public static zzbl zze(String str) {
        zzbl zzblVar = null;
        if (str != null && !str.isEmpty()) {
            zzblVar = zzbl.zza(Integer.parseInt(str));
        }
        if (zzblVar != null) {
            return zzblVar;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ඏ"), str));
    }

    public static Object zzf(zzap zzapVar) {
        if (zzap.zzg.equals(zzapVar)) {
            return null;
        }
        if (zzap.zzf.equals(zzapVar)) {
            return "";
        }
        if (zzapVar instanceof zzam) {
            return zzg((zzam) zzapVar);
        }
        if (!(zzapVar instanceof zzae)) {
            return !zzapVar.zzh().isNaN() ? zzapVar.zzh() : zzapVar.zzi();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((zzae) zzapVar).iterator();
        while (it.hasNext()) {
            Object zzf = zzf((zzap) it.next());
            if (zzf != null) {
                arrayList.add(zzf);
            }
        }
        return arrayList;
    }

    public static Map zzg(zzam zzamVar) {
        HashMap hashMap = new HashMap();
        for (String str : zzamVar.zzb()) {
            Object zzf = zzf(zzamVar.zzf(str));
            if (zzf != null) {
                hashMap.put(str, zzf);
            }
        }
        return hashMap;
    }

    public static void zzh(String str, int i5, List list) {
        if (list.size() != i5) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ඐ"), str, Integer.valueOf(i5), Integer.valueOf(list.size())));
        }
    }

    public static void zzi(String str, int i5, List list) {
        if (list.size() < i5) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("එ"), str, Integer.valueOf(i5), Integer.valueOf(list.size())));
        }
    }

    public static void zzj(String str, int i5, List list) {
        if (list.size() > i5) {
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ඒ"), str, Integer.valueOf(i5), Integer.valueOf(list.size())));
        }
    }

    public static boolean zzk(zzap zzapVar) {
        if (zzapVar == null) {
            return false;
        }
        Double zzh = zzapVar.zzh();
        return !zzh.isNaN() && zzh.doubleValue() >= p.f18289o && zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())));
    }

    public static boolean zzl(zzap zzapVar, zzap zzapVar2) {
        if (!zzapVar.getClass().equals(zzapVar2.getClass())) {
            return false;
        }
        if ((zzapVar instanceof zzau) || (zzapVar instanceof zzan)) {
            return true;
        }
        if (!(zzapVar instanceof zzah)) {
            return zzapVar instanceof zzat ? zzapVar.zzi().equals(zzapVar2.zzi()) : zzapVar instanceof zzaf ? zzapVar.zzg().equals(zzapVar2.zzg()) : zzapVar == zzapVar2;
        }
        if (Double.isNaN(zzapVar.zzh().doubleValue()) || Double.isNaN(zzapVar2.zzh().doubleValue())) {
            return false;
        }
        return zzapVar.zzh().equals(zzapVar2.zzh());
    }
}
