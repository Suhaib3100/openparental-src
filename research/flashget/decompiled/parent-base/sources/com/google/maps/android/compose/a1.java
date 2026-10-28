package com.google.maps.android.compose;

import android.annotation.SuppressLint;
import androidx.compose.runtime.m5;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: MapUpdater.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aP\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0081\b¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0014\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"", "mergeDescendants", "", "contentDescription", "Lcom/google/maps/android/compose/b;", "cameraPositionState", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "Lcom/google/android/gms/maps/LocationSource;", "locationSource", "Lcom/google/maps/android/compose/q0;", "mapProperties", "Lcom/google/maps/android/compose/y0;", "mapUiSettings", "Lkotlin/k2;", "a", "(ZLjava/lang/String;Lcom/google/maps/android/compose/b;Landroidx/compose/foundation/layout/l1;Lcom/google/android/gms/maps/LocationSource;Lcom/google/maps/android/compose/q0;Lcom/google/maps/android/compose/y0;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/layout/l1;", "b", "()Landroidx/compose/foundation/layout/l1;", "NoPadding", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n74#2:166\n74#2:167\n251#3,10:168\n*S KotlinDebug\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt\n*L\n110#1:166\n111#1:167\n112#1:168,10\n*E\n"})
/* loaded from: classes6.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f61038a = androidx.compose.foundation.layout.j1.c(0.0f, 0.0f, 3, null);

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.a<w0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f61039b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f61039b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.w0, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final w0 invoke() {
            return this.f61039b.invoke();
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "Lcom/google/android/gms/maps/model/LatLngBounds;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Lcom/google/android/gms/maps/model/LatLngBounds;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$9\n*L\n1#1,165:1\n*E\n"})
    static final class a0 extends kotlin.jvm.internal.n0 implements ld.p<w0, LatLngBounds, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(GoogleMap googleMap) {
            super(2);
            this.f61040b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, @fg.m LatLngBounds latLngBounds) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٰ\u0001"));
            this.f61040b.setLatLngBoundsForCameraTarget(latLngBounds);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, LatLngBounds latLngBounds) {
            a(w0Var, latLngBounds);
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/w0;", "a", "()Lcom/google/maps/android/compose/w0;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$1\n*L\n1#1,165:1\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.a<w0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61041b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.b f61042c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f61043d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f61044e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.w f61045f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GoogleMap googleMap, com.google.maps.android.compose.b bVar, String str, androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar) {
            super(0);
            this.f61041b = googleMap;
            this.f61042c = bVar;
            this.f61043d = str;
            this.f61044e = dVar;
            this.f61045f = wVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w0 invoke() {
            return new w0(this.f61041b, this.f61042c, this.f61043d, this.f61044e, this.f61045f);
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "Lcom/google/android/gms/maps/model/MapStyleOptions;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Lcom/google/android/gms/maps/model/MapStyleOptions;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$10\n*L\n1#1,165:1\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<w0, MapStyleOptions, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61046b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GoogleMap googleMap) {
            super(2);
            this.f61046b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, @fg.m MapStyleOptions mapStyleOptions) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٱ\u0001"));
            this.f61046b.setMapStyle(mapStyleOptions);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, MapStyleOptions mapStyleOptions) {
            a(w0Var, mapStyleOptions);
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "Lcom/google/maps/android/compose/x0;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Lcom/google/maps/android/compose/x0;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$11\n*L\n1#1,165:1\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<w0, x0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61047b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GoogleMap googleMap) {
            super(2);
            this.f61047b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, @fg.l x0 x0Var) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٲ\u0001"));
            kotlin.jvm.internal.l0.p(x0Var, ProtectedSandApp.s("ٳ\u0001"));
            this.f61047b.setMapType(x0Var.getValue());
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, x0 x0Var) {
            a(w0Var, x0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;F)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$12\n*L\n1#1,165:1\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<w0, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61048b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(GoogleMap googleMap) {
            super(2);
            this.f61048b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, float f4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٴ\u0001"));
            this.f61048b.setMaxZoomPreference(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Float f4) {
            a(w0Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;F)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$13\n*L\n1#1,165:1\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<w0, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61049b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(GoogleMap googleMap) {
            super(2);
            this.f61049b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, float f4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٵ\u0001"));
            this.f61049b.setMinZoomPreference(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Float f4) {
            a(w0Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "Landroidx/compose/foundation/layout/l1;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Landroidx/compose/foundation/layout/l1;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$14\n*L\n1#1,165:1\n*E\n"})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<w0, androidx.compose.foundation.layout.l1, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61050b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(GoogleMap googleMap) {
            super(2);
            this.f61050b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, @fg.l androidx.compose.foundation.layout.l1 l1Var) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٶ\u0001"));
            kotlin.jvm.internal.l0.p(l1Var, ProtectedSandApp.s("ٷ\u0001"));
            androidx.compose.ui.unit.d density = w0Var.getDensity();
            this.f61050b.setPadding(density.q2(l1Var.b(w0Var.getLayoutDirection())), density.q2(l1Var.getTop()), density.q2(l1Var.c(w0Var.getLayoutDirection())), density.q2(l1Var.getBottom()));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, androidx.compose.foundation.layout.l1 l1Var) {
            a(w0Var, l1Var);
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$15\n*L\n1#1,165:1\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61051b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(GoogleMap googleMap) {
            super(2);
            this.f61051b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٸ\u0001"));
            this.f61051b.getUiSettings().setCompassEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$16\n*L\n1#1,165:1\n*E\n"})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(GoogleMap googleMap) {
            super(2);
            this.f61052b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٹ\u0001"));
            this.f61052b.getUiSettings().setIndoorLevelPickerEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$17\n*L\n1#1,165:1\n*E\n"})
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(GoogleMap googleMap) {
            super(2);
            this.f61053b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٺ\u0001"));
            this.f61053b.getUiSettings().setMapToolbarEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$18\n*L\n1#1,165:1\n*E\n"})
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(GoogleMap googleMap) {
            super(2);
            this.f61054b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٻ\u0001"));
            this.f61054b.getUiSettings().setMyLocationButtonEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$19\n*L\n1#1,165:1\n*E\n"})
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61055b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(GoogleMap googleMap) {
            super(2);
            this.f61055b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ټ\u0001"));
            this.f61055b.getUiSettings().setRotateGesturesEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "Landroidx/compose/ui/unit/d;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Landroidx/compose/ui/unit/d;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$1\n*L\n1#1,165:1\n*E\n"})
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<w0, androidx.compose.ui.unit.d, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f61056b = new m(2);

        public m() {
            super(2);
        }

        public final void a(@fg.l w0 w0Var, @fg.l androidx.compose.ui.unit.d dVar) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٽ\u0001"));
            kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("پ\u0001"));
            w0Var.s(dVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, androidx.compose.ui.unit.d dVar) {
            a(w0Var, dVar);
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$20\n*L\n1#1,165:1\n*E\n"})
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61057b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(GoogleMap googleMap) {
            super(2);
            this.f61057b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ٿ\u0001"));
            this.f61057b.getUiSettings().setScrollGesturesEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$21\n*L\n1#1,165:1\n*E\n"})
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61058b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(GoogleMap googleMap) {
            super(2);
            this.f61058b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ڀ\u0001"));
            this.f61058b.getUiSettings().setScrollGesturesEnabledDuringRotateOrZoom(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$22\n*L\n1#1,165:1\n*E\n"})
    static final class p extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(GoogleMap googleMap) {
            super(2);
            this.f61059b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ځ\u0001"));
            this.f61059b.getUiSettings().setTiltGesturesEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$23\n*L\n1#1,165:1\n*E\n"})
    static final class q extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61060b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(GoogleMap googleMap) {
            super(2);
            this.f61060b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ڂ\u0001"));
            this.f61060b.getUiSettings().setZoomControlsEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$24\n*L\n1#1,165:1\n*E\n"})
    static final class r extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(GoogleMap googleMap) {
            super(2);
            this.f61061b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ڃ\u0001"));
            this.f61061b.getUiSettings().setZoomGesturesEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "Lcom/google/maps/android/compose/b;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Lcom/google/maps/android/compose/b;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$25\n*L\n1#1,165:1\n*E\n"})
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<w0, com.google.maps.android.compose.b, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final s f61062b = new s(2);

        public s() {
            super(2);
        }

        public final void a(@fg.l w0 w0Var, @fg.l com.google.maps.android.compose.b bVar) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ڄ\u0001"));
            kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("څ\u0001"));
            w0Var.q(bVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, com.google.maps.android.compose.b bVar) {
            a(w0Var, bVar);
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "Landroidx/compose/ui/unit/w;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Landroidx/compose/ui/unit/w;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$2\n*L\n1#1,165:1\n*E\n"})
    static final class t extends kotlin.jvm.internal.n0 implements ld.p<w0, androidx.compose.ui.unit.w, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final t f61063b = new t(2);

        public t() {
            super(2);
        }

        public final void a(@fg.l w0 w0Var, @fg.l androidx.compose.ui.unit.w wVar) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("چ\u0001"));
            kotlin.jvm.internal.l0.p(wVar, ProtectedSandApp.s("ڇ\u0001"));
            w0Var.t(wVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, androidx.compose.ui.unit.w wVar) {
            a(w0Var, wVar);
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$3\n*L\n1#1,165:1\n*E\n"})
    static final class u extends kotlin.jvm.internal.n0 implements ld.p<w0, String, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final u f61064b = new u(2);

        public u() {
            super(2);
        }

        public final void a(@fg.l w0 w0Var, @fg.m String str) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ڈ\u0001"));
            w0Var.r(str);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, String str) {
            a(w0Var, str);
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "Lcom/google/android/gms/maps/LocationSource;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Lcom/google/android/gms/maps/LocationSource;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$4\n*L\n1#1,165:1\n*E\n"})
    static final class v extends kotlin.jvm.internal.n0 implements ld.p<w0, LocationSource, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61065b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(GoogleMap googleMap) {
            super(2);
            this.f61065b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, @fg.m LocationSource locationSource) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ډ\u0001"));
            this.f61065b.setLocationSource(locationSource);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, LocationSource locationSource) {
            a(w0Var, locationSource);
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$5\n*L\n1#1,165:1\n*E\n"})
    static final class w extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61066b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(GoogleMap googleMap) {
            super(2);
            this.f61066b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ڊ\u0001"));
            this.f61066b.setBuildingsEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$6\n*L\n1#1,165:1\n*E\n"})
    static final class x extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61067b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(GoogleMap googleMap) {
            super(2);
            this.f61067b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ڋ\u0001"));
            this.f61067b.setIndoorEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$7\n*L\n1#1,165:1\n*E\n"})
    static final class y extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61068b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(GoogleMap googleMap) {
            super(2);
            this.f61068b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ڌ\u0001"));
            this.f61068b.setMyLocationEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: MapUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/w0;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/w0;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nMapUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapUpdater.kt\ncom/google/maps/android/compose/MapUpdaterKt$MapUpdater$2$8\n*L\n1#1,165:1\n*E\n"})
    static final class z extends kotlin.jvm.internal.n0 implements ld.p<w0, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GoogleMap f61069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(GoogleMap googleMap) {
            super(2);
            this.f61069b = googleMap;
        }

        public final void a(@fg.l w0 w0Var, boolean z4) {
            kotlin.jvm.internal.l0.p(w0Var, ProtectedSandApp.s("ڍ\u0001"));
            this.f61069b.setTrafficEnabled(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(w0 w0Var, Boolean bool) {
            a(w0Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    @androidx.compose.runtime.i
    @SuppressLint({"MissingPermission"})
    public static final void a(boolean z4, @fg.m String str, @fg.l com.google.maps.android.compose.b bVar, @fg.m androidx.compose.foundation.layout.l1 l1Var, @fg.m LocationSource locationSource, @fg.l q0 q0Var, @fg.l y0 y0Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("ڎ\u0001"));
        kotlin.jvm.internal.l0.p(q0Var, ProtectedSandApp.s("ڏ\u0001"));
        kotlin.jvm.internal.l0.p(y0Var, ProtectedSandApp.s("ڐ\u0001"));
        tVar.P(1782787885);
        boolean z5 = (i5 & 1) != 0 ? false : z4;
        androidx.compose.foundation.layout.l1 l1Var2 = (i5 & 8) != 0 ? f61038a : l1Var;
        androidx.compose.runtime.e<?> s4 = tVar.s();
        String s5 = ProtectedSandApp.s("ڑ\u0001");
        kotlin.jvm.internal.l0.n(s4, s5);
        GoogleMap map = ((b0) s4).getMap();
        androidx.compose.runtime.e<?> s6 = tVar.s();
        kotlin.jvm.internal.l0.n(s6, s5);
        MapView mapView = ((b0) s6).getMapView();
        if (z5) {
            mapView.setImportantForAccessibility(4);
        }
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) tVar.x(androidx.compose.ui.platform.h1.i());
        androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) tVar.x(androidx.compose.ui.platform.h1.p());
        b bVar2 = new b(map, bVar, str, dVar, wVar);
        tVar.P(1886828752);
        if (!(tVar.s() instanceof b0)) {
            androidx.compose.runtime.p.n();
        }
        tVar.v();
        if (tVar.getInserting()) {
            tVar.F(new a(bVar2));
        } else {
            tVar.C();
        }
        m5.n(tVar, dVar, m.f61056b);
        m5.n(tVar, wVar, t.f61063b);
        m5.n(tVar, str, u.f61064b);
        m5.j(tVar, locationSource, new v(map));
        m5.j(tVar, Boolean.valueOf(q0Var.getIsBuildingEnabled()), new w(map));
        m5.j(tVar, Boolean.valueOf(q0Var.getIsIndoorEnabled()), new x(map));
        m5.j(tVar, Boolean.valueOf(q0Var.getIsMyLocationEnabled()), new y(map));
        m5.j(tVar, Boolean.valueOf(q0Var.getIsTrafficEnabled()), new z(map));
        m5.j(tVar, q0Var.getLatLngBoundsForCameraTarget(), new a0(map));
        m5.j(tVar, q0Var.getMapStyleOptions(), new c(map));
        m5.j(tVar, q0Var.getMapType(), new d(map));
        m5.j(tVar, Float.valueOf(q0Var.getMaxZoomPreference()), new e(map));
        m5.j(tVar, Float.valueOf(q0Var.getMinZoomPreference()), new f(map));
        m5.j(tVar, l1Var2, new g(map));
        m5.j(tVar, Boolean.valueOf(y0Var.getCompassEnabled()), new h(map));
        m5.j(tVar, Boolean.valueOf(y0Var.getIndoorLevelPickerEnabled()), new i(map));
        m5.j(tVar, Boolean.valueOf(y0Var.getMapToolbarEnabled()), new j(map));
        m5.j(tVar, Boolean.valueOf(y0Var.getMyLocationButtonEnabled()), new k(map));
        m5.j(tVar, Boolean.valueOf(y0Var.getRotationGesturesEnabled()), new l(map));
        m5.j(tVar, Boolean.valueOf(y0Var.getScrollGesturesEnabled()), new n(map));
        m5.j(tVar, Boolean.valueOf(y0Var.getScrollGesturesEnabledDuringRotateOrZoom()), new o(map));
        m5.j(tVar, Boolean.valueOf(y0Var.getTiltGesturesEnabled()), new p(map));
        m5.j(tVar, Boolean.valueOf(y0Var.getZoomControlsEnabled()), new q(map));
        m5.j(tVar, Boolean.valueOf(y0Var.getZoomGesturesEnabled()), new r(map));
        m5.n(tVar, bVar, s.f61062b);
        tVar.H();
        tVar.p0();
        tVar.p0();
    }

    @fg.l
    public static final androidx.compose.foundation.layout.l1 b() {
        return f61038a;
    }
}
