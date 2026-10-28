package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzhb {
    public static final zzhb zza = new zzhb(null, null, 100);
    private final EnumMap zzb;
    private final int zzc;

    public zzhb(Boolean bool, Boolean bool2, int i5) {
        EnumMap enumMap = new EnumMap(zzha.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap) zzha.zza, (zzha) bool);
        enumMap.put((EnumMap) zzha.zzb, (zzha) bool2);
        this.zzc = i5;
    }

    public static zzhb zzb(Bundle bundle, int i5) {
        if (bundle == null) {
            return new zzhb(null, null, i5);
        }
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            enumMap.put((EnumMap) zzhaVar, (zzha) zzp(bundle.getString(zzhaVar.zzd)));
        }
        return new zzhb(enumMap, i5);
    }

    public static zzhb zzc(String str, int i5) {
        EnumMap enumMap = new EnumMap(zzha.class);
        if (str != null) {
            int i6 = 0;
            while (true) {
                zzha[] zzhaVarArr = zzha.zzc;
                int length = zzhaVarArr.length;
                if (i6 >= 2) {
                    break;
                }
                zzha zzhaVar = zzhaVarArr[i6];
                int i7 = i6 + 2;
                if (i7 < str.length()) {
                    char charAt = str.charAt(i7);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) zzhaVar, (zzha) bool);
                }
                i6++;
            }
        }
        return new zzhb(enumMap, i5);
    }

    public static String zzh(Bundle bundle) {
        String string;
        for (zzha zzhaVar : zzha.values()) {
            if (bundle.containsKey(zzhaVar.zzd) && (string = bundle.getString(zzhaVar.zzd)) != null && zzp(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean zzk(int i5, int i6) {
        return i5 <= i6;
    }

    static final int zzo(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean zzp(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals(ProtectedSandApp.s("\u0ff0"))) {
            return Boolean.TRUE;
        }
        if (str.equals(ProtectedSandApp.s("\u0ff1"))) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhb)) {
            return false;
        }
        zzhb zzhbVar = (zzhb) obj;
        for (zzha zzhaVar : zzha.values()) {
            if (zzo((Boolean) this.zzb.get(zzhaVar)) != zzo((Boolean) zzhbVar.zzb.get(zzhaVar))) {
                return false;
            }
        }
        return this.zzc == zzhbVar.zzc;
    }

    public final int hashCode() {
        int i5 = this.zzc * 17;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            i5 = (i5 * 31) + zzo((Boolean) it.next());
        }
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0ff2"));
        sb.append(this.zzc);
        for (zzha zzhaVar : zzha.values()) {
            sb.append(ProtectedSandApp.s("\u0ff3"));
            sb.append(zzhaVar.name());
            sb.append(ProtectedSandApp.s("\u0ff4"));
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            if (bool == null) {
                sb.append(ProtectedSandApp.s("\u0ff5"));
            } else {
                sb.append(true != bool.booleanValue() ? ProtectedSandApp.s("\u0ff6") : ProtectedSandApp.s("\u0ff7"));
            }
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zzc;
    }

    public final zzhb zzd(zzhb zzhbVar) {
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            Boolean bool2 = (Boolean) zzhbVar.zzb.get(zzhaVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) zzhaVar, (zzha) bool);
        }
        return new zzhb(enumMap, 100);
    }

    public final zzhb zze(zzhb zzhbVar) {
        EnumMap enumMap = new EnumMap(zzha.class);
        for (zzha zzhaVar : zzha.values()) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            if (bool == null) {
                bool = (Boolean) zzhbVar.zzb.get(zzhaVar);
            }
            enumMap.put((EnumMap) zzhaVar, (zzha) bool);
        }
        return new zzhb(enumMap, this.zzc);
    }

    public final Boolean zzf() {
        return (Boolean) this.zzb.get(zzha.zza);
    }

    public final Boolean zzg() {
        return (Boolean) this.zzb.get(zzha.zzb);
    }

    public final String zzi() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0ff8"));
        zzha[] zzhaVarArr = zzha.zzc;
        int length = zzhaVarArr.length;
        for (int i5 = 0; i5 < 2; i5++) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVarArr[i5]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final boolean zzj(zzha zzhaVar) {
        Boolean bool = (Boolean) this.zzb.get(zzhaVar);
        return bool == null || bool.booleanValue();
    }

    public final boolean zzl() {
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzm(zzhb zzhbVar) {
        return zzn(zzhbVar, (zzha[]) this.zzb.keySet().toArray(new zzha[0]));
    }

    public final boolean zzn(zzhb zzhbVar, zzha... zzhaVarArr) {
        for (zzha zzhaVar : zzhaVarArr) {
            Boolean bool = (Boolean) this.zzb.get(zzhaVar);
            Boolean bool2 = (Boolean) zzhbVar.zzb.get(zzhaVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public zzhb(EnumMap enumMap, int i5) {
        EnumMap enumMap2 = new EnumMap(zzha.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i5;
    }
}
