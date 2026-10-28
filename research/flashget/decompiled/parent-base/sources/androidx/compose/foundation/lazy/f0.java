package androidx.compose.foundation.lazy;

import androidx.compose.runtime.b5;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/lazy/f0;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "", "fraction", "Landroidx/compose/runtime/b5;", "", "widthState", "heightState", "<init>", "(FLandroidx/compose/runtime/b5;Landroidx/compose/runtime/b5;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "p", "F", "y7", "()F", "B7", "(F)V", "q", "Landroidx/compose/runtime/b5;", "A7", "()Landroidx/compose/runtime/b5;", "D7", "(Landroidx/compose/runtime/b5;)V", "r", "z7", "C7", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f0 extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float fraction;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b5<Integer> widthState;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b5<Integer> heightState;

    /* compiled from: LazyItemScopeImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f5566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1 i1Var) {
            super(1);
            this.f5566b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f5566b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    public /* synthetic */ f0(float f4, b5 b5Var, b5 b5Var2, int i4, kotlin.jvm.internal.w wVar) {
        this(f4, (i4 & 2) != 0 ? null : b5Var, (i4 & 4) != 0 ? null : b5Var2);
    }

    @fg.m
    public final b5<Integer> A7() {
        return this.widthState;
    }

    public final void B7(float f4) {
        this.fraction = f4;
    }

    public final void C7(@fg.m b5<Integer> b5Var) {
        this.heightState = b5Var;
    }

    public final void D7(@fg.m b5<Integer> b5Var) {
        this.widthState = b5Var;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4) {
        b5<Integer> b5Var = this.widthState;
        int L0 = (b5Var == null || b5Var.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : kotlin.math.b.L0(b5Var.getValue().floatValue() * this.fraction);
        b5<Integer> b5Var2 = this.heightState;
        int L02 = (b5Var2 == null || b5Var2.getValue().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : kotlin.math.b.L0(b5Var2.getValue().floatValue() * this.fraction);
        int r4 = L0 != Integer.MAX_VALUE ? L0 : androidx.compose.ui.unit.b.r(j4);
        int q4 = L02 != Integer.MAX_VALUE ? L02 : androidx.compose.ui.unit.b.q(j4);
        if (L0 == Integer.MAX_VALUE) {
            L0 = androidx.compose.ui.unit.b.p(j4);
        }
        if (L02 == Integer.MAX_VALUE) {
            L02 = androidx.compose.ui.unit.b.o(j4);
        }
        i1 m02 = l0Var.m0(androidx.compose.ui.unit.c.a(r4, L0, q4, L02));
        return o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(m02), 4, null);
    }

    /* renamed from: y7, reason: from getter */
    public final float getFraction() {
        return this.fraction;
    }

    @fg.m
    public final b5<Integer> z7() {
        return this.heightState;
    }

    public f0(float f4, @fg.m b5<Integer> b5Var, @fg.m b5<Integer> b5Var2) {
        this.fraction = f4;
        this.widthState = b5Var;
        this.heightState = b5Var2;
    }
}
