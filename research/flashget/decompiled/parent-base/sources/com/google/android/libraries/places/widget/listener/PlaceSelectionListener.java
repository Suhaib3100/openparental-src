package com.google.android.libraries.places.widget.listener;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public interface PlaceSelectionListener {
    void onError(@RecentlyNonNull Status status);

    void onPlaceSelected(@RecentlyNonNull Place place);
}
