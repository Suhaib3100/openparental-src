package androidx.compose.material3;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: SwipeToDismissBox.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0016\u0010%\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/material3/y9;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/material3/ba;", "state", "", "enableDismissFromStartToEnd", "enableDismissFromEndToStart", "<init>", "(Landroidx/compose/material3/ba;ZZ)V", "Lkotlin/k2;", "j7", "()V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "p", "Landroidx/compose/material3/ba;", "A7", "()Landroidx/compose/material3/ba;", "D7", "(Landroidx/compose/material3/ba;)V", "q", "Z", "z7", "()Z", "C7", "(Z)V", "r", "y7", "B7", "s", "didLookahead", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class y9 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ba state;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean enableDismissFromStartToEnd;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean enableDismissFromEndToStart;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean didLookahead;

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f15832b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y9 f15833c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f15834d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.o0 o0Var, y9 y9Var, androidx.compose.ui.layout.i1 i1Var) {
            super(1);
            this.f15832b = o0Var;
            this.f15833c = y9Var;
            this.f15834d = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f15834d, kotlin.math.b.L0(this.f15832b.E1() ? this.f15833c.getState().b().p().e(this.f15833c.getState().h()) : this.f15833c.getState().j()), 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: SwipeToDismissBox.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/u4;", "Landroidx/compose/material3/ca;", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/u4;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<u4<ca>, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f15836c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f4) {
            super(1);
            this.f15836c = f4;
        }

        public final void a(@fg.l u4<ca> u4Var) {
            u4Var.a(ca.Settled, 0.0f);
            if (y9.this.getEnableDismissFromStartToEnd()) {
                u4Var.a(ca.StartToEnd, this.f15836c);
            }
            if (y9.this.getEnableDismissFromEndToStart()) {
                u4Var.a(ca.EndToStart, -this.f15836c);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(u4<ca> u4Var) {
            a(u4Var);
            return kotlin.k2.f75408a;
        }
    }

    public y9(@fg.l ba baVar, boolean z4, boolean z5) {
        this.state = baVar;
        this.enableDismissFromStartToEnd = z4;
        this.enableDismissFromEndToStart = z5;
    }

    @fg.l
    /* renamed from: A7, reason: from getter */
    public final ba getState() {
        return this.state;
    }

    public final void B7(boolean z4) {
        this.enableDismissFromEndToStart = z4;
    }

    public final void C7(boolean z4) {
        this.enableDismissFromStartToEnd = z4;
    }

    public final void D7(@fg.l ba baVar) {
        this.state = baVar;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
        if (o0Var.E1() || !this.didLookahead) {
            k.N(this.state.b(), j.a(new b(m02.getWidth())), null, 2, null);
        }
        this.didLookahead = o0Var.E1() || this.didLookahead;
        return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(o0Var, this, m02), 4, null);
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        this.didLookahead = false;
    }

    /* renamed from: y7, reason: from getter */
    public final boolean getEnableDismissFromEndToStart() {
        return this.enableDismissFromEndToStart;
    }

    /* renamed from: z7, reason: from getter */
    public final boolean getEnableDismissFromStartToEnd() {
        return this.enableDismissFromStartToEnd;
    }
}
