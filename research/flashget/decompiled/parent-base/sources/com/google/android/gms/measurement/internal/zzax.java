package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.measurement.internal.zzje;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzax {
    private static final zzax zza = new zzax(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzje.zza, zzjh> zzf;

    zzax(Boolean bool, int i4) {
        this((Boolean) null, i4, (Boolean) null, (String) null);
    }

    private final String zzh() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzje.zza zzaVar : zzjg.zzb.zza()) {
            sb.append(ProtectedSandApp.s("\udd59"));
            sb.append(zzje.zza(this.zzf.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzax)) {
            return false;
        }
        zzax zzaxVar = (zzax) obj;
        if (this.zzc.equalsIgnoreCase(zzaxVar.zzc) && Objects.equals(this.zzd, zzaxVar.zzd)) {
            return Objects.equals(this.zze, zzaxVar.zze);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.zzd;
        int i4 = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.zze;
        return ((str == null ? 17 : str.hashCode()) * 137) + (i4 * 29) + this.zzc.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\udd5b"));
        sb.append(zzje.zza(this.zzb));
        for (zzje.zza zzaVar : zzjg.zzb.zza()) {
            sb.append(ProtectedSandApp.s("\udd5c"));
            sb.append(zzaVar.zze);
            sb.append(ProtectedSandApp.s("\udd5d"));
            zzjh zzjhVar = this.zzf.get(zzaVar);
            String s4 = ProtectedSandApp.s("\udd5e");
            if (zzjhVar == null) {
                sb.append(s4);
            } else {
                int i4 = zzba.zza[zzjhVar.ordinal()];
                if (i4 == 1) {
                    sb.append(s4);
                } else if (i4 == 2) {
                    sb.append(ProtectedSandApp.s("\udd61"));
                } else if (i4 == 3) {
                    sb.append(ProtectedSandApp.s("\udd60"));
                } else if (i4 == 4) {
                    sb.append(ProtectedSandApp.s("\udd5f"));
                }
            }
        }
        if (this.zzd != null) {
            sb.append(ProtectedSandApp.s("\udd62"));
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(ProtectedSandApp.s("\udd63"));
            sb.append(this.zze);
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zzje.zza, zzjh> entry : this.zzf.entrySet()) {
            String zzb = zzje.zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString(ProtectedSandApp.s("\udd57"), bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString(ProtectedSandApp.s("\udd58"), str);
        }
        return bundle;
    }

    public final zzjh zzc() {
        zzjh zzjhVar = this.zzf.get(zzje.zza.zzc);
        return zzjhVar == null ? zzjh.zza : zzjhVar;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        Iterator<zzjh> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjh.zza) {
                return true;
            }
        }
        return false;
    }

    zzax(Boolean bool, int i4, Boolean bool2, String str) {
        EnumMap<zzje.zza, zzjh> enumMap = new EnumMap<>((Class<zzje.zza>) zzje.zza.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap<zzje.zza, zzjh>) zzje.zza.zzc, (zzje.zza) zzje.zza(bool));
        this.zzb = i4;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    public static zzax zza(Bundle bundle, int i4) {
        if (bundle == null) {
            return new zzax(null, i4);
        }
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        for (zzje.zza zzaVar : zzjg.zzb.zza()) {
            enumMap.put((EnumMap) zzaVar, (zzje.zza) zzje.zza(bundle.getString(zzaVar.zze)));
        }
        String s4 = ProtectedSandApp.s("\udd57");
        return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, i4, bundle.containsKey(s4) ? Boolean.valueOf(bundle.getString(s4)) : null, bundle.getString(ProtectedSandApp.s("\udd58")));
    }

    private zzax(EnumMap<zzje.zza, zzjh> enumMap, int i4, Boolean bool, String str) {
        EnumMap<zzje.zza, zzjh> enumMap2 = new EnumMap<>((Class<zzje.zza>) zzje.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i4;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    static zzax zza(zzjh zzjhVar, int i4) {
        EnumMap enumMap = new EnumMap(zzje.zza.class);
        enumMap.put((EnumMap) zzje.zza.zzc, (zzje.zza) zzjhVar);
        return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzax zza(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(ProtectedSandApp.s("\udd59"));
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(zzje.zza.class);
            zzje.zza[] zza2 = zzjg.zzb.zza();
            int length = zza2.length;
            int i4 = 1;
            int i5 = 0;
            while (i5 < length) {
                enumMap.put((EnumMap) zza2[i5], (zzje.zza) zzje.zza(split[i4].charAt(0)));
                i5++;
                i4++;
            }
            return new zzax((EnumMap<zzje.zza, zzjh>) enumMap, parseInt, (Boolean) null, (String) null);
        }
        return zza;
    }

    public static Boolean zza(Bundle bundle) {
        zzjh zza2;
        if (bundle == null || (zza2 = zzje.zza(bundle.getString(ProtectedSandApp.s("\udd5a")))) == null) {
            return null;
        }
        int i4 = zzba.zza[zza2.ordinal()];
        if (i4 == 3) {
            return Boolean.FALSE;
        }
        if (i4 != 4) {
            return null;
        }
        return Boolean.TRUE;
    }
}
