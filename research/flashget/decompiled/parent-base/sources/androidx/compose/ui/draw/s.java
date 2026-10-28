package androidx.compose.ui.draw;

import androidx.compose.runtime.x4;
import androidx.compose.ui.graphics.p4;
import kotlin.Metadata;

/* compiled from: Scale.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/q;", "", "scaleX", "scaleY", "b", "(Landroidx/compose/ui/q;FF)Landroidx/compose/ui/q;", "scale", "a", "(Landroidx/compose/ui/q;F)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {
    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, float f4) {
        return b(qVar, f4, f4);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return (f4 == 1.0f && f5 == 1.0f) ? qVar : p4.e(qVar, f4, f5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null);
    }
}
