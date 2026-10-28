package androidx.compose.foundation;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Scroll.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J#\u0010\u001a\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J#\u0010\u001b\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroidx/compose/foundation/x2;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/foundation/w2;", "scrollerState", "", "isReversed", "isVertical", "<init>", "(Landroidx/compose/foundation/w2;ZZ)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "width", "G", "V", "p", "Landroidx/compose/foundation/w2;", "y7", "()Landroidx/compose/foundation/w2;", "C7", "(Landroidx/compose/foundation/w2;)V", "q", "Z", "z7", "()Z", "B7", "(Z)V", "r", "A7", "D7", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x2 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: s, reason: collision with root package name */
    public static final int f9259s = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private w2 scrollerState;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isReversed;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isVertical;

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f9264c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f9265d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, androidx.compose.ui.layout.i1 i1Var) {
            super(1);
            this.f9264c = i4;
            this.f9265d = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            int I = kotlin.ranges.s.I(x2.this.getScrollerState().r(), 0, this.f9264c);
            int i4 = x2.this.getIsReversed() ? I - this.f9264c : -I;
            i1.a.q(aVar, this.f9265d, x2.this.getIsVertical() ? 0 : i4, x2.this.getIsVertical() ? i4 : 0, 0.0f, null, 12, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public x2(@fg.l w2 w2Var, boolean z4, boolean z5) {
        this.scrollerState = w2Var;
        this.isReversed = z4;
        this.isVertical = z5;
    }

    /* renamed from: A7, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final void B7(boolean z4) {
        this.isReversed = z4;
    }

    public final void C7(@fg.l w2 w2Var) {
        this.scrollerState = w2Var;
    }

    public final void D7(boolean z4) {
        this.isVertical = z4;
    }

    @Override // androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return this.isVertical ? pVar.Z(i4) : pVar.Z(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return this.isVertical ? pVar.k0(Integer.MAX_VALUE) : pVar.k0(i4);
    }

    @Override // androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return this.isVertical ? pVar.l0(Integer.MAX_VALUE) : pVar.l0(i4);
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        f0.a(j4, this.isVertical ? androidx.compose.foundation.gestures.j0.Vertical : androidx.compose.foundation.gestures.j0.Horizontal);
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.b.e(j4, 0, this.isVertical ? androidx.compose.ui.unit.b.p(j4) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : androidx.compose.ui.unit.b.o(j4), 5, null));
        int width = m02.getWidth();
        int p4 = androidx.compose.ui.unit.b.p(j4);
        int i4 = width > p4 ? p4 : width;
        int height = m02.getHeight();
        int o4 = androidx.compose.ui.unit.b.o(j4);
        int i5 = height > o4 ? o4 : height;
        int height2 = m02.getHeight() - i5;
        int width2 = m02.getWidth() - i4;
        if (!this.isVertical) {
            height2 = width2;
        }
        this.scrollerState.u(height2);
        this.scrollerState.w(this.isVertical ? i5 : i4);
        return androidx.compose.ui.layout.o0.x2(o0Var, i4, i5, null, new a(height2, m02), 4, null);
    }

    @Override // androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return this.isVertical ? pVar.t(i4) : pVar.t(Integer.MAX_VALUE);
    }

    @fg.l
    /* renamed from: y7, reason: from getter */
    public final w2 getScrollerState() {
        return this.scrollerState;
    }

    /* renamed from: z7, reason: from getter */
    public final boolean getIsReversed() {
        return this.isReversed;
    }
}
