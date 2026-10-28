package com.google.android.libraries.places.api.model;

import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzw extends RectangularBounds {
    private final LatLng zza;
    private final LatLng zzb;

    zzw(LatLng latLng, LatLng latLng2) {
        if (latLng == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue636"));
        }
        this.zza = latLng;
        if (latLng2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue635"));
        }
        this.zzb = latLng2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RectangularBounds) {
            RectangularBounds rectangularBounds = (RectangularBounds) obj;
            if (this.zza.equals(rectangularBounds.getSouthwest()) && this.zzb.equals(rectangularBounds.getNortheast())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public final LatLng getNortheast() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.RectangularBounds
    public final LatLng getSouthwest() {
        return this.zza;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String latLng = this.zza.toString();
        String latLng2 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(latLng2.length() + latLng.length() + 41);
        l0.a(sb, ProtectedSandApp.s("\ue637"), latLng, ProtectedSandApp.s("\ue638"), latLng2);
        sb.append(ProtectedSandApp.s("\ue639"));
        return sb.toString();
    }
}
