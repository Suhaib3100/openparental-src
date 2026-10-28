package androidx.compose.material3;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R.\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010,\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u001e\u00101\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u00100R\u001e\u00103\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/material3/ha;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/runtime/b5;", "", "Landroidx/compose/material3/ka;", "tabPositionsState", "", "selectedTabIndex", "", "followContentSize", "<init>", "(Landroidx/compose/runtime/b5;IZ)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "p", "Landroidx/compose/runtime/b5;", "A7", "()Landroidx/compose/runtime/b5;", "D7", "(Landroidx/compose/runtime/b5;)V", "q", "I", "z7", "()I", "C7", "(I)V", "r", "Z", "y7", "()Z", "B7", "(Z)V", "Landroidx/compose/animation/core/b;", "Landroidx/compose/ui/unit/h;", "Landroidx/compose/animation/core/o;", "s", "Landroidx/compose/animation/core/b;", "offsetAnimatable", "t", "widthAnimatable", "u", "Landroidx/compose/ui/unit/h;", "initialOffset", "v", "initialWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ha extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: w, reason: collision with root package name */
    public static final int f11358w = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.b5<? extends List<ka>> tabPositionsState;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int selectedTabIndex;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean followContentSize;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> offsetAnimatable;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> widthAnimatable;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.h initialOffset;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.unit.h initialWidth;

    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11366b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l i1.a aVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(i1.a aVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TabRow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$2", f = "TabRow.kt", i = {}, l = {536}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> f11368c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f11369d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar, float f4, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f11368c = bVar;
            this.f11369d = f4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f11368c, this.f11369d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f11367b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar = this.f11368c;
                androidx.compose.ui.unit.h d5 = androidx.compose.ui.unit.h.d(this.f11369d);
                this.f11367b = 1;
                if (androidx.compose.animation.core.b.i(bVar, d5, null, null, null, this, 14, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: TabRow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", f = "TabRow.kt", i = {}, l = {552}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f11370b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> f11371c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f11372d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar, float f4, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f11371c = bVar;
            this.f11372d = f4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new c(this.f11371c, this.f11372d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f11370b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar = this.f11371c;
                androidx.compose.ui.unit.h d5 = androidx.compose.ui.unit.h.d(this.f11372d);
                this.f11370b = 1;
                if (androidx.compose.animation.core.b.i(bVar, d5, null, null, null, this, 14, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: TabRow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11373b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f11374c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f11375d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f11376e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.o0 o0Var, float f4, long j4) {
            super(1);
            this.f11373b = i1Var;
            this.f11374c = o0Var;
            this.f11375d = f4;
            this.f11376e = j4;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f11373b, this.f11374c.q2(this.f11375d), androidx.compose.ui.unit.b.o(this.f11376e) - this.f11373b.getHeight(), 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public ha(@fg.l androidx.compose.runtime.b5<? extends List<ka>> b5Var, int i4, boolean z4) {
        this.tabPositionsState = b5Var;
        this.selectedTabIndex = i4;
        this.followContentSize = z4;
    }

    @fg.l
    public final androidx.compose.runtime.b5<List<ka>> A7() {
        return this.tabPositionsState;
    }

    public final void B7(boolean z4) {
        this.followContentSize = z4;
    }

    public final void C7(int i4) {
        this.selectedTabIndex = i4;
    }

    public final void D7(@fg.l androidx.compose.runtime.b5<? extends List<ka>> b5Var) {
        this.tabPositionsState = b5Var;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        androidx.compose.ui.layout.l0 l0Var2;
        long j5;
        if (this.tabPositionsState.getValue().isEmpty()) {
            return androidx.compose.ui.layout.o0.x2(o0Var, 0, 0, null, a.f11366b, 4, null);
        }
        float contentWidth = this.tabPositionsState.getValue().get(this.selectedTabIndex).getContentWidth();
        if (this.followContentSize) {
            if (this.initialWidth != null) {
                androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar = this.widthAnimatable;
                if (bVar == null) {
                    androidx.compose.ui.unit.h hVar = this.initialWidth;
                    kotlin.jvm.internal.l0.m(hVar);
                    bVar = new androidx.compose.animation.core.b<>(hVar, androidx.compose.animation.core.k2.b(androidx.compose.ui.unit.h.INSTANCE), null, null, 12, null);
                    this.widthAnimatable = bVar;
                }
                if (!androidx.compose.ui.unit.h.l(contentWidth, bVar.s().u())) {
                    kotlinx.coroutines.k.f(V6(), null, null, new b(bVar, contentWidth, null), 3, null);
                }
            } else {
                this.initialWidth = androidx.compose.ui.unit.h.d(contentWidth);
            }
        }
        float left = this.tabPositionsState.getValue().get(this.selectedTabIndex).getLeft();
        if (this.initialOffset != null) {
            androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar2 = this.offsetAnimatable;
            if (bVar2 == null) {
                androidx.compose.ui.unit.h hVar2 = this.initialOffset;
                kotlin.jvm.internal.l0.m(hVar2);
                bVar2 = new androidx.compose.animation.core.b<>(hVar2, androidx.compose.animation.core.k2.b(androidx.compose.ui.unit.h.INSTANCE), null, null, 12, null);
                this.offsetAnimatable = bVar2;
            }
            if (!androidx.compose.ui.unit.h.l(left, bVar2.s().u())) {
                kotlinx.coroutines.k.f(V6(), null, null, new c(bVar2, left, null), 3, null);
            }
        } else {
            this.initialOffset = androidx.compose.ui.unit.h.d(left);
        }
        androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar3 = this.offsetAnimatable;
        if (bVar3 != null) {
            left = bVar3.v().u();
        }
        float f4 = left;
        if (this.followContentSize) {
            androidx.compose.animation.core.b<androidx.compose.ui.unit.h, androidx.compose.animation.core.o> bVar4 = this.widthAnimatable;
            if (bVar4 != null) {
                contentWidth = bVar4.v().u();
            }
            j5 = androidx.compose.ui.unit.b.e(j4, o0Var.q2(contentWidth), o0Var.q2(contentWidth), 0, 0, 12, null);
            l0Var2 = l0Var;
        } else {
            l0Var2 = l0Var;
            j5 = j4;
        }
        androidx.compose.ui.layout.i1 m02 = l0Var2.m0(j5);
        return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), androidx.compose.ui.unit.b.o(j4), null, new d(m02, o0Var, f4, j4), 4, null);
    }

    /* renamed from: y7, reason: from getter */
    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    /* renamed from: z7, reason: from getter */
    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }
}
