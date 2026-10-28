package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.animation.core.f2;
import androidx.compose.animation.core.i2;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v3;
import androidx.compose.ui.graphics.p4;
import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: Crossfade.kt */
@Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aZ\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0088\u0001\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00140\t2&\u0010\f\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019²\u0006\u0012\u0010\u0018\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00008\nX\u008a\u0084\u0002"}, d2 = {"T", "targetState", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/animation/core/p0;", "", "animationSpec", "", "label", "Lkotlin/Function1;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "b", "(Ljava/lang/Object;Landroidx/compose/ui/q;Landroidx/compose/animation/core/p0;Ljava/lang/String;Lld/q;Landroidx/compose/runtime/t;II)V", "c", "(Ljava/lang/Object;Landroidx/compose/ui/q;Landroidx/compose/animation/core/p0;Lld/q;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/animation/core/e2;", "Lkotlin/r0;", "name", "", "contentKey", "a", "(Landroidx/compose/animation/core/e2;Landroidx/compose/ui/q;Landroidx/compose/animation/core/p0;Lld/l;Lld/q;Landroidx/compose/runtime/t;II)V", "alpha", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,147:1\n25#2:148\n25#2:156\n456#2,8:199\n464#2,3:213\n467#2,3:223\n1116#3,3:149\n1119#3,3:153\n1116#3,6:157\n1116#3,6:163\n1#4:152\n350#5,7:169\n33#6,6:176\n33#6,6:217\n68#7,6:182\n74#7:216\n78#7:227\n79#8,11:188\n92#8:226\n3737#9,6:207\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt\n*L\n104#1:148\n105#1:156\n139#1:199,8\n139#1:213,3\n139#1:223,3\n104#1:149,3\n104#1:153,3\n105#1:157,6\n112#1:163,6\n118#1:169,7\n127#1:176,6\n140#1:217,6\n139#1:182,6\n139#1:216\n139#1:227\n139#1:188,11\n139#1:226\n139#1:207,6\n*E\n"})
/* loaded from: classes.dex */
public final class z {

    /* compiled from: Crossfade.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f3401b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3402c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.p0<Float> f3403d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3404e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<T, androidx.compose.runtime.t, Integer, k2> f3405f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f3406g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f3407h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(T t4, androidx.compose.ui.q qVar, androidx.compose.animation.core.p0<Float> p0Var, String str, ld.q<? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3401b = t4;
            this.f3402c = qVar;
            this.f3403d = p0Var;
            this.f3404e = str;
            this.f3405f = qVar2;
            this.f3406g = i4;
            this.f3407h = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            z.b(this.f3401b, this.f3402c, this.f3403d, this.f3404e, this.f3405f, tVar, g3.b(this.f3406g | 1), this.f3407h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Crossfade.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f3408b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3409c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.p0<Float> f3410d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<Object, androidx.compose.runtime.t, Integer, k2> f3411e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f3412f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f3413g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Object obj, androidx.compose.ui.q qVar, androidx.compose.animation.core.p0<Float> p0Var, ld.q<Object, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3408b = obj;
            this.f3409c = qVar;
            this.f3410d = p0Var;
            this.f3411e = qVar2;
            this.f3412f = i4;
            this.f3413g = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            z.c(this.f3408b, this.f3409c, this.f3410d, this.f3411e, tVar, g3.b(this.f3412f | 1), this.f3413g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Crossfade.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c<T> extends kotlin.jvm.internal.n0 implements ld.l<T, T> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f3414b = new c(1);

        c() {
            super(1);
        }

        @Override // ld.l
        public final T invoke(T t4) {
            return t4;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Crossfade.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d<T> extends kotlin.jvm.internal.n0 implements ld.l<T, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<T> f3415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e2<T> e2Var) {
            super(1);
            this.f3415b = e2Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t4) {
            return Boolean.valueOf(!kotlin.jvm.internal.l0.g(t4, this.f3415b.o()));
        }
    }

    /* compiled from: Crossfade.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/k2;", "b", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nCrossfade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n+ 2 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,147:1\n1163#2,4:148\n1083#2,5:152\n1116#3,6:157\n68#4,6:163\n74#4:197\n78#4:202\n79#5,11:169\n92#5:201\n456#6,8:180\n464#6,3:194\n467#6,3:198\n3737#7,6:188\n81#8:203\n*S KotlinDebug\n*F\n+ 1 Crossfade.kt\nandroidx/compose/animation/CrossfadeKt$Crossfade$5$1\n*L\n129#1:148,4\n129#1:152,5\n132#1:157,6\n132#1:163,6\n132#1:197\n132#1:202\n132#1:169,11\n132#1:201\n132#1:180,8\n132#1:194,3\n132#1:198,3\n132#1:188,6\n129#1:203\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<T> f3416b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.p0<Float> f3417c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f3418d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.q<T, androidx.compose.runtime.t, Integer, k2> f3419e;

        /* compiled from: Crossfade.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/q4;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<q4, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b5<Float> f3420b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b5<Float> b5Var) {
                super(1);
                this.f3420b = b5Var;
            }

            public final void a(@fg.l q4 q4Var) {
                q4Var.k(e.c(this.f3420b));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(q4 q4Var) {
                a(q4Var);
                return k2.f75408a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Crossfade.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/animation/core/e2$b;", "Landroidx/compose/animation/core/p0;", "", "a", "(Landroidx/compose/animation/core/e2$b;Landroidx/compose/runtime/t;I)Landroidx/compose/animation/core/p0;"}, k = 3, mv = {1, 8, 0})
        static final class b<T> extends kotlin.jvm.internal.n0 implements ld.q<e2.b<T>, androidx.compose.runtime.t, Integer, androidx.compose.animation.core.p0<Float>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.p0<Float> f3421b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.animation.core.p0<Float> p0Var) {
                super(3);
                this.f3421b = p0Var;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ androidx.compose.animation.core.p0<Float> R(Object obj, androidx.compose.runtime.t tVar, Integer num) {
                return a((e2.b) obj, tVar, num.intValue());
            }

            @fg.l
            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final androidx.compose.animation.core.p0<Float> a(@fg.l e2.b<T> bVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
                tVar.P(438406499);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(438406499, i4, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:129)");
                }
                androidx.compose.animation.core.p0<Float> p0Var = this.f3421b;
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
                tVar.p0();
                return p0Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(e2<T> e2Var, androidx.compose.animation.core.p0<Float> p0Var, T t4, ld.q<? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar) {
            super(2);
            this.f3416b = e2Var;
            this.f3417c = p0Var;
            this.f3418d = t4;
            this.f3419e = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float c(b5<Float> b5Var) {
            return b5Var.getValue().floatValue();
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void b(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1426421288, i4, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:128)");
            }
            e2<T> e2Var = this.f3416b;
            b bVar = new b(this.f3417c);
            T t4 = this.f3418d;
            tVar.P(-1338768149);
            i2<Float, androidx.compose.animation.core.o> i5 = androidx.compose.animation.core.k2.i(kotlin.jvm.internal.a0.f75283a);
            tVar.P(-142660079);
            Object h4 = e2Var.h();
            tVar.P(-438678252);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
            }
            float f4 = kotlin.jvm.internal.l0.g(h4, t4) ? 1.0f : 0.0f;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            Float valueOf = Float.valueOf(f4);
            Object o4 = e2Var.o();
            tVar.P(-438678252);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:130)");
            }
            float f5 = kotlin.jvm.internal.l0.g(o4, t4) ? 1.0f : 0.0f;
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            b5 m4 = f2.m(e2Var, valueOf, Float.valueOf(f5), bVar.R(e2Var.m(), tVar, 0), i5, "FloatAnimation", tVar, 0);
            tVar.p0();
            tVar.p0();
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            tVar.P(317054099);
            boolean q02 = tVar.q0(m4);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(m4);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q a5 = p4.a(companion, (ld.l) Q);
            ld.q<T, androidx.compose.runtime.t, Integer, k2> qVar = this.f3419e;
            T t5 = this.f3418d;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a6 = a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a7 = companion2.a();
            ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = androidx.compose.ui.layout.a0.g(a5);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a7);
            } else {
                tVar.C();
            }
            ld.p a8 = p.a(companion2, tVar, a6, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a8);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            qVar.R(t5, tVar, 0);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            b(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: Crossfade.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e2<T> f3422b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f3423c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.p0<Float> f3424d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Object> f3425e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.q<T, androidx.compose.runtime.t, Integer, k2> f3426f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f3427g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f3428h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(e2<T> e2Var, androidx.compose.ui.q qVar, androidx.compose.animation.core.p0<Float> p0Var, ld.l<? super T, ? extends Object> lVar, ld.q<? super T, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i4, int i5) {
            super(2);
            this.f3422b = e2Var;
            this.f3423c = qVar;
            this.f3424d = p0Var;
            this.f3425e = lVar;
            this.f3426f = qVar2;
            this.f3427g = i4;
            this.f3428h = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            z.a(this.f3422b, this.f3423c, this.f3424d, this.f3425e, this.f3426f, tVar, g3.b(this.f3427g | 1), this.f3428h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x023f  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.animation.j0
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void a(@fg.l androidx.compose.animation.core.e2<T> r17, @fg.m androidx.compose.ui.q r18, @fg.m androidx.compose.animation.core.p0<java.lang.Float> r19, @fg.m ld.l<? super T, ? extends java.lang.Object> r20, @fg.l ld.q<? super T, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r21, @fg.m androidx.compose.runtime.t r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.z.a(androidx.compose.animation.core.e2, androidx.compose.ui.q, androidx.compose.animation.core.p0, ld.l, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004f  */
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void b(T r17, @fg.m androidx.compose.ui.q r18, @fg.m androidx.compose.animation.core.p0<java.lang.Float> r19, @fg.m java.lang.String r20, @fg.l ld.q<? super T, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r21, @fg.m androidx.compose.runtime.t r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.z.b(java.lang.Object, androidx.compose.ui.q, androidx.compose.animation.core.p0, java.lang.String, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    @androidx.compose.runtime.i
    public static final /* synthetic */ void c(Object obj, androidx.compose.ui.q qVar, androidx.compose.animation.core.p0 p0Var, ld.q qVar2, androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(523603005);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.q0(obj) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.q0(qVar) ? 32 : 16;
        }
        int i10 = i5 & 4;
        if (i10 != 0) {
            i6 |= 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 7168) == 0) {
            i6 |= o4.S(qVar2) ? 2048 : 1024;
        }
        if (i10 == 4 && (i6 & 5851) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (i10 != 0) {
                p0Var = androidx.compose.animation.core.l.r(0, 0, null, 7, null);
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(523603005, i6, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:70)");
            }
            a(f2.p(obj, null, o4, i6 & 14, 2), qVar, p0Var, null, qVar2, o4, (i6 & 112) | 512 | ((i6 << 3) & 57344), 4);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.q qVar3 = qVar;
        androidx.compose.animation.core.p0 p0Var2 = p0Var;
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(obj, qVar3, p0Var2, qVar2, i4, i5));
        }
    }
}
