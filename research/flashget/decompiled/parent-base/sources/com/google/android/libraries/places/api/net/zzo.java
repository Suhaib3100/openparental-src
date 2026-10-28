package com.google.android.libraries.places.api.net;

import androidx.annotation.q0;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.stats.a;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzo extends FindCurrentPlaceRequest {
    private final List zza;
    private final CancellationToken zzb;

    /* synthetic */ zzo(List list, CancellationToken cancellationToken, zzn zznVar) {
        this.zza = list;
        this.zzb = cancellationToken;
    }

    public final boolean equals(Object obj) {
        CancellationToken cancellationToken;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindCurrentPlaceRequest) {
            FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) obj;
            if (this.zza.equals(findCurrentPlaceRequest.getPlaceFields()) && ((cancellationToken = this.zzb) != null ? cancellationToken.equals(findCurrentPlaceRequest.getCancellationToken()) : findCurrentPlaceRequest.getCancellationToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest, com.google.android.libraries.places.internal.zzen
    @q0
    public final CancellationToken getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest
    public final List<Place.Field> getPlaceFields() {
        return this.zza;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        CancellationToken cancellationToken = this.zzb;
        return hashCode ^ (cancellationToken == null ? 0 : cancellationToken.hashCode());
    }

    public final String toString() {
        String obj = this.zza.toString();
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(a.a(obj, 57, valueOf.length()));
        l0.a(sb, ProtectedSandApp.s("\ue69f"), obj, ProtectedSandApp.s("\ue6a0"), valueOf);
        sb.append(ProtectedSandApp.s("\ue6a1"));
        return sb.toString();
    }
}
