package com.google.android.libraries.places.internal;

import android.location.Location;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzda extends zzdf {
    private final Location zza;
    private final zzhs zzb;

    zzda(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zzhs zzhsVar, Locale locale, String str, boolean z4, zzez zzezVar) {
        super(findCurrentPlaceRequest, locale, str, false, zzezVar);
        this.zza = location;
        this.zzb = zzhsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    protected final String zze() {
        return ProtectedSandApp.s("\ue869");
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    public final Map zzf() {
        FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) zzb();
        HashMap hashMap = new HashMap();
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue86a"), zzdx.zzc(this.zza), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue86b"), zzdx.zzg(this.zzb, 4000), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue86c"), zzdx.zza(this.zza), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue86d"), Long.valueOf(this.zza.getTime()), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue86e"), zzdy.zza(findCurrentPlaceRequest.getPlaceFields()), null);
        return hashMap;
    }
}
