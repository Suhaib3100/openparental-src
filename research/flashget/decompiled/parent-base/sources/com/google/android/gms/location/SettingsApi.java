package com.google.android.gms.location;

import androidx.annotation.o0;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
@Deprecated
/* loaded from: classes5.dex */
public interface SettingsApi {
    @o0
    PendingResult<LocationSettingsResult> checkLocationSettings(@o0 GoogleApiClient googleApiClient, @o0 LocationSettingsRequest locationSettingsRequest);
}
