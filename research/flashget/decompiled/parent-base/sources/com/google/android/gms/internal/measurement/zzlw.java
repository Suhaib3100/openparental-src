package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzlw {
    private static final zzmk<?, ?> zza = new zzmm();

    static int zza(int i4, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzb(i4, true) * size;
    }

    static int zzb(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i4) * size) + zzb(list);
    }

    static int zzc(int i4, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzf(i4, 0) * size;
    }

    static int zzd(int i4, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzc(i4, 0L) * size;
    }

    static int zze(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i4) * size) + zze(list);
    }

    static int zzf(int i4, List<Long> list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjc.zzi(i4) * list.size()) + zzf(list);
    }

    static int zzg(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i4) * size) + zzg(list);
    }

    static int zzh(int i4, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i4) * size) + zzh(list);
    }

    static int zzi(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i4) * size) + zzi(list);
    }

    static int zzj(int i4, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i4) * size) + zzj(list);
    }

    public static void zzk(int i4, List<Integer> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzk(i4, list, z4);
    }

    public static void zzl(int i4, List<Long> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzl(i4, list, z4);
    }

    public static void zzm(int i4, List<Integer> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzm(i4, list, z4);
    }

    public static void zzn(int i4, List<Long> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzn(i4, list, z4);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i4, List<zzik> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzjc.zzi(i4) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzi += zzjc.zzb(list.get(i5));
        }
        return zzi;
    }

    static int zzb(List<Integer> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzd(zzjwVar.zzb(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzd(list.get(i5).intValue());
                i5++;
            }
        }
        return i4;
    }

    public static void zzc(int i4, List<Integer> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzc(i4, list, z4);
    }

    public static void zzd(int i4, List<Integer> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzd(i4, list, z4);
    }

    static int zze(List<Integer> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzf(zzjwVar.zzb(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzf(list.get(i5).intValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzf(List<Long> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzd(zzknVar.zzb(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzd(list.get(i5).longValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzg(List<Integer> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzh(zzjwVar.zzb(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzh(list.get(i5).intValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzh(List<Long> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzf(zzknVar.zzb(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzf(list.get(i5).longValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzi(List<Integer> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzj(zzjwVar.zzb(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzj(list.get(i5).intValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzj(List<Long> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzg(zzknVar.zzb(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzjc.zzg(list.get(i5).longValue());
                i5++;
            }
        }
        return i4;
    }

    static int zza(int i4, List<zzlc> list, zzlu<?> zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += zzjc.zzb(i4, list.get(i6), zzluVar);
        }
        return i5;
    }

    static int zzb(int i4, List<?> list, zzlu<?> zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzjc.zzi(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            if (obj instanceof zzkk) {
                zzi = zzjc.zza((zzkk) obj) + zzi;
            } else {
                zzi += zzjc.zza((zzlc) obj, zzluVar);
            }
        }
        return zzi;
    }

    public static void zze(int i4, List<Long> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zze(i4, list, z4);
    }

    public static void zzf(int i4, List<Float> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzf(i4, list, z4);
    }

    public static void zzg(int i4, List<Integer> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzg(i4, list, z4);
    }

    public static void zzh(int i4, List<Long> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzh(i4, list, z4);
    }

    public static void zzi(int i4, List<Integer> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzi(i4, list, z4);
    }

    public static void zzj(int i4, List<Long> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzj(i4, list, z4);
    }

    static int zza(int i4, Object obj, zzlu<?> zzluVar) {
        if (obj instanceof zzkk) {
            return zzjc.zzb(i4, (zzkk) obj);
        }
        return zzjc.zzc(i4, (zzlc) obj, zzluVar);
    }

    public static zzmk<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i4, List<Integer> list, zzjx zzjxVar, UB ub, zzmk<UT, UB> zzmkVar) {
        if (zzjxVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = list.get(i6);
                int intValue = num.intValue();
                if (zzjxVar.zza(intValue)) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    ub = (UB) zza(obj, i4, intValue, ub, zzmkVar);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzjxVar.zza(intValue2)) {
                    ub = (UB) zza(obj, i4, intValue2, ub, zzmkVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static int zzb(int i4, List<?> list) {
        int zzb;
        int zzb2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzjc.zzi(i4) * size;
        if (list instanceof zzkj) {
            zzkj zzkjVar = (zzkj) list;
            while (i5 < size) {
                Object zza2 = zzkjVar.zza(i5);
                if (zza2 instanceof zzik) {
                    zzb2 = zzjc.zzb((zzik) zza2);
                } else {
                    zzb2 = zzjc.zzb((String) zza2);
                }
                zzi = zzb2 + zzi;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof zzik) {
                    zzb = zzjc.zzb((zzik) obj);
                } else {
                    zzb = zzjc.zzb((String) obj);
                }
                zzi = zzb + zzi;
                i5++;
            }
        }
        return zzi;
    }

    static <UT, UB> UB zza(Object obj, int i4, int i5, UB ub, zzmk<UT, UB> zzmkVar) {
        if (ub == null) {
            ub = zzmkVar.zzc(obj);
        }
        zzmkVar.zzb(ub, i4, i5);
        return ub;
    }

    public static void zzb(int i4, List<Double> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i4, list, z4);
    }

    static <T, FT extends zzjo<FT>> void zza(zzji<FT> zzjiVar, T t4, T t5) {
        zzjm<FT> zza2 = zzjiVar.zza(t5);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzjiVar.zzb(t4).zza(zza2);
    }

    public static void zzb(int i4, List<?> list, zznb zznbVar, zzlu<?> zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i4, list, (zzlu) zzluVar);
    }

    public static void zzb(int i4, List<String> list, zznb zznbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i4, list);
    }

    static <T> void zza(zzkv zzkvVar, T t4, T t5, long j4) {
        zzml.zza(t4, j4, zzkvVar.zza(zzml.zze(t4, j4), zzml.zze(t5, j4)));
    }

    static <T, UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t4, T t5) {
        zzmkVar.zzc(t4, zzmkVar.zza(zzmkVar.zzd(t4), zzmkVar.zzd(t5)));
    }

    public static void zza(Class<?> cls) {
        zzjt.class.isAssignableFrom(cls);
    }

    public static void zza(int i4, List<Boolean> list, zznb zznbVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i4, list, z4);
    }

    public static void zza(int i4, List<zzik> list, zznb zznbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i4, list);
    }

    public static void zza(int i4, List<?> list, zznb zznbVar, zzlu<?> zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i4, list, (zzlu) zzluVar);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
