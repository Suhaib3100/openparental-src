package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzbh extends zzaw {
    protected zzbh() {
        this.zza.add(zzbl.zzA);
        this.zza.add(zzbl.zzB);
        this.zza.add(zzbl.zzC);
        this.zza.add(zzbl.zzD);
        this.zza.add(zzbl.zzE);
        this.zza.add(zzbl.zzF);
        this.zza.add(zzbl.zzG);
        this.zza.add(zzbl.zzan);
    }

    private static zzap zzc(zzbf zzbfVar, Iterator it, zzap zzapVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzap zzc = zzbfVar.zza((zzap) it.next()).zzc((zzae) zzapVar);
                if (zzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzc;
                    if (ProtectedSandApp.s("⌓").equals(zzagVar.zzc())) {
                        return zzap.zzf;
                    }
                    if (ProtectedSandApp.s("⌔").equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzap.zzf;
    }

    private static zzap zzd(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        return zzc(zzbfVar, zzapVar.zzl(), zzapVar2);
    }

    private static zzap zze(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof Iterable) {
            return zzc(zzbfVar, ((Iterable) zzapVar).iterator(), zzapVar2);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("⌕"));
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.zza;
        int ordinal = zzh.zze(str).ordinal();
        String s5 = ProtectedSandApp.s("⌖");
        String s6 = ProtectedSandApp.s("⌗");
        if (ordinal == 65) {
            zzap zzapVar = (zzap) a.a(zzbl.zzan, 4, list, 0);
            zzap zzapVar2 = (zzap) list.get(1);
            zzap zzapVar3 = (zzap) list.get(2);
            zzap zzb = zzgVar.zzb((zzap) list.get(3));
            if (zzgVar.zzb(zzapVar3).zzg().booleanValue()) {
                zzap zzc = zzgVar.zzc((zzae) zzb);
                if (zzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzc;
                    if (s6.equals(zzagVar.zzc())) {
                        return zzap.zzf;
                    }
                    if (s5.equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
            while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                zzap zzc2 = zzgVar.zzc((zzae) zzb);
                if (zzc2 instanceof zzag) {
                    zzag zzagVar2 = (zzag) zzc2;
                    if (s6.equals(zzagVar2.zzc())) {
                        return zzap.zzf;
                    }
                    if (s5.equals(zzagVar2.zzc())) {
                        return zzagVar2;
                    }
                }
                zzgVar.zzb(zzapVar2);
            }
            return zzap.zzf;
        }
        switch (ordinal) {
            case 26:
                if (!(a.a(zzbl.zzA, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("⌞"));
                }
                return zzd(new zzbg(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 27:
                if (!(a.a(zzbl.zzB, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("⌝"));
                }
                return zzd(new zzbd(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 28:
                if (!(a.a(zzbl.zzC, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("⌜"));
                }
                return zzd(new zzbe(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 29:
                zzap zzb2 = zzgVar.zzb((zzap) a.a(zzbl.zzD, 4, list, 0));
                if (!(zzb2 instanceof zzae)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("⌛"));
                }
                zzae zzaeVar = (zzae) zzb2;
                zzap zzapVar4 = (zzap) list.get(1);
                zzap zzapVar5 = (zzap) list.get(2);
                zzap zzb3 = zzgVar.zzb((zzap) list.get(3));
                zzg zza = zzgVar.zza();
                for (int i5 = 0; i5 < zzaeVar.zzc(); i5++) {
                    String zzi = zzaeVar.zze(i5).zzi();
                    zza.zzg(zzi, zzgVar.zzd(zzi));
                }
                while (zzgVar.zzb(zzapVar4).zzg().booleanValue()) {
                    zzap zzc3 = zzgVar.zzc((zzae) zzb3);
                    if (zzc3 instanceof zzag) {
                        zzag zzagVar3 = (zzag) zzc3;
                        if (s6.equals(zzagVar3.zzc())) {
                            return zzap.zzf;
                        }
                        if (s5.equals(zzagVar3.zzc())) {
                            return zzagVar3;
                        }
                    }
                    zzg zza2 = zzgVar.zza();
                    for (int i6 = 0; i6 < zzaeVar.zzc(); i6++) {
                        String zzi2 = zzaeVar.zze(i6).zzi();
                        zza2.zzg(zzi2, zza.zzd(zzi2));
                    }
                    zza2.zzb(zzapVar5);
                    zza = zza2;
                }
                return zzap.zzf;
            case 30:
                if (!(a.a(zzbl.zzE, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("⌚"));
                }
                return zze(new zzbg(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 31:
                if (!(a.a(zzbl.zzF, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("⌙"));
                }
                return zze(new zzbd(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            case 32:
                if (!(a.a(zzbl.zzG, 3, list, 0) instanceof zzat)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("⌘"));
                }
                return zze(new zzbe(zzgVar, ((zzap) list.get(0)).zzi()), zzgVar.zzb((zzap) list.get(1)), zzgVar.zzb((zzap) list.get(2)));
            default:
                return super.zzb(str);
        }
    }
}
