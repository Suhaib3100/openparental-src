package com.google.android.gms.maps.model;

import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public interface TileProvider {

    @o0
    public static final Tile NO_TILE = new Tile(-1, -1, null);

    @q0
    Tile getTile(int i4, int i5, int i6);
}
