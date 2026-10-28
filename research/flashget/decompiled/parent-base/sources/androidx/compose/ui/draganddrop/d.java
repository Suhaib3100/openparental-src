package androidx.compose.ui.draganddrop;

import androidx.compose.ui.node.j;
import fg.l;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DragAndDropNode.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J;\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/draganddrop/d;", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/draganddrop/g;", "Landroidx/compose/ui/draganddrop/h;", "transferData", "Li0/n;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "drawDragDecoration", "L", "(Landroidx/compose/ui/draganddrop/h;JLld/l;)V", "Landroidx/compose/ui/draganddrop/b;", "startEvent", "", "W2", "(Landroidx/compose/ui/draganddrop/b;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d extends j, g {
    void L(@l h transferData, long decorationSize, @l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> drawDragDecoration);

    boolean W2(@l b startEvent);
}
