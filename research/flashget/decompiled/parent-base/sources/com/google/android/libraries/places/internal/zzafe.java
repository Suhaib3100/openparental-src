package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzafe {
    private static final Class zza;
    private static final zzaft zzb;
    private static final zzaft zzc;
    private static final zzaft zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName(ProtectedSandApp.s("\ue7c4"));
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzZ(false);
        zzc = zzZ(true);
        zzd = new zzafv();
    }

    public static zzaft zzA() {
        return zzc;
    }

    public static zzaft zzB() {
        return zzd;
    }

    static void zzC(zzada zzadaVar, Object obj, Object obj2) {
        zzadaVar.zza(obj2);
        throw null;
    }

    static void zzD(zzaft zzaftVar, Object obj, Object obj2) {
        zzaftVar.zzf(obj, zzaftVar.zzd(zzaftVar.zzc(obj), zzaftVar.zzc(obj2)));
    }

    public static void zzE(Class cls) {
        Class cls2;
        if (!zzadk.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\ue7c5"));
        }
    }

    static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzG(zzaem zzaemVar, Object obj, Object obj2, long j4) {
        zzael zzaelVar = (zzael) zzagd.zzf(obj, j4);
        zzael zzaelVar2 = (zzael) zzagd.zzf(obj2, j4);
        if (!zzaelVar2.isEmpty()) {
            if (!zzaelVar.zzd()) {
                zzaelVar = zzaelVar.zza();
            }
            zzaelVar.zzc(zzaelVar2);
        }
        zzagd.zzs(obj, j4, zzaelVar);
    }

    public static void zzH(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzc(i4, list, z4);
    }

    public static void zzI(int i4, List list, zzacy zzacyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zze(i4, list);
    }

    public static void zzJ(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzg(i4, list, z4);
    }

    public static void zzK(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzi(i4, list, z4);
    }

    public static void zzL(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzk(i4, list, z4);
    }

    public static void zzM(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzm(i4, list, z4);
    }

    public static void zzN(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzo(i4, list, z4);
    }

    public static void zzO(int i4, List list, zzacy zzacyVar, zzafc zzafcVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzacyVar.zzp(i4, list.get(i5), zzafcVar);
        }
    }

    public static void zzP(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzr(i4, list, z4);
    }

    public static void zzQ(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzt(i4, list, z4);
    }

    public static void zzR(int i4, List list, zzacy zzacyVar, zzafc zzafcVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzacyVar.zzu(i4, list.get(i5), zzafcVar);
        }
    }

    public static void zzS(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzw(i4, list, z4);
    }

    public static void zzT(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzy(i4, list, z4);
    }

    public static void zzU(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzA(i4, list, z4);
    }

    public static void zzV(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzC(i4, list, z4);
    }

    public static void zzW(int i4, List list, zzacy zzacyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzE(i4, list);
    }

    public static void zzX(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzG(i4, list, z4);
    }

    public static void zzY(int i4, List list, zzacy zzacyVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzacyVar.zzI(i4, list, z4);
    }

    private static zzaft zzZ(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName(ProtectedSandApp.s("\ue7c6"));
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzaft) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zza(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzacx.zzA(i4 << 3) + 1) * size;
    }

    static int zzb(List list) {
        return list.size();
    }

    static int zzc(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzacx.zzz(i4) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzz += zzacx.zzt((zzacp) list.get(i5));
        }
        return zzz;
    }

    static int zzd(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzacx.zzz(i4) * size) + zze(list);
    }

    static int zze(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadl) {
            zzadl zzadlVar = (zzadl) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzacx.zzv(zzadlVar.zzd(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzacx.zzv(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzf(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzacx.zzA(i4 << 3) + 4) * size;
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzacx.zzA(i4 << 3) + 8) * size;
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i4, List list, zzafc zzafcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += zzacx.zzu(i4, (zzaer) list.get(i6), zzafcVar);
        }
        return i5;
    }

    static int zzk(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzacx.zzz(i4) * size) + zzl(list);
    }

    static int zzl(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadl) {
            zzadl zzadlVar = (zzadl) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzacx.zzv(zzadlVar.zzd(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzacx.zzv(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzm(int i4, List list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzacx.zzz(i4) * list.size()) + zzn(list);
    }

    static int zzn(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeg) {
            zzaeg zzaegVar = (zzaeg) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzacx.zzB(zzaegVar.zzd(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzacx.zzB(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzo(int i4, Object obj, zzafc zzafcVar) {
        if (!(obj instanceof zzadx)) {
            return zzacx.zzA(i4 << 3) + zzacx.zzx((zzaer) obj, zzafcVar);
        }
        int zzA = zzacx.zzA(i4 << 3);
        int zza2 = ((zzadx) obj).zza();
        return a.a(zza2, zza2, zzA);
    }

    static int zzp(int i4, List list, zzafc zzafcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzacx.zzz(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            zzz = obj instanceof zzadx ? zzacx.zzw((zzadx) obj) + zzz : zzz + zzacx.zzx((zzaer) obj, zzafcVar);
        }
        return zzz;
    }

    static int zzq(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzacx.zzz(i4) * size) + zzr(list);
    }

    static int zzr(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadl) {
            zzadl zzadlVar = (zzadl) list;
            i4 = 0;
            while (i5 < size) {
                int zzd2 = zzadlVar.zzd(i5);
                i4 += zzacx.zzA((zzd2 >> 31) ^ (zzd2 + zzd2));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i4 += zzacx.zzA((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
        }
        return i4;
    }

    static int zzs(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzacx.zzz(i4) * size) + zzt(list);
    }

    static int zzt(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeg) {
            zzaeg zzaegVar = (zzaeg) list;
            i4 = 0;
            while (i5 < size) {
                long zzd2 = zzaegVar.zzd(i5);
                i4 += zzacx.zzB((zzd2 >> 63) ^ (zzd2 + zzd2));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i4 += zzacx.zzB((longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
        }
        return i4;
    }

    static int zzu(int i4, List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzacx.zzz(i4) * size;
        if (list instanceof zzadz) {
            zzadz zzadzVar = (zzadz) list;
            while (i5 < size) {
                Object zze = zzadzVar.zze(i5);
                zzz = (zze instanceof zzacp ? zzacx.zzt((zzacp) zze) : zzacx.zzy((String) zze)) + zzz;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                zzz = (obj instanceof zzacp ? zzacx.zzt((zzacp) obj) : zzacx.zzy((String) obj)) + zzz;
                i5++;
            }
        }
        return zzz;
    }

    static int zzv(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzacx.zzz(i4) * size) + zzw(list);
    }

    static int zzw(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzadl) {
            zzadl zzadlVar = (zzadl) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzacx.zzA(zzadlVar.zzd(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzacx.zzA(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzx(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzacx.zzz(i4) * size) + zzy(list);
    }

    static int zzy(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaeg) {
            zzaeg zzaegVar = (zzaeg) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzacx.zzB(zzaegVar.zzd(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzacx.zzB(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i4;
    }

    public static zzaft zzz() {
        return zzb;
    }
}
