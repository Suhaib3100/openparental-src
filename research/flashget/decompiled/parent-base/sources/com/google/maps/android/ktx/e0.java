package com.google.maps.android.ktx;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.IndoorBuilding;
import kotlin.Metadata;

/* compiled from: GoogleMap.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/google/maps/android/ktx/e0;", "Lcom/google/maps/android/ktx/d0;", "Lcom/google/android/gms/maps/model/IndoorBuilding;", "building", "<init>", "(Lcom/google/android/gms/maps/model/IndoorBuilding;)V", "a", "()Lcom/google/android/gms/maps/model/IndoorBuilding;", "b", "(Lcom/google/android/gms/maps/model/IndoorBuilding;)Lcom/google/maps/android/ktx/e0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/gms/maps/model/IndoorBuilding;", "d", "maps-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class e0 extends d0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final IndoorBuilding building;

    public e0(@fg.l IndoorBuilding indoorBuilding) {
        kotlin.jvm.internal.l0.p(indoorBuilding, ProtectedSandApp.s("ࡗ\u0001"));
        this.building = indoorBuilding;
    }

    public static /* synthetic */ e0 c(e0 e0Var, IndoorBuilding indoorBuilding, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            indoorBuilding = e0Var.building;
        }
        return e0Var.b(indoorBuilding);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final IndoorBuilding getBuilding() {
        return this.building;
    }

    @fg.l
    public final e0 b(@fg.l IndoorBuilding building) {
        kotlin.jvm.internal.l0.p(building, ProtectedSandApp.s("ࡗ\u0001"));
        return new e0(building);
    }

    @fg.l
    public final IndoorBuilding d() {
        return this.building;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof e0) && kotlin.jvm.internal.l0.g(this.building, ((e0) other).building);
    }

    public int hashCode() {
        return this.building.hashCode();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("ࡘ\u0001") + this.building + ')';
    }
}
