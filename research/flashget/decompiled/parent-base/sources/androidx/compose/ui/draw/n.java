package androidx.compose.ui.draw;

import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/draw/n;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/c;", "Lkotlin/k2;", "Lkotlin/u;", "onDraw", "<init>", "(Lld/l;)V", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "p", "Lld/l;", "y7", "()Lld/l;", "z7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class n extends q.d implements androidx.compose.ui.node.q {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.graphics.drawscope.c, k2> onDraw;

    public n(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.c, k2> lVar) {
        this.onDraw = lVar;
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        this.onDraw.invoke(cVar);
    }

    @fg.l
    public final ld.l<androidx.compose.ui.graphics.drawscope.c, k2> y7() {
        return this.onDraw;
    }

    public final void z7(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.c, k2> lVar) {
        this.onDraw = lVar;
    }
}
