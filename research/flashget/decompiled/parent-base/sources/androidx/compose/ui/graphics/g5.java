package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: Path.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 A2\u00020\u0001:\u0001AJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0007J/\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0012J?\u0010\u001a\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H&¢\u0006\u0004\b\u001e\u0010\u001bJ/\u0010%\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J/\u0010)\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b)\u0010&J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u001fH&¢\u0006\u0004\b-\u0010+J'\u0010.\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H&¢\u0006\u0004\b0\u0010/J\u0017\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u000201H&¢\u0006\u0004\b3\u00104J$\u0010\u0004\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00002\b\b\u0002\u00107\u001a\u000206H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u00108J\u000f\u00109\u001a\u00020\u0005H&¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0005H&¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020\u0005H\u0016¢\u0006\u0004\b<\u0010:J\u001a\u0010=\u001a\u00020\u00052\u0006\u00107\u001a\u000206H&ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001a\u0010A\u001a\u00020\u00052\u0006\u0010@\u001a\u00020?H\u0016ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u001fH&¢\u0006\u0004\bC\u0010DJ*\u0010I\u001a\u00020#2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\u0006\u0010H\u001a\u00020GH&ø\u0001\u0000¢\u0006\u0004\bI\u0010JR\"\u0010P\u001a\u00020K8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010Rø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006UÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/g5;", "", "", "x", "y", "Lkotlin/k2;", "s", "(FF)V", "dx", "dy", "c", "z", "w", "x1", "y1", "x2", "y2", "e", "(FFFF)V", "dx1", "dy1", "dx2", "dy2", "f", "x3", "y3", "t", "(FFFFFF)V", "dx3", "dy3", "d", "Li0/i;", "rect", "startAngleRadians", "sweepAngleRadians", "", "forceMoveTo", "v", "(Li0/i;FFZ)V", "startAngleDegrees", "sweepAngleDegrees", "h", "k", "(Li0/i;)V", "oval", "m", "j", "(Li0/i;FF)V", "i", "Li0/l;", "roundRect", "r", "(Li0/l;)V", "path", "Li0/f;", "offset", "(Landroidx/compose/ui/graphics/g5;J)V", "close", "()V", "reset", "rewind", "n", "(J)V", "Landroidx/compose/ui/graphics/y4;", "matrix", "a", "([F)V", "getBounds", "()Li0/i;", "path1", "path2", "Landroidx/compose/ui/graphics/k5;", "operation", "u", "(Landroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/g5;I)Z", "Landroidx/compose/ui/graphics/i5;", "p", "()I", "g", "(I)V", "fillType", "b", "()Z", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f17839a;

    /* compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/g5$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/k5;", "operation", "Landroidx/compose/ui/graphics/g5;", "path1", "path2", "a", "(ILandroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/g5;)Landroidx/compose/ui/graphics/g5;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.g5$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f17839a = new Companion();

        private Companion() {
        }

        @fg.l
        public final g5 a(int operation, @fg.l g5 path1, @fg.l g5 path2) {
            g5 a5 = a1.a();
            if (a5.u(path1, path2, operation)) {
                return a5;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    /* compiled from: Path.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        @Deprecated
        public static void b(@fg.l g5 g5Var, @fg.l i0.i iVar, float f4, float f5, boolean z4) {
            g5.super.v(iVar, f4, f5, z4);
        }

        @Deprecated
        public static void c(@fg.l g5 g5Var) {
            g5.x(g5Var);
        }

        @Deprecated
        public static void d(@fg.l g5 g5Var, @fg.l float[] fArr) {
            g5.o(g5Var, fArr);
        }
    }

    static void o(g5 g5Var, float[] fArr) {
        g5Var.getClass();
    }

    static void q(g5 g5Var, g5 g5Var2, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i4 & 2) != 0) {
            i0.f.INSTANCE.getClass();
            j4 = i0.f.f74147c;
        }
        g5Var.y(g5Var2, j4);
    }

    static void x(g5 g5Var) {
        g5Var.reset();
    }

    default void a(@fg.l float[] matrix) {
    }

    boolean b();

    void c(float dx, float dy);

    void close();

    void d(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3);

    void e(float x12, float y12, float x22, float y22);

    void f(float dx1, float dy1, float dx2, float dy2);

    void g(int i4);

    @fg.l
    i0.i getBounds();

    void h(@fg.l i0.i rect, float startAngleDegrees, float sweepAngleDegrees, boolean forceMoveTo);

    void i(@fg.l i0.i oval, float startAngleDegrees, float sweepAngleDegrees);

    boolean isEmpty();

    void j(@fg.l i0.i oval, float startAngleRadians, float sweepAngleRadians);

    void k(@fg.l i0.i rect);

    void m(@fg.l i0.i oval);

    void n(long offset);

    int p();

    void r(@fg.l i0.l roundRect);

    void reset();

    default void rewind() {
        reset();
    }

    void s(float x4, float y4);

    void t(float x12, float y12, float x22, float y22, float x32, float y32);

    boolean u(@fg.l g5 path1, @fg.l g5 path2, int operation);

    default void v(@fg.l i0.i rect, float startAngleRadians, float sweepAngleRadians, boolean forceMoveTo) {
        h(rect, startAngleRadians * 57.29578f, sweepAngleRadians * 57.29578f, forceMoveTo);
    }

    void w(float dx, float dy);

    void y(@fg.l g5 path, long offset);

    void z(float x4, float y4);
}
