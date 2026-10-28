package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.q;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: NestedScrollModifier.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/input/nestedscroll/a;", "connection", "Landroidx/compose/ui/input/nestedscroll/b;", "dispatcher", "a", "(Landroidx/compose/ui/q;Landroidx/compose/ui/input/nestedscroll/a;Landroidx/compose/ui/input/nestedscroll/b;)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    @l
    public static final q a(@l q qVar, @l a aVar, @m b bVar) {
        return qVar.w3(new NestedScrollElement(aVar, bVar));
    }

    public static /* synthetic */ q b(q qVar, a aVar, b bVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bVar = null;
        }
        return a(qVar, aVar, bVar);
    }
}
