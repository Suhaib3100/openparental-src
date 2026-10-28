package com.google.android.libraries.places.api.model;

import androidx.annotation.RecentlyNonNull;
import b9.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class RectangularBounds implements LocationBias, LocationRestriction {
    @RecentlyNonNull
    public static RectangularBounds newInstance(@RecentlyNonNull LatLng latLng, @RecentlyNonNull LatLng latLng2) {
        return newInstance(new LatLngBounds(latLng, latLng2));
    }

    @RecentlyNonNull
    public abstract LatLng getNortheast();

    @RecentlyNonNull
    public abstract LatLng getSouthwest();

    @RecentlyNonNull
    public static RectangularBounds newInstance(@RecentlyNonNull LatLngBounds latLngBounds) {
        zzv zzvVar = new zzv();
        zzvVar.zzb(latLngBounds.southwest);
        zzvVar.zza(latLngBounds.northeast);
        return zzvVar.zzc();
    }
}
