package com.google.maps.android.compose;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: GroundOverlay.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0080\u0001\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lcom/google/maps/android/compose/p;", "position", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "image", "Li0/f;", "anchor", "", "bearing", "", "clickable", "", "tag", "transparency", "visible", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/GroundOverlay;", "Lkotlin/k2;", "onClick", "a", "(Lcom/google/maps/android/compose/p;Lcom/google/android/gms/maps/model/BitmapDescriptor;JFZLjava/lang/Object;FZFLld/l;Landroidx/compose/runtime/t;II)V", "e", "(Lcom/google/android/gms/maps/model/GroundOverlay;Lcom/google/maps/android/compose/p;)V", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "d", "(Lcom/google/android/gms/maps/model/GroundOverlayOptions;Lcom/google/maps/android/compose/p;)Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nGroundOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroundOverlay.kt\ncom/google/maps/android/compose/GroundOverlayKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,154:1\n251#2,10:155\n*S KotlinDebug\n*F\n+ 1 GroundOverlay.kt\ncom/google/maps/android/compose/GroundOverlayKt\n*L\n93#1:155,10\n*E\n"})
/* loaded from: classes6.dex */
public final class n {

    /* compiled from: GroundOverlay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<GroundOverlay, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61925b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l GroundOverlay groundOverlay) {
            kotlin.jvm.internal.l0.p(groundOverlay, ProtectedSandApp.s("߄\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(GroundOverlay groundOverlay) {
            a(groundOverlay);
            return k2.f75408a;
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/o;", "a", "()Lcom/google/maps/android/compose/o;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nGroundOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroundOverlay.kt\ncom/google/maps/android/compose/GroundOverlayKt$GroundOverlay$2\n+ 2 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt\n+ 3 GroundOverlayOptions.kt\ncom/google/maps/android/ktx/model/GroundOverlayOptionsKt\n*L\n1#1,154:1\n483#2,2:155\n485#2:160\n28#3,3:157\n*S KotlinDebug\n*F\n+ 1 GroundOverlay.kt\ncom/google/maps/android/compose/GroundOverlayKt$GroundOverlay$2\n*L\n95#1:155,2\n95#1:160\n95#1:157,3\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<o> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f61926b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f61927c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<GroundOverlay, k2> f61928d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f61929e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f61930f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f61931g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ BitmapDescriptor f61932h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ p f61933i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f61934j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f61935k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f61936l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b0 b0Var, Object obj, ld.l<? super GroundOverlay, k2> lVar, long j4, float f4, boolean z4, BitmapDescriptor bitmapDescriptor, p pVar, float f5, boolean z5, float f6) {
            super(0);
            this.f61926b = b0Var;
            this.f61927c = obj;
            this.f61928d = lVar;
            this.f61929e = j4;
            this.f61930f = f4;
            this.f61931g = z4;
            this.f61932h = bitmapDescriptor;
            this.f61933i = pVar;
            this.f61934j = f5;
            this.f61935k = z5;
            this.f61936l = f6;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            GoogleMap map;
            b0 b0Var = this.f61926b;
            if (b0Var != null && (map = b0Var.getMap()) != null) {
                long j4 = this.f61929e;
                float f4 = this.f61930f;
                boolean z4 = this.f61931g;
                BitmapDescriptor bitmapDescriptor = this.f61932h;
                p pVar = this.f61933i;
                float f5 = this.f61934j;
                boolean z5 = this.f61935k;
                float f6 = this.f61936l;
                GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
                groundOverlayOptions.anchor(i0.f.p(j4), i0.f.r(j4));
                groundOverlayOptions.bearing(f4);
                groundOverlayOptions.clickable(z4);
                groundOverlayOptions.image(bitmapDescriptor);
                n.d(groundOverlayOptions, pVar);
                groundOverlayOptions.transparency(f5);
                groundOverlayOptions.visible(z5);
                groundOverlayOptions.zIndex(f6);
                GroundOverlay addGroundOverlay = map.addGroundOverlay(groundOverlayOptions);
                if (addGroundOverlay != null) {
                    addGroundOverlay.setTag(this.f61927c);
                    return new o(addGroundOverlay, this.f61928d);
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("߅\u0001"));
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/o;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/GroundOverlay;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/o;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<o, ld.l<? super GroundOverlay, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f61937b = new c(2);

        c() {
            super(2);
        }

        public final void a(@fg.l o oVar, @fg.l ld.l<? super GroundOverlay, k2> lVar) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("߆\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("߇\u0001"));
            oVar.f(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o oVar, ld.l<? super GroundOverlay, ? extends k2> lVar) {
            a(oVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o;F)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<o, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f61938b = new d(2);

        d() {
            super(2);
        }

        public final void a(@fg.l o oVar, float f4) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("߈\u0001"));
            oVar.getGroundOverlay().setBearing(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o oVar, Float f4) {
            a(oVar, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<o, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f61939b = new e(2);

        e() {
            super(2);
        }

        public final void a(@fg.l o oVar, boolean z4) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("߉\u0001"));
            oVar.getGroundOverlay().setClickable(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o oVar, Boolean bool) {
            a(oVar, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o;", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o;Lcom/google/android/gms/maps/model/BitmapDescriptor;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<o, BitmapDescriptor, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f61940b = new f(2);

        f() {
            super(2);
        }

        public final void a(@fg.l o oVar, @fg.l BitmapDescriptor bitmapDescriptor) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("ߊ\u0001"));
            kotlin.jvm.internal.l0.p(bitmapDescriptor, ProtectedSandApp.s("ߋ\u0001"));
            oVar.getGroundOverlay().setImage(bitmapDescriptor);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o oVar, BitmapDescriptor bitmapDescriptor) {
            a(oVar, bitmapDescriptor);
            return k2.f75408a;
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o;", "Lcom/google/maps/android/compose/p;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o;Lcom/google/maps/android/compose/p;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<o, p, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f61941b = new g(2);

        g() {
            super(2);
        }

        public final void a(@fg.l o oVar, @fg.l p pVar) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("ߌ\u0001"));
            kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("ߍ\u0001"));
            n.e(oVar.getGroundOverlay(), pVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o oVar, p pVar) {
            a(oVar, pVar);
            return k2.f75408a;
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o;Ljava/lang/Object;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<o, Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f61942b = new h(2);

        h() {
            super(2);
        }

        public final void a(@fg.l o oVar, @fg.m Object obj) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("ߎ\u0001"));
            oVar.getGroundOverlay().setTag(obj);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o oVar, Object obj) {
            a(oVar, obj);
            return k2.f75408a;
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o;F)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<o, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f61943b = new i(2);

        i() {
            super(2);
        }

        public final void a(@fg.l o oVar, float f4) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("ߏ\u0001"));
            oVar.getGroundOverlay().setTransparency(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o oVar, Float f4) {
            a(oVar, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<o, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f61944b = new j(2);

        j() {
            super(2);
        }

        public final void a(@fg.l o oVar, boolean z4) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("ߐ\u0001"));
            oVar.getGroundOverlay().setVisible(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o oVar, Boolean bool) {
            a(oVar, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o;F)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<o, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f61945b = new k(2);

        k() {
            super(2);
        }

        public final void a(@fg.l o oVar, float f4) {
            kotlin.jvm.internal.l0.p(oVar, ProtectedSandApp.s("ߑ\u0001"));
            oVar.getGroundOverlay().setZIndex(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o oVar, Float f4) {
            a(oVar, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: GroundOverlay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f61946b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BitmapDescriptor f61947c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f61948d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f61949e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f61950f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f61951g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f61952h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f61953i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f61954j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.l<GroundOverlay, k2> f61955k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f61956l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f61957m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(p pVar, BitmapDescriptor bitmapDescriptor, long j4, float f4, boolean z4, Object obj, float f5, boolean z5, float f6, ld.l<? super GroundOverlay, k2> lVar, int i4, int i5) {
            super(2);
            this.f61946b = pVar;
            this.f61947c = bitmapDescriptor;
            this.f61948d = j4;
            this.f61949e = f4;
            this.f61950f = z4;
            this.f61951g = obj;
            this.f61952h = f5;
            this.f61953i = z5;
            this.f61954j = f6;
            this.f61955k = lVar;
            this.f61956l = i4;
            this.f61957m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n.a(this.f61946b, this.f61947c, this.f61948d, this.f61949e, this.f61950f, this.f61951g, this.f61952h, this.f61953i, this.f61954j, this.f61955k, tVar, g3.b(this.f61956l | 1), this.f61957m);
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
    public static final class m extends kotlin.jvm.internal.n0 implements ld.a<o> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f61958b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ld.a aVar) {
            super(0);
            this.f61958b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.o, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final o invoke() {
            return this.f61958b.invoke();
        }
    }

    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    public static final void a(@fg.l p pVar, @fg.l BitmapDescriptor bitmapDescriptor, long j4, float f4, boolean z4, @fg.m Object obj, float f5, boolean z5, float f6, @fg.m ld.l<? super GroundOverlay, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("߭\u0001"));
        kotlin.jvm.internal.l0.p(bitmapDescriptor, ProtectedSandApp.s("߮\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(199851106);
        long a5 = (i5 & 4) != 0 ? i0.g.a(0.5f, 0.5f) : j4;
        float f7 = (i5 & 8) != 0 ? 0.0f : f4;
        boolean z6 = (i5 & 16) != 0 ? false : z4;
        Object obj2 = (i5 & 32) != 0 ? null : obj;
        float f10 = (i5 & 64) != 0 ? 0.0f : f5;
        boolean z7 = (i5 & 128) != 0 ? true : z5;
        float f11 = (i5 & 256) != 0 ? 0.0f : f6;
        ld.l<? super GroundOverlay, k2> lVar2 = (i5 & 512) != 0 ? a.f61925b : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(199851106, i4, -1, ProtectedSandApp.s("߯\u0001"));
        }
        androidx.compose.runtime.e<?> s4 = o4.s();
        ld.l<? super GroundOverlay, k2> lVar3 = lVar2;
        Object obj3 = obj2;
        b bVar = new b(s4 instanceof b0 ? (b0) s4 : null, obj2, lVar2, a5, f7, z6, bitmapDescriptor, pVar, f10, z7, f11);
        o4.P(1886828752);
        if (!(o4.s() instanceof b0)) {
            androidx.compose.runtime.p.n();
        }
        o4.v();
        if (o4.getInserting()) {
            o4.F(new m(bVar));
        } else {
            o4.C();
        }
        m5.n(o4, lVar3, c.f61937b);
        m5.j(o4, Float.valueOf(f7), d.f61938b);
        m5.j(o4, Boolean.valueOf(z6), e.f61939b);
        m5.j(o4, bitmapDescriptor, f.f61940b);
        m5.j(o4, pVar, g.f61941b);
        m5.j(o4, obj3, h.f61942b);
        m5.j(o4, Float.valueOf(f10), i.f61943b);
        m5.j(o4, Boolean.valueOf(z7), j.f61944b);
        m5.j(o4, Float.valueOf(f11), k.f61945b);
        o4.H();
        o4.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new l(pVar, bitmapDescriptor, a5, f7, z6, obj3, f10, z7, f11, lVar3, i4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroundOverlayOptions d(GroundOverlayOptions groundOverlayOptions, p pVar) {
        if (pVar.getLatLngBounds() != null) {
            GroundOverlayOptions positionFromBounds = groundOverlayOptions.positionFromBounds(pVar.getLatLngBounds());
            kotlin.jvm.internal.l0.o(positionFromBounds, ProtectedSandApp.s("߰\u0001"));
            return positionFromBounds;
        }
        if (pVar.getLocation() == null || pVar.getWidth() == null) {
            throw new IllegalStateException(ProtectedSandApp.s("߲\u0001") + pVar);
        }
        Float height = pVar.getHeight();
        String s4 = ProtectedSandApp.s("߱\u0001");
        if (height == null) {
            GroundOverlayOptions position = groundOverlayOptions.position(pVar.getLocation(), pVar.getWidth().floatValue());
            kotlin.jvm.internal.l0.o(position, s4);
            return position;
        }
        GroundOverlayOptions position2 = groundOverlayOptions.position(pVar.getLocation(), pVar.getWidth().floatValue(), pVar.getHeight().floatValue());
        kotlin.jvm.internal.l0.o(position2, s4);
        return position2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(GroundOverlay groundOverlay, p pVar) {
        if (pVar.getLatLngBounds() != null) {
            groundOverlay.setPositionFromBounds(pVar.getLatLngBounds());
            return;
        }
        if (pVar.getLocation() != null) {
            groundOverlay.setPosition(pVar.getLocation());
        }
        if (pVar.getWidth() != null && pVar.getHeight() == null) {
            groundOverlay.setDimensions(pVar.getWidth().floatValue());
        } else {
            if (pVar.getWidth() == null || pVar.getHeight() == null) {
                return;
            }
            groundOverlay.setDimensions(pVar.getWidth().floatValue(), pVar.getHeight().floatValue());
        }
    }
}
