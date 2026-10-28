package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.graphics.k5;
import kotlin.Metadata;

/* compiled from: AndroidPath.android.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u001bJ?\u0010#\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$J?\u0010'\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010$J/\u0010+\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010.J'\u00103\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u00104J\u0017\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u00012\u0006\u0010<\u001a\u00020;H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010=J\u000f\u0010>\u001a\u00020\u000eH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u000eH\u0016¢\u0006\u0004\b@\u0010?J\u000f\u0010A\u001a\u00020\u000eH\u0016¢\u0006\u0004\bA\u0010?J\u001a\u0010B\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020DH\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0006H\u0016¢\u0006\u0004\bH\u0010IJ*\u0010N\u001a\u00020\b2\u0006\u0010J\u001a\u00020\u00012\u0006\u0010K\u001a\u00020\u00012\u0006\u0010M\u001a\u00020LH\u0016ø\u0001\u0000¢\u0006\u0004\bN\u0010OR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0018\u0010V\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010UR\u0018\u0010Y\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010[R\u001a\u0010_\u001a\u00020\b8VX\u0096\u0004¢\u0006\f\u0012\u0004\b^\u0010?\u001a\u0004\bP\u0010]R*\u0010f\u001a\u00020`2\u0006\u0010a\u001a\u00020`8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010g\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010]\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006h"}, d2 = {"Landroidx/compose/ui/graphics/v0;", "Landroidx/compose/ui/graphics/g5;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "Li0/i;", "rect", "", "A", "(Li0/i;)Z", "", "x", "y", "Lkotlin/k2;", "s", "(FF)V", "dx", "dy", "c", "z", "w", "x1", "y1", "x2", "y2", "e", "(FFFF)V", "dx1", "dy1", "dx2", "dy2", "f", "x3", "y3", "t", "(FFFFFF)V", "dx3", "dy3", "d", "startAngleDegrees", "sweepAngleDegrees", "forceMoveTo", "h", "(Li0/i;FFZ)V", "k", "(Li0/i;)V", "oval", "m", "startAngleRadians", "sweepAngleRadians", "j", "(Li0/i;FF)V", "i", "Li0/l;", "roundRect", "r", "(Li0/l;)V", "path", "Li0/f;", "offset", "(Landroidx/compose/ui/graphics/g5;J)V", "close", "()V", "reset", "rewind", "n", "(J)V", "Landroidx/compose/ui/graphics/y4;", "matrix", "a", "([F)V", "getBounds", "()Li0/i;", "path1", "path2", "Landroidx/compose/ui/graphics/k5;", "operation", "u", "(Landroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/g5;I)Z", "b", "Landroid/graphics/Path;", "B", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", "[F", "radii", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mMatrix", "()Z", "C", "isConvex", "Landroidx/compose/ui/graphics/i5;", "value", "p", "()I", "g", "(I)V", "fillType", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,258:1\n1#2:259\n35#3,5:260\n35#3,5:265\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n181#1:260,5\n234#1:265,5\n*E\n"})
/* loaded from: classes.dex */
public final class v0 implements g5 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Path internalPath;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private RectF rectF;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private float[] radii;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Matrix mMatrix;

    /* JADX WARN: Multi-variable type inference failed */
    public v0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean A(i0.i rect) {
        if (Float.isNaN(rect.t())) {
            throw new IllegalStateException("Rect.left is NaN");
        }
        if (Float.isNaN(rect.getTop())) {
            throw new IllegalStateException("Rect.top is NaN");
        }
        if (Float.isNaN(rect.x())) {
            throw new IllegalStateException("Rect.right is NaN");
        }
        if (Float.isNaN(rect.j())) {
            throw new IllegalStateException("Rect.bottom is NaN");
        }
        return true;
    }

    public static /* synthetic */ void C() {
    }

    @fg.l
    /* renamed from: B, reason: from getter */
    public final Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.g5
    public void a(@fg.l float[] matrix) {
        if (this.mMatrix == null) {
            this.mMatrix = new Matrix();
        }
        Matrix matrix2 = this.mMatrix;
        kotlin.jvm.internal.l0.m(matrix2);
        s0.a(matrix2, matrix);
        Path path = this.internalPath;
        Matrix matrix3 = this.mMatrix;
        kotlin.jvm.internal.l0.m(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.g5
    public boolean b() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.g5
    public void c(float dx, float dy) {
        this.internalPath.rMoveTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.g5
    public void d(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
        this.internalPath.rCubicTo(dx1, dy1, dx2, dy2, dx3, dy3);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void e(float x12, float y12, float x22, float y22) {
        this.internalPath.quadTo(x12, y12, x22, y22);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void f(float dx1, float dy1, float dx2, float dy2) {
        this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void g(int i4) {
        Path path = this.internalPath;
        i5.INSTANCE.getClass();
        path.setFillType(i5.f(i4, i5.f17858d) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.g5
    @fg.l
    public i0.i getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.l0.m(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new i0.i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void h(@fg.l i0.i rect, float startAngleDegrees, float sweepAngleDegrees, boolean forceMoveTo) {
        float t4 = rect.t();
        float top2 = rect.getTop();
        float x4 = rect.x();
        float j4 = rect.j();
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.l0.m(rectF);
        rectF.set(t4, top2, x4, j4);
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.l0.m(rectF2);
        path.arcTo(rectF2, startAngleDegrees, sweepAngleDegrees, forceMoveTo);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void i(@fg.l i0.i oval, float startAngleDegrees, float sweepAngleDegrees) {
        if (!A(oval)) {
            throw new IllegalStateException("invalid rect");
        }
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.l0.m(rectF);
        rectF.set(oval.t(), oval.getTop(), oval.x(), oval.j());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.l0.m(rectF2);
        path.addArc(rectF2, startAngleDegrees, sweepAngleDegrees);
    }

    @Override // androidx.compose.ui.graphics.g5
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.g5
    public void j(@fg.l i0.i oval, float startAngleRadians, float sweepAngleRadians) {
        i(oval, startAngleRadians * 57.29578f, sweepAngleRadians * 57.29578f);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void k(@fg.l i0.i rect) {
        if (!A(rect)) {
            throw new IllegalStateException("invalid rect");
        }
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.l0.m(rectF);
        rectF.set(rect.t(), rect.getTop(), rect.x(), rect.j());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.l0.m(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void m(@fg.l i0.i oval) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.l0.m(rectF);
        rectF.set(oval.t(), oval.getTop(), oval.x(), oval.j());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.l0.m(rectF2);
        path.addOval(rectF2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void n(long offset) {
        Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new Matrix();
        } else {
            kotlin.jvm.internal.l0.m(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.mMatrix;
        kotlin.jvm.internal.l0.m(matrix2);
        matrix2.setTranslate(i0.f.p(offset), i0.f.r(offset));
        Path path = this.internalPath;
        Matrix matrix3 = this.mMatrix;
        kotlin.jvm.internal.l0.m(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.g5
    public int p() {
        if (this.internalPath.getFillType() == Path.FillType.EVEN_ODD) {
            i5.INSTANCE.getClass();
            return i5.f17858d;
        }
        i5.INSTANCE.getClass();
        return i5.f17857c;
    }

    @Override // androidx.compose.ui.graphics.g5
    public void r(@fg.l i0.l roundRect) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        kotlin.jvm.internal.l0.m(rectF);
        rectF.set(roundRect.q(), roundRect.s(), roundRect.r(), roundRect.m());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        kotlin.jvm.internal.l0.m(fArr);
        fArr[0] = i0.a.m(roundRect.t());
        fArr[1] = i0.a.o(roundRect.t());
        fArr[2] = i0.a.m(roundRect.u());
        fArr[3] = i0.a.o(roundRect.u());
        fArr[4] = i0.a.m(roundRect.o());
        fArr[5] = i0.a.o(roundRect.o());
        fArr[6] = i0.a.m(roundRect.n());
        fArr[7] = i0.a.o(roundRect.n());
        Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        kotlin.jvm.internal.l0.m(rectF2);
        float[] fArr2 = this.radii;
        kotlin.jvm.internal.l0.m(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.g5
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.g5
    public void s(float x4, float y4) {
        this.internalPath.moveTo(x4, y4);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void t(float x12, float y12, float x22, float y22, float x32, float y32) {
        this.internalPath.cubicTo(x12, y12, x22, y22, x32, y32);
    }

    @Override // androidx.compose.ui.graphics.g5
    public boolean u(@fg.l g5 path1, @fg.l g5 path2, int operation) {
        Path.Op op;
        k5.Companion companion = k5.INSTANCE;
        companion.getClass();
        if (k5.i(operation, k5.f17900c)) {
            op = Path.Op.DIFFERENCE;
        } else {
            companion.getClass();
            if (k5.i(operation, k5.f17901d)) {
                op = Path.Op.INTERSECT;
            } else {
                companion.getClass();
                if (k5.i(operation, k5.f17904g)) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    companion.getClass();
                    op = k5.i(operation, k5.f17902e) ? Path.Op.UNION : Path.Op.XOR;
                }
            }
        }
        Path path = this.internalPath;
        if (!(path1 instanceof v0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path3 = ((v0) path1).internalPath;
        if (path2 instanceof v0) {
            return path.op(path3, ((v0) path2).internalPath, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.g5
    public void w(float dx, float dy) {
        this.internalPath.rLineTo(dx, dy);
    }

    @Override // androidx.compose.ui.graphics.g5
    public void y(@fg.l g5 path, long offset) {
        Path path2 = this.internalPath;
        if (!(path instanceof v0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((v0) path).internalPath, i0.f.p(offset), i0.f.r(offset));
    }

    @Override // androidx.compose.ui.graphics.g5
    public void z(float x4, float y4) {
        this.internalPath.lineTo(x4, y4);
    }

    public v0(@fg.l Path path) {
        this.internalPath = path;
    }

    public /* synthetic */ v0(Path path, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? new Path() : path);
    }
}
