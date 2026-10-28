package com.google.android.libraries.places.api.net;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzm extends FindCurrentPlaceRequest.Builder {
    private List zza;
    private CancellationToken zzb;

    zzm() {
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    @q0
    public final CancellationToken getCancellationToken() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    public final FindCurrentPlaceRequest.Builder setCancellationToken(@q0 CancellationToken cancellationToken) {
        this.zzb = cancellationToken;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    final FindCurrentPlaceRequest.Builder zza(List list) {
        if (list == null) {
            throw new NullPointerException(ProtectedSandApp.s("\ue69d"));
        }
        this.zza = list;
        return this;
    }

    @Override // com.google.android.libraries.places.api.net.FindCurrentPlaceRequest.Builder
    final FindCurrentPlaceRequest zzb() {
        List list = this.zza;
        if (list != null) {
            return new zzo(list, this.zzb, null);
        }
        throw new IllegalStateException(ProtectedSandApp.s("\ue69e"));
    }
}
