package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: InteractiveComponentSize.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/MinimumInteractiveModifier;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/material3/w6;", "<init>", "()V", "n", "()Landroidx/compose/material3/w6;", "node", "Lkotlin/k2;", "o", "(Landroidx/compose/material3/w6;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MinimumInteractiveModifier extends androidx.compose.ui.node.y0<w6> {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final MinimumInteractiveModifier f9407d = new MinimumInteractiveModifier();

    /* renamed from: e, reason: collision with root package name */
    public static final int f9408e = 0;

    private MinimumInteractiveModifier() {
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        return other == this;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // androidx.compose.ui.node.y0
    public w6 i() {
        return new w6();
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        a2Var.d("minimumInteractiveComponentSize");
        a2Var.getProperties().c("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
    }

    @Override // androidx.compose.ui.node.y0
    public void m(w6 w6Var) {
    }

    @fg.l
    public w6 n() {
        return new w6();
    }

    public void o(@fg.l w6 node) {
    }
}
