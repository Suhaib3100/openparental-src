package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.i2;
import androidx.compose.animation.core.k2;
import androidx.compose.animation.core.y1;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;

/* compiled from: SelectionMagnifier.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\t\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001d\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\" \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$²\u0006\f\u0010\u0007\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function0;", "Li0/f;", "magnifierCenter", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "animatedCenter", "platformMagnifier", "d", "(Landroidx/compose/ui/q;Lld/a;Lld/l;)Landroidx/compose/ui/q;", "targetCalculation", "Landroidx/compose/runtime/b5;", "h", "(Lld/a;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "Landroidx/compose/animation/core/p;", "a", "Landroidx/compose/animation/core/p;", "UnspecifiedAnimationVector2D", "Landroidx/compose/animation/core/i2;", "b", "Landroidx/compose/animation/core/i2;", "g", "()Landroidx/compose/animation/core/i2;", "UnspecifiedSafeOffsetVectorConverter", "c", "J", "f", "()J", "OffsetDisplacementThreshold", "Landroidx/compose/animation/core/y1;", "Landroidx/compose/animation/core/y1;", "e", "()Landroidx/compose/animation/core/y1;", "MagnifierSpringSpec", "targetValue", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n25#2:110\n25#2:117\n1116#3,6:111\n1116#3,6:118\n81#4:124\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n78#1:110\n79#1:117\n78#1:111,6\n79#1:118,6\n78#1:124\n*E\n"})
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.p f7962a = new androidx.compose.animation.core.p(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final i2<i0.f, androidx.compose.animation.core.p> f7963b = k2.a(a.f7966b, b.f7967b);

    /* renamed from: c, reason: collision with root package name */
    private static final long f7964c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final y1<i0.f> f7965d;

    /* compiled from: SelectionMagnifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Landroidx/compose/animation/core/p;", "a", "(J)Landroidx/compose/animation/core/p;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i0.f, androidx.compose.animation.core.p> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7966b = new a(1);

        a() {
            super(1);
        }

        @fg.l
        public final androidx.compose.animation.core.p a(long j4) {
            return i0.g.d(j4) ? new androidx.compose.animation.core.p(i0.f.p(j4), i0.f.r(j4)) : g0.f7962a;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.p invoke(i0.f fVar) {
            return a(fVar.getPackedValue());
        }
    }

    /* compiled from: SelectionMagnifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/p;", "it", "Li0/f;", "a", "(Landroidx/compose/animation/core/p;)J"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.animation.core.p, i0.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f7967b = new b(1);

        b() {
            super(1);
        }

        public final long a(@fg.l androidx.compose.animation.core.p pVar) {
            return i0.g.a(pVar.getV1(), pVar.getV2());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ i0.f invoke(androidx.compose.animation.core.p pVar) {
            return i0.f.d(a(pVar));
        }
    }

    /* compiled from: SelectionMagnifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/q;", "b", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/q;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,109:1\n1116#2,6:110\n81#3:116\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n*L\n67#1:110,6\n66#1:116\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, androidx.compose.ui.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<i0.f> f7968b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<ld.a<i0.f>, androidx.compose.ui.q> f7969c;

        /* compiled from: SelectionMagnifier.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "a", "()J"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<i0.f> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b5<i0.f> f7970b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b5<i0.f> b5Var) {
                super(0);
                this.f7970b = b5Var;
            }

            public final long a() {
                return c.c(this.f7970b);
            }

            @Override // ld.a
            public i0.f invoke() {
                return i0.f.d(c.c(this.f7970b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.a<i0.f> aVar, ld.l<? super ld.a<i0.f>, ? extends androidx.compose.ui.q> lVar) {
            super(3);
            this.f7968b = aVar;
            this.f7969c = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long c(b5<i0.f> b5Var) {
            return b5Var.getValue().getPackedValue();
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.q R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
            return b(qVar, tVar, num.intValue());
        }

        @fg.l
        @androidx.compose.runtime.i
        public final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(759876635);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(759876635, i4, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            b5 h4 = g0.h(this.f7968b, tVar, 0);
            ld.l<ld.a<i0.f>, androidx.compose.ui.q> lVar = this.f7969c;
            tVar.P(1227294510);
            boolean q02 = tVar.q0(h4);
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(h4);
                tVar.E(Q);
            }
            tVar.p0();
            androidx.compose.ui.q invoke = lVar.invoke((ld.a) Q);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return invoke;
        }
    }

    /* compiled from: SelectionMagnifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1", f = "SelectionMagnifier.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f7971b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f7972c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b5<i0.f> f7973d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<i0.f, androidx.compose.animation.core.p> f7974e;

        /* compiled from: SelectionMagnifier.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "a", "()J"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<i0.f> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b5<i0.f> f7975b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b5<i0.f> b5Var) {
                super(0);
                this.f7975b = b5Var;
            }

            public final long a() {
                return g0.i(this.f7975b);
            }

            @Override // ld.a
            public i0.f invoke() {
                return i0.f.d(g0.i(this.f7975b));
            }
        }

        /* compiled from: SelectionMagnifier.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "targetValue", "Lkotlin/k2;", "a", "(JLkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.b<i0.f, androidx.compose.animation.core.p> f7976b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f7977c;

            /* compiled from: SelectionMagnifier.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$1", f = "SelectionMagnifier.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f7978b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.animation.core.b<i0.f, androidx.compose.animation.core.p> f7979c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ long f7980d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(androidx.compose.animation.core.b<i0.f, androidx.compose.animation.core.p> bVar, long j4, kotlin.coroutines.d<? super a> dVar) {
                    super(2, dVar);
                    this.f7979c = bVar;
                    this.f7980d = j4;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new a(this.f7979c, this.f7980d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f7978b;
                    if (i4 == 0) {
                        a1.n(obj);
                        androidx.compose.animation.core.b<i0.f, androidx.compose.animation.core.p> bVar = this.f7979c;
                        i0.f d5 = i0.f.d(this.f7980d);
                        y1<i0.f> e4 = g0.e();
                        this.f7978b = 1;
                        if (androidx.compose.animation.core.b.i(bVar, d5, e4, null, null, this, 12, null) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a1.n(obj);
                    }
                    return kotlin.k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                }
            }

            b(androidx.compose.animation.core.b<i0.f, androidx.compose.animation.core.p> bVar, kotlinx.coroutines.r0 r0Var) {
                this.f7976b = bVar;
                this.f7977c = r0Var;
            }

            @fg.m
            public final Object a(long j4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                if (i0.g.d(this.f7976b.v().getPackedValue()) && i0.g.d(j4) && i0.f.r(this.f7976b.v().getPackedValue()) != i0.f.r(j4)) {
                    kotlinx.coroutines.k.f(this.f7977c, null, null, new a(this.f7976b, j4, null), 3, null);
                    return kotlin.k2.f75408a;
                }
                Object C = this.f7976b.C(i0.f.d(j4), dVar);
                return C == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? C : kotlin.k2.f75408a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((i0.f) obj).getPackedValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b5<i0.f> b5Var, androidx.compose.animation.core.b<i0.f, androidx.compose.animation.core.p> bVar, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f7973d = b5Var;
            this.f7974e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f7973d, this.f7974e, dVar);
            dVar2.f7972c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f7971b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f7972c;
                kotlinx.coroutines.flow.i w4 = o4.w(new a(this.f7973d));
                b bVar = new b(this.f7974e, r0Var);
                this.f7971b = 1;
                if (w4.a(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    static {
        long a5 = i0.g.a(0.01f, 0.01f);
        f7964c = a5;
        f7965d = new y1<>(0.0f, 0.0f, i0.f.d(a5), 3, null);
    }

    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l ld.a<i0.f> aVar, @fg.l ld.l<? super ld.a<i0.f>, ? extends androidx.compose.ui.q> lVar) {
        return androidx.compose.ui.i.j(qVar, null, new c(aVar, lVar), 1, null);
    }

    @fg.l
    public static final y1<i0.f> e() {
        return f7965d;
    }

    public static final long f() {
        return f7964c;
    }

    @fg.l
    public static final i2<i0.f, androidx.compose.animation.core.p> g() {
        return f7963b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i
    public static final b5<i0.f> h(ld.a<i0.f> aVar, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1589795249);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1589795249, i4, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Q = o4.e(aVar);
            tVar.E(Q);
        }
        tVar.p0();
        b5 b5Var = (b5) Q;
        tVar.P(-492369756);
        Object Q2 = tVar.Q();
        if (Q2 == companion.a()) {
            Q2 = new androidx.compose.animation.core.b(i0.f.d(i(b5Var)), f7963b, i0.f.d(f7964c), null, 8, null);
            tVar.E(Q2);
        }
        tVar.p0();
        androidx.compose.animation.core.b bVar = (androidx.compose.animation.core.b) Q2;
        androidx.compose.runtime.a1.h(kotlin.k2.f75408a, new d(b5Var, bVar, null), tVar, 70);
        b5<i0.f> j4 = bVar.j();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(b5<i0.f> b5Var) {
        return b5Var.getValue().getPackedValue();
    }
}
