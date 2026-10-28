package androidx.compose.ui.layout;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: LayoutId.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/q;", "", "layoutId", "b", "(Landroidx/compose/ui/q;Ljava/lang/Object;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/layout/l0;", "a", "(Landroidx/compose/ui/layout/l0;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w {
    @fg.m
    public static final Object a(@fg.l l0 l0Var) {
        Object a5 = l0Var.a();
        y yVar = a5 instanceof y ? (y) a5 : null;
        if (yVar != null) {
            return yVar.getLayoutId();
        }
        return null;
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l Object obj) {
        return qVar.w3(new LayoutIdElement(obj));
    }
}
