package com.google.maps.android.compose;

import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.maps.android.compose.q;
import kotlin.Metadata;

/* compiled from: MapClickListeners.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/maps/android/compose/i;", "Lcom/google/maps/android/compose/q;", "<init>", "()V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class i implements q {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final i f61503a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final int f61504b = 0;

    private i() {
    }

    @Override // com.google.maps.android.compose.q
    public void onIndoorBuildingFocused() {
    }

    @Override // com.google.maps.android.compose.q
    public void onIndoorLevelActivated(@fg.l IndoorBuilding indoorBuilding) {
        q.a.b(this, indoorBuilding);
    }
}
