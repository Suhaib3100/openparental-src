package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/z0;", "Landroidx/compose/foundation/layout/y0;", "Landroidx/compose/foundation/layout/x0;", "width", "", "enforceIncoming", "<init>", "(Landroidx/compose/foundation/layout/x0;Z)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "y7", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)J", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "P", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "V", "p", "Landroidx/compose/foundation/layout/x0;", "A7", "()Landroidx/compose/foundation/layout/x0;", "C7", "(Landroidx/compose/foundation/layout/x0;)V", "q", "Z", "z7", "()Z", "B7", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class z0 extends y0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private x0 width;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    public z0(@fg.l x0 x0Var, boolean z4) {
        this.width = x0Var;
        this.enforceIncoming = z4;
    }

    @fg.l
    /* renamed from: A7, reason: from getter */
    public final x0 getWidth() {
        return this.width;
    }

    public void B7(boolean z4) {
        this.enforceIncoming = z4;
    }

    public final void C7(@fg.l x0 x0Var) {
        this.width = x0Var;
    }

    @Override // androidx.compose.foundation.layout.y0, androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return this.width == x0.Min ? pVar.k0(i4) : pVar.l0(i4);
    }

    @Override // androidx.compose.foundation.layout.y0, androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return this.width == x0.Min ? pVar.k0(i4) : pVar.l0(i4);
    }

    @Override // androidx.compose.foundation.layout.y0
    public long y7(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        int k02 = this.width == x0.Min ? l0Var.k0(androidx.compose.ui.unit.b.o(j4)) : l0Var.l0(androidx.compose.ui.unit.b.o(j4));
        if (k02 < 0) {
            k02 = 0;
        }
        return androidx.compose.ui.unit.b.INSTANCE.e(k02);
    }

    @Override // androidx.compose.foundation.layout.y0
    /* renamed from: z7, reason: from getter */
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }
}
