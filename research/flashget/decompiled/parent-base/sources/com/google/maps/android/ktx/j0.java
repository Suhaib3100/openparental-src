package com.google.maps.android.ktx;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.Marker;
import kotlin.Metadata;

/* compiled from: GoogleMap.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/google/maps/android/ktx/j0;", "Lcom/google/maps/android/ktx/m0;", "Lcom/google/android/gms/maps/model/Marker;", "marker", "<init>", "(Lcom/google/android/gms/maps/model/Marker;)V", "b", "()Lcom/google/android/gms/maps/model/Marker;", "c", "(Lcom/google/android/gms/maps/model/Marker;)Lcom/google/maps/android/ktx/j0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/gms/maps/model/Marker;", "maps-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class j0 extends m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Marker marker;

    public j0(@fg.l Marker marker) {
        kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ࢅ\u0001"));
        this.marker = marker;
    }

    public static /* synthetic */ j0 d(j0 j0Var, Marker marker, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            marker = j0Var.marker;
        }
        return j0Var.c(marker);
    }

    @Override // com.google.maps.android.ktx.m0
    @fg.l
    /* renamed from: a, reason: from getter */
    public Marker getMarker() {
        return this.marker;
    }

    @fg.l
    public final Marker b() {
        return this.marker;
    }

    @fg.l
    public final j0 c(@fg.l Marker marker) {
        kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ࢅ\u0001"));
        return new j0(marker);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof j0) && kotlin.jvm.internal.l0.g(this.marker, ((j0) other).marker);
    }

    public int hashCode() {
        return this.marker.hashCode();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("ࢆ\u0001") + this.marker + ')';
    }
}
