package com.google.android.gms.common.wrappers;

import android.content.AttributionSource;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class AttributionSourceWrapper {

    @q0
    private final AttributionSource zza;

    @KeepForSdk
    public AttributionSourceWrapper(@q0 AttributionSource attributionSource) {
        this.zza = attributionSource;
    }

    @q0
    @KeepForSdk
    public AttributionSource getAttributionSource() {
        return this.zza;
    }
}
