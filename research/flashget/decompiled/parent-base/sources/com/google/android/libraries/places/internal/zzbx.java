package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.android.volley.q;
import com.android.volley.toolbox.r;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzbx extends r {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbx(zzby zzbyVar, String str, q.b bVar, int i4, int i5, ImageView.ScaleType scaleType, Bitmap.Config config, q.a aVar, Map map) {
        super(str, bVar, 0, 0, scaleType, config, aVar);
        this.zza = map;
    }

    @Override // com.android.volley.n
    public final Map getHeaders() {
        return this.zza;
    }
}
