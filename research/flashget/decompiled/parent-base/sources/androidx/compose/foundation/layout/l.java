package androidx.compose.foundation.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: Box.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u0000*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/l;", "Landroidx/compose/ui/node/s1;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/c;", "alignment", "", "matchParentSize", "<init>", "(Landroidx/compose/ui/c;Z)V", "Landroidx/compose/ui/unit/d;", "", "parentData", "A7", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Landroidx/compose/foundation/layout/l;", "p", "Landroidx/compose/ui/c;", "y7", "()Landroidx/compose/ui/c;", "B7", "(Landroidx/compose/ui/c;)V", "q", "Z", "z7", "()Z", "C7", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class l extends q.d implements androidx.compose.ui.node.s1 {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.c alignment;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean matchParentSize;

    public l(@fg.l androidx.compose.ui.c cVar, boolean z4) {
        this.alignment = cVar;
        this.matchParentSize = z4;
    }

    @fg.l
    public l A7(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj) {
        return this;
    }

    public final void B7(@fg.l androidx.compose.ui.c cVar) {
        this.alignment = cVar;
    }

    public final void C7(boolean z4) {
        this.matchParentSize = z4;
    }

    @Override // androidx.compose.ui.node.s1
    public Object T(androidx.compose.ui.unit.d dVar, Object obj) {
        return this;
    }

    @fg.l
    /* renamed from: y7, reason: from getter */
    public final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    /* renamed from: z7, reason: from getter */
    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }
}
