package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzcw extends zzdf {
    zzcw(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, Locale locale, String str, boolean z4, zzez zzezVar) {
        super(findAutocompletePredictionsRequest, locale, str, false, zzezVar);
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    protected final String zze() {
        return ProtectedSandApp.s("\ue85d");
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    public final Map zzf() {
        HashMap hashMap = new HashMap();
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) zzb();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        String query = findAutocompletePredictionsRequest.getQuery();
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue861"), query == null ? null : query.replaceFirst(ProtectedSandApp.s("\ue85e"), "").replaceFirst(ProtectedSandApp.s("\ue85f"), ProtectedSandApp.s("\ue860")), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue862"), typeFilter != null ? zzdz.zza(typeFilter) : null, null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue863"), findAutocompletePredictionsRequest.getSessionToken(), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue864"), zzdx.zzd(findAutocompletePredictionsRequest.getOrigin()), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue865"), zzdx.zze(findAutocompletePredictionsRequest.getLocationBias()), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue866"), zzdx.zzf(findAutocompletePredictionsRequest.getLocationRestriction()), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue867"), zzdx.zzb(findAutocompletePredictionsRequest.getCountries()), null);
        return hashMap;
    }
}
