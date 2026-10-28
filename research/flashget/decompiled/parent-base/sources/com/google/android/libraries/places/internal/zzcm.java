package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzcm extends zzdf {
    zzcm(FetchPhotoRequest fetchPhotoRequest, String str, boolean z4, zzez zzezVar) {
        super(fetchPhotoRequest, null, str, false, zzezVar);
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    protected final String zze() {
        return ProtectedSandApp.s("\ue854");
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    public final Map zzf() {
        FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) zzb();
        PhotoMetadata photoMetadata = fetchPhotoRequest.getPhotoMetadata();
        HashMap hashMap = new HashMap();
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue855"), fetchPhotoRequest.getMaxHeight(), null);
        zzdf.zzg(hashMap, ProtectedSandApp.s("\ue856"), fetchPhotoRequest.getMaxWidth(), null);
        hashMap.put(ProtectedSandApp.s("\ue857"), photoMetadata.zza());
        return hashMap;
    }
}
