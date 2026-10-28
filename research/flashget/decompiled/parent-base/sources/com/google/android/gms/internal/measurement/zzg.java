package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzg {
    public static double zza(double d5) {
        if (Double.isNaN(d5)) {
            return p.f60679p;
        }
        if (Double.isInfinite(d5) || d5 == p.f60679p || d5 == -0.0d) {
            return d5;
        }
        return Math.floor(Math.abs(d5)) * (d5 > p.f60679p ? 1 : -1);
    }

    public static int zzb(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5) || d5 == p.f60679p) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d5)) * (d5 > p.f60679p ? 1 : -1)) % 4.294967296E9d);
    }

    public static long zzc(double d5) {
        return zzb(d5) & 4294967295L;
    }

    public static void zzc(String str, int i4, List<zzaq> list) {
        if (list.size() <= i4) {
            return;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("푍"), str, Integer.valueOf(i4), Integer.valueOf(list.size())));
    }

    public static void zzb(zzbv zzbvVar, int i4, List<zzaq> list) {
        zzb(zzbvVar.name(), i4, list);
    }

    public static int zza(zzh zzhVar) {
        String s4 = ProtectedSandApp.s("푈");
        int zzb = zzb(zzhVar.zza(s4).zze().doubleValue() + 1.0d);
        if (zzb <= 1000000) {
            zzhVar.zzc(s4, new zzai(Double.valueOf(zzb)));
            return zzb;
        }
        throw new IllegalStateException(ProtectedSandApp.s("푉"));
    }

    public static void zzb(String str, int i4, List<zzaq> list) {
        if (list.size() >= i4) {
            return;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("푌"), str, Integer.valueOf(i4), Integer.valueOf(list.size())));
    }

    public static zzbv zza(String str) {
        zzbv zza = (str == null || str.isEmpty()) ? null : zzbv.zza(Integer.parseInt(str));
        if (zza != null) {
            return zza;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("푊"), str));
    }

    public static boolean zzb(zzaq zzaqVar) {
        if (zzaqVar == null) {
            return false;
        }
        Double zze = zzaqVar.zze();
        return !zze.isNaN() && zze.doubleValue() >= p.f60679p && zze.equals(Double.valueOf(Math.floor(zze.doubleValue())));
    }

    public static Object zza(zzaq zzaqVar) {
        if (zzaq.zzd.equals(zzaqVar)) {
            return null;
        }
        if (zzaq.zzc.equals(zzaqVar)) {
            return "";
        }
        if (zzaqVar instanceof zzap) {
            return zza((zzap) zzaqVar);
        }
        if (zzaqVar instanceof zzaf) {
            ArrayList arrayList = new ArrayList();
            Iterator<zzaq> it = ((zzaf) zzaqVar).iterator();
            while (it.hasNext()) {
                Object zza = zza(it.next());
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
            return arrayList;
        }
        if (!zzaqVar.zze().isNaN()) {
            return zzaqVar.zze();
        }
        return zzaqVar.zzf();
    }

    public static Map<String, Object> zza(zzap zzapVar) {
        HashMap hashMap = new HashMap();
        for (String str : zzapVar.zza()) {
            Object zza = zza(zzapVar.zza(str));
            if (zza != null) {
                hashMap.put(str, zza);
            }
        }
        return hashMap;
    }

    public static void zza(zzbv zzbvVar, int i4, List<zzaq> list) {
        zza(zzbvVar.name(), i4, list);
    }

    public static void zza(String str, int i4, List<zzaq> list) {
        if (list.size() == i4) {
            return;
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("푋"), str, Integer.valueOf(i4), Integer.valueOf(list.size())));
    }

    public static boolean zza(zzaq zzaqVar, zzaq zzaqVar2) {
        if (!zzaqVar.getClass().equals(zzaqVar2.getClass())) {
            return false;
        }
        if ((zzaqVar instanceof zzax) || (zzaqVar instanceof zzao)) {
            return true;
        }
        if (zzaqVar instanceof zzai) {
            if (Double.isNaN(zzaqVar.zze().doubleValue()) || Double.isNaN(zzaqVar2.zze().doubleValue())) {
                return false;
            }
            return zzaqVar.zze().equals(zzaqVar2.zze());
        }
        if (zzaqVar instanceof zzas) {
            return zzaqVar.zzf().equals(zzaqVar2.zzf());
        }
        if (zzaqVar instanceof zzag) {
            return zzaqVar.zzd().equals(zzaqVar2.zzd());
        }
        return zzaqVar == zzaqVar2;
    }
}
