package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* compiled from: TextSelectionDelegate.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/n0;", "textLayoutResult", "", "offset", "", "isStart", "areHandlesCrossed", "Li0/f;", "b", "(Landroidx/compose/ui/text/n0;IZZ)J", "", "a", "(Landroidx/compose/ui/text/n0;IZZ)F", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z0 {
    public static final float a(@fg.l androidx.compose.ui.text.n0 n0Var, int i4, boolean z4, boolean z5) {
        return n0Var.j(i4, n0Var.c(((!z4 || z5) && (z4 || !z5)) ? Math.max(i4 + (-1), 0) : i4) == n0Var.y(i4));
    }

    public static final long b(@fg.l androidx.compose.ui.text.n0 n0Var, int i4, boolean z4, boolean z5) {
        int q4 = n0Var.q(i4);
        if (q4 < n0Var.n()) {
            return i0.g.a(a(n0Var, i4, z4, z5), n0Var.m(q4));
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74149e;
    }
}
