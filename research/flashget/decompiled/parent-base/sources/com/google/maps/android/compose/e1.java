package com.google.maps.android.compose;

import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Marker.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0018B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005R+\u0010\u0015\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00108F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR(\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00178@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/google/maps/android/compose/e1;", "", "Lcom/google/android/gms/maps/model/LatLng;", "position", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;)V", "Lkotlin/k2;", "i", "()V", "e", "<set-?>", "a", "Landroidx/compose/runtime/k2;", "d", "()Lcom/google/android/gms/maps/model/LatLng;", "h", "Lcom/google/maps/android/compose/j;", "b", "()Lcom/google/maps/android/compose/j;", "f", "(Lcom/google/maps/android/compose/j;)V", "dragState", "Landroidx/compose/runtime/k2;", "Lcom/google/android/gms/maps/model/Marker;", "c", "markerState", "value", "()Lcom/google/android/gms/maps/model/Marker;", "g", "(Lcom/google/android/gms/maps/model/Marker;)V", "marker", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@r1({"SMAP\nMarker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Marker.kt\ncom/google/maps/android/compose/MarkerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,727:1\n81#2:728\n107#2,2:729\n81#2:731\n107#2,2:732\n*S KotlinDebug\n*F\n+ 1 Marker.kt\ncom/google/maps/android/compose/MarkerState\n*L\n81#1:728\n81#1:729,2\n86#1:731\n86#1:732,2\n*E\n"})
/* loaded from: classes6.dex */
public final class e1 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f61435e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 position;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 dragState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<Marker> markerState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<e1, LatLng> f61436f = androidx.compose.runtime.saveable.m.a(a.f61440b, b.f61441b);

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Lcom/google/maps/android/compose/e1;", "it", "Lcom/google/android/gms/maps/model/LatLng;", "a", "(Landroidx/compose/runtime/saveable/n;Lcom/google/maps/android/compose/e1;)Lcom/google/android/gms/maps/model/LatLng;"}, k = 3, mv = {1, 9, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, e1, LatLng> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61440b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LatLng invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l e1 e1Var) {
            kotlin.jvm.internal.l0.p(nVar, ProtectedSandApp.s("ܱ\u0001"));
            kotlin.jvm.internal.l0.p(e1Var, ProtectedSandApp.s("ܲ\u0001"));
            return e1Var.d();
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "it", "Lcom/google/maps/android/compose/e1;", "a", "(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/maps/android/compose/e1;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<LatLng, e1> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f61441b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e1 invoke(@fg.l LatLng latLng) {
            kotlin.jvm.internal.l0.p(latLng, ProtectedSandApp.s("ܳ\u0001"));
            return new e1(latLng);
        }
    }

    /* compiled from: Marker.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/google/maps/android/compose/e1$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Lcom/google/maps/android/compose/e1;", "Lcom/google/android/gms/maps/model/LatLng;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.google.maps.android.compose.e1$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<e1, LatLng> a() {
            return e1.f61436f;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final j b() {
        return (j) this.dragState.getValue();
    }

    @fg.m
    public final Marker c() {
        return this.markerState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final LatLng d() {
        return (LatLng) this.position.getValue();
    }

    public final void e() {
        Marker c5 = c();
        if (c5 != null) {
            c5.hideInfoWindow();
        }
    }

    public final void f(@fg.l j jVar) {
        kotlin.jvm.internal.l0.p(jVar, ProtectedSandApp.s("ܵ\u0001"));
        this.dragState.setValue(jVar);
    }

    public final void g(@fg.m Marker marker) {
        if (this.markerState.getValue() == null && marker == null) {
            return;
        }
        if (this.markerState.getValue() != null && marker != null) {
            throw new IllegalStateException(ProtectedSandApp.s("ܶ\u0001"));
        }
        this.markerState.setValue(marker);
    }

    public final void h(@fg.l LatLng latLng) {
        kotlin.jvm.internal.l0.p(latLng, ProtectedSandApp.s("ܵ\u0001"));
        this.position.setValue(latLng);
    }

    public final void i() {
        Marker c5 = c();
        if (c5 != null) {
            c5.showInfoWindow();
        }
    }

    public e1(@fg.l LatLng latLng) {
        k2 g4;
        k2 g5;
        k2<Marker> g6;
        kotlin.jvm.internal.l0.p(latLng, ProtectedSandApp.s("ܴ\u0001"));
        g4 = t4.g(latLng, null, 2, null);
        this.position = g4;
        g5 = t4.g(j.END, null, 2, null);
        this.dragState = g5;
        g6 = t4.g(null, null, 2, null);
        this.markerState = g6;
    }

    public /* synthetic */ e1(LatLng latLng, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? new LatLng(com.google.firebase.remoteconfig.p.f60679p, com.google.firebase.remoteconfig.p.f60679p) : latLng);
    }
}
