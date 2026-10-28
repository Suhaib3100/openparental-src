package androidx.compose.ui.layout;

import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: OnGloballyPositionedModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/x0;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/s;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/u;", "Lkotlin/k2;", "callback", "<init>", "(Lld/l;)V", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "p", "Lld/l;", "y7", "()Lld/l;", "z7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class x0 extends q.d implements androidx.compose.ui.node.s {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super u, k2> callback;

    public x0(@fg.l ld.l<? super u, k2> lVar) {
        this.callback = lVar;
    }

    @Override // androidx.compose.ui.node.s
    public void W(@fg.l u coordinates) {
        this.callback.invoke(coordinates);
    }

    @fg.l
    public final ld.l<u, k2> y7() {
        return this.callback;
    }

    public final void z7(@fg.l ld.l<? super u, k2> lVar) {
        this.callback = lVar;
    }
}
