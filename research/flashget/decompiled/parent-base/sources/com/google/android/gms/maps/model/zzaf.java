package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.q0;
import com.google.android.gms.internal.maps.zzap;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
final class zzaf implements TileProvider {
    final /* synthetic */ TileOverlayOptions zza;
    private final zzap zzb;

    zzaf(TileOverlayOptions tileOverlayOptions) {
        zzap zzapVar;
        this.zza = tileOverlayOptions;
        zzapVar = tileOverlayOptions.zza;
        this.zzb = zzapVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    @q0
    public final Tile getTile(int i4, int i5, int i6) {
        try {
            return this.zzb.zzb(i4, i5, i6);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
