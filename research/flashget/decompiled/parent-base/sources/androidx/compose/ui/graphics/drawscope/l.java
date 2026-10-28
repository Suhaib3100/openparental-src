package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.d5;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.graphics.s6;
import androidx.compose.ui.graphics.v1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EmptyCanvas.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010#\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\"\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J*\u0010,\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J7\u0010.\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/JG\u00102\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b2\u00103J7\u00104\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010/J*\u00107\u001a\u00020\u00042\u0006\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108JO\u0010=\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\r2\u0006\u0010<\u001a\u00020;2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010@J*\u0010D\u001a\u00020\u00042\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020)2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJB\u0010L\u001a\u00020\u00042\u0006\u0010B\u001a\u00020A2\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020F2\u0006\u0010K\u001a\u00020H2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ0\u0010R\u001a\u00020\u00042\u0006\u0010O\u001a\u00020N2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020)0P2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ*\u0010U\u001a\u00020\u00042\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020T2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ*\u0010[\u001a\u00020\u00042\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0004H\u0016¢\u0006\u0004\b]\u0010\u0003J\u000f\u0010^\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006_"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/l;", "Landroidx/compose/ui/graphics/v1;", "<init>", "()V", "Lkotlin/k2;", "C", "o", "Li0/i;", "bounds", "Landroidx/compose/ui/graphics/d5;", "paint", "z", "(Li0/i;Landroidx/compose/ui/graphics/d5;)V", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "d", "degrees", "y", "(F)V", "B", "Landroidx/compose/ui/graphics/y4;", "matrix", "E", "([F)V", "left", "top", "right", "bottom", "Landroidx/compose/ui/graphics/c2;", "clipOp", "b", "(FFFFI)V", "Landroidx/compose/ui/graphics/g5;", "path", "c", "(Landroidx/compose/ui/graphics/g5;I)V", "Li0/f;", "p1", "p2", "w", "(JJLandroidx/compose/ui/graphics/d5;)V", "e", "(FFFFLandroidx/compose/ui/graphics/d5;)V", "radiusX", "radiusY", "O", "(FFFFFFLandroidx/compose/ui/graphics/d5;)V", "f", "center", "radius", "K", "(JFLandroidx/compose/ui/graphics/d5;)V", "startAngle", "sweepAngle", "", "useCenter", "r", "(FFFFFFZLandroidx/compose/ui/graphics/d5;)V", "J", "(Landroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/graphics/s4;", "image", "topLeftOffset", "i", "(Landroidx/compose/ui/graphics/s4;JLandroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/unit/q;", "srcOffset", "Landroidx/compose/ui/unit/u;", "srcSize", "dstOffset", "dstSize", "h", "(Landroidx/compose/ui/graphics/s4;JJJJLandroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/graphics/n5;", "pointMode", "", "points", "g", "(ILjava/util/List;Landroidx/compose/ui/graphics/d5;)V", "", "j", "(I[FLandroidx/compose/ui/graphics/d5;)V", "Landroidx/compose/ui/graphics/s6;", "vertices", "Landroidx/compose/ui/graphics/k1;", "blendMode", "k", "(Landroidx/compose/ui/graphics/s6;ILandroidx/compose/ui/graphics/d5;)V", "t", "D", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements v1 {
    @Override // androidx.compose.ui.graphics.v1
    public void B(float sx, float sy) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void C() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void D() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void E(@fg.l float[] matrix) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void J(@fg.l g5 path, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void K(long center, float radius, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void O(float left, float top2, float right, float bottom, float radiusX, float radiusY, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void b(float left, float top2, float right, float bottom, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void c(@fg.l g5 path, int clipOp) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void d(float sx, float sy) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void e(float left, float top2, float right, float bottom, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void f(float left, float top2, float right, float bottom, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void g(int pointMode, @fg.l List<i0.f> points, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void h(@fg.l s4 image, long srcOffset, long srcSize, long dstOffset, long dstSize, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void i(@fg.l s4 image, long topLeftOffset, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void j(int pointMode, @fg.l float[] points, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void k(@fg.l s6 vertices, int blendMode, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void o() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void r(float left, float top2, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void t() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void translate(float dx, float dy) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void w(long p12, long p22, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void y(float degrees) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.compose.ui.graphics.v1
    public void z(@fg.l i0.i bounds, @fg.l d5 paint) {
        throw new UnsupportedOperationException();
    }
}
