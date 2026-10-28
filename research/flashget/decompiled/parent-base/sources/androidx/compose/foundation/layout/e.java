package androidx.compose.foundation.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/e;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "Landroidx/compose/ui/unit/z;", "before", "after", "<init>", "(Landroidx/compose/ui/layout/a;JJLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "p", "Landroidx/compose/ui/layout/a;", "z7", "()Landroidx/compose/ui/layout/a;", "C7", "(Landroidx/compose/ui/layout/a;)V", "q", "J", "A7", "()J", "D7", "(J)V", "r", "y7", "B7", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e extends q.d implements androidx.compose.ui.node.c0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.layout.a alignmentLine;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long before;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long after;

    public /* synthetic */ e(androidx.compose.ui.layout.a aVar, long j4, long j5, kotlin.jvm.internal.w wVar) {
        this(aVar, j4, j5);
    }

    /* renamed from: A7, reason: from getter */
    public final long getBefore() {
        return this.before;
    }

    public final void B7(long j4) {
        this.after = j4;
    }

    public final void C7(@fg.l androidx.compose.ui.layout.a aVar) {
        this.alignmentLine = aVar;
    }

    public final void D7(long j4) {
        this.before = j4;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        float f4;
        float f5;
        androidx.compose.ui.layout.n0 c5;
        androidx.compose.ui.layout.a aVar = this.alignmentLine;
        if (androidx.compose.ui.unit.a0.s(this.before)) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        } else {
            f4 = o0Var.i(this.before);
        }
        float f6 = f4;
        if (androidx.compose.ui.unit.a0.s(this.after)) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f5 = androidx.compose.ui.unit.h.f21501f;
        } else {
            f5 = o0Var.i(this.after);
        }
        c5 = c.c(o0Var, aVar, f6, f5, l0Var, j4);
        return c5;
    }

    /* renamed from: y7, reason: from getter */
    public final long getAfter() {
        return this.after;
    }

    @fg.l
    /* renamed from: z7, reason: from getter */
    public final androidx.compose.ui.layout.a getAlignmentLine() {
        return this.alignmentLine;
    }

    private e(androidx.compose.ui.layout.a aVar, long j4, long j5) {
        this.alignmentLine = aVar;
        this.before = j4;
        this.after = j5;
    }
}
