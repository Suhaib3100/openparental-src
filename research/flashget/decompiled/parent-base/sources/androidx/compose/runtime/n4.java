package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: SnapshotStateExtensions.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\t0\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\r0\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/b5;", "", "Landroidx/compose/runtime/o1;", "c", "(Landroidx/compose/runtime/b5;)Landroidx/compose/runtime/o1;", "", "Landroidx/compose/runtime/z1;", "d", "(Landroidx/compose/runtime/b5;)Landroidx/compose/runtime/z1;", "", "Landroidx/compose/runtime/f1;", "b", "(Landroidx/compose/runtime/b5;)Landroidx/compose/runtime/f1;", "", "Landroidx/compose/runtime/y0;", "a", "(Landroidx/compose/runtime/b5;)Landroidx/compose/runtime/y0;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n4 {
    @x4
    @fg.l
    public static final y0 a(@fg.l b5<Double> b5Var) {
        return b5Var instanceof y0 ? (y0) b5Var : new i5(b5Var);
    }

    @x4
    @fg.l
    public static final f1 b(@fg.l b5<Float> b5Var) {
        return b5Var instanceof f1 ? (f1) b5Var : new j5(b5Var);
    }

    @x4
    @fg.l
    public static final o1 c(@fg.l b5<Integer> b5Var) {
        return b5Var instanceof o1 ? (o1) b5Var : new k5(b5Var);
    }

    @x4
    @fg.l
    public static final z1 d(@fg.l b5<Long> b5Var) {
        return b5Var instanceof z1 ? (z1) b5Var : new l5(b5Var);
    }
}
