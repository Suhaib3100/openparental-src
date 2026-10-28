package androidx.compose.ui.layout;

import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v3;
import androidx.compose.ui.layout.t0;
import androidx.compose.ui.node.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Layout.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001a:\u0010\t\u001a\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\u000b\u0010\f\u001a@\u0010\u0010\u001a\u00020\u00012\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00030\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00030\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0018\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00172\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001a\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00172\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u001a\u0010\u0019\u001a9\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001d8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006 "}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "Landroidx/compose/ui/v;", "content", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/layout/m0;", "measurePolicy", "c", "(Lld/p;Landroidx/compose/ui/q;Landroidx/compose/ui/layout/m0;Landroidx/compose/runtime/t;II)V", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/layout/m0;Landroidx/compose/runtime/t;II)V", "", "contents", "Landroidx/compose/ui/layout/s0;", "b", "(Ljava/util/List;Landroidx/compose/ui/q;Landroidx/compose/ui/layout/s0;Landroidx/compose/runtime/t;II)V", "e", "(Ljava/util/List;)Lld/p;", "Lkotlin/Function1;", "Landroidx/compose/runtime/v3;", "Landroidx/compose/ui/node/g;", "Lkotlin/u;", "g", "(Landroidx/compose/ui/q;)Lld/q;", "f", "d", "(Landroidx/compose/ui/q;Lld/p;Landroidx/compose/ui/layout/m0;Landroidx/compose/runtime/t;II)V", "", "I", "LargeDimension", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,390:1\n79#1,11:434\n92#1:465\n456#2,8:391\n464#2,6:405\n286#2,8:411\n294#2,2:425\n36#2:427\n456#2,8:445\n464#2,6:459\n365#2,8:466\n373#2,3:480\n3737#3,6:399\n3737#3,6:419\n3737#3,6:453\n3737#3,6:474\n1116#4,6:428\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n170#1:434,11\n170#1:465\n81#1:391,8\n81#1:405,6\n127#1:411,8\n127#1:425,2\n173#1:427\n170#1:445,8\n170#1:459,6\n252#1:466,8\n252#1:480,3\n87#1:399,6\n134#1:419,6\n170#1:453,6\n261#1:474,6\n173#1:428,6\n*E\n"})
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18904a = 32767;

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.node.g> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f18905b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f18905b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.g, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final androidx.compose.ui.node.g invoke() {
            return this.f18905b.invoke();
        }
    }

    /* compiled from: Layout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/h0;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.h0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f18906b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.node.h0 h0Var) {
            h0Var.E1(true);
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.node.h0 h0Var) {
            h0Var.E1(true);
            return k2.f75408a;
        }
    }

    /* compiled from: Layout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f18907b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f18908c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ m0 f18909d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f18910e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f18911f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, m0 m0Var, int i4, int i5) {
            super(2);
            this.f18907b = qVar;
            this.f18908c = pVar;
            this.f18909d = m0Var;
            this.f18910e = i4;
            this.f18911f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a0.d(this.f18907b, this.f18908c, this.f18909d, tVar, g3.b(this.f18910e | 1), this.f18911f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Layout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$combineAsVirtualLayouts$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,390:1\n33#2,4:391\n38#2:412\n365#3,8:395\n373#3,3:409\n3737#4,6:403\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$combineAsVirtualLayouts$1\n*L\n181#1:391,4\n181#1:412\n183#1:395,8\n183#1:409,3\n187#1:403,6\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<ld.p<androidx.compose.runtime.t, Integer, k2>> f18912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>> list) {
            super(2);
            this.f18912b = list;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1953651383, i4, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:180)");
            }
            List<ld.p<androidx.compose.runtime.t, Integer, k2>> list = this.f18912b;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                ld.p<androidx.compose.runtime.t, Integer, k2> pVar = list.get(i5);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> j5 = companion.j();
                tVar.P(-692256719);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(j5);
                } else {
                    tVar.C();
                }
                ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, b5);
                }
                pVar.invoke(tVar, 0);
                tVar.H();
                tVar.p0();
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Layout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/v3;", "Landroidx/compose/ui/node/g;", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,390:1\n3848#2,2:391\n3850#2,2:399\n3737#3,6:393\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOf$1\n*L\n206#1:391,2\n206#1:399,2\n209#1:393,6\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f18913b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.q qVar) {
            super(3);
            this.f18913b = qVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ k2 R(v3<androidx.compose.ui.node.g> v3Var, androidx.compose.runtime.t tVar, Integer num) {
            a(v3Var.getComposer(), tVar, num.intValue());
            return k2.f75408a;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.runtime.t tVar, @fg.m androidx.compose.runtime.t tVar2, int i4) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1586257396, i4, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:203)");
            }
            int j4 = androidx.compose.runtime.p.j(tVar2, 0);
            androidx.compose.ui.q l4 = androidx.compose.ui.i.l(tVar2, this.f18913b);
            tVar.P(509942095);
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            m5.j(tVar, l4, companion.g());
            ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, b5);
            }
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: Layout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/v3;", "Landroidx/compose/ui/node/g;", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOfWithCompositionLocalInjection$1\n+ 2 Composer.kt\nandroidx/compose/runtime/SkippableUpdater\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,390:1\n3848#2,2:391\n3850#2,2:399\n3737#3,6:393\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt$materializerOfWithCompositionLocalInjection$1\n*L\n229#1:391,2\n229#1:399,2\n232#1:393,6\n*E\n"})
    static final class f extends kotlin.jvm.internal.n0 implements ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f18914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.q qVar) {
            super(3);
            this.f18914b = qVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ k2 R(v3<androidx.compose.ui.node.g> v3Var, androidx.compose.runtime.t tVar, Integer num) {
            a(v3Var.getComposer(), tVar, num.intValue());
            return k2.f75408a;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.l androidx.compose.runtime.t tVar, @fg.m androidx.compose.runtime.t tVar2, int i4) {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-55743822, i4, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:226)");
            }
            int j4 = androidx.compose.runtime.p.j(tVar2, 0);
            androidx.compose.ui.q m4 = androidx.compose.ui.i.m(tVar2, this.f18914b);
            tVar.P(509942095);
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            m5.j(tVar, m4, companion.g());
            ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, b5);
            }
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    @androidx.compose.ui.v
    @androidx.compose.runtime.i
    public static final void a(@fg.m androidx.compose.ui.q qVar, @fg.l m0 m0Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(544976794);
        if ((i5 & 1) != 0) {
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        int j4 = androidx.compose.runtime.p.j(tVar, 0);
        androidx.compose.ui.q l4 = androidx.compose.ui.i.l(tVar, qVar);
        androidx.compose.runtime.g0 B = tVar.B();
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a5 = companion.a();
        tVar.P(1405779621);
        if (tVar.s() == null) {
            androidx.compose.runtime.p.n();
        }
        tVar.W();
        if (tVar.getInserting()) {
            tVar.F(new a(a5));
        } else {
            tVar.C();
        }
        m5.j(tVar, m0Var, companion.f());
        m5.j(tVar, B, companion.h());
        m5.j(tVar, l4, companion.g());
        ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
        if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, b5);
        }
        tVar.H();
        tVar.p0();
        tVar.p0();
    }

    @androidx.compose.ui.v
    @androidx.compose.runtime.i
    public static final void b(@fg.l List<? extends ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>> list, @fg.m androidx.compose.ui.q qVar, @fg.l s0 s0Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(1399185516);
        if ((i5 & 2) != 0) {
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        ld.p<androidx.compose.runtime.t, Integer, k2> e4 = e(list);
        tVar.P(1157296644);
        boolean q02 = tVar.q0(s0Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new t0.a(s0Var);
            tVar.E(Q);
        }
        tVar.p0();
        m0 m0Var = (m0) Q;
        tVar.P(-1323940314);
        int j4 = androidx.compose.runtime.p.j(tVar, 0);
        androidx.compose.runtime.g0 B = tVar.B();
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a5 = companion.a();
        ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = g(qVar);
        if (tVar.s() == null) {
            androidx.compose.runtime.p.n();
        }
        tVar.W();
        if (tVar.getInserting()) {
            tVar.F(a5);
        } else {
            tVar.C();
        }
        ld.p a6 = androidx.compose.animation.p.a(companion, tVar, m0Var, tVar, B);
        if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, a6);
        }
        androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
        androidx.compose.material3.q.a(0, e4, tVar);
    }

    @androidx.compose.ui.v
    @androidx.compose.runtime.i
    public static final void c(@fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.ui.q qVar, @fg.l m0 m0Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1323940314);
        if ((i5 & 2) != 0) {
            qVar = androidx.compose.ui.q.INSTANCE;
        }
        int j4 = androidx.compose.runtime.p.j(tVar, 0);
        androidx.compose.runtime.g0 B = tVar.B();
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a5 = companion.a();
        ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = g(qVar);
        int i6 = ((i4 << 9) & 7168) | 6;
        if (tVar.s() == null) {
            androidx.compose.runtime.p.n();
        }
        tVar.W();
        if (tVar.getInserting()) {
            tVar.F(a5);
        } else {
            tVar.C();
        }
        ld.p a6 = androidx.compose.animation.p.a(companion, tVar, m0Var, tVar, B);
        if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, a6);
        }
        androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
        pVar.invoke(tVar, Integer.valueOf((i6 >> 9) & 14));
        tVar.p0();
        tVar.H();
        tVar.p0();
    }

    @androidx.compose.ui.v
    @kotlin.k(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    @androidx.compose.runtime.i
    public static final void d(@fg.m androidx.compose.ui.q qVar, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.l m0 m0Var, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(1949933075);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= o4.q0(m0Var) ? 256 : 128;
        }
        if ((i6 & 731) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1949933075, i6, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:246)");
            }
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.ui.q l4 = androidx.compose.ui.i.l(o4, qVar);
            androidx.compose.runtime.g0 B = o4.B();
            androidx.compose.ui.node.h0.INSTANCE.getClass();
            ld.a aVar = androidx.compose.ui.node.h0.P;
            int i10 = ((i6 << 3) & 896) | 6;
            o4.P(-692256719);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(aVar);
            } else {
                o4.C();
            }
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            m5.j(o4, m0Var, companion.f());
            m5.j(o4, B, companion.h());
            m5.g(o4, b.f18906b);
            m5.j(o4, l4, companion.g());
            ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, b5);
            }
            pVar.invoke(o4, Integer.valueOf((i10 >> 6) & 14));
            o4.H();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar2 = qVar;
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(qVar2, pVar, m0Var, i4, i5));
        }
    }

    @fg.l
    @kotlin.w0
    public static final ld.p<androidx.compose.runtime.t, Integer, k2> e(@fg.l List<? extends ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>> list) {
        return new androidx.compose.runtime.internal.b(-1953651383, true, new d(list));
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Needed only for backwards compatibility. Do not use.")
    @fg.l
    @kd.i(name = "materializerOf")
    @kotlin.w0
    public static final ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> f(@fg.l androidx.compose.ui.q qVar) {
        return new androidx.compose.runtime.internal.b(-55743822, true, new f(qVar));
    }

    @fg.l
    @kd.i(name = "modifierMaterializerOf")
    @kotlin.w0
    public static final ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g(@fg.l androidx.compose.ui.q qVar) {
        return new androidx.compose.runtime.internal.b(-1586257396, true, new e(qVar));
    }
}
