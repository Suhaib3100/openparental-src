package com.google.android.libraries.places.internal;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.RectangularBounds;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzdx {
    private static final zzhv zza;

    static {
        zzhu zzhuVar = new zzhu();
        zzhuVar.zza(zzbf.zza, ProtectedSandApp.s("\ue91a"));
        zzhuVar.zza(zzbf.zzb, ProtectedSandApp.s("\ue91b"));
        zzhuVar.zza(zzbf.zzc, ProtectedSandApp.s("\ue91c"));
        zzhuVar.zza(zzbf.zzd, ProtectedSandApp.s("\ue91d"));
        zza = zzhuVar.zzb();
    }

    @q0
    public static Integer zza(@q0 Location location) {
        if (location == null) {
            return null;
        }
        float accuracy = location.getAccuracy();
        if (!location.hasAccuracy() || accuracy <= 0.0f) {
            return null;
        }
        return Integer.valueOf(Math.round(accuracy * 100.0f));
    }

    @q0
    public static String zzb(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2)) {
                String valueOf = String.valueOf(str2.toLowerCase(Locale.US));
                int length = valueOf.length();
                String s4 = ProtectedSandApp.s("\ue91e");
                str = length != 0 ? s4.concat(valueOf) : new String(s4);
            }
            if (str != null) {
                if (sb.length() != 0) {
                    sb.append('|');
                }
                sb.append(str);
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    @q0
    public static String zzc(@q0 Location location) {
        if (location == null) {
            return null;
        }
        return zzh(location.getLatitude(), location.getLongitude());
    }

    @q0
    public static String zzd(@q0 LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return zzh(latLng.latitude, latLng.longitude);
    }

    @q0
    public static String zze(@q0 LocationBias locationBias) {
        if (locationBias == null) {
            return null;
        }
        if (locationBias instanceof RectangularBounds) {
            return zzi((RectangularBounds) locationBias);
        }
        throw new AssertionError(ProtectedSandApp.s("\ue91f"));
    }

    @q0
    public static String zzf(@q0 LocationRestriction locationRestriction) {
        if (locationRestriction == null) {
            return null;
        }
        if (locationRestriction instanceof RectangularBounds) {
            return zzi((RectangularBounds) locationRestriction);
        }
        throw new AssertionError(ProtectedSandApp.s("\ue920"));
    }

    public static String zzg(zzhs zzhsVar, int i4) {
        StringBuilder sb = new StringBuilder();
        int size = zzhsVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            zzbg zzbgVar = (zzbg) zzhsVar.get(i5);
            String s4 = sb.length() > 0 ? ProtectedSandApp.s("\ue921") : "";
            zzhu zzhuVar = new zzhu();
            zzhuVar.zza(ProtectedSandApp.s("\ue922"), zzbgVar.zzd());
            zzhuVar.zza(ProtectedSandApp.s("\ue923"), Integer.valueOf(zzbgVar.zzb()));
            zzhuVar.zza(ProtectedSandApp.s("\ue924"), zza.get(zzbgVar.zzc()));
            zzhuVar.zza(ProtectedSandApp.s("\ue925"), Boolean.valueOf(zzbgVar.zze()));
            zzhuVar.zza(ProtectedSandApp.s("\ue926"), Integer.valueOf(zzbgVar.zza()));
            zzhv zzb = zzhuVar.zzb();
            zzgv zzc = zzgv.zzc(ProtectedSandApp.s("\ue927"));
            Iterator<E> it = zzb.entrySet().iterator();
            StringBuilder sb2 = new StringBuilder();
            try {
                zzgu.zza(sb2, it, zzc, ProtectedSandApp.s("\ue928"));
                String sb3 = sb2.toString();
                String concat = sb3.length() != 0 ? s4.concat(sb3) : new String(s4);
                if (concat.length() + sb.length() > 4000) {
                    break;
                }
                sb.append(concat);
            } catch (IOException e4) {
                throw new AssertionError(e4);
            }
        }
        return sb.toString();
    }

    private static String zzh(double d5, double d6) {
        return String.format(Locale.US, ProtectedSandApp.s("\ue929"), Double.valueOf(d5), Double.valueOf(d6));
    }

    private static String zzi(RectangularBounds rectangularBounds) {
        LatLng southwest = rectangularBounds.getSouthwest();
        double d5 = southwest.latitude;
        double d6 = southwest.longitude;
        LatLng northeast = rectangularBounds.getNortheast();
        double d7 = northeast.latitude;
        double d10 = northeast.longitude;
        return String.format(Locale.US, ProtectedSandApp.s("\ue92a"), Double.valueOf(d5), Double.valueOf(d6), Double.valueOf(d7), Double.valueOf(d10));
    }
}
