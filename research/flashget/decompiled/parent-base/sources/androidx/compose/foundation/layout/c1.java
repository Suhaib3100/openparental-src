package androidx.compose.foundation.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/c1;", "Landroidx/compose/ui/node/s1;", "Landroidx/compose/ui/q$d;", "", "weight", "", "fill", "<init>", "(FZ)V", "Landroidx/compose/ui/unit/d;", "", "parentData", "Landroidx/compose/foundation/layout/v1;", "A7", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Landroidx/compose/foundation/layout/v1;", "p", "F", "z7", "()F", "C7", "(F)V", "q", "Z", "y7", "()Z", "B7", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c1 extends q.d implements androidx.compose.ui.node.s1 {

    /* renamed from: r, reason: collision with root package name */
    public static final int f4876r = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float weight;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean fill;

    public c1(float f4, boolean z4) {
        this.weight = f4;
        this.fill = z4;
    }

    @Override // androidx.compose.ui.node.s1
    @fg.l
    /* renamed from: A7, reason: merged with bridge method [inline-methods] */
    public v1 T(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj) {
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        if (v1Var == null) {
            v1Var = new v1(0.0f, false, null, 7, null);
        }
        v1Var.k(this.weight);
        v1Var.j(this.fill);
        return v1Var;
    }

    public final void B7(boolean z4) {
        this.fill = z4;
    }

    public final void C7(float f4) {
        this.weight = f4;
    }

    /* renamed from: y7, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    /* renamed from: z7, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }
}
