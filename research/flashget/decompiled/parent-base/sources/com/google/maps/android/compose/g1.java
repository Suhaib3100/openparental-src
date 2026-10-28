package com.google.maps.android.compose;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.f2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Polygon.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aº\u0001\u0010\u0018\u001a\u00020\u00162\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"", "Lcom/google/android/gms/maps/model/LatLng;", "points", "", "clickable", "Landroidx/compose/ui/graphics/d2;", "fillColor", "geodesic", "holes", "strokeColor", "", "strokeJointType", "Lcom/google/android/gms/maps/model/PatternItem;", "strokePattern", "", "strokeWidth", "", "tag", "visible", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Polygon;", "Lkotlin/k2;", "onClick", "a", "(Ljava/util/List;ZJZLjava/util/List;JILjava/util/List;FLjava/lang/Object;ZFLld/l;Landroidx/compose/runtime/t;III)V", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nPolygon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polygon.kt\ncom/google/maps/android/compose/PolygonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,110:1\n251#2,8:111\n259#2,2:125\n3737#3,6:119\n*S KotlinDebug\n*F\n+ 1 Polygon.kt\ncom/google/maps/android/compose/PolygonKt\n*L\n72#1:111,8\n72#1:125,2\n101#1:119,6\n*E\n"})
/* loaded from: classes6.dex */
public final class g1 {

    /* compiled from: Polygon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Polygon, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61454b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l Polygon polygon) {
            kotlin.jvm.internal.l0.p(polygon, ProtectedSandApp.s("ܿ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Polygon polygon) {
            a(polygon);
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/h1;", "a", "()Lcom/google/maps/android/compose/h1;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nPolygon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polygon.kt\ncom/google/maps/android/compose/PolygonKt$Polygon$2\n+ 2 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt\n+ 3 PolygonOptions.kt\ncom/google/maps/android/ktx/model/PolygonOptionsKt\n*L\n1#1,110:1\n503#2,2:111\n505#2:116\n28#3,3:113\n*S KotlinDebug\n*F\n+ 1 Polygon.kt\ncom/google/maps/android/compose/PolygonKt$Polygon$2\n*L\n74#1:111,2\n74#1:116\n74#1:113,3\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<h1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f61455b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61456c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Polygon, k2> f61457d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<LatLng> f61458e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61459f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f61460g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f61461h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List<List<LatLng>> f61462i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f61463j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f61464k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<PatternItem> f61465l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f61466m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f61467n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f61468o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b0 b0Var, Object obj, ld.l<? super Polygon, k2> lVar, List<LatLng> list, boolean z4, long j4, boolean z5, List<? extends List<LatLng>> list2, long j5, int i4, List<? extends PatternItem> list3, float f4, boolean z6, float f5) {
            super(0);
            this.f61455b = b0Var;
            this.f61456c = obj;
            this.f61457d = lVar;
            this.f61458e = list;
            this.f61459f = z4;
            this.f61460g = j4;
            this.f61461h = z5;
            this.f61462i = list2;
            this.f61463j = j5;
            this.f61464k = i4;
            this.f61465l = list3;
            this.f61466m = f4;
            this.f61467n = z6;
            this.f61468o = f5;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h1 invoke() {
            GoogleMap map;
            b0 b0Var = this.f61455b;
            if (b0Var != null && (map = b0Var.getMap()) != null) {
                List<LatLng> list = this.f61458e;
                boolean z4 = this.f61459f;
                long j4 = this.f61460g;
                boolean z5 = this.f61461h;
                List<List<LatLng>> list2 = this.f61462i;
                long j5 = this.f61463j;
                int i4 = this.f61464k;
                List<PatternItem> list3 = this.f61465l;
                float f4 = this.f61466m;
                boolean z6 = this.f61467n;
                float f5 = this.f61468o;
                PolygonOptions polygonOptions = new PolygonOptions();
                polygonOptions.addAll(list);
                polygonOptions.clickable(z4);
                polygonOptions.fillColor(f2.r(j4));
                polygonOptions.geodesic(z5);
                Iterator<List<LatLng>> it = list2.iterator();
                while (it.hasNext()) {
                    polygonOptions.addHole(it.next());
                }
                polygonOptions.strokeColor(f2.r(j5));
                polygonOptions.strokeJointType(i4);
                polygonOptions.strokePattern(list3);
                polygonOptions.strokeWidth(f4);
                polygonOptions.visible(z6);
                polygonOptions.zIndex(f5);
                Polygon addPolygon = map.addPolygon(polygonOptions);
                kotlin.jvm.internal.l0.o(addPolygon, ProtectedSandApp.s("݀\u0001"));
                if (addPolygon != null) {
                    addPolygon.setTag(this.f61456c);
                    return new h1(addPolygon, this.f61457d);
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("݁\u0001"));
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/h1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<h1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f61469b = new c(2);

        c() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, float f4) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("݂\u0001"));
            h1Var.getPolygon().setStrokeWidth(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, Float f4) {
            a(h1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/h1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<h1, Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f61470b = new d(2);

        d() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, @fg.m Object obj) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("݃\u0001"));
            h1Var.getPolygon().setTag(obj);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, Object obj) {
            a(h1Var, obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/h1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<h1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f61471b = new e(2);

        e() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("݄\u0001"));
            h1Var.getPolygon().setVisible(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, Boolean bool) {
            a(h1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/h1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<h1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f61472b = new f(2);

        f() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, float f4) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("݅\u0001"));
            h1Var.getPolygon().setZIndex(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, Float f4) {
            a(h1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/h1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Polygon;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/h1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<h1, ld.l<? super Polygon, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f61473b = new g(2);

        g() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, @fg.l ld.l<? super Polygon, k2> lVar) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("݆\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("݇\u0001"));
            h1Var.f(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, ld.l<? super Polygon, ? extends k2> lVar) {
            a(h1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/h1;", "", "Lcom/google/android/gms/maps/model/LatLng;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<h1, List<? extends LatLng>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f61474b = new h(2);

        h() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, @fg.l List<LatLng> list) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("݈\u0001"));
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("݉\u0001"));
            h1Var.getPolygon().setPoints(list);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, List<? extends LatLng> list) {
            a(h1Var, list);
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/h1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<h1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f61475b = new i(2);

        i() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("݊\u0001"));
            h1Var.getPolygon().setClickable(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, Boolean bool) {
            a(h1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/h1;", "Landroidx/compose/ui/graphics/d2;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;J)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<h1, d2, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f61476b = new j(2);

        j() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, long j4) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("\u074b\u0001"));
            h1Var.getPolygon().setFillColor(f2.r(j4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, d2 d2Var) {
            a(h1Var, d2Var.M());
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/h1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<h1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f61477b = new k(2);

        k() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("\u074c\u0001"));
            h1Var.getPolygon().setGeodesic(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, Boolean bool) {
            a(h1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/h1;", "", "Lcom/google/android/gms/maps/model/LatLng;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<h1, List<? extends List<? extends LatLng>>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f61478b = new l(2);

        l() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, @fg.l List<? extends List<LatLng>> list) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("ݍ\u0001"));
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("ݎ\u0001"));
            h1Var.getPolygon().setHoles(list);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, List<? extends List<? extends LatLng>> list) {
            a(h1Var, list);
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/h1;", "Landroidx/compose/ui/graphics/d2;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;J)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<h1, d2, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f61479b = new m(2);

        m() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, long j4) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("ݏ\u0001"));
            h1Var.getPolygon().setStrokeColor(f2.r(j4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, d2 d2Var) {
            a(h1Var, d2Var.M());
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/h1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;I)V"}, k = 3, mv = {1, 9, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<h1, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f61480b = new n(2);

        n() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, int i4) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("ݐ\u0001"));
            h1Var.getPolygon().setStrokeJointType(i4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, Integer num) {
            a(h1Var, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/h1;", "", "Lcom/google/android/gms/maps/model/PatternItem;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/h1;Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<h1, List<? extends PatternItem>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f61481b = new o(2);

        o() {
            super(2);
        }

        public final void a(@fg.l h1 h1Var, @fg.m List<? extends PatternItem> list) {
            kotlin.jvm.internal.l0.p(h1Var, ProtectedSandApp.s("ݑ\u0001"));
            h1Var.getPolygon().setStrokePattern(list);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h1 h1Var, List<? extends PatternItem> list) {
            a(h1Var, list);
            return k2.f75408a;
        }
    }

    /* compiled from: Polygon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class p extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<LatLng> f61482b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f61483c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f61484d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f61485e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<List<LatLng>> f61486f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f61487g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f61488h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List<PatternItem> f61489i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f61490j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Object f61491k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f61492l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f61493m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.l<Polygon, k2> f61494n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f61495o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f61496p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f61497q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(List<LatLng> list, boolean z4, long j4, boolean z5, List<? extends List<LatLng>> list2, long j5, int i4, List<? extends PatternItem> list3, float f4, Object obj, boolean z6, float f5, ld.l<? super Polygon, k2> lVar, int i5, int i6, int i7) {
            super(2);
            this.f61482b = list;
            this.f61483c = z4;
            this.f61484d = j4;
            this.f61485e = z5;
            this.f61486f = list2;
            this.f61487g = j5;
            this.f61488h = i4;
            this.f61489i = list3;
            this.f61490j = f4;
            this.f61491k = obj;
            this.f61492l = z6;
            this.f61493m = f5;
            this.f61494n = lVar;
            this.f61495o = i5;
            this.f61496p = i6;
            this.f61497q = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g1.a(this.f61482b, this.f61483c, this.f61484d, this.f61485e, this.f61486f, this.f61487g, this.f61488h, this.f61489i, this.f61490j, this.f61491k, this.f61492l, this.f61493m, this.f61494n, tVar, g3.b(this.f61495o | 1), g3.b(this.f61496p), this.f61497q);
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
    public static final class q extends kotlin.jvm.internal.n0 implements ld.a<h1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f61498b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ld.a aVar) {
            super(0);
            this.f61498b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.h1, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final h1 invoke() {
            return this.f61498b.invoke();
        }
    }

    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    public static final void a(@fg.l List<LatLng> list, boolean z4, long j4, boolean z5, @fg.m List<? extends List<LatLng>> list2, long j5, int i4, @fg.m List<? extends PatternItem> list3, float f4, @fg.m Object obj, boolean z6, float f5, @fg.m ld.l<? super Polygon, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i5, int i6, int i7) {
        long j6;
        long j7;
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("ݒ\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(-52967640);
        boolean z7 = (i7 & 2) != 0 ? false : z4;
        if ((i7 & 4) != 0) {
            d2.INSTANCE.getClass();
            j6 = d2.f17766c;
        } else {
            j6 = j4;
        }
        boolean z10 = (i7 & 8) != 0 ? false : z5;
        List<? extends List<LatLng>> list4 = (i7 & 16) != 0 ? kotlin.collections.j0.f74919b : list2;
        if ((i7 & 32) != 0) {
            d2.INSTANCE.getClass();
            j7 = d2.f17766c;
        } else {
            j7 = j5;
        }
        int i10 = (i7 & 64) != 0 ? 0 : i4;
        List<? extends PatternItem> list5 = (i7 & 128) != 0 ? null : list3;
        float f6 = (i7 & 256) != 0 ? 10.0f : f4;
        Object obj2 = (i7 & 512) != 0 ? null : obj;
        boolean z11 = (i7 & 1024) != 0 ? true : z6;
        float f7 = (i7 & 2048) != 0 ? 0.0f : f5;
        ld.l<? super Polygon, k2> lVar2 = (i7 & 4096) != 0 ? a.f61454b : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-52967640, i5, i6, ProtectedSandApp.s("ݓ\u0001"));
        }
        ld.l<? super Polygon, k2> lVar3 = lVar2;
        List<? extends PatternItem> list6 = list5;
        Object obj3 = obj2;
        List<? extends List<LatLng>> list7 = list4;
        b bVar = new b((b0) o4.s(), obj2, lVar2, list, z7, j6, z10, list4, j7, i10, list6, f6, z11, f7);
        o4.P(1886828752);
        if (!(o4.s() instanceof b0)) {
            androidx.compose.runtime.p.n();
        }
        o4.v();
        if (o4.getInserting()) {
            o4.F(new q(bVar));
        } else {
            o4.C();
        }
        m5.n(o4, lVar3, g.f61473b);
        m5.j(o4, list, h.f61474b);
        m5.j(o4, Boolean.valueOf(z7), i.f61475b);
        m5.j(o4, d2.n(j6), j.f61476b);
        m5.j(o4, Boolean.valueOf(z10), k.f61477b);
        m5.j(o4, list7, l.f61478b);
        m5.j(o4, d2.n(j7), m.f61479b);
        n nVar = n.f61480b;
        if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(i10))) {
            o4.E(Integer.valueOf(i10));
            o4.w(Integer.valueOf(i10), nVar);
        }
        m5.j(o4, list6, o.f61481b);
        m5.j(o4, Float.valueOf(f6), c.f61469b);
        m5.j(o4, obj3, d.f61470b);
        m5.j(o4, Boolean.valueOf(z11), e.f61471b);
        m5.j(o4, Float.valueOf(f7), f.f61472b);
        o4.H();
        o4.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new p(list, z7, j6, z10, list7, j7, i10, list6, f6, obj3, z11, f7, lVar3, i5, i6, i7));
        }
    }
}
