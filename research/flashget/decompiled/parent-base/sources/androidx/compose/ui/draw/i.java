package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DrawModifier.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0005*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/draw/i;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "onDraw", "<init>", "(Lld/l;)V", "Landroidx/compose/ui/graphics/drawscope/c;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "p", "Lld/l;", "y7", "()Lld/l;", "z7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i extends q.d implements androidx.compose.ui.node.q {

    /* renamed from: q, reason: collision with root package name */
    public static final int f17445q = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> onDraw;

    public i(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> lVar) {
        this.onDraw = lVar;
    }

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        this.onDraw.invoke(cVar);
        cVar.G6();
    }

    @fg.l
    public final ld.l<androidx.compose.ui.graphics.drawscope.f, k2> y7() {
        return this.onDraw;
    }

    public final void z7(@fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> lVar) {
        this.onDraw = lVar;
    }
}
