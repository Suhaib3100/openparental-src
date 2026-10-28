package com.google.android.libraries.places.api.model;

import androidx.annotation.x;
import androidx.concurrent.futures.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzs extends PlaceLikelihood {
    private final Place zza;
    private final double zzb;

    zzs(Place place, double d5) {
        if (place == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue62e"));
        }
        this.zza = place;
        this.zzb = d5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaceLikelihood) {
            PlaceLikelihood placeLikelihood = (PlaceLikelihood) obj;
            if (this.zza.equals(placeLikelihood.getPlace()) && Double.doubleToLongBits(this.zzb) == Double.doubleToLongBits(placeLikelihood.getLikelihood())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    @x(from = p.f60679p, to = 1.0d)
    public final double getLikelihood() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PlaceLikelihood
    public final Place getPlace() {
        return this.zza;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.zzb) >>> 32) ^ Double.doubleToLongBits(this.zzb)));
    }

    public final String toString() {
        String obj = this.zza.toString();
        double d5 = this.zzb;
        StringBuilder sb = new StringBuilder(obj.length() + 60);
        a.a(sb, ProtectedSandApp.s("\ue62f"), obj, ProtectedSandApp.s("\ue630"));
        sb.append(d5);
        sb.append(ProtectedSandApp.s("\ue631"));
        return sb.toString();
    }
}
