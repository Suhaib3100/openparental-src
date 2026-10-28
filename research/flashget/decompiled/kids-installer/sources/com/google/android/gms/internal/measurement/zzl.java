package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzl extends zzam {
    private final zzab zzb;

    public zzl(zzab zzabVar) {
        this.zzb = zzabVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzam, com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        char c6;
        int hashCode = str.hashCode();
        String s5 = ProtectedSandApp.s("⎓");
        String s6 = ProtectedSandApp.s("⎔");
        String s7 = ProtectedSandApp.s("⎕");
        String s8 = ProtectedSandApp.s("⎖");
        String s9 = ProtectedSandApp.s("⎗");
        String s10 = ProtectedSandApp.s("⎘");
        switch (hashCode) {
            case 21624207:
                if (str.equals(s10)) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case 45521504:
                if (str.equals(s9)) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case 146575578:
                if (str.equals(s8)) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case 700587132:
                if (str.equals(s7)) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case 920706790:
                if (str.equals(s6)) {
                    c6 = 5;
                    break;
                }
                c6 = 65535;
                break;
            case 1570616835:
                if (str.equals(s5)) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        if (c6 == 0) {
            zzh.zzh(s10, 0, list);
            return new zzat(this.zzb.zzb().zzd());
        }
        if (c6 == 1) {
            zzh.zzh(s8, 1, list);
            return zzi.zzb(this.zzb.zzb().zzc(zzgVar.zzb((zzap) list.get(0)).zzi()));
        }
        if (c6 == 2) {
            zzh.zzh(s7, 0, list);
            Map zze = this.zzb.zzb().zze();
            zzam zzamVar = new zzam();
            for (String str2 : zze.keySet()) {
                zzamVar.zzr(str2, zzi.zzb(zze.get(str2)));
            }
            return zzamVar;
        }
        if (c6 == 3) {
            zzh.zzh(s9, 0, list);
            return new zzah(Double.valueOf(this.zzb.zzb().zza()));
        }
        if (c6 != 4) {
            if (c6 != 5) {
                return super.zzbU(str, zzgVar, list);
            }
            zzh.zzh(s6, 2, list);
            String zzi = zzgVar.zzb((zzap) list.get(0)).zzi();
            zzap zzb = zzgVar.zzb((zzap) list.get(1));
            this.zzb.zzb().zzg(zzi, zzh.zzf(zzb));
            return zzb;
        }
        zzh.zzh(s5, 1, list);
        zzap zzb2 = zzgVar.zzb((zzap) list.get(0));
        if (zzap.zzf.equals(zzb2) || zzap.zzg.equals(zzb2)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⎙"));
        }
        this.zzb.zzb().zzf(zzb2.zzi());
        return new zzat(zzb2.zzi());
    }
}
