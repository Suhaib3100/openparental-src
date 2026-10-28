package com.google.android.libraries.places.api.net;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.Place;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzh extends FetchPlaceResponse {
    private final Place zza;

    zzh(Place place) {
        if (place == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue68b"));
        }
        this.zza = place;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPlaceResponse) {
            return this.zza.equals(((FetchPlaceResponse) obj).getPlace());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceResponse
    public final Place getPlace() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return k0.a(new StringBuilder(obj.length() + 26), ProtectedSandApp.s("\ue68c"), obj, ProtectedSandApp.s("\ue68d"));
    }
}
