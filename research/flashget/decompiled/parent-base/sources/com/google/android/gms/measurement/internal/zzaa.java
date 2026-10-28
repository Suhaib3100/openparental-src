package com.google.android.gms.measurement.internal;

import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.firebase.remoteconfig.p;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
abstract class zzaa {
    String zza;
    int zzb;
    Boolean zzc;
    Boolean zzd;
    Long zze;
    Long zzf;

    zzaa(String str, int i4) {
        this.zza = str;
        this.zzb = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0080, code lost:
    
        if (r3 != null) goto L36;
     */
    @androidx.annotation.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean zza(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzfo.zzd r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzfo$zzd, double):java.lang.Boolean");
    }

    abstract int zza();

    abstract boolean zzb();

    abstract boolean zzc();

    @m1
    static Boolean zza(String str, zzfo.zzf zzfVar, zzgo zzgoVar) {
        String zze;
        List<String> list;
        Preconditions.checkNotNull(zzfVar);
        if (str == null || !zzfVar.zzj() || zzfVar.zzb() == zzfo.zzf.zzb.zza) {
            return null;
        }
        zzfo.zzf.zzb zzb = zzfVar.zzb();
        zzfo.zzf.zzb zzbVar = zzfo.zzf.zzb.zzg;
        if (zzb == zzbVar) {
            if (zzfVar.zza() == 0) {
                return null;
            }
        } else if (!zzfVar.zzi()) {
            return null;
        }
        zzfo.zzf.zzb zzb2 = zzfVar.zzb();
        boolean zzg = zzfVar.zzg();
        if (!zzg && zzb2 != zzfo.zzf.zzb.zzb && zzb2 != zzbVar) {
            zze = zzfVar.zze().toUpperCase(Locale.ENGLISH);
        } else {
            zze = zzfVar.zze();
        }
        String str2 = zze;
        if (zzfVar.zza() == 0) {
            list = null;
        } else {
            List<String> zzf = zzfVar.zzf();
            if (!zzg) {
                ArrayList arrayList = new ArrayList(zzf.size());
                Iterator<String> it = zzf.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(Locale.ENGLISH));
                }
                zzf = Collections.unmodifiableList(arrayList);
            }
            list = zzf;
        }
        return zza(str, zzb2, zzg, str2, list, zzb2 == zzfo.zzf.zzb.zzb ? str2 : null, zzgoVar);
    }

    private static Boolean zza(String str, zzfo.zzf.zzb zzbVar, boolean z4, String str2, List<String> list, String str3, zzgo zzgoVar) {
        if (str == null) {
            return null;
        }
        if (zzbVar == zzfo.zzf.zzb.zzg) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z4 && zzbVar != zzfo.zzf.zzb.zzb) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (zzw.zza[zzbVar.ordinal()]) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (zzgoVar != null) {
                            zzgoVar.zzu().zza(ProtectedSandApp.s("\udb6e"), str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    static Boolean zza(double d5, zzfo.zzd zzdVar) {
        try {
            return zza(new BigDecimal(d5), zzdVar, Math.ulp(d5));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean zza(long j4, zzfo.zzd zzdVar) {
        try {
            return zza(new BigDecimal(j4), zzdVar, p.f60679p);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean zza(String str, zzfo.zzd zzdVar) {
        if (!zzoo.zzb(str)) {
            return null;
        }
        try {
            return zza(new BigDecimal(str), zzdVar, p.f60679p);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @m1
    static Boolean zza(Boolean bool, boolean z4) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z4);
    }
}
