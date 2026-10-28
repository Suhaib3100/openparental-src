package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class zzcb {
    private zzcb() {
    }

    @q0
    public static Parcelable zza(@q0 Bundle bundle, String str) {
        ClassLoader zzd = zzd();
        bundle.setClassLoader(zzd);
        Bundle bundle2 = bundle.getBundle(ProtectedSandApp.s("\uda8c"));
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(zzd);
        return bundle2.getParcelable(str);
    }

    public static void zzb(@q0 Bundle bundle, @q0 Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        String s4 = ProtectedSandApp.s("\uda8d");
        Parcelable zza = zza(bundle, s4);
        if (zza != null) {
            zzc(bundle2, s4, zza);
        }
        String s5 = ProtectedSandApp.s("\uda8e");
        Parcelable zza2 = zza(bundle, s5);
        if (zza2 != null) {
            zzc(bundle2, s5, zza2);
        }
        String s6 = ProtectedSandApp.s("\uda8f");
        Parcelable zza3 = zza(bundle, s6);
        if (zza3 != null) {
            zzc(bundle2, s6, zza3);
        }
        String s7 = ProtectedSandApp.s("\uda90");
        if (bundle.containsKey(s7)) {
            bundle2.putString(s7, bundle.getString(s7));
        }
        String s10 = ProtectedSandApp.s("\uda91");
        if (bundle.containsKey(s10)) {
            bundle2.putBoolean(s10, bundle.getBoolean(s10, false));
        }
    }

    public static void zzc(Bundle bundle, String str, @q0 Parcelable parcelable) {
        ClassLoader zzd = zzd();
        bundle.setClassLoader(zzd);
        String s4 = ProtectedSandApp.s("\uda8c");
        Bundle bundle2 = bundle.getBundle(s4);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(zzd);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle(s4, bundle2);
    }

    private static ClassLoader zzd() {
        return (ClassLoader) Preconditions.checkNotNull(zzcb.class.getClassLoader());
    }
}
