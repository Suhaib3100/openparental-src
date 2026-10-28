package com.google.maps.android.compose;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.f2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.ButtCap;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Polyline.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a®\u0001\u0010\u0019\u001a\u00020\u00172\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"", "Lcom/google/android/gms/maps/model/LatLng;", "points", "", "clickable", "Landroidx/compose/ui/graphics/d2;", "color", "Lcom/google/android/gms/maps/model/Cap;", "endCap", "geodesic", "", "jointType", "Lcom/google/android/gms/maps/model/PatternItem;", "pattern", "startCap", "", "tag", "visible", "", "width", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Polyline;", "Lkotlin/k2;", "onClick", "a", "(Ljava/util/List;ZJLcom/google/android/gms/maps/model/Cap;ZILjava/util/List;Lcom/google/android/gms/maps/model/Cap;Ljava/lang/Object;ZFFLld/l;Landroidx/compose/runtime/t;III)V", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nPolyline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polyline.kt\ncom/google/maps/android/compose/PolylineKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,109:1\n251#2,8:110\n259#2,2:124\n3737#3,6:118\n*S KotlinDebug\n*F\n+ 1 Polyline.kt\ncom/google/maps/android/compose/PolylineKt\n*L\n74#1:110,8\n74#1:124,2\n100#1:118,6\n*E\n"})
/* loaded from: classes6.dex */
public final class i1 {

    /* compiled from: Polyline.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Polyline, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61506b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l Polyline polyline) {
            kotlin.jvm.internal.l0.p(polyline, ProtectedSandApp.s("ݛ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Polyline polyline) {
            a(polyline);
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/j1;", "a", "()Lcom/google/maps/android/compose/j1;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nPolyline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polyline.kt\ncom/google/maps/android/compose/PolylineKt$Polyline$2\n+ 2 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt\n+ 3 PolylineOptions.kt\ncom/google/maps/android/ktx/model/PolylineOptionsKt\n*L\n1#1,109:1\n513#2,2:110\n515#2:115\n28#3,3:112\n*S KotlinDebug\n*F\n+ 1 Polyline.kt\ncom/google/maps/android/compose/PolylineKt$Polyline$2\n*L\n76#1:110,2\n76#1:115\n76#1:112,3\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<j1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f61507b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61508c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Polyline, k2> f61509d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<LatLng> f61510e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61511f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f61512g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Cap f61513h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f61514i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f61515j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<PatternItem> f61516k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Cap f61517l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f61518m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f61519n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ float f61520o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b0 b0Var, Object obj, ld.l<? super Polyline, k2> lVar, List<LatLng> list, boolean z4, long j4, Cap cap, boolean z5, int i4, List<? extends PatternItem> list2, Cap cap2, boolean z6, float f4, float f5) {
            super(0);
            this.f61507b = b0Var;
            this.f61508c = obj;
            this.f61509d = lVar;
            this.f61510e = list;
            this.f61511f = z4;
            this.f61512g = j4;
            this.f61513h = cap;
            this.f61514i = z5;
            this.f61515j = i4;
            this.f61516k = list2;
            this.f61517l = cap2;
            this.f61518m = z6;
            this.f61519n = f4;
            this.f61520o = f5;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j1 invoke() {
            GoogleMap map;
            b0 b0Var = this.f61507b;
            if (b0Var != null && (map = b0Var.getMap()) != null) {
                List<LatLng> list = this.f61510e;
                boolean z4 = this.f61511f;
                long j4 = this.f61512g;
                Cap cap = this.f61513h;
                boolean z5 = this.f61514i;
                int i4 = this.f61515j;
                List<PatternItem> list2 = this.f61516k;
                Cap cap2 = this.f61517l;
                boolean z6 = this.f61518m;
                float f4 = this.f61519n;
                float f5 = this.f61520o;
                PolylineOptions polylineOptions = new PolylineOptions();
                polylineOptions.addAll(list);
                polylineOptions.clickable(z4);
                polylineOptions.color(f2.r(j4));
                polylineOptions.endCap(cap);
                polylineOptions.geodesic(z5);
                polylineOptions.jointType(i4);
                polylineOptions.pattern(list2);
                polylineOptions.startCap(cap2);
                polylineOptions.visible(z6);
                polylineOptions.width(f4);
                polylineOptions.zIndex(f5);
                Polyline addPolyline = map.addPolyline(polylineOptions);
                kotlin.jvm.internal.l0.o(addPolyline, ProtectedSandApp.s("ݜ\u0001"));
                if (addPolyline != null) {
                    addPolyline.setTag(this.f61508c);
                    return new j1(addPolyline, this.f61509d);
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("ݝ\u0001"));
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/j1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<j1, Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f61521b = new c(2);

        c() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, @fg.m Object obj) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݞ\u0001"));
            j1Var.getPolyline().setTag(obj);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, Object obj) {
            a(j1Var, obj);
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/j1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<j1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f61522b = new d(2);

        d() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݟ\u0001"));
            j1Var.getPolyline().setVisible(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, Boolean bool) {
            a(j1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/j1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<j1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f61523b = new e(2);

        e() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, float f4) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݠ\u0001"));
            j1Var.getPolyline().setWidth(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, Float f4) {
            a(j1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/j1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<j1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f61524b = new f(2);

        f() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, float f4) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݡ\u0001"));
            j1Var.getPolyline().setZIndex(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, Float f4) {
            a(j1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/j1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Polyline;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/j1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<j1, ld.l<? super Polyline, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f61525b = new g(2);

        g() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, @fg.l ld.l<? super Polyline, k2> lVar) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݢ\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ݣ\u0001"));
            j1Var.f(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, ld.l<? super Polyline, ? extends k2> lVar) {
            a(j1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/j1;", "", "Lcom/google/android/gms/maps/model/LatLng;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<j1, List<? extends LatLng>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f61526b = new h(2);

        h() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, @fg.l List<LatLng> list) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݤ\u0001"));
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("ݥ\u0001"));
            j1Var.getPolyline().setPoints(list);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, List<? extends LatLng> list) {
            a(j1Var, list);
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/j1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<j1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f61527b = new i(2);

        i() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݦ\u0001"));
            j1Var.getPolyline().setClickable(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, Boolean bool) {
            a(j1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/j1;", "Landroidx/compose/ui/graphics/d2;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;J)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<j1, d2, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f61528b = new j(2);

        j() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, long j4) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݧ\u0001"));
            j1Var.getPolyline().setColor(f2.r(j4));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, d2 d2Var) {
            a(j1Var, d2Var.M());
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/j1;", "Lcom/google/android/gms/maps/model/Cap;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;Lcom/google/android/gms/maps/model/Cap;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<j1, Cap, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f61529b = new k(2);

        k() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, @fg.l Cap cap) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݨ\u0001"));
            kotlin.jvm.internal.l0.p(cap, ProtectedSandApp.s("ݩ\u0001"));
            j1Var.getPolyline().setEndCap(cap);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, Cap cap) {
            a(j1Var, cap);
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/j1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<j1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f61530b = new l(2);

        l() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݪ\u0001"));
            j1Var.getPolyline().setGeodesic(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, Boolean bool) {
            a(j1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/j1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;I)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<j1, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f61531b = new m(2);

        m() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, int i4) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݫ\u0001"));
            j1Var.getPolyline().setJointType(i4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, Integer num) {
            a(j1Var, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/j1;", "", "Lcom/google/android/gms/maps/model/PatternItem;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<j1, List<? extends PatternItem>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f61532b = new n(2);

        n() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, @fg.m List<? extends PatternItem> list) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݬ\u0001"));
            j1Var.getPolyline().setPattern(list);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, List<? extends PatternItem> list) {
            a(j1Var, list);
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/j1;", "Lcom/google/android/gms/maps/model/Cap;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/j1;Lcom/google/android/gms/maps/model/Cap;)V"}, k = 3, mv = {1, 9, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<j1, Cap, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f61533b = new o(2);

        o() {
            super(2);
        }

        public final void a(@fg.l j1 j1Var, @fg.l Cap cap) {
            kotlin.jvm.internal.l0.p(j1Var, ProtectedSandApp.s("ݭ\u0001"));
            kotlin.jvm.internal.l0.p(cap, ProtectedSandApp.s("ݮ\u0001"));
            j1Var.getPolyline().setStartCap(cap);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(j1 j1Var, Cap cap) {
            a(j1Var, cap);
            return k2.f75408a;
        }
    }

    /* compiled from: Polyline.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class p extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<LatLng> f61534b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f61535c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f61536d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Cap f61537e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61538f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f61539g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<PatternItem> f61540h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Cap f61541i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f61542j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f61543k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f61544l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f61545m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.l<Polyline, k2> f61546n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f61547o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f61548p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f61549q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(List<LatLng> list, boolean z4, long j4, Cap cap, boolean z5, int i4, List<? extends PatternItem> list2, Cap cap2, Object obj, boolean z6, float f4, float f5, ld.l<? super Polyline, k2> lVar, int i5, int i6, int i7) {
            super(2);
            this.f61534b = list;
            this.f61535c = z4;
            this.f61536d = j4;
            this.f61537e = cap;
            this.f61538f = z5;
            this.f61539g = i4;
            this.f61540h = list2;
            this.f61541i = cap2;
            this.f61542j = obj;
            this.f61543k = z6;
            this.f61544l = f4;
            this.f61545m = f5;
            this.f61546n = lVar;
            this.f61547o = i5;
            this.f61548p = i6;
            this.f61549q = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            i1.a(this.f61534b, this.f61535c, this.f61536d, this.f61537e, this.f61538f, this.f61539g, this.f61540h, this.f61541i, this.f61542j, this.f61543k, this.f61544l, this.f61545m, this.f61546n, tVar, g3.b(this.f61547o | 1), g3.b(this.f61548p), this.f61549q);
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
    public static final class q extends kotlin.jvm.internal.n0 implements ld.a<j1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f61550b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ld.a aVar) {
            super(0);
            this.f61550b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.j1, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final j1 invoke() {
            return this.f61550b.invoke();
        }
    }

    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    public static final void a(@fg.l List<LatLng> list, boolean z4, long j4, @fg.m Cap cap, boolean z5, int i4, @fg.m List<? extends PatternItem> list2, @fg.m Cap cap2, @fg.m Object obj, boolean z6, float f4, float f5, @fg.m ld.l<? super Polyline, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i5, int i6, int i7) {
        long j5;
        Cap cap3;
        int i10;
        Cap cap4;
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("ݯ\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(-2113937603);
        boolean z7 = (i7 & 2) != 0 ? false : z4;
        if ((i7 & 4) != 0) {
            d2.INSTANCE.getClass();
            j5 = d2.f17766c;
        } else {
            j5 = j4;
        }
        if ((i7 & 8) != 0) {
            i10 = i5 & (-7169);
            cap3 = new ButtCap();
        } else {
            cap3 = cap;
            i10 = i5;
        }
        boolean z10 = (i7 & 16) != 0 ? false : z5;
        int i11 = (i7 & 32) != 0 ? 0 : i4;
        List<? extends PatternItem> list3 = (i7 & 64) != 0 ? null : list2;
        if ((i7 & 128) != 0) {
            i10 &= -29360129;
            cap4 = new ButtCap();
        } else {
            cap4 = cap2;
        }
        Object obj2 = (i7 & 256) != 0 ? null : obj;
        boolean z11 = (i7 & 512) != 0 ? true : z6;
        float f6 = (i7 & 1024) != 0 ? 10.0f : f4;
        float f7 = (i7 & 2048) != 0 ? 0.0f : f5;
        ld.l<? super Polyline, k2> lVar2 = (i7 & 4096) != 0 ? a.f61506b : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-2113937603, i10, i6, ProtectedSandApp.s("ݰ\u0001"));
        }
        ld.l<? super Polyline, k2> lVar3 = lVar2;
        Object obj3 = obj2;
        Cap cap5 = cap4;
        List<? extends PatternItem> list4 = list3;
        Cap cap6 = cap3;
        b bVar = new b((b0) o4.s(), obj2, lVar2, list, z7, j5, cap3, z10, i11, list4, cap5, z11, f6, f7);
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
        m5.n(o4, lVar3, g.f61525b);
        m5.j(o4, list, h.f61526b);
        m5.j(o4, Boolean.valueOf(z7), i.f61527b);
        m5.j(o4, d2.n(j5), j.f61528b);
        m5.j(o4, cap6, k.f61529b);
        m5.j(o4, Boolean.valueOf(z10), l.f61530b);
        m mVar = m.f61531b;
        if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(i11))) {
            o4.E(Integer.valueOf(i11));
            o4.w(Integer.valueOf(i11), mVar);
        }
        m5.j(o4, list4, n.f61532b);
        m5.j(o4, cap5, o.f61533b);
        m5.j(o4, obj3, c.f61521b);
        m5.j(o4, Boolean.valueOf(z11), d.f61522b);
        m5.j(o4, Float.valueOf(f6), e.f61523b);
        m5.j(o4, Float.valueOf(f7), f.f61524b);
        o4.H();
        o4.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new p(list, z7, j5, cap6, z10, i11, list4, cap5, obj3, z11, f6, f7, lVar3, i5, i6, i7));
        }
    }
}
