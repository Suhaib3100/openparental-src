package androidx.compose.foundation.relocation;

import androidx.compose.foundation.z0;
import androidx.compose.ui.layout.u;
import androidx.compose.ui.q;
import fg.l;
import kotlin.Metadata;

/* compiled from: BringIntoViewResponder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\t\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/relocation/h;", "responder", "b", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/relocation/h;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/layout/u;", "sourceCoordinates", "Li0/i;", "rect", "d", "(Landroidx/compose/ui/layout/u;Landroidx/compose/ui/layout/u;Li0/i;)Li0/i;", "other", "", "c", "(Li0/i;Li0/i;)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {
    @l
    @z0
    public static final q b(@l q qVar, @l h hVar) {
        return qVar.w3(new BringIntoViewResponderElement(hVar));
    }

    private static final boolean c(i0.i iVar, i0.i iVar2) {
        return iVar.t() <= iVar2.t() && iVar.getTop() <= iVar2.getTop() && iVar.x() >= iVar2.x() && iVar.j() >= iVar2.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0.i d(u uVar, u uVar2, i0.i iVar) {
        return iVar.T(uVar.j0(uVar2, false).E());
    }
}
