package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.IndoorBuilding;
import kotlin.Metadata;

/* compiled from: MapClickListeners.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/maps/android/compose/q;", "", "Lkotlin/k2;", "onIndoorBuildingFocused", "()V", "Lcom/google/android/gms/maps/model/IndoorBuilding;", "building", "onIndoorLevelActivated", "(Lcom/google/android/gms/maps/model/IndoorBuilding;)V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface q {

    /* compiled from: MapClickListeners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static void a(@fg.l q qVar) {
        }

        public static void b(@fg.l q qVar, @fg.l IndoorBuilding indoorBuilding) {
            kotlin.jvm.internal.l0.p(indoorBuilding, ProtectedSandApp.s("߽\u0001"));
        }
    }

    void onIndoorBuildingFocused();

    void onIndoorLevelActivated(@fg.l IndoorBuilding building);
}
