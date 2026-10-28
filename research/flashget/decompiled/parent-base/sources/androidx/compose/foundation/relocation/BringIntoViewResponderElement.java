package androidx.compose.foundation.relocation;

import androidx.compose.foundation.z0;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: BringIntoViewResponder.kt */
@z0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\n*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/relocation/j;", "Landroidx/compose/foundation/relocation/h;", "responder", "<init>", "(Landroidx/compose/foundation/relocation/h;)V", "n", "()Landroidx/compose/foundation/relocation/j;", "node", "Lkotlin/k2;", "o", "(Landroidx/compose/foundation/relocation/j;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Landroidx/compose/foundation/relocation/h;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BringIntoViewResponderElement extends y0<j> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final h responder;

    public BringIntoViewResponderElement(@l h hVar) {
        this.responder = hVar;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@m Object other) {
        return this == other || ((other instanceof BringIntoViewResponderElement) && l0.g(this.responder, ((BringIntoViewResponderElement) other).responder));
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.responder.hashCode();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@l a2 a2Var) {
        a2Var.d("bringIntoViewResponder");
        a2Var.getProperties().c("responder", this.responder);
    }

    @Override // androidx.compose.ui.node.y0
    @l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public j i() {
        return new j(this.responder);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@l j node) {
        node.E7(this.responder);
    }
}
