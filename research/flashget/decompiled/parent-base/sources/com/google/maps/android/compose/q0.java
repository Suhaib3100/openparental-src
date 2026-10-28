package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import java.util.Objects;
import kotlin.Metadata;

/* compiled from: MapProperties.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJk\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b$\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b&\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b)\u00100R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b!\u0010/\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"Lcom/google/maps/android/compose/q0;", "", "", "isBuildingEnabled", "isIndoorEnabled", "isMyLocationEnabled", "isTrafficEnabled", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBoundsForCameraTarget", "Lcom/google/android/gms/maps/model/MapStyleOptions;", "mapStyleOptions", "Lcom/google/maps/android/compose/x0;", "mapType", "", "maxZoomPreference", "minZoomPreference", "<init>", "(ZZZZLcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/MapStyleOptions;Lcom/google/maps/android/compose/x0;FF)V", "", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "(ZZZZLcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/MapStyleOptions;Lcom/google/maps/android/compose/x0;FF)Lcom/google/maps/android/compose/q0;", "Z", "h", "()Z", "b", "i", "c", "j", "d", "k", "e", "Lcom/google/android/gms/maps/model/LatLngBounds;", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "f", "Lcom/google/android/gms/maps/model/MapStyleOptions;", "()Lcom/google/android/gms/maps/model/MapStyleOptions;", "g", "Lcom/google/maps/android/compose/x0;", "()Lcom/google/maps/android/compose/x0;", "F", "()F", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class q0 {

    /* renamed from: j, reason: collision with root package name */
    public static final int f62044j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isBuildingEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isIndoorEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isMyLocationEnabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isTrafficEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final LatLngBounds latLngBoundsForCameraTarget;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final MapStyleOptions mapStyleOptions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x0 mapType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float maxZoomPreference;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float minZoomPreference;

    public q0() {
        this(false, false, false, false, null, null, null, 0.0f, 0.0f, 511, null);
    }

    @fg.l
    public final q0 a(boolean isBuildingEnabled, boolean isIndoorEnabled, boolean isMyLocationEnabled, boolean isTrafficEnabled, @fg.m LatLngBounds latLngBoundsForCameraTarget, @fg.m MapStyleOptions mapStyleOptions, @fg.l x0 mapType, float maxZoomPreference, float minZoomPreference) {
        kotlin.jvm.internal.l0.p(mapType, ProtectedSandApp.s("߾\u0001"));
        return new q0(isBuildingEnabled, isIndoorEnabled, isMyLocationEnabled, isTrafficEnabled, latLngBoundsForCameraTarget, mapStyleOptions, mapType, maxZoomPreference, minZoomPreference);
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.latLngBoundsForCameraTarget;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final MapStyleOptions getMapStyleOptions() {
        return this.mapStyleOptions;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final x0 getMapType() {
        return this.mapType;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof q0) {
            q0 q0Var = (q0) other;
            if (this.isBuildingEnabled == q0Var.isBuildingEnabled && this.isIndoorEnabled == q0Var.isIndoorEnabled && this.isMyLocationEnabled == q0Var.isMyLocationEnabled && this.isTrafficEnabled == q0Var.isTrafficEnabled && kotlin.jvm.internal.l0.g(this.latLngBoundsForCameraTarget, q0Var.latLngBoundsForCameraTarget) && kotlin.jvm.internal.l0.g(this.mapStyleOptions, q0Var.mapStyleOptions) && this.mapType == q0Var.mapType && this.maxZoomPreference == q0Var.maxZoomPreference && this.minZoomPreference == q0Var.minZoomPreference) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f, reason: from getter */
    public final float getMaxZoomPreference() {
        return this.maxZoomPreference;
    }

    /* renamed from: g, reason: from getter */
    public final float getMinZoomPreference() {
        return this.minZoomPreference;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsBuildingEnabled() {
        return this.isBuildingEnabled;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isBuildingEnabled), Boolean.valueOf(this.isIndoorEnabled), Boolean.valueOf(this.isMyLocationEnabled), Boolean.valueOf(this.isTrafficEnabled), this.latLngBoundsForCameraTarget, this.mapStyleOptions, this.mapType, Float.valueOf(this.maxZoomPreference), Float.valueOf(this.minZoomPreference));
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsIndoorEnabled() {
        return this.isIndoorEnabled;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsMyLocationEnabled() {
        return this.isMyLocationEnabled;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsTrafficEnabled() {
        return this.isTrafficEnabled;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("߿\u0001"));
        sb.append(this.isBuildingEnabled);
        sb.append(ProtectedSandApp.s("ࠀ\u0001"));
        sb.append(this.isIndoorEnabled);
        sb.append(ProtectedSandApp.s("ࠁ\u0001"));
        sb.append(this.isMyLocationEnabled);
        sb.append(ProtectedSandApp.s("ࠂ\u0001"));
        sb.append(this.isTrafficEnabled);
        sb.append(ProtectedSandApp.s("ࠃ\u0001"));
        sb.append(this.latLngBoundsForCameraTarget);
        sb.append(ProtectedSandApp.s("ࠄ\u0001"));
        sb.append(this.mapStyleOptions);
        sb.append(ProtectedSandApp.s("ࠅ\u0001"));
        sb.append(this.mapType);
        sb.append(ProtectedSandApp.s("ࠆ\u0001"));
        sb.append(this.maxZoomPreference);
        sb.append(ProtectedSandApp.s("ࠇ\u0001"));
        return androidx.compose.animation.b.a(sb, this.minZoomPreference, ')');
    }

    public q0(boolean z4, boolean z5, boolean z6, boolean z7, @fg.m LatLngBounds latLngBounds, @fg.m MapStyleOptions mapStyleOptions, @fg.l x0 x0Var, float f4, float f5) {
        kotlin.jvm.internal.l0.p(x0Var, ProtectedSandApp.s("߾\u0001"));
        this.isBuildingEnabled = z4;
        this.isIndoorEnabled = z5;
        this.isMyLocationEnabled = z6;
        this.isTrafficEnabled = z7;
        this.latLngBoundsForCameraTarget = latLngBounds;
        this.mapStyleOptions = mapStyleOptions;
        this.mapType = x0Var;
        this.maxZoomPreference = f4;
        this.minZoomPreference = f5;
    }

    public /* synthetic */ q0(boolean z4, boolean z5, boolean z6, boolean z7, LatLngBounds latLngBounds, MapStyleOptions mapStyleOptions, x0 x0Var, float f4, float f5, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? false : z4, (i4 & 2) != 0 ? false : z5, (i4 & 4) != 0 ? false : z6, (i4 & 8) == 0 ? z7 : false, (i4 & 16) != 0 ? null : latLngBounds, (i4 & 32) == 0 ? mapStyleOptions : null, (i4 & 64) != 0 ? x0.NORMAL : x0Var, (i4 & 128) != 0 ? 21.0f : f4, (i4 & 256) != 0 ? 3.0f : f5);
    }
}
