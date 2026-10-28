package com.google.android.libraries.places.api.net;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzp extends FindCurrentPlaceResponse {
    private final List zza;

    zzp(List list) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue6a2"));
        }
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceResponse) {
            return this.zza.equals(((FindCurrentPlaceResponse) obj).getPlaceLikelihoods());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceResponse
    public final List<PlaceLikelihood> getPlaceLikelihoods() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return k0.a(new StringBuilder(obj.length() + 43), ProtectedSandApp.s("\ue6a3"), obj, ProtectedSandApp.s("\ue6a4"));
    }
}
