package com.google.maps.android.compose;

import androidx.compose.runtime.g3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: InputHandler.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a\u0097\u0002\u0010\u0013\u001a\u00020\u00022\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00002\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Circle;", "Lkotlin/k2;", "onCircleClick", "Lcom/google/android/gms/maps/model/GroundOverlay;", "onGroundOverlayClick", "Lcom/google/android/gms/maps/model/Polygon;", "onPolygonClick", "Lcom/google/android/gms/maps/model/Polyline;", "onPolylineClick", "Lcom/google/android/gms/maps/model/Marker;", "", "onMarkerClick", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "a", "(Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;Landroidx/compose/runtime/t;III)V", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nInputHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputHandler.kt\ncom/google/maps/android/compose/InputHandlerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,94:1\n1116#2,6:95\n251#3,10:101\n*S KotlinDebug\n*F\n+ 1 InputHandler.kt\ncom/google/maps/android/compose/InputHandlerKt\n*L\n38#1:95,6\n37#1:101,10\n*E\n"})
/* loaded from: classes6.dex */
public final class r {

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.a<s> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f62054b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f62054b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.s, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final s invoke() {
            return this.f62054b.invoke();
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/s;", "a", "()Lcom/google/maps/android/compose/s;"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<s> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Circle, k2> f62055b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<GroundOverlay, k2> f62056c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Polygon, k2> f62057d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Polyline, k2> f62058e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f62059f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62060g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62061h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62062i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62063j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62064k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62065l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.l<? super Circle, k2> lVar, ld.l<? super GroundOverlay, k2> lVar2, ld.l<? super Polygon, k2> lVar3, ld.l<? super Polyline, k2> lVar4, ld.l<? super Marker, Boolean> lVar5, ld.l<? super Marker, k2> lVar6, ld.l<? super Marker, k2> lVar7, ld.l<? super Marker, k2> lVar8, ld.l<? super Marker, k2> lVar9, ld.l<? super Marker, k2> lVar10, ld.l<? super Marker, k2> lVar11) {
            super(0);
            this.f62055b = lVar;
            this.f62056c = lVar2;
            this.f62057d = lVar3;
            this.f62058e = lVar4;
            this.f62059f = lVar5;
            this.f62060g = lVar6;
            this.f62061h = lVar7;
            this.f62062i = lVar8;
            this.f62063j = lVar9;
            this.f62064k = lVar10;
            this.f62065l = lVar11;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return new s(this.f62055b, this.f62056c, this.f62057d, this.f62058e, this.f62059f, this.f62060g, this.f62061h, this.f62062i, this.f62063j, this.f62064k, this.f62065l);
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f62066b = new c(2);

        c() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠈ\u0001"));
            sVar.v(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super Marker, ? extends k2> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f62067b = new d(2);

        d() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠉ\u0001"));
            sVar.w(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super Marker, ? extends k2> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Circle;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super Circle, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f62068b = new e(2);

        e() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super Circle, k2> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠊ\u0001"));
            sVar.o(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super Circle, ? extends k2> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/GroundOverlay;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super GroundOverlay, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f62069b = new f(2);

        f() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super GroundOverlay, k2> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠋ\u0001"));
            sVar.p(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super GroundOverlay, ? extends k2> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Polygon;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super Polygon, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f62070b = new g(2);

        g() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super Polygon, k2> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠌ\u0001"));
            sVar.x(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super Polygon, ? extends k2> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Polyline;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super Polyline, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f62071b = new h(2);

        h() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super Polyline, k2> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠍ\u0001"));
            sVar.y(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super Polyline, ? extends k2> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super Marker, ? extends Boolean>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f62072b = new i(2);

        i() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super Marker, Boolean> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠎ\u0001"));
            sVar.t(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super Marker, ? extends Boolean> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f62073b = new j(2);

        j() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠏ\u0001"));
            sVar.q(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super Marker, ? extends k2> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f62074b = new k(2);

        k() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠐ\u0001"));
            sVar.r(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super Marker, ? extends k2> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f62075b = new l(2);

        l() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠑ\u0001"));
            sVar.s(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super Marker, ? extends k2> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/s;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/s;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<s, ld.l<? super Marker, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f62076b = new m(2);

        m() {
            super(2);
        }

        public final void a(@fg.l s sVar, @fg.m ld.l<? super Marker, k2> lVar) {
            kotlin.jvm.internal.l0.p(sVar, ProtectedSandApp.s("ࠒ\u0001"));
            sVar.u(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(s sVar, ld.l<? super Marker, ? extends k2> lVar) {
            a(sVar, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: InputHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class n extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Circle, k2> f62077b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<GroundOverlay, k2> f62078c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<Polygon, k2> f62079d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<Polyline, k2> f62080e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, Boolean> f62081f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62082g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62083h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62084i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62085j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62086k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.l<Marker, k2> f62087l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f62088m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f62089n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f62090o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(ld.l<? super Circle, k2> lVar, ld.l<? super GroundOverlay, k2> lVar2, ld.l<? super Polygon, k2> lVar3, ld.l<? super Polyline, k2> lVar4, ld.l<? super Marker, Boolean> lVar5, ld.l<? super Marker, k2> lVar6, ld.l<? super Marker, k2> lVar7, ld.l<? super Marker, k2> lVar8, ld.l<? super Marker, k2> lVar9, ld.l<? super Marker, k2> lVar10, ld.l<? super Marker, k2> lVar11, int i4, int i5, int i6) {
            super(2);
            this.f62077b = lVar;
            this.f62078c = lVar2;
            this.f62079d = lVar3;
            this.f62080e = lVar4;
            this.f62081f = lVar5;
            this.f62082g = lVar6;
            this.f62083h = lVar7;
            this.f62084i = lVar8;
            this.f62085j = lVar9;
            this.f62086k = lVar10;
            this.f62087l = lVar11;
            this.f62088m = i4;
            this.f62089n = i5;
            this.f62090o = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            r.a(this.f62077b, this.f62078c, this.f62079d, this.f62080e, this.f62081f, this.f62082g, this.f62083h, this.f62084i, this.f62085j, this.f62086k, this.f62087l, tVar, g3.b(this.f62088m | 1), g3.b(this.f62089n), this.f62090o);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022b  */
    @androidx.annotation.c1({androidx.annotation.c1.a.LIBRARY_GROUP})
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.m ld.l<? super com.google.android.gms.maps.model.Circle, kotlin.k2> r38, @fg.m ld.l<? super com.google.android.gms.maps.model.GroundOverlay, kotlin.k2> r39, @fg.m ld.l<? super com.google.android.gms.maps.model.Polygon, kotlin.k2> r40, @fg.m ld.l<? super com.google.android.gms.maps.model.Polyline, kotlin.k2> r41, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> r42, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r43, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r44, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r45, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r46, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r47, @fg.m ld.l<? super com.google.android.gms.maps.model.Marker, kotlin.k2> r48, @fg.m androidx.compose.runtime.t r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.r.a(ld.l, ld.l, ld.l, ld.l, ld.l, ld.l, ld.l, ld.l, ld.l, ld.l, ld.l, androidx.compose.runtime.t, int, int, int):void");
    }
}
