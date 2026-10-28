package com.google.maps.android.compose;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.f2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Circle.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0094\u0001\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\f2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "center", "", "clickable", "Landroidx/compose/ui/graphics/d2;", "fillColor", "", "radius", "strokeColor", "", "Lcom/google/android/gms/maps/model/PatternItem;", "strokePattern", "", "strokeWidth", "", "tag", "visible", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Circle;", "Lkotlin/k2;", "onClick", "a", "(Lcom/google/android/gms/maps/model/LatLng;ZJDJLjava/util/List;FLjava/lang/Object;ZFLld/l;Landroidx/compose/runtime/t;III)V", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Circle.kt\ncom/google/maps/android/compose/CircleKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,99:1\n251#2,10:100\n*S KotlinDebug\n*F\n+ 1 Circle.kt\ncom/google/maps/android/compose/CircleKt\n*L\n68#1:100,10\n*E\n"})
/* loaded from: classes6.dex */
public final class d {

    /* compiled from: Circle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Circle, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61370b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l Circle circle) {
            kotlin.jvm.internal.l0.p(circle, ProtectedSandApp.s("ܓ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Circle circle) {
            a(circle);
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/e;", "a", "()Lcom/google/maps/android/compose/e;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Circle.kt\ncom/google/maps/android/compose/CircleKt$Circle$2\n+ 2 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt\n+ 3 CircleOptions.kt\ncom/google/maps/android/ktx/model/CircleOptionsKt\n*L\n1#1,99:1\n472#2,2:100\n474#2:105\n28#3,3:102\n*S KotlinDebug\n*F\n+ 1 Circle.kt\ncom/google/maps/android/compose/CircleKt$Circle$2\n*L\n70#1:100,2\n70#1:105\n70#1:102,3\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<com.google.maps.android.compose.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f61371b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61372c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Circle, k2> f61373d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LatLng f61374e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61375f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f61376g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ double f61377h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f61378i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<PatternItem> f61379j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f61380k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f61381l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f61382m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b0 b0Var, Object obj, ld.l<? super Circle, k2> lVar, LatLng latLng, boolean z4, long j4, double d5, long j5, List<? extends PatternItem> list, float f4, boolean z5, float f5) {
            super(0);
            this.f61371b = b0Var;
            this.f61372c = obj;
            this.f61373d = lVar;
            this.f61374e = latLng;
            this.f61375f = z4;
            this.f61376g = j4;
            this.f61377h = d5;
            this.f61378i = j5;
            this.f61379j = list;
            this.f61380k = f4;
            this.f61381l = z5;
            this.f61382m = f5;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.google.maps.android.compose.e invoke() {
            GoogleMap map;
            b0 b0Var = this.f61371b;
            if (b0Var != null && (map = b0Var.getMap()) != null) {
                LatLng latLng = this.f61374e;
                boolean z4 = this.f61375f;
                long j4 = this.f61376g;
                double d5 = this.f61377h;
                long j5 = this.f61378i;
                List<PatternItem> list = this.f61379j;
                float f4 = this.f61380k;
                boolean z5 = this.f61381l;
                float f5 = this.f61382m;
                CircleOptions circleOptions = new CircleOptions();
                circleOptions.center(latLng);
                circleOptions.clickable(z4);
                circleOptions.fillColor(f2.r(j4));
                circleOptions.radius(d5);
                circleOptions.strokeColor(f2.r(j5));
                circleOptions.strokePattern(list);
                circleOptions.strokeWidth(f4);
                circleOptions.visible(z5);
                circleOptions.zIndex(f5);
                Circle addCircle = map.addCircle(circleOptions);
                kotlin.jvm.internal.l0.o(addCircle, ProtectedSandApp.s("ܔ\u0001"));
                if (addCircle != null) {
                    addCircle.setTag(this.f61372c);
                    return new com.google.maps.android.compose.e(addCircle, this.f61373d);
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("ܕ\u0001"));
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/e;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/e;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f61383b = new c(2);

        c() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, boolean z4) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܖ\u0001"));
            eVar.getCircle().setVisible(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, Boolean bool) {
            a(eVar, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/e;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/e;F)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.google.maps.android.compose.d$d, reason: collision with other inner class name */
    static final class C0948d extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0948d f61384b = new C0948d(2);

        C0948d() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, float f4) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܗ\u0001"));
            eVar.getCircle().setZIndex(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, Float f4) {
            a(eVar, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/e;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Circle;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/e;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, ld.l<? super Circle, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f61385b = new e(2);

        e() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, @fg.l ld.l<? super Circle, k2> lVar) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܘ\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ܙ\u0001"));
            eVar.f(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, ld.l<? super Circle, ? extends k2> lVar) {
            a(eVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/e;", "Lcom/google/android/gms/maps/model/LatLng;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/e;Lcom/google/android/gms/maps/model/LatLng;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, LatLng, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f61386b = new f(2);

        f() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, @fg.l LatLng latLng) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܚ\u0001"));
            kotlin.jvm.internal.l0.p(latLng, ProtectedSandApp.s("ܛ\u0001"));
            eVar.getCircle().setCenter(latLng);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, LatLng latLng) {
            a(eVar, latLng);
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/e;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/e;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f61387b = new g(2);

        g() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, boolean z4) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܜ\u0001"));
            eVar.getCircle().setClickable(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, Boolean bool) {
            a(eVar, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/e;", "Landroidx/compose/ui/graphics/d2;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/e;J)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, d2, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f61388b = new h(2);

        h() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, long j4) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܝ\u0001"));
            eVar.getCircle().setFillColor(f2.r(j4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, d2 d2Var) {
            a(eVar, d2Var.M());
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/e;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/e;D)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, Double, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f61389b = new i(2);

        i() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, double d5) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܞ\u0001"));
            eVar.getCircle().setRadius(d5);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, Double d5) {
            a(eVar, d5.doubleValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/e;", "Landroidx/compose/ui/graphics/d2;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/e;J)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, d2, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f61390b = new j(2);

        j() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, long j4) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܟ\u0001"));
            eVar.getCircle().setStrokeColor(f2.r(j4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, d2 d2Var) {
            a(eVar, d2Var.M());
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/e;", "", "Lcom/google/android/gms/maps/model/PatternItem;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/e;Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, List<? extends PatternItem>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f61391b = new k(2);

        k() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, @fg.m List<? extends PatternItem> list) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܠ\u0001"));
            eVar.getCircle().setStrokePattern(list);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, List<? extends PatternItem> list) {
            a(eVar, list);
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/e;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/e;F)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f61392b = new l(2);

        l() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, float f4) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܡ\u0001"));
            eVar.getCircle().setStrokeWidth(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, Float f4) {
            a(eVar, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/e;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<com.google.maps.android.compose.e, Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f61393b = new m(2);

        m() {
            super(2);
        }

        public final void a(@fg.l com.google.maps.android.compose.e eVar, @fg.m Object obj) {
            kotlin.jvm.internal.l0.p(eVar, ProtectedSandApp.s("ܢ\u0001"));
            eVar.getCircle().setTag(obj);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.e eVar, Object obj) {
            a(eVar, obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Circle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LatLng f61394b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f61395c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f61396d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ double f61397e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f61398f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<PatternItem> f61399g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f61400h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f61401i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f61402j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f61403k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.l<Circle, k2> f61404l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f61405m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f61406n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f61407o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(LatLng latLng, boolean z4, long j4, double d5, long j5, List<? extends PatternItem> list, float f4, Object obj, boolean z5, float f5, ld.l<? super Circle, k2> lVar, int i4, int i5, int i6) {
            super(2);
            this.f61394b = latLng;
            this.f61395c = z4;
            this.f61396d = j4;
            this.f61397e = d5;
            this.f61398f = j5;
            this.f61399g = list;
            this.f61400h = f4;
            this.f61401i = obj;
            this.f61402j = z5;
            this.f61403k = f5;
            this.f61404l = lVar;
            this.f61405m = i4;
            this.f61406n = i5;
            this.f61407o = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d.a(this.f61394b, this.f61395c, this.f61396d, this.f61397e, this.f61398f, this.f61399g, this.f61400h, this.f61401i, this.f61402j, this.f61403k, this.f61404l, tVar, g3.b(this.f61405m | 1), g3.b(this.f61406n), this.f61407o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class o extends kotlin.jvm.internal.n0 implements ld.a<com.google.maps.android.compose.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f61408b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ld.a aVar) {
            super(0);
            this.f61408b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.e, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final com.google.maps.android.compose.e invoke() {
            return this.f61408b.invoke();
        }
    }

    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    public static final void a(@fg.l LatLng latLng, boolean z4, long j4, double d5, long j5, @fg.m List<? extends PatternItem> list, float f4, @fg.m Object obj, boolean z5, float f5, @fg.m ld.l<? super Circle, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6) {
        long j6;
        long j7;
        kotlin.jvm.internal.l0.p(latLng, ProtectedSandApp.s("ܮ\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(139485030);
        boolean z6 = (i6 & 2) != 0 ? false : z4;
        if ((i6 & 4) != 0) {
            d2.INSTANCE.getClass();
            j6 = d2.f17777n;
        } else {
            j6 = j4;
        }
        double d6 = (i6 & 8) != 0 ? 0.0d : d5;
        if ((i6 & 16) != 0) {
            d2.INSTANCE.getClass();
            j7 = d2.f17766c;
        } else {
            j7 = j5;
        }
        List<? extends PatternItem> list2 = (i6 & 32) != 0 ? null : list;
        float f6 = (i6 & 64) != 0 ? 10.0f : f4;
        Object obj2 = (i6 & 128) != 0 ? null : obj;
        boolean z7 = (i6 & 256) != 0 ? true : z5;
        float f7 = (i6 & 512) != 0 ? 0.0f : f5;
        ld.l<? super Circle, k2> lVar2 = (i6 & 1024) != 0 ? a.f61370b : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(139485030, i4, i5, ProtectedSandApp.s("ܯ\u0001"));
        }
        androidx.compose.runtime.e<?> s4 = o4.s();
        List<? extends PatternItem> list3 = list2;
        ld.l<? super Circle, k2> lVar3 = lVar2;
        Object obj3 = obj2;
        b bVar = new b(s4 instanceof b0 ? (b0) s4 : null, obj2, lVar2, latLng, z6, j6, d6, j7, list3, f6, z7, f7);
        o4.P(1886828752);
        if (!(o4.s() instanceof b0)) {
            androidx.compose.runtime.p.n();
        }
        o4.v();
        if (o4.getInserting()) {
            o4.F(new o(bVar));
        } else {
            o4.C();
        }
        m5.n(o4, lVar3, e.f61385b);
        m5.j(o4, latLng, f.f61386b);
        m5.j(o4, Boolean.valueOf(z6), g.f61387b);
        m5.j(o4, d2.n(j6), h.f61388b);
        m5.j(o4, Double.valueOf(d6), i.f61389b);
        m5.j(o4, d2.n(j7), j.f61390b);
        m5.j(o4, list3, k.f61391b);
        m5.j(o4, Float.valueOf(f6), l.f61392b);
        m5.j(o4, obj3, m.f61393b);
        m5.j(o4, Boolean.valueOf(z7), c.f61383b);
        m5.j(o4, Float.valueOf(f7), C0948d.f61384b);
        o4.H();
        o4.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new n(latLng, z6, j6, d6, j7, list3, f6, obj3, z7, f7, lVar3, i4, i5, i6));
        }
    }
}
