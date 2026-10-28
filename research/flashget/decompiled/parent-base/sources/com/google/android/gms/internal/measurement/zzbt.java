package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzbt extends zzay {
    protected zzbt() {
        this.zza.add(zzbv.zzd);
        this.zza.add(zzbv.zzo);
        this.zza.add(zzbv.zzq);
        this.zza.add(zzbv.zzr);
        this.zza.add(zzbv.zzw);
        this.zza.add(zzbv.zzaf);
        this.zza.add(zzbv.zzag);
        this.zza.add(zzbv.zzah);
        this.zza.add(zzbv.zzau);
        this.zza.add(zzbv.zzbc);
        this.zza.add(zzbv.zzbg);
        this.zza.add(zzbv.zzbh);
        this.zza.add(zzbv.zzbi);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        String s4;
        int i4 = 0;
        switch (zzbs.zza[zzg.zza(str).ordinal()]) {
            case 1:
                zzg.zza(zzbv.zzd, 2, list);
                zzaq zza = zzhVar.zza(list.get(0));
                if (!(zza instanceof zzas)) {
                    throw new IllegalArgumentException(String.format(ProtectedSandApp.s("퉻"), zza.getClass().getCanonicalName()));
                }
                if (!zzhVar.zzb(zza.zzf())) {
                    throw new IllegalArgumentException(String.format(ProtectedSandApp.s("퉺"), zza.zzf()));
                }
                zzaq zza2 = zzhVar.zza(list.get(1));
                zzhVar.zzc(zza.zzf(), zza2);
                return zza2;
            case 2:
                zzg.zzb(zzbv.zzo, 2, list);
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format(ProtectedSandApp.s("퉹"), Integer.valueOf(list.size())));
                }
                while (i4 < list.size() - 1) {
                    zzaq zza3 = zzhVar.zza(list.get(i4));
                    if (!(zza3 instanceof zzas)) {
                        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("퉸"), zza3.getClass().getCanonicalName()));
                    }
                    zzhVar.zzb(zza3.zzf(), zzhVar.zza(list.get(i4 + 1)));
                    i4 += 2;
                }
                return zzaq.zzc;
            case 3:
                if (list.isEmpty()) {
                    return new zzaf();
                }
                zzaf zzafVar = new zzaf();
                Iterator<zzaq> it = list.iterator();
                while (it.hasNext()) {
                    zzaq zza4 = zzhVar.zza(it.next());
                    if (zza4 instanceof zzaj) {
                        throw new IllegalStateException(ProtectedSandApp.s("퉷"));
                    }
                    zzafVar.zzb(i4, zza4);
                    i4++;
                }
                return zzafVar;
            case 4:
                if (list.isEmpty()) {
                    return new zzap();
                }
                if (list.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format(ProtectedSandApp.s("퉶"), Integer.valueOf(list.size())));
                }
                zzap zzapVar = new zzap();
                while (i4 < list.size() - 1) {
                    zzaq zza5 = zzhVar.zza(list.get(i4));
                    zzaq zza6 = zzhVar.zza(list.get(i4 + 1));
                    if ((zza5 instanceof zzaj) || (zza6 instanceof zzaj)) {
                        throw new IllegalStateException(ProtectedSandApp.s("퉵"));
                    }
                    zzapVar.zza(zza5.zzf(), zza6);
                    i4 += 2;
                }
                return zzapVar;
            case 5:
                zzg.zzb(zzbv.zzw, 1, list);
                zzaq zzaqVar = zzaq.zzc;
                while (i4 < list.size()) {
                    zzaqVar = zzhVar.zza(list.get(i4));
                    if (zzaqVar instanceof zzaj) {
                        throw new IllegalStateException(ProtectedSandApp.s("퉴"));
                    }
                    i4++;
                }
                return zzaqVar;
            case 6:
                zzg.zza(zzbv.zzaf, 1, list);
                zzaq zza7 = zzhVar.zza(list.get(0));
                if (zza7 instanceof zzas) {
                    return zzhVar.zza(zza7.zzf());
                }
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("퉳"), zza7.getClass().getCanonicalName()));
            case 7:
            case 8:
                zzg.zza(zzbv.zzah, 2, list);
                zzaq zza8 = zzhVar.zza(list.get(0));
                zzaq zza9 = zzhVar.zza(list.get(1));
                if ((zza8 instanceof zzaf) && zzg.zzb(zza9)) {
                    return ((zzaf) zza8).zza(zza9.zze().intValue());
                }
                if (zza8 instanceof zzak) {
                    return ((zzak) zza8).zza(zza9.zzf());
                }
                if (zza8 instanceof zzas) {
                    if (ProtectedSandApp.s("퉲").equals(zza9.zzf())) {
                        return new zzai(Double.valueOf(zza8.zzf().length()));
                    }
                    if (zzg.zzb(zza9) && zza9.zze().doubleValue() < zza8.zzf().length()) {
                        return new zzas(String.valueOf(zza8.zzf().charAt(zza9.zze().intValue())));
                    }
                }
                return zzaq.zzc;
            case 9:
                zzg.zza(zzbv.zzau, 0, list);
                return zzaq.zzd;
            case 10:
                zzg.zza(zzbv.zzbc, 3, list);
                zzaq zza10 = zzhVar.zza(list.get(0));
                zzaq zza11 = zzhVar.zza(list.get(1));
                zzaq zza12 = zzhVar.zza(list.get(2));
                if (zza10 == zzaq.zzc || zza10 == zzaq.zzd) {
                    throw new IllegalStateException(String.format(ProtectedSandApp.s("퉱"), zza11.zzf(), zza10.zzf()));
                }
                if ((zza10 instanceof zzaf) && (zza11 instanceof zzai)) {
                    ((zzaf) zza10).zzb(zza11.zze().intValue(), zza12);
                } else if (zza10 instanceof zzak) {
                    ((zzak) zza10).zza(zza11.zzf(), zza12);
                }
                return zza12;
            case 11:
                zzg.zza(zzbv.zzbg, 1, list);
                zzaq zza13 = zzhVar.zza(list.get(0));
                if (zza13 instanceof zzax) {
                    s4 = ProtectedSandApp.s("퉪");
                } else if (zza13 instanceof zzag) {
                    s4 = ProtectedSandApp.s("퉫");
                } else if (zza13 instanceof zzai) {
                    s4 = ProtectedSandApp.s("퉬");
                } else if (zza13 instanceof zzas) {
                    s4 = ProtectedSandApp.s("퉭");
                } else if (zza13 instanceof zzar) {
                    s4 = ProtectedSandApp.s("퉮");
                } else {
                    if ((zza13 instanceof zzat) || (zza13 instanceof zzaj)) {
                        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("퉰"), zza13));
                    }
                    s4 = ProtectedSandApp.s("퉯");
                }
                return new zzas(s4);
            case 12:
                zzg.zza(zzbv.zzbh, 0, list);
                return zzaq.zzc;
            case 13:
                zzg.zzb(zzbv.zzbi, 1, list);
                Iterator<zzaq> it2 = list.iterator();
                while (it2.hasNext()) {
                    zzaq zza14 = zzhVar.zza(it2.next());
                    if (!(zza14 instanceof zzas)) {
                        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("퉩"), zza14.getClass().getCanonicalName()));
                    }
                    zzhVar.zza(zza14.zzf(), zzaq.zzc);
                }
                return zzaq.zzc;
            default:
                return zza(str);
        }
    }
}
