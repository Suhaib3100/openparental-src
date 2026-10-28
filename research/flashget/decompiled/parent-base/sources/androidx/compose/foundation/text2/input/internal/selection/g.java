package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text2.input.internal.j0;
import androidx.compose.foundation.text2.input.internal.m0;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.node.l;
import androidx.compose.ui.node.q;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.semantics.z;
import kotlin.Metadata;

/* compiled from: TextFieldMagnifier.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u000f*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u000f*\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/g;", "Landroidx/compose/ui/node/l;", "Landroidx/compose/ui/layout/v0;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/node/y1;", "<init>", "()V", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "", "isFocused", "Lkotlin/k2;", "J7", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/foundation/text2/input/internal/j0;Z)V", "Landroidx/compose/ui/layout/u;", "coordinates", "W", "(Landroidx/compose/ui/layout/u;)V", "Landroidx/compose/ui/graphics/drawscope/c;", "E", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class g extends l implements v0, q, y1 {

    /* renamed from: s, reason: collision with root package name */
    public static final int f8757s = 0;

    @Override // androidx.compose.ui.node.q
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
    }

    public abstract void J7(@fg.l m0 textFieldState, @fg.l i textFieldSelectionState, @fg.l j0 textLayoutState, boolean isFocused);

    @Override // androidx.compose.ui.layout.v0
    public void W(@fg.l androidx.compose.ui.layout.u coordinates) {
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l z zVar) {
    }
}
