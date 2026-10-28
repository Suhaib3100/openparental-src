package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzn extends zzap {
    private final zzac zza;

    public zzn(zzac zzacVar) {
        this.zza = zzacVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap, com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        String s4 = ProtectedSandApp.s("햊");
        String s5 = ProtectedSandApp.s("햋");
        String s6 = ProtectedSandApp.s("햌");
        String s7 = ProtectedSandApp.s("햍");
        String s10 = ProtectedSandApp.s("햎");
        String s11 = ProtectedSandApp.s("햏");
        str.getClass();
        char c5 = 65535;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals(s11)) {
                    c5 = 0;
                    break;
                }
                break;
            case 45521504:
                if (str.equals(s10)) {
                    c5 = 1;
                    break;
                }
                break;
            case 146575578:
                if (str.equals(s7)) {
                    c5 = 2;
                    break;
                }
                break;
            case 700587132:
                if (str.equals(s6)) {
                    c5 = 3;
                    break;
                }
                break;
            case 920706790:
                if (str.equals(s5)) {
                    c5 = 4;
                    break;
                }
                break;
            case 1570616835:
                if (str.equals(s4)) {
                    c5 = 5;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                zzg.zza(s11, 0, list);
                return new zzas(this.zza.zzb().zzb());
            case 1:
                zzg.zza(s10, 0, list);
                return new zzai(Double.valueOf(this.zza.zzb().zza()));
            case 2:
                zzg.zza(s7, 1, list);
                return zzj.zza(this.zza.zzb().zza(zzhVar.zza(list.get(0)).zzf()));
            case 3:
                zzg.zza(s6, 0, list);
                Map<String, Object> zzc = this.zza.zzb().zzc();
                zzap zzapVar = new zzap();
                for (String str2 : zzc.keySet()) {
                    zzapVar.zza(str2, zzj.zza(zzc.get(str2)));
                }
                return zzapVar;
            case 4:
                zzg.zza(s5, 2, list);
                String zzf = zzhVar.zza(list.get(0)).zzf();
                zzaq zza = zzhVar.zza(list.get(1));
                this.zza.zzb().zza(zzf, zzg.zza(zza));
                return zza;
            case 5:
                zzg.zza(s4, 1, list);
                zzaq zza2 = zzhVar.zza(list.get(0));
                if (zzaq.zzc.equals(zza2) || zzaq.zzd.equals(zza2)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("햐"));
                }
                this.zza.zzb().zzb(zza2.zzf());
                return new zzas(zza2.zzf());
            default:
                return super.zza(str, zzhVar, list);
        }
    }
}
