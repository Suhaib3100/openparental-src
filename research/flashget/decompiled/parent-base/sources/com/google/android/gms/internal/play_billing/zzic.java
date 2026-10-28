package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzic {
    public static final /* synthetic */ int zza = 0;
    private static final zziq zzb;

    static {
        int i4 = zzfc.zza;
        zzb = new zzis();
    }

    public static void zzA(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzD(i4, list, z4);
    }

    public static void zzB(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzF(i4, list, z4);
    }

    public static void zzC(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzK(i4, list, z4);
    }

    public static void zzD(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzM(i4, list, z4);
    }

    static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    static int zza(int i4, zzhr zzhrVar, zzib zzibVar) {
        int zzy = zzfx.zzy(i4 << 3);
        return zzy + zzy + ((zzfa) zzhrVar).zzi(zzibVar);
    }

    static int zzb(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgq) {
            zzgq zzgqVar = (zzgq) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzfx.zzz(zzgqVar.zze(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzfx.zzz(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzc(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfx.zzy(i4 << 3) + 4) * size;
    }

    static int zzd(List list) {
        return list.size() * 4;
    }

    static int zze(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzfx.zzy(i4 << 3) + 8) * size;
    }

    static int zzf(List list) {
        return list.size() * 8;
    }

    static int zzg(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgq) {
            zzgq zzgqVar = (zzgq) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzfx.zzz(zzgqVar.zze(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzfx.zzz(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzh(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhj) {
            zzhj zzhjVar = (zzhj) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzfx.zzz(zzhjVar.zze(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzfx.zzz(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzi(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgq) {
            zzgq zzgqVar = (zzgq) list;
            i4 = 0;
            while (i5 < size) {
                int zze = zzgqVar.zze(i5);
                i4 += zzfx.zzy((zze >> 31) ^ (zze + zze));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i4 += zzfx.zzy((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
        }
        return i4;
    }

    static int zzj(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhj) {
            zzhj zzhjVar = (zzhj) list;
            i4 = 0;
            while (i5 < size) {
                long zze = zzhjVar.zze(i5);
                i4 += zzfx.zzz((zze >> 63) ^ (zze + zze));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i4 += zzfx.zzz((longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
        }
        return i4;
    }

    static int zzk(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgq) {
            zzgq zzgqVar = (zzgq) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzfx.zzy(zzgqVar.zze(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzfx.zzy(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i4;
    }

    static int zzl(List list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhj) {
            zzhj zzhjVar = (zzhj) list;
            i4 = 0;
            while (i5 < size) {
                i4 += zzfx.zzz(zzhjVar.zze(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += zzfx.zzz(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i4;
    }

    public static zziq zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i4, int i5, Object obj2, zziq zziqVar) {
        if (obj2 == null) {
            obj2 = zzis.zza(obj);
        }
        ((zzir) obj2).zzj(i4 << 3, Long.valueOf(i5));
        return obj2;
    }

    static void zzo(zzgd zzgdVar, Object obj, Object obj2) {
        if (((zzgm) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(zziq zziqVar, Object obj, Object obj2) {
        zzgp zzgpVar = (zzgp) obj;
        zzir zzirVar = zzgpVar.zzc;
        zzir zzirVar2 = ((zzgp) obj2).zzc;
        if (!zzir.zzc().equals(zzirVar2)) {
            if (zzir.zzc().equals(zzirVar)) {
                zzirVar = zzir.zze(zzirVar, zzirVar2);
            } else {
                zzirVar.zzd(zzirVar2);
            }
        }
        zzgpVar.zzc = zzirVar;
    }

    public static void zzq(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzc(i4, list, z4);
    }

    public static void zzr(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzg(i4, list, z4);
    }

    public static void zzs(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzj(i4, list, z4);
    }

    public static void zzt(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzl(i4, list, z4);
    }

    public static void zzu(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzn(i4, list, z4);
    }

    public static void zzv(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzp(i4, list, z4);
    }

    public static void zzw(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzs(i4, list, z4);
    }

    public static void zzx(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzu(i4, list, z4);
    }

    public static void zzy(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzz(i4, list, z4);
    }

    public static void zzz(int i4, List list, zzji zzjiVar, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzjiVar.zzB(i4, list, z4);
    }
}
