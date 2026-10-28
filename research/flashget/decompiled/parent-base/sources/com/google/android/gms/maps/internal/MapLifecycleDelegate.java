package com.google.android.gms.maps.internal;

import androidx.annotation.o0;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.maps.OnMapReadyCallback;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public interface MapLifecycleDelegate extends LifecycleDelegate {
    void getMapAsync(@o0 OnMapReadyCallback onMapReadyCallback);
}
