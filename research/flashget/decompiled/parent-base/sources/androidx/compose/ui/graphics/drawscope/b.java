package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.graphics.v1;
import i0.o;
import kotlin.Metadata;

/* compiled from: CanvasDrawScope.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/d;", "Landroidx/compose/ui/graphics/drawscope/j;", "b", "(Landroidx/compose/ui/graphics/drawscope/d;)Landroidx/compose/ui/graphics/drawscope/j;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ:\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020!8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b%\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"androidx/compose/ui/graphics/drawscope/b$a", "Landroidx/compose/ui/graphics/drawscope/j;", "", "left", "top", "right", "bottom", "Lkotlin/k2;", "m", "(FFFF)V", "Landroidx/compose/ui/graphics/c2;", "clipOp", "b", "(FFFFI)V", "Landroidx/compose/ui/graphics/g5;", "path", "c", "(Landroidx/compose/ui/graphics/g5;I)V", "translate", "(FF)V", "degrees", "Li0/f;", "pivot", "j", "(FJ)V", "scaleX", "scaleY", "i", "(FFJ)V", "Landroidx/compose/ui/graphics/y4;", "matrix", "a", "([F)V", "Li0/n;", "e", "()J", "size", "c0", "center", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f17791a;

        a(d dVar) {
            this.f17791a = dVar;
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void a(@fg.l float[] matrix) {
            this.f17791a.i().E(matrix);
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void b(float left, float top2, float right, float bottom, int clipOp) {
            this.f17791a.i().b(left, top2, right, bottom, clipOp);
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void c(@fg.l g5 path, int clipOp) {
            this.f17791a.i().c(path, clipOp);
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public long c0() {
            return o.b(this.f17791a.e());
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public long e() {
            return this.f17791a.e();
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void i(float scaleX, float scaleY, long pivot) {
            v1 i4 = this.f17791a.i();
            i4.translate(i0.f.p(pivot), i0.f.r(pivot));
            i4.d(scaleX, scaleY);
            i4.translate(-i0.f.p(pivot), -i0.f.r(pivot));
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void j(float degrees, long pivot) {
            v1 i4 = this.f17791a.i();
            i4.translate(i0.f.p(pivot), i0.f.r(pivot));
            i4.y(degrees);
            i4.translate(-i0.f.p(pivot), -i0.f.r(pivot));
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void m(float left, float top2, float right, float bottom) {
            v1 i4 = this.f17791a.i();
            d dVar = this.f17791a;
            long a5 = o.a(i0.n.t(dVar.e()) - (right + left), i0.n.m(this.f17791a.e()) - (bottom + top2));
            if (i0.n.t(a5) < 0.0f || i0.n.m(a5) < 0.0f) {
                throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
            }
            dVar.j(a5);
            i4.translate(left, top2);
        }

        @Override // androidx.compose.ui.graphics.drawscope.j
        public void translate(float left, float top2) {
            this.f17791a.i().translate(left, top2);
        }
    }

    public static final j a(d dVar) {
        return new a(dVar);
    }

    private static final j b(d dVar) {
        return new a(dVar);
    }
}
