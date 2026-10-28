package androidx.compose.ui.layout;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005J\"\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H¦\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u001c8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0014\u0010+\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006,À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/u;", "", "Li0/f;", "relativeToWindow", "P", "(J)J", "relativeToLocal", "e0", "r0", "sourceCoordinates", "relativeToSource", "E", "(Landroidx/compose/ui/layout/u;J)J", "", "clipBounds", "Li0/i;", "j0", "(Landroidx/compose/ui/layout/u;Z)Li0/i;", "Landroidx/compose/ui/graphics/y4;", "matrix", "Lkotlin/k2;", "T", "(Landroidx/compose/ui/layout/u;[F)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "q", "(Landroidx/compose/ui/layout/a;)I", "Landroidx/compose/ui/unit/u;", "c", "()J", "size", "", "p0", "()Ljava/util/Set;", "providedAlignmentLines", "n0", "()Landroidx/compose/ui/layout/u;", "parentLayoutCoordinates", "G", "parentCoordinates", "f", "()Z", "isAttached", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface u {

    /* compiled from: LayoutCoordinates.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static void b(@fg.l u uVar, @fg.l u uVar2, @fg.l float[] fArr) {
            u.super.T(uVar2, fArr);
        }
    }

    static /* synthetic */ i0.i A(u uVar, u uVar2, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return uVar.j0(uVar2, z4);
    }

    long E(@fg.l u sourceCoordinates, long relativeToSource);

    @fg.m
    u G();

    long P(long relativeToWindow);

    default void T(@fg.l u sourceCoordinates, @fg.l float[] matrix) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    long c();

    long e0(long relativeToLocal);

    boolean f();

    @fg.l
    i0.i j0(@fg.l u sourceCoordinates, boolean clipBounds);

    @fg.m
    u n0();

    @fg.l
    Set<androidx.compose.ui.layout.a> p0();

    int q(@fg.l androidx.compose.ui.layout.a alignmentLine);

    long r0(long relativeToLocal);
}
