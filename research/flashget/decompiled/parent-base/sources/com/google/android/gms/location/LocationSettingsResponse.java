package com.google.android.gms.location;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.api.Response;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public class LocationSettingsResponse extends Response<LocationSettingsResult> {
    public LocationSettingsResponse() {
    }

    @q0
    public LocationSettingsStates getLocationSettingsStates() {
        return getResult().getLocationSettingsStates();
    }

    public LocationSettingsResponse(@o0 LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }
}
