package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Metadata;

/* compiled from: GroundOverlay.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000bB9\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/maps/android/compose/p;", "", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "Lcom/google/android/gms/maps/model/LatLng;", "location", "", "width", "height", "<init>", "(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Float;Ljava/lang/Float;)V", "a", "Lcom/google/android/gms/maps/model/LatLngBounds;", "b", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "Lcom/google/android/gms/maps/model/LatLng;", "c", "()Lcom/google/android/gms/maps/model/LatLng;", "Ljava/lang/Float;", "d", "()Ljava/lang/Float;", "e", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    public static final int f62036f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final LatLngBounds latLngBounds;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final LatLng location;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Float width;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Float height;

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/maps/android/compose/p$a;", "", "<init>", "()V", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "Lcom/google/maps/android/compose/p;", "b", "(Lcom/google/android/gms/maps/model/LatLngBounds;)Lcom/google/maps/android/compose/p;", "Lcom/google/android/gms/maps/model/LatLng;", "location", "", "width", "height", "a", "(Lcom/google/android/gms/maps/model/LatLng;FLjava/lang/Float;)Lcom/google/maps/android/compose/p;", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.google.maps.android.compose.p$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ p c(Companion companion, LatLng latLng, float f4, Float f5, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                f5 = null;
            }
            return companion.a(latLng, f4, f5);
        }

        @fg.l
        public final p a(@fg.l LatLng location, float width, @fg.m Float height) {
            kotlin.jvm.internal.l0.p(location, ProtectedSandApp.s("ߺ\u0001"));
            return new p(null, location, Float.valueOf(width), height, 1, null);
        }

        @fg.l
        public final p b(@fg.l LatLngBounds latLngBounds) {
            kotlin.jvm.internal.l0.p(latLngBounds, ProtectedSandApp.s("\u07fb\u0001"));
            return new p(latLngBounds, null, null, null, 14, null);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private p(LatLngBounds latLngBounds, LatLng latLng, Float f4, Float f5) {
        this.latLngBounds = latLngBounds;
        this.location = latLng;
        this.width = f4;
        this.height = f5;
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final Float getHeight() {
        return this.height;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final LatLngBounds getLatLngBounds() {
        return this.latLngBounds;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final LatLng getLocation() {
        return this.location;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final Float getWidth() {
        return this.width;
    }

    /* synthetic */ p(LatLngBounds latLngBounds, LatLng latLng, Float f4, Float f5, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : latLngBounds, (i4 & 2) != 0 ? null : latLng, (i4 & 4) != 0 ? null : f4, (i4 & 8) != 0 ? null : f5);
    }
}
