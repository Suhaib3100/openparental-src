package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: MapApplier.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/google/maps/android/compose/b0;", "Landroidx/compose/runtime/a;", "Lcom/google/maps/android/compose/o0;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lcom/google/android/gms/maps/MapView;", "mapView", "Lcom/google/maps/android/compose/e0;", "mapClickListeners", "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/MapView;Lcom/google/maps/android/compose/e0;)V", "Lkotlin/k2;", "n", "()V", "", "index", "instance", "L", "(ILcom/google/maps/android/compose/o0;)V", "M", "from", "to", "count", "c", "(III)V", "a", "(II)V", "H", "e", "Lcom/google/android/gms/maps/GoogleMap;", "I", "()Lcom/google/android/gms/maps/GoogleMap;", "f", "Lcom/google/android/gms/maps/MapView;", "K", "()Lcom/google/android/gms/maps/MapView;", "g", "Lcom/google/maps/android/compose/e0;", "J", "()Lcom/google/maps/android/compose/e0;", "", "h", "Ljava/util/List;", "decorations", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nMapApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapApplier.kt\ncom/google/maps/android/compose/MapApplier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 MapApplier.kt\ncom/google/maps/android/compose/MapApplierKt\n*L\n1#1,227:1\n1855#2,2:228\n210#3,16:230\n210#3,16:246\n210#3,16:262\n210#3,16:278\n210#3,16:294\n210#3,16:310\n210#3,16:326\n210#3,16:342\n*S KotlinDebug\n*F\n+ 1 MapApplier.kt\ncom/google/maps/android/compose/MapApplier\n*L\n53#1:228,2\n79#1:230,16\n87#1:246,16\n95#1:262,16\n103#1:278,16\n113#1:294,16\n121#1:310,16\n129#1:326,16\n137#1:342,16\n*E\n"})
/* loaded from: classes6.dex */
public final class b0 extends androidx.compose.runtime.a<o0> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f61098i = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final GoogleMap map;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final MapView mapView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 mapClickListeners;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<o0> decorations;

    /* compiled from: MapApplier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/Marker;", "marker", "Lcom/google/maps/android/compose/d1;", "a", "(Lcom/google/android/gms/maps/model/Marker;)Lcom/google/maps/android/compose/d1;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapApplier.kt\ncom/google/maps/android/compose/MapApplier$attachClickListeners$10\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n288#2,2:228\n*S KotlinDebug\n*F\n+ 1 MapApplier.kt\ncom/google/maps/android/compose/MapApplier$attachClickListeners$10\n*L\n191#1:228,2\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Marker, d1> {
        a() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d1 invoke(@fg.l Marker marker) {
            Object obj;
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڟ\u0001"));
            Iterator it = b0.this.decorations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                o0 o0Var = (o0) obj;
                if ((o0Var instanceof d1) && kotlin.jvm.internal.l0.g(((d1) o0Var).getMarker(), marker)) {
                    break;
                }
            }
            return (d1) obj;
        }
    }

    /* compiled from: MapApplier.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/google/maps/android/compose/b0$b", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;", "Lcom/google/android/gms/maps/model/Marker;", "marker", "Lkotlin/k2;", "onMarkerDrag", "(Lcom/google/android/gms/maps/model/Marker;)V", "onMarkerDragEnd", "onMarkerDragStart", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nMapApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapApplier.kt\ncom/google/maps/android/compose/MapApplier$attachClickListeners$9\n+ 2 MapApplier.kt\ncom/google/maps/android/compose/MapApplierKt\n*L\n1#1,227:1\n210#2,16:228\n210#2,16:244\n210#2,16:260\n*S KotlinDebug\n*F\n+ 1 MapApplier.kt\ncom/google/maps/android/compose/MapApplier$attachClickListeners$9\n*L\n146#1:228,16\n160#1:244,16\n174#1:260,16\n*E\n"})
    public static final class b implements GoogleMap.OnMarkerDragListener {

        /* compiled from: MapApplier.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/Marker;", "it", "Lkotlin/k2;", "a", "(Lcom/google/android/gms/maps/model/Marker;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d1 f61105b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d1 d1Var) {
                super(1);
                this.f61105b = d1Var;
            }

            public final void a(@fg.l Marker marker) {
                kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڠ\u0001"));
                e1 markerState = this.f61105b.getMarkerState();
                LatLng position = marker.getPosition();
                kotlin.jvm.internal.l0.o(position, ProtectedSandApp.s("ڡ\u0001"));
                markerState.h(position);
                this.f61105b.getMarkerState().f(j.DRAG);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
                a(marker);
                return k2.f75408a;
            }
        }

        /* compiled from: MapApplier.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/Marker;", "it", "Lkotlin/k2;", "a", "(Lcom/google/android/gms/maps/model/Marker;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.google.maps.android.compose.b0$b$b, reason: collision with other inner class name */
        static final class C0945b extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d1 f61106b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0945b(d1 d1Var) {
                super(1);
                this.f61106b = d1Var;
            }

            public final void a(@fg.l Marker marker) {
                kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڢ\u0001"));
                e1 markerState = this.f61106b.getMarkerState();
                LatLng position = marker.getPosition();
                kotlin.jvm.internal.l0.o(position, ProtectedSandApp.s("ڣ\u0001"));
                markerState.h(position);
                this.f61106b.getMarkerState().f(j.END);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
                a(marker);
                return k2.f75408a;
            }
        }

        /* compiled from: MapApplier.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/Marker;", "it", "Lkotlin/k2;", "a", "(Lcom/google/android/gms/maps/model/Marker;)V"}, k = 3, mv = {1, 9, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<Marker, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d1 f61107b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d1 d1Var) {
                super(1);
                this.f61107b = d1Var;
            }

            public final void a(@fg.l Marker marker) {
                kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڤ\u0001"));
                e1 markerState = this.f61107b.getMarkerState();
                LatLng position = marker.getPosition();
                kotlin.jvm.internal.l0.o(position, ProtectedSandApp.s("ڥ\u0001"));
                markerState.h(position);
                this.f61107b.getMarkerState().f(j.START);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(Marker marker) {
                a(marker);
                return k2.f75408a;
            }
        }

        b() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
        public void onMarkerDrag(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڦ\u0001"));
            for (o0 o0Var : b0.this.decorations) {
                if (o0Var instanceof d1) {
                    d1 d1Var = (d1) o0Var;
                    if (kotlin.jvm.internal.l0.g(d1Var.getMarker(), marker)) {
                        if (kotlin.jvm.internal.l0.g(new a(d1Var).invoke(marker), Boolean.TRUE)) {
                            return;
                        }
                    }
                }
                if (o0Var instanceof s) {
                    ld.l<Marker, k2> j4 = ((s) o0Var).j();
                    if (j4 != null ? kotlin.jvm.internal.l0.g(j4.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
        public void onMarkerDragEnd(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڦ\u0001"));
            for (o0 o0Var : b0.this.decorations) {
                if (o0Var instanceof d1) {
                    d1 d1Var = (d1) o0Var;
                    if (kotlin.jvm.internal.l0.g(d1Var.getMarker(), marker)) {
                        if (kotlin.jvm.internal.l0.g(new C0945b(d1Var).invoke(marker), Boolean.TRUE)) {
                            return;
                        }
                    }
                }
                if (o0Var instanceof s) {
                    ld.l<Marker, k2> k4 = ((s) o0Var).k();
                    if (k4 != null ? kotlin.jvm.internal.l0.g(k4.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
        public void onMarkerDragStart(@fg.l Marker marker) {
            kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڦ\u0001"));
            for (o0 o0Var : b0.this.decorations) {
                if (o0Var instanceof d1) {
                    d1 d1Var = (d1) o0Var;
                    if (kotlin.jvm.internal.l0.g(d1Var.getMarker(), marker)) {
                        if (kotlin.jvm.internal.l0.g(new c(d1Var).invoke(marker), Boolean.TRUE)) {
                            return;
                        }
                    }
                }
                if (o0Var instanceof s) {
                    ld.l<Marker, k2> l4 = ((s) o0Var).l();
                    if (l4 != null ? kotlin.jvm.internal.l0.g(l4.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@fg.l GoogleMap googleMap, @fg.l MapView mapView, @fg.l e0 e0Var) {
        super(p0.f62041a);
        kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ڧ\u0001"));
        kotlin.jvm.internal.l0.p(mapView, ProtectedSandApp.s("ڨ\u0001"));
        kotlin.jvm.internal.l0.p(e0Var, ProtectedSandApp.s("ک\u0001"));
        this.map = googleMap;
        this.mapView = mapView;
        this.mapClickListeners = e0Var;
        this.decorations = new ArrayList();
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(b0 b0Var, Polyline polyline) {
        kotlin.jvm.internal.l0.p(b0Var, ProtectedSandApp.s("ڪ\u0001"));
        kotlin.jvm.internal.l0.p(polyline, ProtectedSandApp.s("ګ\u0001"));
        for (o0 o0Var : b0Var.decorations) {
            if (o0Var instanceof j1) {
                j1 j1Var = (j1) o0Var;
                if (kotlin.jvm.internal.l0.g(j1Var.getPolyline(), polyline)) {
                    ld.l<Polyline, k2> d5 = j1Var.d();
                    if (d5 != null ? kotlin.jvm.internal.l0.g(d5.invoke(polyline), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (o0Var instanceof s) {
                ld.l<Polyline, k2> n4 = ((s) o0Var).n();
                if (n4 != null ? kotlin.jvm.internal.l0.g(n4.invoke(polyline), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean B(com.google.maps.android.compose.b0 r5, com.google.android.gms.maps.model.Marker r6) {
        /*
            java.lang.String r0 = "ڪ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.String r0 = "ڬ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r6, r0)
            java.util.List<com.google.maps.android.compose.o0> r5 = r5.decorations
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L1a:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L66
            java.lang.Object r0 = r5.next()
            com.google.maps.android.compose.o0 r0 = (com.google.maps.android.compose.o0) r0
            boolean r2 = r0 instanceof com.google.maps.android.compose.d1
            r3 = 1
            if (r2 == 0) goto L4d
            r2 = r0
            com.google.maps.android.compose.d1 r2 = (com.google.maps.android.compose.d1) r2
            com.google.android.gms.maps.model.Marker r4 = r2.getMarker()
            boolean r4 = kotlin.jvm.internal.l0.g(r4, r6)
            if (r4 == 0) goto L4d
            ld.l r0 = r2.l()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r0.invoke(r6)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.l0.g(r0, r1)
        L49:
            if (r1 == 0) goto L1a
        L4b:
            r1 = r3
            goto L66
        L4d:
            boolean r2 = r0 instanceof com.google.maps.android.compose.s
            if (r2 == 0) goto L1a
            com.google.maps.android.compose.s r0 = (com.google.maps.android.compose.s) r0
            ld.l r0 = r0.i()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r0.invoke(r6)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.l0.g(r0, r1)
        L63:
            if (r1 == 0) goto L1a
            goto L4b
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.b0.B(com.google.maps.android.compose.b0, com.google.android.gms.maps.model.Marker):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(b0 b0Var, Marker marker) {
        kotlin.jvm.internal.l0.p(b0Var, ProtectedSandApp.s("ڪ\u0001"));
        kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڬ\u0001"));
        for (o0 o0Var : b0Var.decorations) {
            if (o0Var instanceof d1) {
                d1 d1Var = (d1) o0Var;
                if (kotlin.jvm.internal.l0.g(d1Var.getMarker(), marker)) {
                    ld.l<Marker, k2> i4 = d1Var.i();
                    if (i4 != null ? kotlin.jvm.internal.l0.g(i4.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (o0Var instanceof s) {
                ld.l<Marker, k2> f4 = ((s) o0Var).f();
                if (f4 != null ? kotlin.jvm.internal.l0.g(f4.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(b0 b0Var, Marker marker) {
        kotlin.jvm.internal.l0.p(b0Var, ProtectedSandApp.s("ڪ\u0001"));
        kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڬ\u0001"));
        for (o0 o0Var : b0Var.decorations) {
            if (o0Var instanceof d1) {
                d1 d1Var = (d1) o0Var;
                if (kotlin.jvm.internal.l0.g(d1Var.getMarker(), marker)) {
                    ld.l<Marker, k2> j4 = d1Var.j();
                    if (j4 != null ? kotlin.jvm.internal.l0.g(j4.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (o0Var instanceof s) {
                ld.l<Marker, k2> g4 = ((s) o0Var).g();
                if (g4 != null ? kotlin.jvm.internal.l0.g(g4.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(b0 b0Var, Marker marker) {
        kotlin.jvm.internal.l0.p(b0Var, ProtectedSandApp.s("ڪ\u0001"));
        kotlin.jvm.internal.l0.p(marker, ProtectedSandApp.s("ڬ\u0001"));
        for (o0 o0Var : b0Var.decorations) {
            if (o0Var instanceof d1) {
                d1 d1Var = (d1) o0Var;
                if (kotlin.jvm.internal.l0.g(d1Var.getMarker(), marker)) {
                    ld.l<Marker, k2> k4 = d1Var.k();
                    if (k4 != null ? kotlin.jvm.internal.l0.g(k4.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (o0Var instanceof s) {
                ld.l<Marker, k2> h4 = ((s) o0Var).h();
                if (h4 != null ? kotlin.jvm.internal.l0.g(h4.invoke(marker), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(b0 b0Var, Circle circle) {
        kotlin.jvm.internal.l0.p(b0Var, ProtectedSandApp.s("ڪ\u0001"));
        kotlin.jvm.internal.l0.p(circle, ProtectedSandApp.s("ڭ\u0001"));
        for (o0 o0Var : b0Var.decorations) {
            if (o0Var instanceof e) {
                e eVar = (e) o0Var;
                if (kotlin.jvm.internal.l0.g(eVar.getCircle(), circle)) {
                    ld.l<Circle, k2> e4 = eVar.e();
                    if (e4 != null ? kotlin.jvm.internal.l0.g(e4.invoke(circle), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (o0Var instanceof s) {
                ld.l<Circle, k2> d5 = ((s) o0Var).d();
                if (d5 != null ? kotlin.jvm.internal.l0.g(d5.invoke(circle), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(b0 b0Var, GroundOverlay groundOverlay) {
        kotlin.jvm.internal.l0.p(b0Var, ProtectedSandApp.s("ڪ\u0001"));
        kotlin.jvm.internal.l0.p(groundOverlay, ProtectedSandApp.s("ڮ\u0001"));
        for (o0 o0Var : b0Var.decorations) {
            if (o0Var instanceof o) {
                o oVar = (o) o0Var;
                if (kotlin.jvm.internal.l0.g(oVar.getGroundOverlay(), groundOverlay)) {
                    ld.l<GroundOverlay, k2> e4 = oVar.e();
                    if (e4 != null ? kotlin.jvm.internal.l0.g(e4.invoke(groundOverlay), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (o0Var instanceof s) {
                ld.l<GroundOverlay, k2> e5 = ((s) o0Var).e();
                if (e5 != null ? kotlin.jvm.internal.l0.g(e5.invoke(groundOverlay), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(b0 b0Var, Polygon polygon) {
        kotlin.jvm.internal.l0.p(b0Var, ProtectedSandApp.s("ڪ\u0001"));
        kotlin.jvm.internal.l0.p(polygon, ProtectedSandApp.s("گ\u0001"));
        for (o0 o0Var : b0Var.decorations) {
            if (o0Var instanceof h1) {
                h1 h1Var = (h1) o0Var;
                if (kotlin.jvm.internal.l0.g(h1Var.getPolygon(), polygon)) {
                    ld.l<Polygon, k2> d5 = h1Var.d();
                    if (d5 != null ? kotlin.jvm.internal.l0.g(d5.invoke(polygon), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (o0Var instanceof s) {
                ld.l<Polygon, k2> m4 = ((s) o0Var).m();
                if (m4 != null ? kotlin.jvm.internal.l0.g(m4.invoke(polygon), Boolean.TRUE) : false) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    public final void H() {
        this.map.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() { // from class: com.google.maps.android.compose.t
            @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
            public final void onCircleClick(Circle circle) {
                b0.F(b0.this, circle);
            }
        });
        this.map.setOnGroundOverlayClickListener(new GoogleMap.OnGroundOverlayClickListener() { // from class: com.google.maps.android.compose.u
            @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
            public final void onGroundOverlayClick(GroundOverlay groundOverlay) {
                b0.G(b0.this, groundOverlay);
            }
        });
        this.map.setOnPolygonClickListener(new GoogleMap.OnPolygonClickListener() { // from class: com.google.maps.android.compose.v
            @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
            public final void onPolygonClick(Polygon polygon) {
                b0.z(b0.this, polygon);
            }
        });
        this.map.setOnPolylineClickListener(new GoogleMap.OnPolylineClickListener() { // from class: com.google.maps.android.compose.w
            @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
            public final void onPolylineClick(Polyline polyline) {
                b0.A(b0.this, polyline);
            }
        });
        this.map.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.google.maps.android.compose.x
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                boolean B;
                B = b0.B(b0.this, marker);
                return B;
            }
        });
        this.map.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.google.maps.android.compose.y
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public final void onInfoWindowClick(Marker marker) {
                b0.C(b0.this, marker);
            }
        });
        this.map.setOnInfoWindowCloseListener(new GoogleMap.OnInfoWindowCloseListener() { // from class: com.google.maps.android.compose.z
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener
            public final void onInfoWindowClose(Marker marker) {
                b0.D(b0.this, marker);
            }
        });
        this.map.setOnInfoWindowLongClickListener(new GoogleMap.OnInfoWindowLongClickListener() { // from class: com.google.maps.android.compose.a0
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
            public final void onInfoWindowLongClick(Marker marker) {
                b0.E(b0.this, marker);
            }
        });
        this.map.setOnMarkerDragListener(new b());
        this.map.setInfoWindowAdapter(new g(this.mapView, new a()));
    }

    @fg.l
    /* renamed from: I, reason: from getter */
    public final GoogleMap getMap() {
        return this.map;
    }

    @fg.l
    /* renamed from: J, reason: from getter */
    public final e0 getMapClickListeners() {
        return this.mapClickListeners;
    }

    @fg.l
    /* renamed from: K, reason: from getter */
    public final MapView getMapView() {
        return this.mapView;
    }

    @Override // androidx.compose.runtime.e
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void h(int index, @fg.l o0 instance) {
        kotlin.jvm.internal.l0.p(instance, ProtectedSandApp.s("ڰ\u0001"));
        this.decorations.add(index, instance);
        instance.a();
    }

    @Override // androidx.compose.runtime.e
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void e(int index, @fg.l o0 instance) {
        kotlin.jvm.internal.l0.p(instance, ProtectedSandApp.s("ڰ\u0001"));
    }

    @Override // androidx.compose.runtime.e
    public void a(int index, int count) {
        for (int i4 = 0; i4 < count; i4++) {
            this.decorations.get(index + i4).c();
        }
        o(this.decorations, index, count);
    }

    @Override // androidx.compose.runtime.e
    public void c(int from, int to, int count) {
        m(this.decorations, from, to, count);
    }

    @Override // androidx.compose.runtime.a
    protected void n() {
        this.map.clear();
        Iterator<T> it = this.decorations.iterator();
        while (it.hasNext()) {
            ((o0) it.next()).b();
        }
        this.decorations.clear();
    }
}
