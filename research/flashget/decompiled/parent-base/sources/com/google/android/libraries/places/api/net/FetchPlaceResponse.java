package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import b9.c;
import com.google.android.libraries.places.api.model.Place;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c
/* loaded from: classes5.dex */
public abstract class FetchPlaceResponse {
    @RecentlyNonNull
    public static FetchPlaceResponse newInstance(@RecentlyNonNull Place place) {
        return new zzh(place);
    }

    @RecentlyNonNull
    public abstract Place getPlace();
}
