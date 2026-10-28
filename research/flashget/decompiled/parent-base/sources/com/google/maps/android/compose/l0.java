package com.google.maps.android.compose;

import android.location.Location;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PointOfInterest;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: MapClickListeners.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001aR\u0010\f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u001f\u0010\n\u001a\u001b\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00000\u0007¢\u0006\u0002\b\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0003¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u0010\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/k2;", "i", "(Landroidx/compose/runtime/t;I)V", "", "L", "Lkotlin/Function0;", "callback", "Lkotlin/Function2;", "Lcom/google/android/gms/maps/GoogleMap;", "Lkotlin/u;", "setter", "listener", "h", "(Lld/a;Lld/p;Ljava/lang/Object;Landroidx/compose/runtime/t;I)V", "Lcom/google/maps/android/compose/d0;", "factory", "g", "(Lld/a;Lld/a;Landroidx/compose/runtime/t;I)V", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMapClickListeners.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapClickListeners.kt\ncom/google/maps/android/compose/MapClickListenersKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,197:1\n251#2,10:198\n*S KotlinDebug\n*F\n+ 1 MapClickListeners.kt\ncom/google/maps/android/compose/MapClickListenersKt\n*L\n195#1:198,10\n*E\n"})
/* loaded from: classes6.dex */
public final class l0 {

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.a<d0<?>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f61811b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f61811b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.d0<?>, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final d0<?> invoke() {
            return this.f61811b.invoke();
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "L", "Lcom/google/maps/android/compose/d0;", "a", "()Lcom/google/maps/android/compose/d0;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<d0<?>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f61812b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<GoogleMap, L, k2> f61813c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L f61814d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b0 b0Var, ld.p<? super GoogleMap, ? super L, k2> pVar, L l4) {
            super(0);
            this.f61812b = b0Var;
            this.f61813c = pVar;
            this.f61814d = l4;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0<?> invoke() {
            return new d0<>(this.f61812b.getMap(), this.f61813c, this.f61814d);
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<Object> f61815b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<d0<?>> f61816c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f61817d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.a<? extends Object> aVar, ld.a<? extends d0<?>> aVar2, int i4) {
            super(2);
            this.f61815b = aVar;
            this.f61816c = aVar2;
            this.f61817d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l0.g(this.f61815b, this.f61816c, tVar, g3.b(this.f61817d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class d extends kotlin.jvm.internal.h0 implements ld.p<GoogleMap, GoogleMap.OnMyLocationButtonClickListener, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final d f61818d = new d();

        d() {
            super(2, GoogleMap.class, ProtectedSandApp.s("ݸ\u0001"), ProtectedSandApp.s("ݷ\u0001"), 0);
        }

        public final void Z(@fg.l GoogleMap googleMap, @fg.m GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
            kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ݹ\u0001"));
            googleMap.setOnMyLocationButtonClickListener(onMyLocationButtonClickListener);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(GoogleMap googleMap, GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
            Z(googleMap, onMyLocationButtonClickListener);
            return k2.f75408a;
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class f extends kotlin.jvm.internal.h0 implements ld.p<GoogleMap, GoogleMap.OnMyLocationClickListener, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final f f61819d = new f();

        f() {
            super(2, GoogleMap.class, ProtectedSandApp.s("ݽ\u0001"), ProtectedSandApp.s("ݼ\u0001"), 0);
        }

        public final void Z(@fg.l GoogleMap googleMap, @fg.m GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
            kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ݾ\u0001"));
            googleMap.setOnMyLocationClickListener(onMyLocationClickListener);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(GoogleMap googleMap, GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
            Z(googleMap, onMyLocationClickListener);
            return k2.f75408a;
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class h extends kotlin.jvm.internal.h0 implements ld.p<GoogleMap, GoogleMap.OnPoiClickListener, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final h f61820d = new h();

        h() {
            super(2, GoogleMap.class, ProtectedSandApp.s("ނ\u0001"), ProtectedSandApp.s("ށ\u0001"), 0);
        }

        public final void Z(@fg.l GoogleMap googleMap, @fg.m GoogleMap.OnPoiClickListener onPoiClickListener) {
            kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ރ\u0001"));
            googleMap.setOnPoiClickListener(onPoiClickListener);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(GoogleMap googleMap, GoogleMap.OnPoiClickListener onPoiClickListener) {
            Z(googleMap, onPoiClickListener);
            return k2.f75408a;
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class j extends kotlin.jvm.internal.h0 implements ld.p<GoogleMap, GoogleMap.OnIndoorStateChangeListener, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final j f61821d = new j();

        j() {
            super(2, GoogleMap.class, ProtectedSandApp.s("އ\u0001"), ProtectedSandApp.s("ކ\u0001"), 0);
        }

        public final void Z(@fg.l GoogleMap googleMap, @fg.m GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
            kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ވ\u0001"));
            googleMap.setOnIndoorStateChangeListener(onIndoorStateChangeListener);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(GoogleMap googleMap, GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
            Z(googleMap, onIndoorStateChangeListener);
            return k2.f75408a;
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/google/maps/android/compose/l0$k", "Lcom/google/android/gms/maps/GoogleMap$OnIndoorStateChangeListener;", "Lkotlin/k2;", "onIndoorBuildingFocused", "()V", "Lcom/google/android/gms/maps/model/IndoorBuilding;", "building", "onIndoorLevelActivated", "(Lcom/google/android/gms/maps/model/IndoorBuilding;)V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements GoogleMap.OnIndoorStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.k<com.google.maps.android.compose.q> f61822a;

        k(kotlin.reflect.k<com.google.maps.android.compose.q> kVar) {
            this.f61822a = kVar;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
        public void onIndoorBuildingFocused() {
            this.f61822a.invoke().onIndoorBuildingFocused();
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
        public void onIndoorLevelActivated(@fg.l IndoorBuilding building) {
            kotlin.jvm.internal.l0.p(building, ProtectedSandApp.s("މ\u0001"));
            this.f61822a.invoke().onIndoorLevelActivated(building);
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class m extends kotlin.jvm.internal.h0 implements ld.p<GoogleMap, GoogleMap.OnMapClickListener, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final m f61823d = new m();

        m() {
            super(2, GoogleMap.class, ProtectedSandApp.s("ލ\u0001"), ProtectedSandApp.s("ތ\u0001"), 0);
        }

        public final void Z(@fg.l GoogleMap googleMap, @fg.m GoogleMap.OnMapClickListener onMapClickListener) {
            kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ގ\u0001"));
            googleMap.setOnMapClickListener(onMapClickListener);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(GoogleMap googleMap, GoogleMap.OnMapClickListener onMapClickListener) {
            Z(googleMap, onMapClickListener);
            return k2.f75408a;
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class o extends kotlin.jvm.internal.h0 implements ld.p<GoogleMap, GoogleMap.OnMapLongClickListener, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final o f61824d = new o();

        o() {
            super(2, GoogleMap.class, ProtectedSandApp.s("ޒ\u0001"), ProtectedSandApp.s("ޑ\u0001"), 0);
        }

        public final void Z(@fg.l GoogleMap googleMap, @fg.m GoogleMap.OnMapLongClickListener onMapLongClickListener) {
            kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ޓ\u0001"));
            googleMap.setOnMapLongClickListener(onMapLongClickListener);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(GoogleMap googleMap, GoogleMap.OnMapLongClickListener onMapLongClickListener) {
            Z(googleMap, onMapLongClickListener);
            return k2.f75408a;
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class q extends kotlin.jvm.internal.h0 implements ld.p<GoogleMap, GoogleMap.OnMapLoadedCallback, k2> {

        /* renamed from: d, reason: collision with root package name */
        public static final q f61825d = new q();

        q() {
            super(2, GoogleMap.class, ProtectedSandApp.s("ޗ\u0001"), ProtectedSandApp.s("ޖ\u0001"), 0);
        }

        public final void Z(@fg.l GoogleMap googleMap, @fg.m GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
            kotlin.jvm.internal.l0.p(googleMap, ProtectedSandApp.s("ޘ\u0001"));
            googleMap.setOnMapLoadedCallback(onMapLoadedCallback);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(GoogleMap googleMap, GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
            Z(googleMap, onMapLoadedCallback);
            return k2.f75408a;
        }
    }

    /* compiled from: MapClickListeners.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f61826b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(int i4) {
            super(2);
            this.f61826b = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            l0.i(tVar, g3.b(this.f61826b | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    public static final void g(ld.a<? extends Object> aVar, ld.a<? extends d0<?>> aVar2, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1042600347);
        if ((i4 & 14) == 0) {
            i5 = (o4.S(aVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.S(aVar2) ? 32 : 16;
        }
        if ((i5 & 91) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1042600347, i5, -1, ProtectedSandApp.s("ޛ\u0001"));
            }
            if (aVar.invoke() != null) {
                o4.P(1886828752);
                if (!(o4.s() instanceof b0)) {
                    androidx.compose.runtime.p.n();
                }
                o4.v();
                if (o4.getInserting()) {
                    o4.F(new a(aVar2));
                } else {
                    o4.C();
                }
                o4.H();
                o4.p0();
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(aVar, aVar2, i4));
        }
    }

    @androidx.compose.runtime.i
    private static final <L> void h(ld.a<? extends Object> aVar, ld.p<? super GoogleMap, ? super L, k2> pVar, L l4, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-649632125);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-649632125, i4, -1, ProtectedSandApp.s("ޜ\u0001"));
        }
        androidx.compose.runtime.e<?> s4 = tVar.s();
        kotlin.jvm.internal.l0.n(s4, ProtectedSandApp.s("ޝ\u0001"));
        g(aVar, new b((b0) s4, pVar, l4), tVar, i4 & 14);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
    }

    @androidx.compose.runtime.i
    public static final void i(@fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(1792062778);
        if (i4 == 0 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1792062778, i4, -1, ProtectedSandApp.s("ޞ\u0001"));
            }
            androidx.compose.runtime.e<?> s4 = o4.s();
            kotlin.jvm.internal.l0.n(s4, ProtectedSandApp.s("ޝ\u0001"));
            e0 mapClickListeners = ((b0) s4).getMapClickListeners();
            o4.P(-918933839);
            kotlin.jvm.internal.v0 v0Var = new kotlin.jvm.internal.v0(mapClickListeners) { // from class: com.google.maps.android.compose.l0.i
                {
                    String s5 = ProtectedSandApp.s("ބ\u0001");
                    String s6 = ProtectedSandApp.s("ޅ\u0001");
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.p
                @fg.m
                public Object get() {
                    return ((e0) this.receiver).a();
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.k
                public void set(@fg.m Object obj) {
                    ((e0) this.receiver).h((com.google.maps.android.compose.q) obj);
                }
            };
            h(v0Var, j.f61821d, new k(v0Var), o4, 8);
            o4.p0();
            o4.P(-918933301);
            final kotlin.jvm.internal.v0 v0Var2 = new kotlin.jvm.internal.v0(mapClickListeners) { // from class: com.google.maps.android.compose.l0.l
                {
                    String s5 = ProtectedSandApp.s("ފ\u0001");
                    String s6 = ProtectedSandApp.s("ދ\u0001");
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.p
                @fg.m
                public Object get() {
                    return ((e0) this.receiver).b();
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.k
                public void set(@fg.m Object obj) {
                    ((e0) this.receiver).i((ld.l) obj);
                }
            };
            h(v0Var2, m.f61823d, new GoogleMap.OnMapClickListener() { // from class: com.google.maps.android.compose.f0
                @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
                public final void onMapClick(LatLng latLng) {
                    l0.l(kotlin.reflect.k.this, latLng);
                }
            }, o4, 520);
            o4.p0();
            o4.P(-918933054);
            final kotlin.jvm.internal.v0 v0Var3 = new kotlin.jvm.internal.v0(mapClickListeners) { // from class: com.google.maps.android.compose.l0.n
                {
                    String s5 = ProtectedSandApp.s("ޏ\u0001");
                    String s6 = ProtectedSandApp.s("ސ\u0001");
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.p
                @fg.m
                public Object get() {
                    return ((e0) this.receiver).d();
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.k
                public void set(@fg.m Object obj) {
                    ((e0) this.receiver).k((ld.l) obj);
                }
            };
            h(v0Var3, o.f61824d, new GoogleMap.OnMapLongClickListener() { // from class: com.google.maps.android.compose.g0
                @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
                public final void onMapLongClick(LatLng latLng) {
                    l0.m(kotlin.reflect.k.this, latLng);
                }
            }, o4, 520);
            o4.p0();
            o4.P(-918932802);
            final kotlin.jvm.internal.v0 v0Var4 = new kotlin.jvm.internal.v0(mapClickListeners) { // from class: com.google.maps.android.compose.l0.p
                {
                    String s5 = ProtectedSandApp.s("ޔ\u0001");
                    String s6 = ProtectedSandApp.s("ޕ\u0001");
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.p
                @fg.m
                public Object get() {
                    return ((e0) this.receiver).c();
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.k
                public void set(@fg.m Object obj) {
                    ((e0) this.receiver).j((ld.a) obj);
                }
            };
            h(v0Var4, q.f61825d, new GoogleMap.OnMapLoadedCallback() { // from class: com.google.maps.android.compose.h0
                @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
                public final void onMapLoaded() {
                    l0.n(kotlin.reflect.k.this);
                }
            }, o4, 520);
            o4.p0();
            o4.P(-918932546);
            final kotlin.jvm.internal.v0 v0Var5 = new kotlin.jvm.internal.v0(mapClickListeners) { // from class: com.google.maps.android.compose.l0.r
                {
                    String s5 = ProtectedSandApp.s("ޙ\u0001");
                    String s6 = ProtectedSandApp.s("ޚ\u0001");
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.p
                @fg.m
                public Object get() {
                    return ((e0) this.receiver).e();
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.k
                public void set(@fg.m Object obj) {
                    ((e0) this.receiver).l((ld.a) obj);
                }
            };
            h(v0Var5, d.f61818d, new GoogleMap.OnMyLocationButtonClickListener() { // from class: com.google.maps.android.compose.i0
                @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener
                public final boolean onMyLocationButtonClick() {
                    boolean o5;
                    o5 = l0.o(kotlin.reflect.k.this);
                    return o5;
                }
            }, o4, 520);
            o4.p0();
            o4.P(-918932263);
            final kotlin.jvm.internal.v0 v0Var6 = new kotlin.jvm.internal.v0(mapClickListeners) { // from class: com.google.maps.android.compose.l0.e
                {
                    String s5 = ProtectedSandApp.s("ݺ\u0001");
                    String s6 = ProtectedSandApp.s("ݻ\u0001");
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.p
                @fg.m
                public Object get() {
                    return ((e0) this.receiver).f();
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.k
                public void set(@fg.m Object obj) {
                    ((e0) this.receiver).m((ld.l) obj);
                }
            };
            h(v0Var6, f.f61819d, new GoogleMap.OnMyLocationClickListener() { // from class: com.google.maps.android.compose.j0
                @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener
                public final void onMyLocationClick(Location location) {
                    l0.j(kotlin.reflect.k.this, location);
                }
            }, o4, 520);
            o4.p0();
            o4.P(-918932006);
            final kotlin.jvm.internal.v0 v0Var7 = new kotlin.jvm.internal.v0(mapClickListeners) { // from class: com.google.maps.android.compose.l0.g
                {
                    String s5 = ProtectedSandApp.s("ݿ\u0001");
                    String s6 = ProtectedSandApp.s("ހ\u0001");
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.p
                @fg.m
                public Object get() {
                    return ((e0) this.receiver).g();
                }

                @Override // kotlin.jvm.internal.v0, kotlin.reflect.k
                public void set(@fg.m Object obj) {
                    ((e0) this.receiver).n((ld.l) obj);
                }
            };
            h(v0Var7, h.f61820d, new GoogleMap.OnPoiClickListener() { // from class: com.google.maps.android.compose.k0
                @Override // com.google.android.gms.maps.GoogleMap.OnPoiClickListener
                public final void onPoiClick(PointOfInterest pointOfInterest) {
                    l0.k(kotlin.reflect.k.this, pointOfInterest);
                }
            }, o4, 520);
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new s(i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(kotlin.reflect.k kVar, Location location) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("ޟ\u0001"));
        kotlin.jvm.internal.l0.p(location, ProtectedSandApp.s("ޠ\u0001"));
        ld.l lVar = (ld.l) kVar.invoke();
        if (lVar != null) {
            lVar.invoke(location);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(kotlin.reflect.k kVar, PointOfInterest pointOfInterest) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("ޟ\u0001"));
        kotlin.jvm.internal.l0.p(pointOfInterest, ProtectedSandApp.s("ޠ\u0001"));
        ld.l lVar = (ld.l) kVar.invoke();
        if (lVar != null) {
            lVar.invoke(pointOfInterest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(kotlin.reflect.k kVar, LatLng latLng) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("ޟ\u0001"));
        kotlin.jvm.internal.l0.p(latLng, ProtectedSandApp.s("ޠ\u0001"));
        ld.l lVar = (ld.l) kVar.invoke();
        if (lVar != null) {
            lVar.invoke(latLng);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(kotlin.reflect.k kVar, LatLng latLng) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("ޟ\u0001"));
        kotlin.jvm.internal.l0.p(latLng, ProtectedSandApp.s("ޠ\u0001"));
        ld.l lVar = (ld.l) kVar.invoke();
        if (lVar != null) {
            lVar.invoke(latLng);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(kotlin.reflect.k kVar) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("ޟ\u0001"));
        ld.a aVar = (ld.a) kVar.invoke();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(kotlin.reflect.k kVar) {
        kotlin.jvm.internal.l0.p(kVar, ProtectedSandApp.s("ޟ\u0001"));
        ld.a aVar = (ld.a) kVar.invoke();
        if (aVar != null) {
            return ((Boolean) aVar.invoke()).booleanValue();
        }
        return false;
    }
}
