package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.c1;
import androidx.annotation.l1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final q[] f14065a = new q[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f14066b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f14067c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f14068d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f14069e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f14070f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final q f14071g = new q();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f14072h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f14073i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f14074j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f14075k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f14076l = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShapeAppearancePathProvider.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        static final p f14077a = new p();

        private a() {
        }
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    @c1({c1.a.LIBRARY_GROUP})
    public interface b {
        void a(q qVar, Matrix matrix, int i5);

        void b(q qVar, Matrix matrix, int i5);
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        public final o f14078a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        public final Path f14079b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        public final RectF f14080c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        public final b f14081d;

        /* renamed from: e, reason: collision with root package name */
        public final float f14082e;

        c(@o0 o oVar, float f6, RectF rectF, @q0 b bVar, Path path) {
            this.f14081d = bVar;
            this.f14078a = oVar;
            this.f14082e = f6;
            this.f14080c = rectF;
            this.f14079b = path;
        }
    }

    public p() {
        for (int i5 = 0; i5 < 4; i5++) {
            this.f14065a[i5] = new q();
            this.f14066b[i5] = new Matrix();
            this.f14067c[i5] = new Matrix();
        }
    }

    private float a(int i5) {
        return (i5 + 1) * 90;
    }

    private void b(@o0 c cVar, int i5) {
        this.f14072h[0] = this.f14065a[i5].l();
        this.f14072h[1] = this.f14065a[i5].m();
        this.f14066b[i5].mapPoints(this.f14072h);
        if (i5 == 0) {
            Path path = cVar.f14079b;
            float[] fArr = this.f14072h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f14079b;
            float[] fArr2 = this.f14072h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f14065a[i5].d(this.f14066b[i5], cVar.f14079b);
        b bVar = cVar.f14081d;
        if (bVar != null) {
            bVar.a(this.f14065a[i5], this.f14066b[i5], i5);
        }
    }

    private void c(@o0 c cVar, int i5) {
        int i6 = (i5 + 1) % 4;
        this.f14072h[0] = this.f14065a[i5].j();
        this.f14072h[1] = this.f14065a[i5].k();
        this.f14066b[i5].mapPoints(this.f14072h);
        this.f14073i[0] = this.f14065a[i6].l();
        this.f14073i[1] = this.f14065a[i6].m();
        this.f14066b[i6].mapPoints(this.f14073i);
        float f6 = this.f14072h[0];
        float[] fArr = this.f14073i;
        float max = Math.max(((float) Math.hypot(f6 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i7 = i(cVar.f14080c, i5);
        this.f14071g.p(0.0f, 0.0f);
        g j5 = j(i5, cVar.f14078a);
        j5.b(max, i7, cVar.f14082e, this.f14071g);
        this.f14074j.reset();
        this.f14071g.d(this.f14067c[i5], this.f14074j);
        if (this.f14076l && (j5.a() || l(this.f14074j, i5) || l(this.f14074j, i6))) {
            Path path = this.f14074j;
            path.op(path, this.f14070f, Path.Op.DIFFERENCE);
            this.f14072h[0] = this.f14071g.l();
            this.f14072h[1] = this.f14071g.m();
            this.f14067c[i5].mapPoints(this.f14072h);
            Path path2 = this.f14069e;
            float[] fArr2 = this.f14072h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f14071g.d(this.f14067c[i5], this.f14069e);
        } else {
            this.f14071g.d(this.f14067c[i5], cVar.f14079b);
        }
        b bVar = cVar.f14081d;
        if (bVar != null) {
            bVar.b(this.f14071g, this.f14067c[i5], i5);
        }
    }

    private void f(int i5, @o0 RectF rectF, @o0 PointF pointF) {
        if (i5 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i5 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i5 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private d g(int i5, @o0 o oVar) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? oVar.t() : oVar.r() : oVar.j() : oVar.l();
    }

    private e h(int i5, @o0 o oVar) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? oVar.s() : oVar.q() : oVar.i() : oVar.k();
    }

    private float i(@o0 RectF rectF, int i5) {
        float[] fArr = this.f14072h;
        q qVar = this.f14065a[i5];
        fArr[0] = qVar.f14087c;
        fArr[1] = qVar.f14088d;
        this.f14066b[i5].mapPoints(fArr);
        return (i5 == 1 || i5 == 3) ? Math.abs(rectF.centerX() - this.f14072h[0]) : Math.abs(rectF.centerY() - this.f14072h[1]);
    }

    private g j(int i5, @o0 o oVar) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? oVar.o() : oVar.p() : oVar.n() : oVar.h();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @l1
    @o0
    public static p k() {
        return a.f14077a;
    }

    @x0(19)
    private boolean l(Path path, int i5) {
        this.f14075k.reset();
        this.f14065a[i5].d(this.f14066b[i5], this.f14075k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f14075k.computeBounds(rectF, true);
        path.op(this.f14075k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(@o0 c cVar, int i5) {
        h(i5, cVar.f14078a).c(this.f14065a[i5], 90.0f, cVar.f14082e, cVar.f14080c, g(i5, cVar.f14078a));
        this.f14066b[i5].reset();
        f(i5, cVar.f14080c, this.f14068d);
        Matrix matrix = this.f14066b[i5];
        PointF pointF = this.f14068d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f14066b[i5].preRotate((i5 + 1) * 90);
    }

    private void o(int i5) {
        this.f14072h[0] = this.f14065a[i5].j();
        this.f14072h[1] = this.f14065a[i5].k();
        this.f14066b[i5].mapPoints(this.f14072h);
        this.f14067c[i5].reset();
        Matrix matrix = this.f14067c[i5];
        float[] fArr = this.f14072h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f14067c[i5].preRotate((i5 + 1) * 90);
    }

    public void d(o oVar, float f6, RectF rectF, @o0 Path path) {
        e(oVar, f6, rectF, null, path);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void e(o oVar, float f6, RectF rectF, b bVar, @o0 Path path) {
        path.rewind();
        this.f14069e.rewind();
        this.f14070f.rewind();
        this.f14070f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(oVar, f6, rectF, bVar, path);
        for (int i5 = 0; i5 < 4; i5++) {
            m(cVar, i5);
            o(i5);
        }
        for (int i6 = 0; i6 < 4; i6++) {
            b(cVar, i6);
            c(cVar, i6);
        }
        path.close();
        this.f14069e.close();
        if (this.f14069e.isEmpty()) {
            return;
        }
        path.op(this.f14069e, Path.Op.UNION);
    }

    void n(boolean z5) {
        this.f14076l = z5;
    }
}
