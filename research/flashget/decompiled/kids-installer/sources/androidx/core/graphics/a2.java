package androidx.core.graphics;

import android.graphics.Path;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: Path.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f¨\u0006\f"}, d2 = {"Landroid/graphics/Path;", "", "error", "", "Landroidx/core/graphics/c2;", "b", "p", "f", "d", "e", "a", "g", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class a2 {
    @androidx.annotation.x0(19)
    @d5.d
    public static final Path a(@d5.d Path path, @d5.d Path p5) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        Path path2 = new Path();
        path2.op(path, p5, Path.Op.INTERSECT);
        return path2;
    }

    @androidx.annotation.x0(26)
    @d5.d
    public static final Iterable<c2> b(@d5.d Path path, float f6) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        Collection<c2> b6 = e2.b(path, f6);
        kotlin.jvm.internal.l0.o(b6, "flatten(this, error)");
        return b6;
    }

    public static /* synthetic */ Iterable c(Path path, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f6 = 0.5f;
        }
        return b(path, f6);
    }

    @androidx.annotation.x0(19)
    @d5.d
    public static final Path d(@d5.d Path path, @d5.d Path p5) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        Path path2 = new Path(path);
        path2.op(p5, Path.Op.DIFFERENCE);
        return path2;
    }

    @androidx.annotation.x0(19)
    @d5.d
    public static final Path e(@d5.d Path path, @d5.d Path p5) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        Path path2 = new Path(path);
        path2.op(p5, Path.Op.UNION);
        return path2;
    }

    @androidx.annotation.x0(19)
    @d5.d
    public static final Path f(@d5.d Path path, @d5.d Path p5) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        Path path2 = new Path(path);
        path2.op(p5, Path.Op.UNION);
        return path2;
    }

    @androidx.annotation.x0(19)
    @d5.d
    public static final Path g(@d5.d Path path, @d5.d Path p5) {
        kotlin.jvm.internal.l0.p(path, "<this>");
        kotlin.jvm.internal.l0.p(p5, "p");
        Path path2 = new Path(path);
        path2.op(p5, Path.Op.XOR);
        return path2;
    }
}
