package com.google.maps.android.compose;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TileOverlay.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a_\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/gms/maps/model/TileProvider;", "tileProvider", "", "fadeIn", "", "transparency", "visible", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/TileOverlay;", "Lkotlin/k2;", "onClick", "b", "(Lcom/google/android/gms/maps/model/TileProvider;ZFZFLld/l;Landroidx/compose/runtime/t;II)V", "Lcom/google/maps/android/compose/p1;", "state", "a", "(Lcom/google/android/gms/maps/model/TileProvider;Lcom/google/maps/android/compose/p1;ZFZFLld/l;Landroidx/compose/runtime/t;II)V", "c", "(Landroidx/compose/runtime/t;I)Lcom/google/maps/android/compose/p1;", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTileOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TileOverlay.kt\ncom/google/maps/android/compose/TileOverlayKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,148:1\n251#2,10:149\n1116#3,6:159\n*S KotlinDebug\n*F\n+ 1 TileOverlay.kt\ncom/google/maps/android/compose/TileOverlayKt\n*L\n87#1:149,10\n146#1:159,6\n*E\n"})
/* loaded from: classes6.dex */
public final class n1 {

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.a<o1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f61990b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f61990b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.o1, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final o1 invoke() {
            return this.f61990b.invoke();
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<TileOverlay, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f61991b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l TileOverlay tileOverlay) {
            kotlin.jvm.internal.l0.p(tileOverlay, ProtectedSandApp.s("ߝ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(TileOverlay tileOverlay) {
            a(tileOverlay);
            return k2.f75408a;
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TileProvider f61992b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f61993c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f61994d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f61995e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f61996f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<TileOverlay, k2> f61997g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f61998h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f61999i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(TileProvider tileProvider, boolean z4, float f4, boolean z5, float f5, ld.l<? super TileOverlay, k2> lVar, int i4, int i5) {
            super(2);
            this.f61992b = tileProvider;
            this.f61993c = z4;
            this.f61994d = f4;
            this.f61995e = z5;
            this.f61996f = f5;
            this.f61997g = lVar;
            this.f61998h = i4;
            this.f61999i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n1.b(this.f61992b, this.f61993c, this.f61994d, this.f61995e, this.f61996f, this.f61997g, tVar, g3.b(this.f61998h | 1), this.f61999i);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<TileOverlay, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f62000b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l TileOverlay tileOverlay) {
            kotlin.jvm.internal.l0.p(tileOverlay, ProtectedSandApp.s("ߞ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(TileOverlay tileOverlay) {
            a(tileOverlay);
            return k2.f75408a;
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/o1;", "a", "()Lcom/google/maps/android/compose/o1;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nTileOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TileOverlay.kt\ncom/google/maps/android/compose/TileOverlayKt$TileOverlay$4\n+ 2 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt\n+ 3 TileOverlayOptioms.kt\ncom/google/maps/android/ktx/model/TileOverlayOptiomsKt\n*L\n1#1,148:1\n524#2,2:149\n526#2:154\n28#3,3:151\n*S KotlinDebug\n*F\n+ 1 TileOverlay.kt\ncom/google/maps/android/compose/TileOverlayKt$TileOverlay$4\n*L\n89#1:149,2\n89#1:154\n89#1:151,3\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<o1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f62001b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1 f62002c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<TileOverlay, k2> f62003d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TileProvider f62004e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f62005f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f62006g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f62007h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f62008i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(b0 b0Var, p1 p1Var, ld.l<? super TileOverlay, k2> lVar, TileProvider tileProvider, boolean z4, float f4, boolean z5, float f5) {
            super(0);
            this.f62001b = b0Var;
            this.f62002c = p1Var;
            this.f62003d = lVar;
            this.f62004e = tileProvider;
            this.f62005f = z4;
            this.f62006g = f4;
            this.f62007h = z5;
            this.f62008i = f5;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o1 invoke() {
            GoogleMap map;
            b0 b0Var = this.f62001b;
            if (b0Var != null && (map = b0Var.getMap()) != null) {
                TileProvider tileProvider = this.f62004e;
                boolean z4 = this.f62005f;
                float f4 = this.f62006g;
                boolean z5 = this.f62007h;
                float f5 = this.f62008i;
                TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
                tileOverlayOptions.tileProvider(tileProvider);
                tileOverlayOptions.fadeIn(z4);
                tileOverlayOptions.transparency(f4);
                tileOverlayOptions.visible(z5);
                tileOverlayOptions.zIndex(f5);
                TileOverlay addTileOverlay = map.addTileOverlay(tileOverlayOptions);
                if (addTileOverlay != null) {
                    return new o1(addTileOverlay, this.f62002c, this.f62003d);
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("ߟ\u0001"));
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/google/maps/android/compose/o1;", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/TileOverlay;", "Lkotlin/k2;", "it", "a", "(Lcom/google/maps/android/compose/o1;Lld/l;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<o1, ld.l<? super TileOverlay, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f62009b = new f(2);

        f() {
            super(2);
        }

        public final void a(@fg.l o1 o1Var, @fg.l ld.l<? super TileOverlay, k2> lVar) {
            kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("ߠ\u0001"));
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("ߡ\u0001"));
            o1Var.g(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o1 o1Var, ld.l<? super TileOverlay, ? extends k2> lVar) {
            a(o1Var, lVar);
            return k2.f75408a;
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o1;", "Lcom/google/android/gms/maps/model/TileProvider;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o1;Lcom/google/android/gms/maps/model/TileProvider;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nTileOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TileOverlay.kt\ncom/google/maps/android/compose/TileOverlayKt$TileOverlay$5$2\n+ 2 GoogleMap.kt\ncom/google/maps/android/ktx/GoogleMapKt\n+ 3 TileOverlayOptioms.kt\ncom/google/maps/android/ktx/model/TileOverlayOptiomsKt\n*L\n1#1,148:1\n524#2,2:149\n526#2:154\n28#3,3:151\n*S KotlinDebug\n*F\n+ 1 TileOverlay.kt\ncom/google/maps/android/compose/TileOverlayKt$TileOverlay$5$2\n*L\n103#1:149,2\n103#1:154\n103#1:151,3\n*E\n"})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<o1, TileProvider, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f62010b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TileProvider f62011c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f62012d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f62013e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f62014f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f62015g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b0 b0Var, TileProvider tileProvider, boolean z4, float f4, boolean z5, float f5) {
            super(2);
            this.f62010b = b0Var;
            this.f62011c = tileProvider;
            this.f62012d = z4;
            this.f62013e = f4;
            this.f62014f = z5;
            this.f62015g = f5;
        }

        public final void a(@fg.l o1 o1Var, @fg.l TileProvider tileProvider) {
            GoogleMap map;
            kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("ߢ\u0001"));
            kotlin.jvm.internal.l0.p(tileProvider, ProtectedSandApp.s("ߣ\u0001"));
            o1Var.getTileOverlay().remove();
            b0 b0Var = this.f62010b;
            if (b0Var != null && (map = b0Var.getMap()) != null) {
                TileProvider tileProvider2 = this.f62011c;
                boolean z4 = this.f62012d;
                float f4 = this.f62013e;
                boolean z5 = this.f62014f;
                float f5 = this.f62015g;
                TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
                tileOverlayOptions.tileProvider(tileProvider2);
                tileOverlayOptions.fadeIn(z4);
                tileOverlayOptions.transparency(f4);
                tileOverlayOptions.visible(z5);
                tileOverlayOptions.zIndex(f5);
                k2 k2Var = k2.f75408a;
                TileOverlay addTileOverlay = map.addTileOverlay(tileOverlayOptions);
                if (addTileOverlay != null) {
                    o1Var.h(addTileOverlay);
                    return;
                }
            }
            throw new IllegalStateException(ProtectedSandApp.s("ߤ\u0001"));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o1 o1Var, TileProvider tileProvider) {
            a(o1Var, tileProvider);
            return k2.f75408a;
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<o1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f62016b = new h(2);

        h() {
            super(2);
        }

        public final void a(@fg.l o1 o1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("ߥ\u0001"));
            o1Var.getTileOverlay().setFadeIn(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o1 o1Var, Boolean bool) {
            a(o1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<o1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f62017b = new i(2);

        i() {
            super(2);
        }

        public final void a(@fg.l o1 o1Var, float f4) {
            kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("ߦ\u0001"));
            o1Var.getTileOverlay().setTransparency(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o1 o1Var, Float f4) {
            a(o1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o1;Z)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<o1, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f62018b = new j(2);

        j() {
            super(2);
        }

        public final void a(@fg.l o1 o1Var, boolean z4) {
            kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("ߧ\u0001"));
            o1Var.getTileOverlay().setVisible(z4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o1 o1Var, Boolean bool) {
            a(o1Var, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/o1;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/o1;F)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<o1, Float, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f62019b = new k(2);

        k() {
            super(2);
        }

        public final void a(@fg.l o1 o1Var, float f4) {
            kotlin.jvm.internal.l0.p(o1Var, ProtectedSandApp.s("ߨ\u0001"));
            o1Var.getTileOverlay().setZIndex(f4);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(o1 o1Var, Float f4) {
            a(o1Var, f4.floatValue());
            return k2.f75408a;
        }
    }

    /* compiled from: TileOverlay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TileProvider f62020b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p1 f62021c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f62022d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f62023e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f62024f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f62025g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.l<TileOverlay, k2> f62026h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f62027i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f62028j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(TileProvider tileProvider, p1 p1Var, boolean z4, float f4, boolean z5, float f5, ld.l<? super TileOverlay, k2> lVar, int i4, int i5) {
            super(2);
            this.f62020b = tileProvider;
            this.f62021c = p1Var;
            this.f62022d = z4;
            this.f62023e = f4;
            this.f62024f = z5;
            this.f62025g = f5;
            this.f62026h = lVar;
            this.f62027i = i4;
            this.f62028j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            n1.a(this.f62020b, this.f62021c, this.f62022d, this.f62023e, this.f62024f, this.f62025g, this.f62026h, tVar, g3.b(this.f62027i | 1), this.f62028j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @com.google.maps.android.compose.k
    @androidx.compose.runtime.i
    public static final void a(@fg.l TileProvider tileProvider, @fg.m p1 p1Var, boolean z4, float f4, boolean z5, float f5, @fg.m ld.l<? super TileOverlay, k2> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        p1 p1Var2;
        int i6;
        kotlin.jvm.internal.l0.p(tileProvider, ProtectedSandApp.s("ߩ\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(-378552693);
        if ((i5 & 2) != 0) {
            i6 = i4 & (-113);
            p1Var2 = c(o4, 0);
        } else {
            p1Var2 = p1Var;
            i6 = i4;
        }
        boolean z6 = (i5 & 4) != 0 ? true : z4;
        float f6 = (i5 & 8) != 0 ? 0.0f : f4;
        boolean z7 = (i5 & 16) != 0 ? true : z5;
        float f7 = (i5 & 32) != 0 ? 0.0f : f5;
        ld.l<? super TileOverlay, k2> lVar2 = (i5 & 64) != 0 ? d.f62000b : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-378552693, i6, -1, ProtectedSandApp.s("ߪ\u0001"));
        }
        b0 b0Var = (b0) o4.s();
        p1 p1Var3 = p1Var2;
        ld.l<? super TileOverlay, k2> lVar3 = lVar2;
        e eVar = new e(b0Var, p1Var2, lVar2, tileProvider, z6, f6, z7, f7);
        o4.P(1886828752);
        if (!(o4.s() instanceof b0)) {
            androidx.compose.runtime.p.n();
        }
        o4.v();
        if (o4.getInserting()) {
            o4.F(new a(eVar));
        } else {
            o4.C();
        }
        m5.n(o4, lVar3, f.f62009b);
        m5.j(o4, tileProvider, new g(b0Var, tileProvider, z6, f6, z7, f7));
        m5.j(o4, Boolean.valueOf(z6), h.f62016b);
        m5.j(o4, Float.valueOf(f6), i.f62017b);
        m5.j(o4, Boolean.valueOf(z7), j.f62018b);
        m5.j(o4, Float.valueOf(f7), k.f62019b);
        o4.H();
        o4.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new l(tileProvider, p1Var3, z6, f6, z7, f7, lVar3, i4, i5));
        }
    }

    @com.google.maps.android.compose.k
    @kotlin.k(level = kotlin.m.HIDDEN, message = "For compatibility")
    @androidx.compose.runtime.i
    public static final /* synthetic */ void b(TileProvider tileProvider, boolean z4, float f4, boolean z5, float f5, ld.l lVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        kotlin.jvm.internal.l0.p(tileProvider, ProtectedSandApp.s("ߩ\u0001"));
        androidx.compose.runtime.t o4 = tVar.o(1712508128);
        boolean z6 = (i5 & 2) != 0 ? true : z4;
        float f6 = (i5 & 4) != 0 ? 0.0f : f4;
        boolean z7 = (i5 & 8) == 0 ? z5 : true;
        float f7 = (i5 & 16) == 0 ? f5 : 0.0f;
        ld.l lVar2 = (i5 & 32) != 0 ? b.f61991b : lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1712508128, i4, -1, ProtectedSandApp.s("߫\u0001"));
        }
        int i6 = i4 << 3;
        a(tileProvider, c(o4, 0), z6, f6, z7, f7, lVar2, o4, (i6 & 896) | 8 | (i6 & 7168) | (57344 & i6) | (458752 & i6) | (i6 & 3670016), 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(tileProvider, z6, f6, z7, f7, lVar2, i4, i5));
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final p1 c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1570127269);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1570127269, i4, -1, ProtectedSandApp.s("߬\u0001"));
        }
        tVar.P(675533539);
        Object Q = tVar.Q();
        if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new p1();
            tVar.E(Q);
        }
        p1 p1Var = (p1) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return p1Var;
    }
}
