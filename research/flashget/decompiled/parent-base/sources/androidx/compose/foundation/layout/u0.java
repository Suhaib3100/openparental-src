package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/u0;", "Landroidx/compose/foundation/layout/y0;", "Landroidx/compose/foundation/layout/x0;", "height", "", "enforceIncoming", "<init>", "(Landroidx/compose/foundation/layout/x0;Z)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "y7", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)J", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "width", "G", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "p", "Landroidx/compose/foundation/layout/x0;", "A7", "()Landroidx/compose/foundation/layout/x0;", "C7", "(Landroidx/compose/foundation/layout/x0;)V", "q", "Z", "z7", "()Z", "B7", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class u0 extends y0 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private x0 height;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean enforceIncoming;

    public u0(@fg.l x0 x0Var, boolean z4) {
        this.height = x0Var;
        this.enforceIncoming = z4;
    }

    @fg.l
    /* renamed from: A7, reason: from getter */
    public final x0 getHeight() {
        return this.height;
    }

    public void B7(boolean z4) {
        this.enforceIncoming = z4;
    }

    public final void C7(@fg.l x0 x0Var) {
        this.height = x0Var;
    }

    @Override // androidx.compose.foundation.layout.y0, androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return this.height == x0.Min ? pVar.Z(i4) : pVar.t(i4);
    }

    @Override // androidx.compose.foundation.layout.y0, androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l androidx.compose.ui.layout.p pVar, int i4) {
        return this.height == x0.Min ? pVar.Z(i4) : pVar.t(i4);
    }

    @Override // androidx.compose.foundation.layout.y0
    public long y7(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        int Z = this.height == x0.Min ? l0Var.Z(androidx.compose.ui.unit.b.p(j4)) : l0Var.t(androidx.compose.ui.unit.b.p(j4));
        if (Z < 0) {
            Z = 0;
        }
        return androidx.compose.ui.unit.b.INSTANCE.d(Z);
    }

    @Override // androidx.compose.foundation.layout.y0
    /* renamed from: z7, reason: from getter */
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }
}
