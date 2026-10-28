package androidx.compose.ui.draw;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u000b\u0010\u0007\u001a&\u0010\r\u001a\u00020\f2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "onDraw", "b", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/draw/m;", "onBuildDrawCache", "c", "Landroidx/compose/ui/draw/e;", "a", "(Lld/l;)Landroidx/compose/ui/draw/e;", "Landroidx/compose/ui/graphics/drawscope/c;", "d", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {
    @fg.l
    public static final e a(@fg.l ld.l<? super g, m> lVar) {
        return new f(new g(), lVar);
    }

    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> lVar) {
        return qVar.w3(new DrawBehindElement(lVar));
    }

    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super g, m> lVar) {
        return qVar.w3(new DrawWithCacheElement(lVar));
    }

    @fg.l
    public static final androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.c, k2> lVar) {
        return qVar.w3(new DrawWithContentElement(lVar));
    }
}
