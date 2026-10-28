package com.google.android.gms.measurement.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.measurement.internal.zzje;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzah {
    private final EnumMap<zzje.zza, zzak> zza;

    zzah() {
        this.zza = new EnumMap<>(zzje.zza.class);
    }

    public final String toString() {
        char c5;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\udb86"));
        for (zzje.zza zzaVar : zzje.zza.values()) {
            zzak zzakVar = this.zza.get(zzaVar);
            if (zzakVar == null) {
                zzakVar = zzak.zza;
            }
            c5 = zzakVar.zzl;
            sb.append(c5);
        }
        return sb.toString();
    }

    public final zzak zza(zzje.zza zzaVar) {
        zzak zzakVar = this.zza.get(zzaVar);
        return zzakVar == null ? zzak.zza : zzakVar;
    }

    private zzah(EnumMap<zzje.zza, zzak> enumMap) {
        EnumMap<zzje.zza, zzak> enumMap2 = new EnumMap<>((Class<zzje.zza>) zzje.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static zzah zza(String str) {
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        if (str.length() >= zzje.zza.values().length) {
            int i4 = 0;
            if (str.charAt(0) == '1') {
                zzje.zza[] values = zzje.zza.values();
                int length = values.length;
                int i5 = 1;
                while (i4 < length) {
                    enumMap.put((EnumMap) values[i4], (zzje.zza) zzak.zza(str.charAt(i5)));
                    i4++;
                    i5++;
                }
                return new zzah(enumMap);
            }
        }
        return new zzah();
    }

    public final void zza(zzje.zza zzaVar, int i4) {
        zzak zzakVar = zzak.zza;
        if (i4 != -30) {
            if (i4 != -20) {
                if (i4 == -10) {
                    zzakVar = zzak.zzd;
                } else if (i4 != 0) {
                    if (i4 == 30) {
                        zzakVar = zzak.zze;
                    }
                }
            }
            zzakVar = zzak.zzf;
        } else {
            zzakVar = zzak.zzg;
        }
        this.zza.put((EnumMap<zzje.zza, zzak>) zzaVar, (zzje.zza) zzakVar);
    }

    public final void zza(zzje.zza zzaVar, zzak zzakVar) {
        this.zza.put((EnumMap<zzje.zza, zzak>) zzaVar, (zzje.zza) zzakVar);
    }
}
