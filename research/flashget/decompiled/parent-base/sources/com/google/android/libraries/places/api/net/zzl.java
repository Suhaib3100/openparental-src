package com.google.android.libraries.places.api.net;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzl extends FindAutocompletePredictionsResponse {
    private final List zza;

    zzl(List list) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue69a"));
        }
        this.zza = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindAutocompletePredictionsResponse) {
            return this.zza.equals(((FindAutocompletePredictionsResponse) obj).getAutocompletePredictions());
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse
    public final List<AutocompletePrediction> getAutocompletePredictions() {
        return this.zza;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return k0.a(new StringBuilder(obj.length() + 61), ProtectedSandApp.s("\ue69b"), obj, ProtectedSandApp.s("\ue69c"));
    }
}
