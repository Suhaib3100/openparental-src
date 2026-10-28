package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/j3;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/foundation/layout/a0;", "direction", "", "unbounded", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/u;", "Landroidx/compose/ui/unit/w;", "Landroidx/compose/ui/unit/q;", "alignmentCallback", "<init>", "(Landroidx/compose/foundation/layout/a0;ZLld/p;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "p", "Landroidx/compose/foundation/layout/a0;", "z7", "()Landroidx/compose/foundation/layout/a0;", "C7", "(Landroidx/compose/foundation/layout/a0;)V", "q", "Z", "A7", "()Z", "D7", "(Z)V", "r", "Lld/p;", "y7", "()Lld/p;", "B7", "(Lld/p;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class j3 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 direction;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean unbounded;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> alignmentCallback;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5140c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f5141d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5142e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f5143f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, androidx.compose.ui.layout.i1 i1Var, int i5, androidx.compose.ui.layout.o0 o0Var) {
            super(1);
            this.f5140c = i4;
            this.f5141d = i1Var;
            this.f5142e = i5;
            this.f5143f = o0Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.i(aVar, this.f5141d, j3.this.y7().invoke(androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.v.a(this.f5140c - this.f5141d.getWidth(), this.f5142e - this.f5141d.getHeight())), this.f5143f.getLayoutDirection()).getPackedValue(), 0.0f, 2, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public j3(@fg.l a0 a0Var, boolean z4, @fg.l ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> pVar) {
        this.direction = a0Var;
        this.unbounded = z4;
        this.alignmentCallback = pVar;
    }

    /* renamed from: A7, reason: from getter */
    public final boolean getUnbounded() {
        return this.unbounded;
    }

    public final void B7(@fg.l ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> pVar) {
        this.alignmentCallback = pVar;
    }

    public final void C7(@fg.l a0 a0Var) {
        this.direction = a0Var;
    }

    public final void D7(boolean z4) {
        this.unbounded = z4;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        a0 a0Var = this.direction;
        a0 a0Var2 = a0.Vertical;
        int r4 = a0Var != a0Var2 ? 0 : androidx.compose.ui.unit.b.r(j4);
        a0 a0Var3 = this.direction;
        a0 a0Var4 = a0.Horizontal;
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.c.a(r4, (this.direction == a0Var2 || !this.unbounded) ? androidx.compose.ui.unit.b.p(j4) : Integer.MAX_VALUE, a0Var3 == a0Var4 ? androidx.compose.ui.unit.b.q(j4) : 0, (this.direction == a0Var4 || !this.unbounded) ? androidx.compose.ui.unit.b.o(j4) : Integer.MAX_VALUE));
        int I = kotlin.ranges.s.I(m02.getWidth(), androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.p(j4));
        int I2 = kotlin.ranges.s.I(m02.getHeight(), androidx.compose.ui.unit.b.q(j4), androidx.compose.ui.unit.b.o(j4));
        return androidx.compose.ui.layout.o0.x2(o0Var, I, I2, null, new a(I, m02, I2, o0Var), 4, null);
    }

    @fg.l
    public final ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> y7() {
        return this.alignmentCallback;
    }

    @fg.l
    /* renamed from: z7, reason: from getter */
    public final a0 getDirection() {
        return this.direction;
    }
}
