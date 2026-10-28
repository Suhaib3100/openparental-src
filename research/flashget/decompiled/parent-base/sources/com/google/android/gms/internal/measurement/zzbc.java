package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzbc extends zzay {
    protected zzbc() {
        this.zza.add(zzbv.zzc);
        this.zza.add(zzbv.zzl);
        this.zza.add(zzbv.zzm);
        this.zza.add(zzbv.zzn);
        this.zza.add(zzbv.zzs);
        this.zza.add(zzbv.zzp);
        this.zza.add(zzbv.zzt);
        this.zza.add(zzbv.zzx);
        this.zza.add(zzbv.zzam);
        this.zza.add(zzbv.zzay);
        this.zza.add(zzbv.zzbb);
        this.zza.add(zzbv.zzbe);
        this.zza.add(zzbv.zzbf);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        int i4 = zzbf.zza[zzg.zza(str).ordinal()];
        String s4 = ProtectedSandApp.s("툸");
        int i5 = 0;
        switch (i4) {
            case 1:
                zzg.zza(zzbv.zzc, 3, list);
                zzaq zza = zzhVar.zza(list.get(0));
                String zzf = zzhVar.zza(list.get(1)).zzf();
                zzaq zza2 = zzhVar.zza(list.get(2));
                if (!(zza2 instanceof zzaf)) {
                    throw new IllegalArgumentException(String.format(ProtectedSandApp.s("툾"), zza2.getClass().getCanonicalName()));
                }
                if (zzf.isEmpty()) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("툽"));
                }
                return zza.zza(zzf, zzhVar, ((zzaf) zza2).zzi());
            case 2:
                return zzhVar.zza().zza(new zzaf(list));
            case 3:
                zzg.zza(zzbv.zzm, 0, list);
                return zzaq.zzf;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    zzaq zza3 = zzhVar.zza(list.get(0));
                    if (zza3 instanceof zzaf) {
                        return zzhVar.zza((zzaf) zza3);
                    }
                }
                return zzaq.zzc;
            case 6:
                zzg.zza(zzbv.zzm, 0, list);
                return zzaq.zze;
            case 7:
                zzg.zzb(zzbv.zzt, 2, list);
                zzar zzarVar = (zzar) zza(zzhVar, list);
                if (zzarVar.zza() == null) {
                    zzhVar.zzc("", zzarVar);
                } else {
                    zzhVar.zzc(zzarVar.zza(), zzarVar);
                }
                return zzarVar;
            case 8:
                return zza(zzhVar, list);
            case 9:
                zzg.zzb(zzbv.zzam, 2, list);
                zzaq zza4 = zzhVar.zza(list.get(0));
                zzaq zza5 = zzhVar.zza(list.get(1));
                zzaq zza6 = list.size() > 2 ? zzhVar.zza(list.get(2)) : null;
                zzaq zzaqVar = zzaq.zzc;
                zzaq zza7 = zza4.zzd().booleanValue() ? zzhVar.zza((zzaf) zza5) : zza6 != null ? zzhVar.zza((zzaf) zza6) : zzaqVar;
                return zza7 instanceof zzaj ? zza7 : zzaqVar;
            case 10:
                return new zzaf(list);
            case 11:
                if (list.isEmpty()) {
                    return zzaq.zzg;
                }
                zzg.zza(zzbv.zzbb, 1, list);
                return new zzaj(s4, zzhVar.zza(list.get(0)));
            case 12:
                zzg.zza(zzbv.zzbe, 3, list);
                zzaq zza8 = zzhVar.zza(list.get(0));
                zzaq zza9 = zzhVar.zza(list.get(1));
                zzaq zza10 = zzhVar.zza(list.get(2));
                if (!(zza9 instanceof zzaf)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("툼"));
                }
                if (!(zza10 instanceof zzaf)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("툻"));
                }
                zzaf zzafVar = (zzaf) zza9;
                zzaf zzafVar2 = (zzaf) zza10;
                boolean z4 = false;
                while (true) {
                    if (i5 < zzafVar.zzb()) {
                        if (z4 || zza8.equals(zzhVar.zza(zzafVar.zza(i5)))) {
                            zzaq zza11 = zzhVar.zza(zzafVar2.zza(i5));
                            if (!(zza11 instanceof zzaj)) {
                                z4 = true;
                            } else if (!((zzaj) zza11).zzb().equals(ProtectedSandApp.s("툹"))) {
                                return zza11;
                            }
                        }
                        i5++;
                    } else if (zzafVar.zzb() + 1 == zzafVar2.zzb()) {
                        zzaq zza12 = zzhVar.zza(zzafVar2.zza(zzafVar.zzb()));
                        if (zza12 instanceof zzaj) {
                            String zzb = ((zzaj) zza12).zzb();
                            if (zzb.equals(s4) || zzb.equals(ProtectedSandApp.s("툺"))) {
                                return zza12;
                            }
                        }
                    }
                }
                return zzaq.zzc;
            case 13:
                zzg.zza(zzbv.zzbf, 3, list);
                return zzhVar.zza(list.get(0)).zzd().booleanValue() ? zzhVar.zza(list.get(1)) : zzhVar.zza(list.get(2));
            default:
                return zza(str);
        }
    }

    private static zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zzb(zzbv.zzx, 2, list);
        zzaq zza = zzhVar.zza(list.get(0));
        zzaq zza2 = zzhVar.zza(list.get(1));
        if (zza2 instanceof zzaf) {
            List<zzaq> zzi = ((zzaf) zza2).zzi();
            List<zzaq> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new zzar(zza.zzf(), zzi, arrayList, zzhVar);
        }
        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("툷"), zza2.getClass().getCanonicalName()));
    }
}
