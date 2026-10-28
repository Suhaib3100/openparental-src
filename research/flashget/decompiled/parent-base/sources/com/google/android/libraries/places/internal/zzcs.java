package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzcs extends zzdf {
    zzcs(FetchPlaceRequest fetchPlaceRequest, Locale locale, String str, boolean z4, zzez zzezVar) {
        super(fetchPlaceRequest, locale, str, false, zzezVar);
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    protected final String zze() {
        return ProtectedSandApp.s("\ue859");
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    public final Map zzf() {
        FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) zzb();
        HashMap hashMap = new HashMap();
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue85a"), fetchPlaceRequest.getPlaceId(), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue85b"), fetchPlaceRequest.getSessionToken(), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue85c"), zzdy.zza(fetchPlaceRequest.getPlaceFields()), null);
        return hashMap;
    }
}
