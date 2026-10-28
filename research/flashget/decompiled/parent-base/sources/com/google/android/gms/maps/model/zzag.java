package com.google.android.gms.maps.model;

import androidx.annotation.q0;
import com.google.android.gms.internal.maps.zzao;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
final class zzag extends zzao {
    final /* synthetic */ TileProvider zza;

    zzag(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.zza = tileProvider;
    }

    @Override // com.google.android.gms.internal.maps.zzap
    @q0
    public final Tile zzb(int i4, int i5, int i6) {
        return this.zza.getTile(i4, i5, i6);
    }
}
