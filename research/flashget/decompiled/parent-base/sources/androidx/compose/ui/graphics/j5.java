package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: PathMeasure.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/j5;", "", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/g5;", "destination", "", "startWithMoveTo", "b", "(FFLandroidx/compose/ui/graphics/g5;Z)Z", "path", "forceClosed", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/graphics/g5;Z)V", "distance", "Li0/f;", "d", "(F)J", "a", "getLength", "()F", "length", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface j5 {

    /* compiled from: PathMeasure.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    static /* synthetic */ boolean e(j5 j5Var, float f4, float f5, g5 g5Var, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i4 & 8) != 0) {
            z4 = true;
        }
        return j5Var.b(f4, f5, g5Var, z4);
    }

    long a(float distance);

    boolean b(float startDistance, float stopDistance, @fg.l g5 destination, boolean startWithMoveTo);

    void c(@fg.m g5 path, boolean forceClosed);

    long d(float distance);

    float getLength();
}
