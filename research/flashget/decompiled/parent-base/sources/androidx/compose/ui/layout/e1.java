package androidx.compose.ui.layout;

import androidx.compose.ui.layout.i1;
import kotlin.Metadata;

/* compiled from: Placeable.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/layout/e1;", "Landroidx/compose/ui/layout/i1$a;", "Landroidx/compose/ui/node/p1;", "owner", "<init>", "(Landroidx/compose/ui/node/p1;)V", "b", "Landroidx/compose/ui/node/p1;", "x", "()Landroidx/compose/ui/node/p1;", "", "e", "()I", "parentWidth", "Landroidx/compose/ui/unit/w;", "d", "()Landroidx/compose/ui/unit/w;", "parentLayoutDirection", "Landroidx/compose/ui/layout/u;", "c", "()Landroidx/compose/ui/layout/u;", "coordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e1 extends i1.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.p1 owner;

    public e1(@fg.l androidx.compose.ui.node.p1 p1Var) {
        this.owner = p1Var;
    }

    @Override // androidx.compose.ui.layout.i1.a
    @fg.l
    public u c() {
        return this.owner.getRoot().z0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i1.a
    @fg.l
    /* renamed from: d */
    public androidx.compose.ui.unit.w getParentLayoutDirection() {
        return this.owner.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i1.a
    /* renamed from: e */
    public int getParentWidth() {
        return this.owner.getRoot().getWidth();
    }

    @fg.l
    /* renamed from: x, reason: from getter */
    public final androidx.compose.ui.node.p1 getOwner() {
        return this.owner;
    }
}
