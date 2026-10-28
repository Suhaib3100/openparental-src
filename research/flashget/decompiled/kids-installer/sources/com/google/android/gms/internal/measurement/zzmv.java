package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zzmv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznk zzc;
    private static final zznk zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zznk zznkVar = null;
        try {
            cls = Class.forName(ProtectedSandApp.s("ี"));
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName(ProtectedSandApp.s("ึ"));
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zznkVar = (zznk) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznkVar;
        zzd = new zznm();
    }

    static Object zzA(Object obj, int i5, int i6, Object obj2, zznk zznkVar) {
        if (obj2 == null) {
            obj2 = zznkVar.zzc(obj);
        }
        zznkVar.zzf(obj2, i5, i6);
        return obj2;
    }

    static void zzB(zznk zznkVar, Object obj, Object obj2) {
        zznkVar.zzh(obj, zznkVar.zze(zznkVar.zzd(obj), zznkVar.zzd(obj2)));
    }

    public static void zzC(Class cls) {
        Class cls2;
        if (!zzlb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ื"));
        }
    }

    public static void zzD(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzc(i5, list, z5);
    }

    public static void zzE(int i5, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zze(i5, list);
    }

    public static void zzF(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzg(i5, list, z5);
    }

    public static void zzG(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzj(i5, list, z5);
    }

    public static void zzH(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzl(i5, list, z5);
    }

    public static void zzI(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzn(i5, list, z5);
    }

    public static void zzJ(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzp(i5, list, z5);
    }

    public static void zzK(int i5, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((zzkj) zzocVar).zzq(i5, list.get(i6), zzmtVar);
        }
    }

    public static void zzL(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzs(i5, list, z5);
    }

    public static void zzM(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzu(i5, list, z5);
    }

    public static void zzN(int i5, List list, zzoc zzocVar, zzmt zzmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((zzkj) zzocVar).zzv(i5, list.get(i6), zzmtVar);
        }
    }

    public static void zzO(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzx(i5, list, z5);
    }

    public static void zzP(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzz(i5, list, z5);
    }

    public static void zzQ(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzB(i5, list, z5);
    }

    public static void zzR(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzD(i5, list, z5);
    }

    public static void zzS(int i5, List list, zzoc zzocVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzG(i5, list);
    }

    public static void zzT(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzI(i5, list, z5);
    }

    public static void zzU(int i5, List list, zzoc zzocVar, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzK(i5, list, z5);
    }

    static boolean zzV(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(int i5, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i5 << 3) + 1) * size;
    }

    static int zzb(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzki.zzx(i5 << 3) * size;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int zzd2 = ((zzka) list.get(i6)).zzd();
            zzx += zzki.zzx(zzd2) + zzd2;
        }
        return zzx;
    }

    static int zzc(int i5, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i5 << 3) * size) + zzd(list);
    }

    static int zzd(List list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i5 = 0;
            while (i6 < size) {
                i5 += zzki.zzu(zzlcVar.zze(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += zzki.zzu(((Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return i5;
    }

    static int zze(int i5, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i5 << 3) + 4) * size;
    }

    static int zzf(List list) {
        return list.size() * 4;
    }

    static int zzg(int i5, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i5 << 3) + 8) * size;
    }

    static int zzh(List list) {
        return list.size() * 8;
    }

    static int zzi(int i5, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += zzki.zzt(i5, (zzmi) list.get(i7), zzmtVar);
        }
        return i6;
    }

    static int zzj(int i5, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i5 << 3) * size) + zzk(list);
    }

    static int zzk(List list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i5 = 0;
            while (i6 < size) {
                i5 += zzki.zzu(zzlcVar.zze(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += zzki.zzu(((Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return i5;
    }

    static int zzl(int i5, List list, boolean z5) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzki.zzx(i5 << 3) * list.size()) + zzm(list);
    }

    static int zzm(List list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i5 = 0;
            while (i6 < size) {
                i5 += zzki.zzy(zzlxVar.zza(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += zzki.zzy(((Long) list.get(i6)).longValue());
                i6++;
            }
        }
        return i5;
    }

    static int zzn(int i5, Object obj, zzmt zzmtVar) {
        if (!(obj instanceof zzlo)) {
            return zzki.zzx(i5 << 3) + zzki.zzv((zzmi) obj, zzmtVar);
        }
        int i6 = zzki.zzb;
        int zza2 = ((zzlo) obj).zza();
        return zzki.zzx(i5 << 3) + zzki.zzx(zza2) + zza2;
    }

    static int zzo(int i5, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzki.zzx(i5 << 3) * size;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = list.get(i6);
            if (obj instanceof zzlo) {
                int zza2 = ((zzlo) obj).zza();
                zzx = zzki.zzx(zza2) + zza2 + zzx;
            } else {
                zzx += zzki.zzv((zzmi) obj, zzmtVar);
            }
        }
        return zzx;
    }

    static int zzp(int i5, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i5 << 3) * size) + zzq(list);
    }

    static int zzq(List list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i5 = 0;
            while (i6 < size) {
                int zze = zzlcVar.zze(i6);
                i5 += zzki.zzx((zze >> 31) ^ (zze + zze));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                int intValue = ((Integer) list.get(i6)).intValue();
                i5 += zzki.zzx((intValue >> 31) ^ (intValue + intValue));
                i6++;
            }
        }
        return i5;
    }

    static int zzr(int i5, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i5 << 3) * size) + zzs(list);
    }

    static int zzs(List list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i5 = 0;
            while (i6 < size) {
                long zza2 = zzlxVar.zza(i6);
                i5 += zzki.zzy((zza2 >> 63) ^ (zza2 + zza2));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                long longValue = ((Long) list.get(i6)).longValue();
                i5 += zzki.zzy((longValue >> 63) ^ (longValue + longValue));
                i6++;
            }
        }
        return i5;
    }

    static int zzt(int i5, List list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z5 = list instanceof zzlq;
        int zzx = zzki.zzx(i5 << 3) * size;
        if (z5) {
            zzlq zzlqVar = (zzlq) list;
            while (i6 < size) {
                Object zzf = zzlqVar.zzf(i6);
                if (zzf instanceof zzka) {
                    int zzd2 = ((zzka) zzf).zzd();
                    zzx = zzki.zzx(zzd2) + zzd2 + zzx;
                } else {
                    zzx = zzki.zzw((String) zzf) + zzx;
                }
                i6++;
            }
        } else {
            while (i6 < size) {
                Object obj = list.get(i6);
                if (obj instanceof zzka) {
                    int zzd3 = ((zzka) obj).zzd();
                    zzx = zzki.zzx(zzd3) + zzd3 + zzx;
                } else {
                    zzx = zzki.zzw((String) obj) + zzx;
                }
                i6++;
            }
        }
        return zzx;
    }

    static int zzu(int i5, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i5 << 3) * size) + zzv(list);
    }

    static int zzv(List list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i5 = 0;
            while (i6 < size) {
                i5 += zzki.zzx(zzlcVar.zze(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += zzki.zzx(((Integer) list.get(i6)).intValue());
                i6++;
            }
        }
        return i5;
    }

    static int zzw(int i5, List list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i5 << 3) * size) + zzx(list);
    }

    static int zzx(List list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i5 = 0;
            while (i6 < size) {
                i5 += zzki.zzy(zzlxVar.zza(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += zzki.zzy(((Long) list.get(i6)).longValue());
                i6++;
            }
        }
        return i5;
    }

    public static zznk zzy() {
        return zzc;
    }

    public static zznk zzz() {
        return zzd;
    }
}
