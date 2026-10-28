package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.m;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzbe {
    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar, Boolean bool, Boolean bool2) {
        zzaf zzafVar2 = new zzaf();
        Iterator<Integer> zzg = zzafVar.zzg();
        while (zzg.hasNext()) {
            int intValue = zzg.next().intValue();
            if (zzafVar.zzc(intValue)) {
                zzaq zza = zzalVar.zza(zzhVar, Arrays.asList(zzafVar.zza(intValue), new zzai(Double.valueOf(intValue)), zzafVar));
                if (zza.zzd().equals(bool)) {
                    return zzafVar2;
                }
                if (bool2 == null || zza.zzd().equals(bool2)) {
                    zzafVar2.zzb(intValue, zza);
                }
            }
        }
        return zzafVar2;
    }

    private static zzaf zza(zzaf zzafVar, zzh zzhVar, zzal zzalVar) {
        return zza(zzafVar, zzhVar, zzalVar, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaq zza(String str, zzaf zzafVar, zzh zzhVar, List<zzaq> list) {
        String str2;
        char c5;
        double d5;
        double zza;
        String s4;
        zzal zzalVar;
        double min;
        int i4;
        zzh zzhVar2;
        Double d6;
        double d7;
        String s5 = ProtectedSandApp.s("퉄");
        String s6 = ProtectedSandApp.s("퉅");
        String s7 = ProtectedSandApp.s("퉆");
        String s10 = ProtectedSandApp.s("퉇");
        String s11 = ProtectedSandApp.s("퉈");
        String s12 = ProtectedSandApp.s("퉉");
        String s13 = ProtectedSandApp.s("퉊");
        String s14 = ProtectedSandApp.s("퉋");
        String s15 = ProtectedSandApp.s("퉌");
        String s16 = ProtectedSandApp.s("퉍");
        String s17 = ProtectedSandApp.s("퉎");
        String s18 = ProtectedSandApp.s("퉏");
        String s19 = ProtectedSandApp.s("퉐");
        String s20 = ProtectedSandApp.s("퉑");
        str.getClass();
        Double valueOf = Double.valueOf(-1.0d);
        String s21 = ProtectedSandApp.s("퉃");
        switch (str.hashCode()) {
            case -1776922004:
                str2 = s20;
                if (str.equals(str2)) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -1354795244:
                if (str.equals(ProtectedSandApp.s("퉖"))) {
                    str2 = s20;
                    c5 = 1;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case -1274492040:
                if (str.equals(s19)) {
                    c5 = 2;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case -934873754:
                if (str.equals(ProtectedSandApp.s("툿"))) {
                    str2 = s20;
                    c5 = 3;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case -895859076:
                if (str.equals(ProtectedSandApp.s("퉕"))) {
                    c5 = 4;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case -678635926:
                if (str.equals(s18)) {
                    c5 = 5;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case -467511597:
                if (str.equals(s17)) {
                    c5 = 6;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case -277637751:
                if (str.equals(ProtectedSandApp.s("퉔"))) {
                    c5 = 7;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 107868:
                if (str.equals(s16)) {
                    c5 = '\b';
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 111185:
                if (str.equals(s15)) {
                    c5 = '\t';
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 3267882:
                if (str.equals(s14)) {
                    c5 = '\n';
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 3452698:
                if (str.equals(ProtectedSandApp.s("퉓"))) {
                    c5 = 11;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 3536116:
                if (str.equals(s13)) {
                    c5 = '\f';
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 3536286:
                if (str.equals(s12)) {
                    c5 = m.f86065d;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 96891675:
                if (str.equals(s11)) {
                    c5 = 14;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 109407362:
                if (str.equals(s10)) {
                    c5 = 15;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 109526418:
                if (str.equals(s7)) {
                    c5 = 16;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 965561430:
                if (str.equals(ProtectedSandApp.s("퉒"))) {
                    c5 = 17;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 1099846370:
                if (str.equals(s6)) {
                    c5 = 18;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            case 1943291465:
                if (str.equals(s5)) {
                    c5 = 19;
                    str2 = s20;
                    break;
                }
                str2 = s20;
                c5 = 65535;
                break;
            default:
                str2 = s20;
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
                zzg.zza(str2, 0, list);
                return new zzas(zzafVar.toString());
            case 1:
                zzaf zzafVar2 = (zzaf) zzafVar.zzc();
                if (!list.isEmpty()) {
                    Iterator<zzaq> it = list.iterator();
                    while (it.hasNext()) {
                        zzaq zza2 = zzhVar.zza(it.next());
                        if (!(zza2 instanceof zzaj)) {
                            int zzb = zzafVar2.zzb();
                            if (zza2 instanceof zzaf) {
                                zzaf zzafVar3 = (zzaf) zza2;
                                Iterator<Integer> zzg = zzafVar3.zzg();
                                while (zzg.hasNext()) {
                                    Integer next = zzg.next();
                                    zzafVar2.zzb(next.intValue() + zzb, zzafVar3.zza(next.intValue()));
                                }
                            } else {
                                zzafVar2.zzb(zzb, zza2);
                            }
                        } else {
                            throw new IllegalStateException(ProtectedSandApp.s("퉜"));
                        }
                    }
                }
                return zzafVar2;
            case 2:
                zzg.zza(s19, 1, list);
                zzaq zza3 = zzhVar.zza(list.get(0));
                if (zza3 instanceof zzar) {
                    if (zzafVar.zza() == 0) {
                        return new zzaf();
                    }
                    zzaf zzafVar4 = (zzaf) zzafVar.zzc();
                    zzaf zza4 = zza(zzafVar, zzhVar, (zzar) zza3, null, Boolean.TRUE);
                    zzaf zzafVar5 = new zzaf();
                    Iterator<Integer> zzg2 = zza4.zzg();
                    while (zzg2.hasNext()) {
                        zzafVar5.zza(zzafVar4.zza(zzg2.next().intValue()));
                    }
                    return zzafVar5;
                }
                throw new IllegalArgumentException(s21);
            case 3:
                return zza(zzafVar, zzhVar, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new zzaf();
                }
                int zza5 = (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                if (zza5 < 0) {
                    zza5 = Math.max(0, zzafVar.zzb() + zza5);
                } else if (zza5 > zzafVar.zzb()) {
                    zza5 = zzafVar.zzb();
                }
                int zzb2 = zzafVar.zzb();
                zzaf zzafVar6 = new zzaf();
                if (list.size() <= 1) {
                    while (zza5 < zzb2) {
                        zzafVar6.zza(zzafVar.zza(zza5));
                        zzafVar.zzb(zza5, null);
                        zza5++;
                    }
                    return zzafVar6;
                }
                int max = Math.max(0, (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue()));
                if (max > 0) {
                    for (int i5 = zza5; i5 < Math.min(zzb2, zza5 + max); i5++) {
                        zzafVar6.zza(zzafVar.zza(zza5));
                        zzafVar.zzb(zza5);
                    }
                }
                if (list.size() > 2) {
                    for (int i6 = 2; i6 < list.size(); i6++) {
                        zzaq zza6 = zzhVar.zza(list.get(i6));
                        if (!(zza6 instanceof zzaj)) {
                            zzafVar.zza((zza5 + i6) - 2, zza6);
                        } else {
                            throw new IllegalArgumentException(ProtectedSandApp.s("퉛"));
                        }
                    }
                }
                return zzafVar6;
            case 5:
                zzg.zza(s18, 1, list);
                zzaq zza7 = zzhVar.zza(list.get(0));
                if (zza7 instanceof zzar) {
                    if (zzafVar.zza() == 0) {
                        return zzaq.zzc;
                    }
                    zza(zzafVar, zzhVar, (zzar) zza7);
                    return zzaq.zzc;
                }
                throw new IllegalArgumentException(s21);
            case 6:
                zzg.zzc(s17, 2, list);
                zzaq zzaqVar = zzaq.zzc;
                if (!list.isEmpty()) {
                    zzaqVar = zzhVar.zza(list.get(0));
                }
                double zzb3 = zzafVar.zzb() - 1;
                if (list.size() > 1) {
                    zzaq zza8 = zzhVar.zza(list.get(1));
                    if (Double.isNaN(zza8.zze().doubleValue())) {
                        zza = zzafVar.zzb() - 1;
                    } else {
                        zza = zzg.zza(zza8.zze().doubleValue());
                    }
                    zzb3 = zza;
                    d5 = p.f60679p;
                    if (zzb3 < p.f60679p) {
                        zzb3 += zzafVar.zzb();
                    }
                } else {
                    d5 = p.f60679p;
                }
                if (zzb3 < d5) {
                    return new zzai(valueOf);
                }
                for (int min2 = (int) Math.min(zzafVar.zzb(), zzb3); min2 >= 0; min2--) {
                    if (zzafVar.zzc(min2) && zzg.zza(zzafVar.zza(min2), zzaqVar)) {
                        return new zzai(Double.valueOf(min2));
                    }
                }
                return new zzai(valueOf);
            case 7:
                if (!list.isEmpty()) {
                    zzaf zzafVar7 = new zzaf();
                    Iterator<zzaq> it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaq zza9 = zzhVar.zza(it2.next());
                        if (!(zza9 instanceof zzaj)) {
                            zzafVar7.zza(zza9);
                        } else {
                            throw new IllegalStateException(ProtectedSandApp.s("퉚"));
                        }
                    }
                    int zzb4 = zzafVar7.zzb();
                    Iterator<Integer> zzg3 = zzafVar.zzg();
                    while (zzg3.hasNext()) {
                        Integer next2 = zzg3.next();
                        zzafVar7.zzb(next2.intValue() + zzb4, zzafVar.zza(next2.intValue()));
                    }
                    zzafVar.zzj();
                    Iterator<Integer> zzg4 = zzafVar7.zzg();
                    while (zzg4.hasNext()) {
                        Integer next3 = zzg4.next();
                        zzafVar.zzb(next3.intValue(), zzafVar7.zza(next3.intValue()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.zzb()));
            case '\b':
                zzg.zza(s16, 1, list);
                zzaq zza10 = zzhVar.zza(list.get(0));
                if (zza10 instanceof zzar) {
                    if (zzafVar.zzb() == 0) {
                        return new zzaf();
                    }
                    return zza(zzafVar, zzhVar, (zzar) zza10);
                }
                throw new IllegalArgumentException(s21);
            case '\t':
                zzg.zza(s15, 0, list);
                int zzb5 = zzafVar.zzb();
                if (zzb5 == 0) {
                    return zzaq.zzc;
                }
                int i7 = zzb5 - 1;
                zzaq zza11 = zzafVar.zza(i7);
                zzafVar.zzb(i7);
                return zza11;
            case '\n':
                zzg.zzc(s14, 1, list);
                if (zzafVar.zzb() == 0) {
                    return zzaq.zzj;
                }
                if (!list.isEmpty()) {
                    zzaq zza12 = zzhVar.zza(list.get(0));
                    if (!(zza12 instanceof zzao) && !(zza12 instanceof zzax)) {
                        s4 = zza12.zzf();
                    } else {
                        s4 = "";
                    }
                } else {
                    s4 = ProtectedSandApp.s("퉙");
                }
                return new zzas(zzafVar.zzb(s4));
            case 11:
                if (!list.isEmpty()) {
                    Iterator<zzaq> it3 = list.iterator();
                    while (it3.hasNext()) {
                        zzafVar.zza(zzhVar.zza(it3.next()));
                    }
                }
                return new zzai(Double.valueOf(zzafVar.zzb()));
            case '\f':
                zzg.zza(s13, 1, list);
                zzaq zza13 = zzhVar.zza(list.get(0));
                if (zza13 instanceof zzal) {
                    if (zzafVar.zzb() != 0) {
                        zzal zzalVar2 = (zzal) zza13;
                        Iterator<Integer> zzg5 = zzafVar.zzg();
                        while (zzg5.hasNext()) {
                            int intValue = zzg5.next().intValue();
                            if (zzafVar.zzc(intValue) && zzalVar2.zza(zzhVar, Arrays.asList(zzafVar.zza(intValue), new zzai(Double.valueOf(intValue)), zzafVar)).zzd().booleanValue()) {
                                return zzaq.zzh;
                            }
                        }
                    }
                    return zzaq.zzi;
                }
                throw new IllegalArgumentException(s21);
            case '\r':
                zzg.zzc(s12, 1, list);
                if (zzafVar.zzb() >= 2) {
                    List<zzaq> zzi = zzafVar.zzi();
                    if (list.isEmpty()) {
                        zzalVar = null;
                    } else {
                        zzaq zza14 = zzhVar.zza(list.get(0));
                        if (zza14 instanceof zzal) {
                            zzalVar = (zzal) zza14;
                        } else {
                            throw new IllegalArgumentException(ProtectedSandApp.s("퉘"));
                        }
                    }
                    Collections.sort(zzi, new zzbh(zzalVar, zzhVar));
                    zzafVar.zzj();
                    Iterator<zzaq> it4 = zzi.iterator();
                    int i10 = 0;
                    while (it4.hasNext()) {
                        zzafVar.zzb(i10, it4.next());
                        i10++;
                    }
                }
                return zzafVar;
            case 14:
                zzg.zza(s11, 1, list);
                zzaq zza15 = zzhVar.zza(list.get(0));
                if (zza15 instanceof zzar) {
                    if (zzafVar.zzb() != 0 && zza(zzafVar, zzhVar, (zzar) zza15, Boolean.FALSE, Boolean.TRUE).zzb() != zzafVar.zzb()) {
                        return zzaq.zzi;
                    }
                    return zzaq.zzh;
                }
                throw new IllegalArgumentException(s21);
            case 15:
                zzg.zza(s10, 0, list);
                if (zzafVar.zzb() == 0) {
                    return zzaq.zzc;
                }
                zzaq zza16 = zzafVar.zza(0);
                zzafVar.zzb(0);
                return zza16;
            case 16:
                zzg.zzc(s7, 2, list);
                if (list.isEmpty()) {
                    return zzafVar.zzc();
                }
                double zzb6 = zzafVar.zzb();
                double zza17 = zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                if (zza17 < p.f60679p) {
                    min = Math.max(zza17 + zzb6, p.f60679p);
                } else {
                    min = Math.min(zza17, zzb6);
                }
                if (list.size() == 2) {
                    double zza18 = zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
                    if (zza18 < p.f60679p) {
                        zzb6 = Math.max(zzb6 + zza18, p.f60679p);
                    } else {
                        zzb6 = Math.min(zzb6, zza18);
                    }
                }
                zzaf zzafVar8 = new zzaf();
                for (int i11 = (int) min; i11 < zzb6; i11++) {
                    zzafVar8.zza(zzafVar.zza(i11));
                }
                return zzafVar8;
            case 17:
                return zza(zzafVar, zzhVar, list, false);
            case 18:
                zzg.zza(s6, 0, list);
                int zzb7 = zzafVar.zzb();
                if (zzb7 != 0) {
                    int i12 = 0;
                    while (i12 < zzb7 / 2) {
                        if (zzafVar.zzc(i12)) {
                            zzaq zza19 = zzafVar.zza(i12);
                            zzafVar.zzb(i12, null);
                            i4 = 1;
                            int i13 = (zzb7 - 1) - i12;
                            if (zzafVar.zzc(i13)) {
                                zzafVar.zzb(i12, zzafVar.zza(i13));
                            }
                            zzafVar.zzb(i13, zza19);
                        } else {
                            i4 = 1;
                        }
                        i12 += i4;
                    }
                }
                return zzafVar;
            case 19:
                zzg.zzc(s5, 2, list);
                zzaq zzaqVar2 = zzaq.zzc;
                if (list.isEmpty()) {
                    zzhVar2 = zzhVar;
                } else {
                    zzhVar2 = zzhVar;
                    zzaqVar2 = zzhVar2.zza(list.get(0));
                }
                if (list.size() > 1) {
                    d7 = zzg.zza(zzhVar2.zza(list.get(1)).zze().doubleValue());
                    if (d7 >= zzafVar.zzb()) {
                        return new zzai(valueOf);
                    }
                    d6 = valueOf;
                    if (d7 < p.f60679p) {
                        d7 += zzafVar.zzb();
                    }
                } else {
                    d6 = valueOf;
                    d7 = p.f60679p;
                }
                Iterator<Integer> zzg6 = zzafVar.zzg();
                while (zzg6.hasNext()) {
                    int intValue2 = zzg6.next().intValue();
                    double d10 = intValue2;
                    if (d10 >= d7 && zzg.zza(zzafVar.zza(intValue2), zzaqVar2)) {
                        return new zzai(Double.valueOf(d10));
                    }
                }
                return new zzai(d6);
            default:
                throw new IllegalArgumentException(ProtectedSandApp.s("퉗"));
        }
    }

    private static zzaq zza(zzaf zzafVar, zzh zzhVar, List<zzaq> list, boolean z4) {
        zzaq zzaqVar;
        String s4 = ProtectedSandApp.s("툿");
        zzg.zzb(s4, 1, list);
        zzg.zzc(s4, 2, list);
        zzaq zza = zzhVar.zza(list.get(0));
        if (zza instanceof zzal) {
            if (list.size() == 2) {
                zzaqVar = zzhVar.zza(list.get(1));
                if (zzaqVar instanceof zzaj) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("퉀"));
                }
            } else {
                if (zzafVar.zzb() == 0) {
                    throw new IllegalStateException(ProtectedSandApp.s("퉂"));
                }
                zzaqVar = null;
            }
            zzal zzalVar = (zzal) zza;
            int zzb = zzafVar.zzb();
            int i4 = z4 ? 0 : zzb - 1;
            int i5 = z4 ? zzb - 1 : 0;
            int i6 = z4 ? 1 : -1;
            if (zzaqVar == null) {
                zzaqVar = zzafVar.zza(i4);
                i4 += i6;
            }
            while ((i5 - i4) * i6 >= 0) {
                if (zzafVar.zzc(i4)) {
                    zzaqVar = zzalVar.zza(zzhVar, Arrays.asList(zzaqVar, zzafVar.zza(i4), new zzai(Double.valueOf(i4)), zzafVar));
                    if (zzaqVar instanceof zzaj) {
                        throw new IllegalStateException(ProtectedSandApp.s("퉁"));
                    }
                    i4 += i6;
                } else {
                    i4 += i6;
                }
            }
            return zzaqVar;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("퉃"));
    }
}
