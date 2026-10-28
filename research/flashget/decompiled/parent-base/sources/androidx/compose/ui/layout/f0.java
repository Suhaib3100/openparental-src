package androidx.compose.ui.layout;

import androidx.compose.ui.layout.i1;
import kotlin.Metadata;

/* compiled from: Placeable.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/layout/f0;", "Landroidx/compose/ui/layout/i1$a;", "Landroidx/compose/ui/node/q0;", "within", "<init>", "(Landroidx/compose/ui/node/q0;)V", "b", "Landroidx/compose/ui/node/q0;", "", "e", "()I", "parentWidth", "Landroidx/compose/ui/unit/w;", "d", "()Landroidx/compose/ui/unit/w;", "parentLayoutDirection", "Landroidx/compose/ui/layout/u;", "c", "()Landroidx/compose/ui/layout/u;", "coordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f0 extends i1.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.node.q0 within;

    public f0(@fg.l androidx.compose.ui.node.q0 q0Var) {
        this.within = q0Var;
    }

    @Override // androidx.compose.ui.layout.i1.a
    @fg.m
    public u c() {
        u P0 = this.within.getIsPlacingForAlignment() ? null : this.within.P0();
        if (P0 == null) {
            this.within.getLayoutNode().getLayoutDelegate().P();
        }
        return P0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i1.a
    @fg.l
    /* renamed from: d */
    public androidx.compose.ui.unit.w getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.i1.a
    /* renamed from: e */
    public int getParentWidth() {
        return this.within.W();
    }
}
