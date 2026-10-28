package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzbi extends zzay {
    protected zzbi() {
        this.zza.add(zzbv.zzy);
        this.zza.add(zzbv.zzz);
        this.zza.add(zzbv.zzaa);
        this.zza.add(zzbv.zzab);
        this.zza.add(zzbv.zzac);
        this.zza.add(zzbv.zzad);
        this.zza.add(zzbv.zzae);
        this.zza.add(zzbv.zzbj);
    }

    private static zzaq zzb(zzbm zzbmVar, zzaq zzaqVar, zzaq zzaqVar2) {
        if (zzaqVar instanceof Iterable) {
            return zza(zzbmVar, (Iterator<zzaq>) ((Iterable) zzaqVar).iterator(), zzaqVar2);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("퉟"));
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        int i4 = zzbl.zza[zzg.zza(str).ordinal()];
        String s4 = ProtectedSandApp.s("퉞");
        String s5 = ProtectedSandApp.s("퉝");
        switch (i4) {
            case 1:
                zzg.zza(zzbv.zzy, 3, list);
                if (!(list.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("퉦"));
                }
                return zza(new zzbp(zzhVar, list.get(0).zzf()), zzhVar.zza(list.get(1)), zzhVar.zza(list.get(2)));
            case 2:
                zzg.zza(zzbv.zzz, 3, list);
                if (!(list.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("퉥"));
                }
                return zza(new zzbk(zzhVar, list.get(0).zzf()), zzhVar.zza(list.get(1)), zzhVar.zza(list.get(2)));
            case 3:
                zzg.zza(zzbv.zzaa, 3, list);
                if (!(list.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("퉤"));
                }
                return zza(new zzbn(zzhVar, list.get(0).zzf()), zzhVar.zza(list.get(1)), zzhVar.zza(list.get(2)));
            case 4:
                zzg.zza(zzbv.zzab, 4, list);
                zzaq zza = zzhVar.zza(list.get(0));
                if (!(zza instanceof zzaf)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("퉣"));
                }
                zzaf zzafVar = (zzaf) zza;
                zzaq zzaqVar = list.get(1);
                zzaq zzaqVar2 = list.get(2);
                zzaq zza2 = zzhVar.zza(list.get(3));
                zzh zza3 = zzhVar.zza();
                for (int i5 = 0; i5 < zzafVar.zzb(); i5++) {
                    String zzf = zzafVar.zza(i5).zzf();
                    zza3.zzc(zzf, zzhVar.zza(zzf));
                }
                while (zzhVar.zza(zzaqVar).zzd().booleanValue()) {
                    zzaq zza4 = zzhVar.zza((zzaf) zza2);
                    if (zza4 instanceof zzaj) {
                        zzaj zzajVar = (zzaj) zza4;
                        if (s5.equals(zzajVar.zzb())) {
                            return zzaq.zzc;
                        }
                        if (s4.equals(zzajVar.zzb())) {
                            return zzajVar;
                        }
                    }
                    zzh zza5 = zzhVar.zza();
                    for (int i6 = 0; i6 < zzafVar.zzb(); i6++) {
                        String zzf2 = zzafVar.zza(i6).zzf();
                        zza5.zzc(zzf2, zza3.zza(zzf2));
                    }
                    zza5.zza(zzaqVar2);
                    zza3 = zza5;
                }
                return zzaq.zzc;
            case 5:
                zzg.zza(zzbv.zzac, 3, list);
                if (!(list.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("퉢"));
                }
                return zzb(new zzbp(zzhVar, list.get(0).zzf()), zzhVar.zza(list.get(1)), zzhVar.zza(list.get(2)));
            case 6:
                zzg.zza(zzbv.zzad, 3, list);
                if (!(list.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("퉡"));
                }
                return zzb(new zzbk(zzhVar, list.get(0).zzf()), zzhVar.zza(list.get(1)), zzhVar.zza(list.get(2)));
            case 7:
                zzg.zza(zzbv.zzae, 3, list);
                if (!(list.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("퉠"));
                }
                return zzb(new zzbn(zzhVar, list.get(0).zzf()), zzhVar.zza(list.get(1)), zzhVar.zza(list.get(2)));
            case 8:
                zzg.zza(zzbv.zzbj, 4, list);
                zzaq zzaqVar3 = list.get(0);
                zzaq zzaqVar4 = list.get(1);
                zzaq zzaqVar5 = list.get(2);
                zzaq zza6 = zzhVar.zza(list.get(3));
                if (zzhVar.zza(zzaqVar5).zzd().booleanValue()) {
                    zzaq zza7 = zzhVar.zza((zzaf) zza6);
                    if (zza7 instanceof zzaj) {
                        zzaj zzajVar2 = (zzaj) zza7;
                        if (!s5.equals(zzajVar2.zzb())) {
                            if (s4.equals(zzajVar2.zzb())) {
                                return zzajVar2;
                            }
                        }
                        return zzaq.zzc;
                    }
                }
                while (zzhVar.zza(zzaqVar3).zzd().booleanValue()) {
                    zzaq zza8 = zzhVar.zza((zzaf) zza6);
                    if (zza8 instanceof zzaj) {
                        zzaj zzajVar3 = (zzaj) zza8;
                        if (s5.equals(zzajVar3.zzb())) {
                            return zzaq.zzc;
                        }
                        if (s4.equals(zzajVar3.zzb())) {
                            return zzajVar3;
                        }
                    }
                    zzhVar.zza(zzaqVar4);
                }
                return zzaq.zzc;
            default:
                return zza(str);
        }
    }

    private static zzaq zza(zzbm zzbmVar, Iterator<zzaq> it, zzaq zzaqVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzaq zza = zzbmVar.zza(it.next()).zza((zzaf) zzaqVar);
                if (zza instanceof zzaj) {
                    zzaj zzajVar = (zzaj) zza;
                    if (ProtectedSandApp.s("퉝").equals(zzajVar.zzb())) {
                        return zzaq.zzc;
                    }
                    if (ProtectedSandApp.s("퉞").equals(zzajVar.zzb())) {
                        return zzajVar;
                    }
                }
            }
        }
        return zzaq.zzc;
    }

    private static zzaq zza(zzbm zzbmVar, zzaq zzaqVar, zzaq zzaqVar2) {
        return zza(zzbmVar, zzaqVar.zzh(), zzaqVar2);
    }
}
