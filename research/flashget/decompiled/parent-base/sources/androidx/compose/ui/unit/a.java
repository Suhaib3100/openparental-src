package androidx.compose.ui.unit;

import android.content.Context;
import kotlin.Metadata;

/* compiled from: AndroidDensity.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/ui/unit/d;", "a", "(Landroid/content/Context;)Landroidx/compose/ui/unit/d;", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    @fg.l
    public static final d a(@fg.l Context context) {
        w0.a b5;
        float f4 = context.getResources().getConfiguration().fontScale;
        if (o.a()) {
            b5 = new x(f4);
        } else {
            b5 = w0.b.f92855a.b(f4);
            if (b5 == null) {
                b5 = new x(f4);
            }
        }
        return new g(context.getResources().getDisplayMetrics().density, f4, b5);
    }
}
