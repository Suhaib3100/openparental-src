package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.TypeFilter;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzdz {
    private static final zzhv zza;

    static {
        zzhu zzhuVar = new zzhu();
        zzhuVar.zza(TypeFilter.ADDRESS, ProtectedSandApp.s("\ue93f"));
        zzhuVar.zza(TypeFilter.CITIES, ProtectedSandApp.s("\ue940"));
        zzhuVar.zza(TypeFilter.ESTABLISHMENT, ProtectedSandApp.s("\ue941"));
        zzhuVar.zza(TypeFilter.GEOCODE, ProtectedSandApp.s("\ue942"));
        zzhuVar.zza(TypeFilter.REGIONS, ProtectedSandApp.s("\ue943"));
        zza = zzhuVar.zzb();
    }

    public static String zza(TypeFilter typeFilter) {
        String str = (String) zza.get(typeFilter);
        return str == null ? "" : str;
    }
}
