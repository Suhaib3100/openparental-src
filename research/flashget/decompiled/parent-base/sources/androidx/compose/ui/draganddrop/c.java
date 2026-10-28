package androidx.compose.ui.draganddrop;

import androidx.compose.ui.q;
import fg.l;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DragAndDropManager.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/draganddrop/c;", "", "Landroidx/compose/ui/draganddrop/h;", "transferData", "Li0/n;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "drawDragDecoration", "", "L", "(Landroidx/compose/ui/draganddrop/h;JLld/l;)Z", "Landroidx/compose/ui/draganddrop/d;", "node", "N", "(Landroidx/compose/ui/draganddrop/d;)V", "M", "(Landroidx/compose/ui/draganddrop/d;)Z", "Landroidx/compose/ui/q;", "c", "()Landroidx/compose/ui/q;", "modifier", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c {
    boolean L(@l h transferData, long decorationSize, @l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> drawDragDecoration);

    boolean M(@l d node);

    void N(@l d node);

    @l
    q c();
}
