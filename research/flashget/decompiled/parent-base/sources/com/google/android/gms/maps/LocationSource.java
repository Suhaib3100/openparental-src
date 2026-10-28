package com.google.android.gms.maps;

import android.location.Location;
import androidx.annotation.o0;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public interface LocationSource {

    /* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
    public interface OnLocationChangedListener {
        void onLocationChanged(@o0 Location location);
    }

    void activate(@o0 OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
