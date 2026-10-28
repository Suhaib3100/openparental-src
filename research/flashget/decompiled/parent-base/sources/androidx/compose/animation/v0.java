package androidx.compose.animation;

import androidx.compose.runtime.t4;
import androidx.compose.ui.layout.i1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AnimationModifier.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001:\u0001?BQ\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012:\b\u0002\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J&\u0010\u001a\u001a\u00020\u0019*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0011R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#RT\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010,\u001a\u00020\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010+R*\u00101\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e8\u0002@BX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010+\"\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R/\u0010>\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/animation/v0;", "Landroidx/compose/animation/p0;", "Landroidx/compose/animation/core/k;", "Landroidx/compose/ui/unit/u;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "startSize", "endSize", "Lkotlin/k2;", "listener", "<init>", "(Landroidx/compose/animation/core/k;Lld/p;)V", "Landroidx/compose/ui/unit/b;", "default", "G7", "(J)J", "k7", "()V", "i7", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "targetSize", "y7", "q", "Landroidx/compose/animation/core/k;", "A7", "()Landroidx/compose/animation/core/k;", "D7", "(Landroidx/compose/animation/core/k;)V", "r", "Lld/p;", "B7", "()Lld/p;", "E7", "(Lld/p;)V", "s", "J", "lookaheadSize", "value", "t", "F7", "(J)V", "lookaheadConstraints", "", "u", "Z", "lookaheadConstraintsAvailable", "Landroidx/compose/animation/v0$a;", "<set-?>", "v", "Landroidx/compose/runtime/k2;", "z7", "()Landroidx/compose/animation/v0$a;", "C7", "(Landroidx/compose/animation/v0$a;)V", "animData", "a", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,237:1\n81#2:238\n107#2,2:239\n56#3,4:241\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n*L\n127#1:238\n127#1:239,2\n155#1:241,4\n*E\n"})
/* loaded from: classes.dex */
final class v0 extends p0 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.animation.core.k<androidx.compose.ui.unit.u> animationSpec;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, k2> listener;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long lookaheadSize;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long lookaheadConstraints;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadConstraintsAvailable;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 animData;

    /* compiled from: AnimationModifier.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\nR(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/v0$a;", "", "Landroidx/compose/animation/core/b;", "Landroidx/compose/ui/unit/u;", "Landroidx/compose/animation/core/p;", "anim", "startSize", "<init>", "(Landroidx/compose/animation/core/b;JLkotlin/jvm/internal/w;)V", "a", "()Landroidx/compose/animation/core/b;", "b", "()J", "c", "(Landroidx/compose/animation/core/b;J)Landroidx/compose/animation/v0$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/animation/core/b;", "e", "J", "f", "g", "(J)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f3379c = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.animation.core.b<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> anim;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long startSize;

        public /* synthetic */ a(androidx.compose.animation.core.b bVar, long j4, kotlin.jvm.internal.w wVar) {
            this(bVar, j4);
        }

        public static a d(a aVar, androidx.compose.animation.core.b bVar, long j4, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                bVar = aVar.anim;
            }
            if ((i4 & 2) != 0) {
                j4 = aVar.startSize;
            }
            aVar.getClass();
            return new a(bVar, j4);
        }

        @fg.l
        public final androidx.compose.animation.core.b<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> a() {
            return this.anim;
        }

        /* renamed from: b, reason: from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        @fg.l
        public final a c(@fg.l androidx.compose.animation.core.b<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> anim, long startSize) {
            return new a(anim, startSize);
        }

        @fg.l
        public final androidx.compose.animation.core.b<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> e() {
            return this.anim;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return kotlin.jvm.internal.l0.g(this.anim, aVar.anim) && androidx.compose.ui.unit.u.h(this.startSize, aVar.startSize);
        }

        public final long f() {
            return this.startSize;
        }

        public final void g(long j4) {
            this.startSize = j4;
        }

        public int hashCode() {
            return androidx.compose.ui.unit.u.n(this.startSize) + (this.anim.hashCode() * 31);
        }

        @fg.l
        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) androidx.compose.ui.unit.u.p(this.startSize)) + ')';
        }

        private a(androidx.compose.animation.core.b<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> bVar, long j4) {
            this.anim = bVar;
            this.startSize = j4;
        }
    }

    /* compiled from: AnimationModifier.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f3382b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f3383c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f3384d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ v0 f3385e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, long j4, v0 v0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f3383c = aVar;
            this.f3384d = j4;
            this.f3385e = v0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f3383c, this.f3384d, this.f3385e, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, k2> B7;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f3382b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.animation.core.b<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> e4 = this.f3383c.e();
                androidx.compose.ui.unit.u b5 = androidx.compose.ui.unit.u.b(this.f3384d);
                androidx.compose.animation.core.k<androidx.compose.ui.unit.u> A7 = this.f3385e.A7();
                this.f3382b = 1;
                obj = androidx.compose.animation.core.b.i(e4, b5, A7, null, null, this, 12, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            androidx.compose.animation.core.i iVar = (androidx.compose.animation.core.i) obj;
            if (iVar.getEndReason() == androidx.compose.animation.core.g.Finished && (B7 = this.f3385e.B7()) != 0) {
                B7.invoke(androidx.compose.ui.unit.u.b(this.f3383c.f()), iVar.b().getValue());
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: AnimationModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f3386b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i1 i1Var) {
            super(1);
            this.f3386b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.m(aVar, this.f3386b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    public /* synthetic */ v0(androidx.compose.animation.core.k kVar, ld.p pVar, int i4, kotlin.jvm.internal.w wVar) {
        this(kVar, (i4 & 2) != 0 ? null : pVar);
    }

    private final void F7(long j4) {
        this.lookaheadConstraints = j4;
        this.lookaheadConstraintsAvailable = true;
    }

    private final long G7(long r22) {
        return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : r22;
    }

    @fg.l
    public final androidx.compose.animation.core.k<androidx.compose.ui.unit.u> A7() {
        return this.animationSpec;
    }

    @fg.m
    public final ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u, k2> B7() {
        return this.listener;
    }

    public final void C7(@fg.m a aVar) {
        this.animData.setValue(aVar);
    }

    public final void D7(@fg.l androidx.compose.animation.core.k<androidx.compose.ui.unit.u> kVar) {
        this.animationSpec = kVar;
    }

    public final void E7(@fg.m ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, k2> pVar) {
        this.listener = pVar;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        i1 m02;
        if (o0Var.E1()) {
            F7(j4);
            m02 = l0Var.m0(j4);
        } else {
            m02 = l0Var.m0(G7(j4));
        }
        long a5 = androidx.compose.ui.unit.v.a(m02.getWidth(), m02.getHeight());
        if (o0Var.E1()) {
            this.lookaheadSize = a5;
        } else {
            if (u.d(this.lookaheadSize)) {
                a5 = this.lookaheadSize;
            }
            a5 = androidx.compose.ui.unit.c.d(j4, y7(a5));
        }
        return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.u.m(a5), (int) (4294967295L & a5), null, new c(m02), 4, null);
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        this.lookaheadSize = u.c();
        this.lookaheadConstraintsAvailable = false;
    }

    @Override // androidx.compose.ui.q.d
    public void k7() {
        C7(null);
    }

    public final long y7(long targetSize) {
        a z7 = z7();
        if (z7 == null) {
            z7 = new a(new androidx.compose.animation.core.b(androidx.compose.ui.unit.u.b(targetSize), androidx.compose.animation.core.k2.e(androidx.compose.ui.unit.u.INSTANCE), androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.v.a(1, 1)), null, 8, null), targetSize, null);
        } else if (!androidx.compose.ui.unit.u.h(targetSize, z7.e().s().getPackedValue())) {
            z7.g(z7.e().v().getPackedValue());
            kotlinx.coroutines.k.f(V6(), null, null, new b(z7, targetSize, this, null), 3, null);
        }
        C7(z7);
        return z7.e().v().getPackedValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final a z7() {
        return (a) this.animData.getValue();
    }

    public v0(@fg.l androidx.compose.animation.core.k<androidx.compose.ui.unit.u> kVar, @fg.m ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.u, k2> pVar) {
        androidx.compose.runtime.k2 g4;
        this.animationSpec = kVar;
        this.listener = pVar;
        this.lookaheadSize = u.c();
        this.lookaheadConstraints = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);
        g4 = t4.g(null, null, 2, null);
        this.animData = g4;
    }
}
