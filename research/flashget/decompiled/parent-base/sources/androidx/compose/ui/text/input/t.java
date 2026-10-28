package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/t0;", "target", "deleted", "a", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {
    public static final long a(long j4, long j5) {
        int j6;
        int l4 = androidx.compose.ui.text.t0.l(j4);
        int k4 = androidx.compose.ui.text.t0.k(j4);
        if (androidx.compose.ui.text.t0.p(j5, j4)) {
            if (androidx.compose.ui.text.t0.d(j5, j4)) {
                l4 = androidx.compose.ui.text.t0.l(j5);
                k4 = l4;
            } else {
                if (androidx.compose.ui.text.t0.d(j4, j5)) {
                    j6 = androidx.compose.ui.text.t0.j(j5);
                } else if (androidx.compose.ui.text.t0.e(j5, l4)) {
                    l4 = androidx.compose.ui.text.t0.l(j5);
                    j6 = androidx.compose.ui.text.t0.j(j5);
                } else {
                    k4 = androidx.compose.ui.text.t0.l(j5);
                }
                k4 -= j6;
            }
        } else if (k4 > androidx.compose.ui.text.t0.l(j5)) {
            l4 -= androidx.compose.ui.text.t0.j(j5);
            j6 = androidx.compose.ui.text.t0.j(j5);
            k4 -= j6;
        }
        return androidx.compose.ui.text.u0.b(l4, k4);
    }
}
