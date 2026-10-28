package com.google.android.libraries.places.api.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzv extends zzbi {
    private LatLng zza;
    private LatLng zzb;

    zzv() {
    }

    @Override // com.google.android.libraries.places.api.model.zzbi
    final zzbi zza(LatLng latLng) {
        if (latLng == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue66c"));
        }
        this.zzb = latLng;
        return this;
    }

    final zzbi zzb(LatLng latLng) {
        if (latLng == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue66d"));
        }
        this.zza = latLng;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzbi
    final RectangularBounds zzc() {
        LatLng latLng;
        LatLng latLng2 = this.zza;
        if (latLng2 != null && (latLng = this.zzb) != null) {
            return new zzax(latLng2, latLng);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(ProtectedSandApp.s("\ue66e"));
        }
        if (this.zzb == null) {
            sb.append(ProtectedSandApp.s("\ue66f"));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue670").concat(sb.toString()));
    }
}
