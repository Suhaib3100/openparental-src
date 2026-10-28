package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: PointerIcon.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/input/pointer/w;", "icon", "", "overrideDescendants", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/input/pointer/w;Z)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {
    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l w wVar, boolean z4) {
        return qVar.w3(new PointerHoverIconModifierElement(wVar, z4));
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, w wVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return a(qVar, wVar, z4);
    }
}
