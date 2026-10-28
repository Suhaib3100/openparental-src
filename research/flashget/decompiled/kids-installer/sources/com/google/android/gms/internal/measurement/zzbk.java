package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzbk extends zzaw {
    protected zzbk() {
        this.zza.add(zzbl.zzd);
        this.zza.add(zzbl.zzo);
        this.zza.add(zzbl.zzr);
        this.zza.add(zzbl.zzs);
        this.zza.add(zzbl.zzy);
        this.zza.add(zzbl.zzH);
        this.zza.add(zzbl.zzJ);
        this.zza.add(zzbl.zzK);
        this.zza.add(zzbl.zzX);
        this.zza.add(zzbl.zzag);
        this.zza.add(zzbl.zzak);
        this.zza.add(zzbl.zzal);
        this.zza.add(zzbl.zzam);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        String s5;
        zzbl zzblVar = zzbl.zza;
        int ordinal = zzh.zze(str).ordinal();
        int i5 = 0;
        if (ordinal == 3) {
            zzap zzb = zzgVar.zzb((zzap) a.a(zzbl.zzd, 2, list, 0));
            if (!(zzb instanceof zzat)) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⌳"), zzb.getClass().getCanonicalName()));
            }
            if (!zzgVar.zzh(zzb.zzi())) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⌲"), zzb.zzi()));
            }
            zzap zzb2 = zzgVar.zzb((zzap) list.get(1));
            zzgVar.zzg(zzb.zzi(), zzb2);
            return zzb2;
        }
        if (ordinal == 14) {
            zzh.zzi(zzbl.zzo.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⌱"), Integer.valueOf(list.size())));
            }
            for (int i6 = 0; i6 < list.size() - 1; i6 += 2) {
                zzap zzb3 = zzgVar.zzb((zzap) list.get(i6));
                if (!(zzb3 instanceof zzat)) {
                    throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⌰"), zzb3.getClass().getCanonicalName()));
                }
                zzgVar.zzf(zzb3.zzi(), zzgVar.zzb((zzap) list.get(i6 + 1)));
            }
            return zzap.zzf;
        }
        if (ordinal == 24) {
            zzh.zzi(zzbl.zzy.name(), 1, list);
            zzap zzapVar = zzap.zzf;
            while (i5 < list.size()) {
                zzapVar = zzgVar.zzb((zzap) list.get(i5));
                if (zzapVar instanceof zzag) {
                    throw new IllegalStateException(ProtectedSandApp.s("⌯"));
                }
                i5++;
            }
            return zzapVar;
        }
        if (ordinal == 33) {
            zzap zzb4 = zzgVar.zzb((zzap) a.a(zzbl.zzH, 1, list, 0));
            if (zzb4 instanceof zzat) {
                return zzgVar.zzd(zzb4.zzi());
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⌮"), zzb4.getClass().getCanonicalName()));
        }
        if (ordinal == 49) {
            zzh.zzh(zzbl.zzX.name(), 0, list);
            return zzap.zzg;
        }
        if (ordinal == 58) {
            zzap zzb5 = zzgVar.zzb((zzap) a.a(zzbl.zzag, 3, list, 0));
            zzap zzb6 = zzgVar.zzb((zzap) list.get(1));
            zzap zzb7 = zzgVar.zzb((zzap) list.get(2));
            if (zzb5 == zzap.zzf || zzb5 == zzap.zzg) {
                throw new IllegalStateException(String.format(ProtectedSandApp.s("⌭"), zzb6.zzi(), zzb5.zzi()));
            }
            if ((zzb5 instanceof zzae) && (zzb6 instanceof zzah)) {
                ((zzae) zzb5).zzq(zzb6.zzh().intValue(), zzb7);
            } else if (zzb5 instanceof zzal) {
                ((zzal) zzb5).zzr(zzb6.zzi(), zzb7);
            }
            return zzb7;
        }
        if (ordinal == 17) {
            if (list.isEmpty()) {
                return new zzae();
            }
            zzae zzaeVar = new zzae();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzap zzb8 = zzgVar.zzb((zzap) it.next());
                if (zzb8 instanceof zzag) {
                    throw new IllegalStateException(ProtectedSandApp.s("⌬"));
                }
                zzaeVar.zzq(i5, zzb8);
                i5++;
            }
            return zzaeVar;
        }
        if (ordinal == 18) {
            if (list.isEmpty()) {
                return new zzam();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⌫"), Integer.valueOf(list.size())));
            }
            zzam zzamVar = new zzam();
            while (i5 < list.size() - 1) {
                zzap zzb9 = zzgVar.zzb((zzap) list.get(i5));
                zzap zzb10 = zzgVar.zzb((zzap) list.get(i5 + 1));
                if ((zzb9 instanceof zzag) || (zzb10 instanceof zzag)) {
                    throw new IllegalStateException(ProtectedSandApp.s("〉"));
                }
                zzamVar.zzr(zzb9.zzi(), zzb10);
                i5 += 2;
            }
            return zzamVar;
        }
        if (ordinal == 35 || ordinal == 36) {
            zzap zzb11 = zzgVar.zzb((zzap) a.a(zzbl.zzK, 2, list, 0));
            zzap zzb12 = zzgVar.zzb((zzap) list.get(1));
            if ((zzb11 instanceof zzae) && zzh.zzk(zzb12)) {
                return ((zzae) zzb11).zze(zzb12.zzh().intValue());
            }
            if (zzb11 instanceof zzal) {
                return ((zzal) zzb11).zzf(zzb12.zzi());
            }
            if (zzb11 instanceof zzat) {
                if (ProtectedSandApp.s("〈").equals(zzb12.zzi())) {
                    return new zzah(Double.valueOf(zzb11.zzi().length()));
                }
                if (zzh.zzk(zzb12) && zzb12.zzh().doubleValue() < zzb11.zzi().length()) {
                    return new zzat(String.valueOf(zzb11.zzi().charAt(zzb12.zzh().intValue())));
                }
            }
            return zzap.zzf;
        }
        switch (ordinal) {
            case 62:
                zzap zzb13 = zzgVar.zzb((zzap) a.a(zzbl.zzak, 1, list, 0));
                if (zzb13 instanceof zzau) {
                    s5 = ProtectedSandApp.s("⌢");
                } else if (zzb13 instanceof zzaf) {
                    s5 = ProtectedSandApp.s("⌣");
                } else if (zzb13 instanceof zzah) {
                    s5 = ProtectedSandApp.s("⌤");
                } else if (zzb13 instanceof zzat) {
                    s5 = ProtectedSandApp.s("⌥");
                } else if (zzb13 instanceof zzao) {
                    s5 = ProtectedSandApp.s("⌦");
                } else {
                    if ((zzb13 instanceof zzaq) || (zzb13 instanceof zzag)) {
                        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⌨"), zzb13));
                    }
                    s5 = ProtectedSandApp.s("⌧");
                }
                return new zzat(s5);
            case 63:
                zzh.zzh(zzbl.zzal.name(), 0, list);
                return zzap.zzf;
            case 64:
                zzh.zzi(zzbl.zzam.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    zzap zzb14 = zzgVar.zzb((zzap) it2.next());
                    if (!(zzb14 instanceof zzat)) {
                        throw new IllegalArgumentException(String.format(ProtectedSandApp.s("⌡"), zzb14.getClass().getCanonicalName()));
                    }
                    zzgVar.zze(zzb14.zzi(), zzap.zzf);
                }
                return zzap.zzf;
            default:
                return super.zzb(str);
        }
    }
}
