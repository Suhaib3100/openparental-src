package androidx.compose.foundation;

import android.annotation.SuppressLint;
import kotlin.Metadata;

/* compiled from: SystemGestureExclusion.android.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\f*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/y0;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Li0/i;", "exclusion", "<init>", "(Lld/l;)V", "n", "()Landroidx/compose/foundation/y0;", "node", "Lkotlin/k2;", "r", "(Landroidx/compose/foundation/y0;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Lld/l;", "o", "()Lld/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(29)
/* loaded from: classes.dex */
final class ExcludeFromSystemGestureElement extends androidx.compose.ui.node.y0<y0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<androidx.compose.ui.layout.u, i0.i> exclusion;

    /* JADX WARN: Multi-variable type inference failed */
    public ExcludeFromSystemGestureElement(@fg.m ld.l<? super androidx.compose.ui.layout.u, i0.i> lVar) {
        this.exclusion = lVar;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (other instanceof ExcludeFromSystemGestureElement) {
            return kotlin.jvm.internal.l0.g(this.exclusion, ((ExcludeFromSystemGestureElement) other).exclusion);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        ld.l<androidx.compose.ui.layout.u, i0.i> lVar = this.exclusion;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        a2Var.d("systemGestureExclusion");
        if (this.exclusion != null) {
            a2Var.getProperties().c("exclusion", this.exclusion);
        }
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    @SuppressLint({"NewApi"})
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public y0 i() {
        return new y0(this.exclusion);
    }

    @fg.m
    public final ld.l<androidx.compose.ui.layout.u, i0.i> o() {
        return this.exclusion;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l y0 node) {
        node.D7(this.exclusion);
    }
}
