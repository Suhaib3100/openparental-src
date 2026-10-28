package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/e0;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/foundation/layout/a0;", "direction", "", "fraction", "<init>", "(Landroidx/compose/foundation/layout/a0;F)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "p", "Landroidx/compose/foundation/layout/a0;", "y7", "()Landroidx/compose/foundation/layout/a0;", "A7", "(Landroidx/compose/foundation/layout/a0;)V", "q", "F", "z7", "()F", "B7", "(F)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e0 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private a0 direction;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float fraction;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f4997b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.i1 i1Var) {
            super(1);
            this.f4997b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.m(aVar, this.f4997b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public e0(@fg.l a0 a0Var, float f4) {
        this.direction = a0Var;
        this.fraction = f4;
    }

    public final void A7(@fg.l a0 a0Var) {
        this.direction = a0Var;
    }

    public final void B7(float f4) {
        this.fraction = f4;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        int r4;
        int p4;
        int o4;
        int i4;
        if (!androidx.compose.ui.unit.b.j(j4) || this.direction == a0.Vertical) {
            r4 = androidx.compose.ui.unit.b.r(j4);
            p4 = androidx.compose.ui.unit.b.p(j4);
        } else {
            r4 = kotlin.ranges.s.I(kotlin.math.b.L0(androidx.compose.ui.unit.b.p(j4) * this.fraction), androidx.compose.ui.unit.b.r(j4), androidx.compose.ui.unit.b.p(j4));
            p4 = r4;
        }
        if (!androidx.compose.ui.unit.b.i(j4) || this.direction == a0.Horizontal) {
            int q4 = androidx.compose.ui.unit.b.q(j4);
            o4 = androidx.compose.ui.unit.b.o(j4);
            i4 = q4;
        } else {
            i4 = kotlin.ranges.s.I(kotlin.math.b.L0(androidx.compose.ui.unit.b.o(j4) * this.fraction), androidx.compose.ui.unit.b.q(j4), androidx.compose.ui.unit.b.o(j4));
            o4 = i4;
        }
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.c.a(r4, p4, i4, o4));
        return androidx.compose.ui.layout.o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(m02), 4, null);
    }

    @fg.l
    /* renamed from: y7, reason: from getter */
    public final a0 getDirection() {
        return this.direction;
    }

    /* renamed from: z7, reason: from getter */
    public final float getFraction() {
        return this.fraction;
    }
}
