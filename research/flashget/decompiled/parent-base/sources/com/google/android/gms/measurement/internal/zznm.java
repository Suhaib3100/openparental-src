package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzje;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zznm {
    private static final String[] zza = {ProtectedSandApp.s("\ue20e"), ProtectedSandApp.s("\ue20f"), ProtectedSandApp.s("\ue210"), ProtectedSandApp.s("\ue211"), ProtectedSandApp.s("\ue20c"), ProtectedSandApp.s("\ue20d")};
    private final Map<String, String> zzb;

    private zznm(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.zzb = hashMap;
        hashMap.putAll(map);
    }

    private static int zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    private static String zzb(SharedPreferences sharedPreferences, String str) {
        String s4 = ProtectedSandApp.s("\ue213");
        try {
            return sharedPreferences.getString(str, s4);
        } catch (ClassCastException unused) {
            return s4;
        }
    }

    private final int zzd() {
        try {
            String str = this.zzb.get(ProtectedSandApp.s("\ue20d"));
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final int zze() {
        try {
            String str = this.zzb.get(ProtectedSandApp.s("\ue211"));
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zznm) {
            return zzc().equalsIgnoreCase(((zznm) obj).zzc());
        }
        return false;
    }

    public final int hashCode() {
        return zzc().hashCode();
    }

    public final String toString() {
        return zzc();
    }

    final String zzc() {
        StringBuilder sb = new StringBuilder();
        for (String str : zza) {
            if (this.zzb.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(ProtectedSandApp.s("\ue21f"));
                }
                sb.append(str);
                sb.append(ProtectedSandApp.s("\ue220"));
                sb.append(this.zzb.get(str));
            }
        }
        return sb.toString();
    }

    public final Bundle zza() {
        String str = this.zzb.get(ProtectedSandApp.s("\ue20e"));
        String s4 = ProtectedSandApp.s("\ue21a");
        if (!s4.equals(str) || !s4.equals(this.zzb.get(ProtectedSandApp.s("\ue20f"))) || !s4.equals(this.zzb.get(ProtectedSandApp.s("\ue210")))) {
            return Bundle.EMPTY;
        }
        int zze = zze();
        if (zze < 0) {
            return Bundle.EMPTY;
        }
        String str2 = this.zzb.get(ProtectedSandApp.s("\ue20c"));
        if (TextUtils.isEmpty(str2)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        int length = str2.length();
        String s5 = ProtectedSandApp.s("\ue21b");
        String s6 = ProtectedSandApp.s("\ue21c");
        if (length > 0) {
            bundle.putString(zzje.zza.zza.zze, str2.charAt(0) == '1' ? s6 : s5);
        }
        if (str2.length() > 3) {
            bundle.putString(zzje.zza.zzd.zze, (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? s6 : s5);
        }
        if (str2.length() > 6 && zze >= 4) {
            String str3 = zzje.zza.zzc.zze;
            if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                s5 = s6;
            }
            bundle.putString(str3, s5);
        }
        return bundle;
    }

    public final String zzb() {
        String s4 = ProtectedSandApp.s("\ue21a");
        StringBuilder sb = new StringBuilder(s4);
        int zzd = zzd();
        String s5 = ProtectedSandApp.s("\ue219");
        if (zzd < 0 || zzd > 4095) {
            sb.append(ProtectedSandApp.s("\ue21d"));
        } else {
            sb.append(s5.charAt((zzd >> 6) & 63));
            sb.append(s5.charAt(zzd & 63));
        }
        int zze = zze();
        if (zze < 0 || zze > 63) {
            sb.append(ProtectedSandApp.s("\ue21e"));
        } else {
            sb.append(s5.charAt(zze));
        }
        Preconditions.checkArgument(true);
        int i4 = s4.equals(this.zzb.get(ProtectedSandApp.s("\ue20f"))) ? 2 : 0;
        int i5 = i4 | 4;
        if (s4.equals(this.zzb.get(ProtectedSandApp.s("\ue210")))) {
            i5 = i4 | 12;
        }
        sb.append(s5.charAt(i5));
        return sb.toString();
    }

    public static zznm zza(SharedPreferences sharedPreferences) {
        HashMap hashMap = new HashMap();
        String zzb = zzb(sharedPreferences, ProtectedSandApp.s("\ue212"));
        String s4 = ProtectedSandApp.s("\ue213");
        if (!s4.equals(zzb) && zzb.length() > 754) {
            hashMap.put(ProtectedSandApp.s("\ue20e"), String.valueOf(zzb.charAt(754)));
        }
        int zza2 = zza(sharedPreferences, ProtectedSandApp.s("\ue214"));
        if (zza2 != -1) {
            hashMap.put(ProtectedSandApp.s("\ue20f"), String.valueOf(zza2));
        }
        int zza3 = zza(sharedPreferences, ProtectedSandApp.s("\ue215"));
        if (zza3 != -1) {
            hashMap.put(ProtectedSandApp.s("\ue210"), String.valueOf(zza3));
        }
        int zza4 = zza(sharedPreferences, ProtectedSandApp.s("\ue216"));
        if (zza4 != -1) {
            hashMap.put(ProtectedSandApp.s("\ue211"), String.valueOf(zza4));
        }
        String zzb2 = zzb(sharedPreferences, ProtectedSandApp.s("\ue217"));
        if (!s4.equals(zzb2)) {
            hashMap.put(ProtectedSandApp.s("\ue20c"), zzb2);
        }
        int zza5 = zza(sharedPreferences, ProtectedSandApp.s("\ue218"));
        if (zza5 != -1) {
            hashMap.put(ProtectedSandApp.s("\ue20d"), String.valueOf(zza5));
        }
        return new zznm(hashMap);
    }

    public static String zza(String str, boolean z4) {
        String s4;
        if (!z4 || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i4 = 1;
        while (true) {
            s4 = ProtectedSandApp.s("\ue219");
            if (i4 >= 64) {
                i4 = 0;
                break;
            }
            if (charArray[4] == s4.charAt(i4)) {
                break;
            }
            i4++;
        }
        charArray[4] = s4.charAt(1 | i4);
        return String.valueOf(charArray);
    }
}
