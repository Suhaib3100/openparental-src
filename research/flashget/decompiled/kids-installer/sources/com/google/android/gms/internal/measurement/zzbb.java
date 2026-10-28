package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzap zza(String str, zzae zzaeVar, zzg zzgVar, List list) {
        String str2;
        char c6;
        String s5;
        double d6;
        zzai zzaiVar;
        int hashCode = str.hashCode();
        String s6 = ProtectedSandApp.s("എ");
        String s7 = ProtectedSandApp.s("ഏ");
        String s8 = ProtectedSandApp.s("ഐ");
        String s9 = ProtectedSandApp.s("\u0d11");
        String s10 = ProtectedSandApp.s("ഒ");
        String s11 = ProtectedSandApp.s("ഓ");
        String s12 = ProtectedSandApp.s("ഔ");
        String s13 = ProtectedSandApp.s("ക");
        String s14 = ProtectedSandApp.s("ഖ");
        String s15 = ProtectedSandApp.s("ഗ");
        String s16 = ProtectedSandApp.s("ഘ");
        String s17 = ProtectedSandApp.s("ങ");
        String s18 = ProtectedSandApp.s("ച");
        String s19 = ProtectedSandApp.s("ഛ");
        switch (hashCode) {
            case -1776922004:
                str2 = s19;
                if (str.equals(str2)) {
                    c6 = 18;
                    break;
                }
                c6 = 65535;
                break;
            case -1354795244:
                if (str.equals(ProtectedSandApp.s("ഡ"))) {
                    str2 = s19;
                    c6 = 0;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case -1274492040:
                if (str.equals(s18)) {
                    str2 = s19;
                    c6 = 2;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case -934873754:
                if (str.equals(ProtectedSandApp.s("ഠ"))) {
                    c6 = '\n';
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case -895859076:
                if (str.equals(ProtectedSandApp.s("ട"))) {
                    c6 = 17;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case -678635926:
                if (str.equals(s17)) {
                    c6 = 3;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case -467511597:
                if (str.equals(s16)) {
                    c6 = 6;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case -277637751:
                if (str.equals(ProtectedSandApp.s("ഞ"))) {
                    c6 = 19;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 107868:
                if (str.equals(s15)) {
                    c6 = 7;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 111185:
                if (str.equals(s14)) {
                    c6 = '\b';
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 3267882:
                if (str.equals(s13)) {
                    c6 = 5;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 3452698:
                if (str.equals(ProtectedSandApp.s("ഝ"))) {
                    c6 = '\t';
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 3536116:
                if (str.equals(s12)) {
                    c6 = 15;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 3536286:
                if (str.equals(s11)) {
                    c6 = 16;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 96891675:
                if (str.equals(s10)) {
                    str2 = s19;
                    c6 = 1;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 109407362:
                if (str.equals(s9)) {
                    c6 = '\r';
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 109526418:
                if (str.equals(s8)) {
                    c6 = 14;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 965561430:
                if (str.equals(ProtectedSandApp.s("ജ"))) {
                    c6 = 11;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 1099846370:
                if (str.equals(s7)) {
                    c6 = '\f';
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            case 1943291465:
                if (str.equals(s6)) {
                    c6 = 4;
                    str2 = s19;
                    break;
                }
                str2 = s19;
                c6 = 65535;
                break;
            default:
                str2 = s19;
                c6 = 65535;
                break;
        }
        String s20 = ProtectedSandApp.s("ഢ");
        double d7 = p.f18289o;
        switch (c6) {
            case 0:
                zzap zzd = zzaeVar.zzd();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zzap zzb = zzgVar.zzb((zzap) it.next());
                        if (zzb instanceof zzag) {
                            throw new IllegalStateException(ProtectedSandApp.s("ഩ"));
                        }
                        zzae zzaeVar2 = (zzae) zzd;
                        int zzc = zzaeVar2.zzc();
                        if (zzb instanceof zzae) {
                            zzae zzaeVar3 = (zzae) zzb;
                            Iterator zzk = zzaeVar3.zzk();
                            while (zzk.hasNext()) {
                                Integer num = (Integer) zzk.next();
                                zzaeVar2.zzq(num.intValue() + zzc, zzaeVar3.zze(num.intValue()));
                            }
                        } else {
                            zzaeVar2.zzq(zzc, zzb);
                        }
                    }
                }
                return zzd;
            case 1:
                zzh.zzh(s10, 1, list);
                zzap zzb2 = zzgVar.zzb((zzap) list.get(0));
                if (zzb2 instanceof zzao) {
                    return zzaeVar.zzc() == 0 ? zzap.zzk : zzb(zzaeVar, zzgVar, (zzao) zzb2, Boolean.FALSE, Boolean.TRUE).zzc() != zzaeVar.zzc() ? zzap.zzl : zzap.zzk;
                }
                throw new IllegalArgumentException(s20);
            case 2:
                zzh.zzh(s18, 1, list);
                zzap zzb3 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzb3 instanceof zzao)) {
                    throw new IllegalArgumentException(s20);
                }
                if (zzaeVar.zzb() == 0) {
                    return new zzae();
                }
                zzap zzd2 = zzaeVar.zzd();
                zzae zzb4 = zzb(zzaeVar, zzgVar, (zzao) zzb3, null, Boolean.TRUE);
                zzae zzaeVar4 = new zzae();
                Iterator zzk2 = zzb4.zzk();
                while (zzk2.hasNext()) {
                    zzaeVar4.zzq(zzaeVar4.zzc(), ((zzae) zzd2).zze(((Integer) zzk2.next()).intValue()));
                }
                return zzaeVar4;
            case 3:
                zzh.zzh(s17, 1, list);
                zzap zzb5 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzb5 instanceof zzao)) {
                    throw new IllegalArgumentException(s20);
                }
                if (zzaeVar.zzb() == 0) {
                    return zzap.zzf;
                }
                zzb(zzaeVar, zzgVar, (zzao) zzb5, null, null);
                return zzap.zzf;
            case 4:
                zzh.zzj(s6, 2, list);
                zzap zzapVar = zzap.zzf;
                if (!list.isEmpty()) {
                    zzapVar = zzgVar.zzb((zzap) list.get(0));
                }
                if (list.size() > 1) {
                    double zza = zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    if (zza >= zzaeVar.zzc()) {
                        return new zzah(Double.valueOf(-1.0d));
                    }
                    d7 = zza < p.f18289o ? zzaeVar.zzc() + zza : zza;
                }
                Iterator zzk3 = zzaeVar.zzk();
                while (zzk3.hasNext()) {
                    int intValue = ((Integer) zzk3.next()).intValue();
                    double d8 = intValue;
                    if (d8 >= d7 && zzh.zzl(zzaeVar.zze(intValue), zzapVar)) {
                        return new zzah(Double.valueOf(d8));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 5:
                zzh.zzj(s13, 1, list);
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzm;
                }
                if (list.isEmpty()) {
                    s5 = ProtectedSandApp.s("ന");
                } else {
                    zzap zzb6 = zzgVar.zzb((zzap) list.get(0));
                    s5 = ((zzb6 instanceof zzan) || (zzb6 instanceof zzau)) ? "" : zzb6.zzi();
                }
                return new zzat(zzaeVar.zzj(s5));
            case 6:
                zzh.zzj(s16, 2, list);
                zzap zzapVar2 = zzap.zzf;
                if (!list.isEmpty()) {
                    zzapVar2 = zzgVar.zzb((zzap) list.get(0));
                }
                int zzc2 = zzaeVar.zzc() - 1;
                if (list.size() > 1) {
                    zzap zzb7 = zzgVar.zzb((zzap) list.get(1));
                    d6 = Double.isNaN(zzb7.zzh().doubleValue()) ? zzaeVar.zzc() - 1 : zzh.zza(zzb7.zzh().doubleValue());
                    if (d6 < p.f18289o) {
                        d6 += zzaeVar.zzc();
                    }
                } else {
                    d6 = zzc2;
                }
                if (d6 < p.f18289o) {
                    return new zzah(Double.valueOf(-1.0d));
                }
                for (int min = (int) Math.min(zzaeVar.zzc(), d6); min >= 0; min--) {
                    if (zzaeVar.zzs(min) && zzh.zzl(zzaeVar.zze(min), zzapVar2)) {
                        return new zzah(Double.valueOf(min));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 7:
                zzh.zzh(s15, 1, list);
                zzap zzb8 = zzgVar.zzb((zzap) list.get(0));
                if (zzb8 instanceof zzao) {
                    return zzaeVar.zzc() == 0 ? new zzae() : zzb(zzaeVar, zzgVar, (zzao) zzb8, null, null);
                }
                throw new IllegalArgumentException(s20);
            case '\b':
                zzh.zzh(s14, 0, list);
                int zzc3 = zzaeVar.zzc();
                if (zzc3 == 0) {
                    return zzap.zzf;
                }
                int i5 = zzc3 - 1;
                zzap zze = zzaeVar.zze(i5);
                zzaeVar.zzp(i5);
                return zze;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzaeVar.zzq(zzaeVar.zzc(), zzgVar.zzb((zzap) it2.next()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzc()));
            case '\n':
                return zzc(zzaeVar, zzgVar, list, true);
            case 11:
                return zzc(zzaeVar, zzgVar, list, false);
            case '\f':
                zzh.zzh(s7, 0, list);
                int zzc4 = zzaeVar.zzc();
                if (zzc4 != 0) {
                    for (int i6 = 0; i6 < zzc4 / 2; i6++) {
                        if (zzaeVar.zzs(i6)) {
                            zzap zze2 = zzaeVar.zze(i6);
                            zzaeVar.zzq(i6, null);
                            int i7 = (zzc4 - 1) - i6;
                            if (zzaeVar.zzs(i7)) {
                                zzaeVar.zzq(i6, zzaeVar.zze(i7));
                            }
                            zzaeVar.zzq(i7, zze2);
                        }
                    }
                }
                return zzaeVar;
            case '\r':
                zzh.zzh(s9, 0, list);
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzf;
                }
                zzap zze3 = zzaeVar.zze(0);
                zzaeVar.zzp(0);
                return zze3;
            case 14:
                zzh.zzj(s8, 2, list);
                if (list.isEmpty()) {
                    return zzaeVar.zzd();
                }
                double zzc5 = zzaeVar.zzc();
                double zza2 = zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                double max = zza2 < p.f18289o ? Math.max(zza2 + zzc5, p.f18289o) : Math.min(zza2, zzc5);
                if (list.size() == 2) {
                    double zza3 = zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue());
                    zzc5 = zza3 < p.f18289o ? Math.max(zzc5 + zza3, p.f18289o) : Math.min(zzc5, zza3);
                }
                zzae zzaeVar5 = new zzae();
                for (int i8 = (int) max; i8 < zzc5; i8++) {
                    zzaeVar5.zzq(zzaeVar5.zzc(), zzaeVar.zze(i8));
                }
                return zzaeVar5;
            case 15:
                zzh.zzh(s12, 1, list);
                zzap zzb9 = zzgVar.zzb((zzap) list.get(0));
                if (!(zzb9 instanceof zzai)) {
                    throw new IllegalArgumentException(s20);
                }
                if (zzaeVar.zzc() == 0) {
                    return zzap.zzl;
                }
                zzai zzaiVar2 = (zzai) zzb9;
                Iterator zzk4 = zzaeVar.zzk();
                while (zzk4.hasNext()) {
                    int intValue2 = ((Integer) zzk4.next()).intValue();
                    if (zzaeVar.zzs(intValue2) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zze(intValue2), new zzah(Double.valueOf(intValue2)), zzaeVar)).zzg().booleanValue()) {
                        return zzap.zzk;
                    }
                }
                return zzap.zzl;
            case 16:
                zzh.zzj(s11, 1, list);
                if (zzaeVar.zzc() >= 2) {
                    List zzm = zzaeVar.zzm();
                    if (list.isEmpty()) {
                        zzaiVar = null;
                    } else {
                        zzap zzb10 = zzgVar.zzb((zzap) list.get(0));
                        if (!(zzb10 instanceof zzai)) {
                            throw new IllegalArgumentException(ProtectedSandApp.s("ധ"));
                        }
                        zzaiVar = (zzai) zzb10;
                    }
                    Collections.sort(zzm, new zzba(zzaiVar, zzgVar));
                    zzaeVar.zzn();
                    Iterator it3 = zzm.iterator();
                    int i9 = 0;
                    while (it3.hasNext()) {
                        zzaeVar.zzq(i9, (zzap) it3.next());
                        i9++;
                    }
                }
                return zzaeVar;
            case 17:
                if (list.isEmpty()) {
                    return new zzae();
                }
                int zza4 = (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue());
                if (zza4 < 0) {
                    zza4 = Math.max(0, zzaeVar.zzc() + zza4);
                } else if (zza4 > zzaeVar.zzc()) {
                    zza4 = zzaeVar.zzc();
                }
                int zzc6 = zzaeVar.zzc();
                zzae zzaeVar6 = new zzae();
                if (list.size() > 1) {
                    int max2 = Math.max(0, (int) zzh.zza(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()));
                    if (max2 > 0) {
                        for (int i10 = zza4; i10 < Math.min(zzc6, zza4 + max2); i10++) {
                            zzaeVar6.zzq(zzaeVar6.zzc(), zzaeVar.zze(zza4));
                            zzaeVar.zzp(zza4);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i11 = 2; i11 < list.size(); i11++) {
                            zzap zzb11 = zzgVar.zzb((zzap) list.get(i11));
                            if (zzb11 instanceof zzag) {
                                throw new IllegalArgumentException(ProtectedSandApp.s("ദ"));
                            }
                            zzaeVar.zzo((zza4 + i11) - 2, zzb11);
                        }
                    }
                } else {
                    while (zza4 < zzc6) {
                        zzaeVar6.zzq(zzaeVar6.zzc(), zzaeVar.zze(zza4));
                        zzaeVar.zzq(zza4, null);
                        zza4++;
                    }
                }
                return zzaeVar6;
            case 18:
                zzh.zzh(str2, 0, list);
                return new zzat(zzaeVar.zzj(ProtectedSandApp.s("ഥ")));
            case 19:
                if (!list.isEmpty()) {
                    zzae zzaeVar7 = new zzae();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        zzap zzb12 = zzgVar.zzb((zzap) it4.next());
                        if (zzb12 instanceof zzag) {
                            throw new IllegalStateException(ProtectedSandApp.s("ത"));
                        }
                        zzaeVar7.zzq(zzaeVar7.zzc(), zzb12);
                    }
                    int zzc7 = zzaeVar7.zzc();
                    Iterator zzk5 = zzaeVar.zzk();
                    while (zzk5.hasNext()) {
                        Integer num2 = (Integer) zzk5.next();
                        zzaeVar7.zzq(num2.intValue() + zzc7, zzaeVar.zze(num2.intValue()));
                    }
                    zzaeVar.zzn();
                    Iterator zzk6 = zzaeVar7.zzk();
                    while (zzk6.hasNext()) {
                        Integer num3 = (Integer) zzk6.next();
                        zzaeVar.zzq(num3.intValue(), zzaeVar7.zze(num3.intValue()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzc()));
            default:
                throw new IllegalArgumentException(ProtectedSandApp.s("ണ"));
        }
    }

    private static zzae zzb(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator zzk = zzaeVar.zzk();
        while (zzk.hasNext()) {
            int intValue = ((Integer) zzk.next()).intValue();
            if (zzaeVar.zzs(intValue)) {
                zzap zza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zze(intValue), new zzah(Double.valueOf(intValue)), zzaeVar));
                if (zza.zzg().equals(bool)) {
                    return zzaeVar2;
                }
                if (bool2 == null || zza.zzg().equals(bool2)) {
                    zzaeVar2.zzq(intValue, zza);
                }
            }
        }
        return zzaeVar2;
    }

    private static zzap zzc(zzae zzaeVar, zzg zzgVar, List list, boolean z5) {
        zzap zzapVar;
        String s5 = ProtectedSandApp.s("പ");
        zzh.zzi(s5, 1, list);
        zzh.zzj(s5, 2, list);
        zzap zzb = zzgVar.zzb((zzap) list.get(0));
        if (!(zzb instanceof zzai)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("മ"));
        }
        if (list.size() == 2) {
            zzapVar = zzgVar.zzb((zzap) list.get(1));
            if (zzapVar instanceof zzag) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ഫ"));
            }
        } else {
            if (zzaeVar.zzc() == 0) {
                throw new IllegalStateException(ProtectedSandApp.s("ഭ"));
            }
            zzapVar = null;
        }
        zzai zzaiVar = (zzai) zzb;
        int zzc = zzaeVar.zzc();
        int i5 = z5 ? 0 : zzc - 1;
        int i6 = z5 ? zzc - 1 : 0;
        int i7 = true == z5 ? 1 : -1;
        if (zzapVar == null) {
            zzapVar = zzaeVar.zze(i5);
            i5 += i7;
        }
        while ((i6 - i5) * i7 >= 0) {
            if (zzaeVar.zzs(i5)) {
                zzapVar = zzaiVar.zza(zzgVar, Arrays.asList(zzapVar, zzaeVar.zze(i5), new zzah(Double.valueOf(i5)), zzaeVar));
                if (zzapVar instanceof zzag) {
                    throw new IllegalStateException(ProtectedSandApp.s("ബ"));
                }
                i5 += i7;
            } else {
                i5 += i7;
            }
        }
        return zzapVar;
    }
}
