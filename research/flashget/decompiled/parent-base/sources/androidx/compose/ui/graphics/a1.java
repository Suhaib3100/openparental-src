package androidx.compose.ui.graphics;

import android.graphics.Path;
import kotlin.Metadata;

/* compiled from: AndroidPath.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/g5;", "a", "()Landroidx/compose/ui/graphics/g5;", "Landroid/graphics/Path;", "c", "(Landroid/graphics/Path;)Landroidx/compose/ui/graphics/g5;", "b", "(Landroidx/compose/ui/graphics/g5;)Landroid/graphics/Path;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a1 {
    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public static final g5 a() {
        return new v0(null, 1, 0 == true ? 1 : 0);
    }

    @fg.l
    public static final Path b(@fg.l g5 g5Var) {
        if (g5Var instanceof v0) {
            return ((v0) g5Var).getInternalPath();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @fg.l
    public static final g5 c(@fg.l Path path) {
        return new v0(path);
    }
}
