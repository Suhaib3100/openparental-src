package androidx.compose.foundation;

import kotlin.Metadata;

/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "", "enabled", "a", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/interaction/k;Z)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k1 {
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.foundation.interaction.k kVar, boolean z4) {
        return qVar.w3(z4 ? new HoverableElement(kVar) : androidx.compose.ui.q.INSTANCE);
    }

    public static /* synthetic */ androidx.compose.ui.q b(androidx.compose.ui.q qVar, androidx.compose.foundation.interaction.k kVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return a(qVar, kVar, z4);
    }
}
