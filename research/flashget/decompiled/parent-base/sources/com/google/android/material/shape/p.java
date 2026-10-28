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
/* loaded from: classes6.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final q[] f53938a = new q[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f53939b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f53940c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f53941d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f53942e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f53943f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final q f53944g = new q();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f53945h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f53946i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f53947j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f53948k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f53949l = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShapeAppearancePathProvider.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        static final p f53950a = new p();

        private a() {
        }
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    @c1({c1.a.LIBRARY_GROUP})
    public interface b {
        void a(q qVar, Matrix matrix, int i4);

        void b(q qVar, Matrix matrix, int i4);
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        public final o f53951a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        public final Path f53952b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        public final RectF f53953c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        public final b f53954d;

        /* renamed from: e, reason: collision with root package name */
        public final float f53955e;

        c(@o0 o oVar, float f4, RectF rectF, @q0 b bVar, Path path) {
            this.f53954d = bVar;
            this.f53951a = oVar;
            this.f53955e = f4;
            this.f53953c = rectF;
            this.f53952b = path;
        }
    }

    public p() {
        for (int i4 = 0; i4 < 4; i4++) {
            this.f53938a[i4] = new q();
            this.f53939b[i4] = new Matrix();
            this.f53940c[i4] = new Matrix();
        }
    }

    private float a(int i4) {
        return (i4 + 1) * 90;
    }

    private void b(@o0 c cVar, int i4) {
        this.f53945h[0] = this.f53938a[i4].l();
        this.f53945h[1] = this.f53938a[i4].m();
        this.f53939b[i4].mapPoints(this.f53945h);
        if (i4 == 0) {
            Path path = cVar.f53952b;
            float[] fArr = this.f53945h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f53952b;
            float[] fArr2 = this.f53945h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f53938a[i4].d(this.f53939b[i4], cVar.f53952b);
        b bVar = cVar.f53954d;
        if (bVar != null) {
            bVar.a(this.f53938a[i4], this.f53939b[i4], i4);
        }
    }

    private void c(@o0 c cVar, int i4) {
        int i5 = (i4 + 1) % 4;
        this.f53945h[0] = this.f53938a[i4].j();
        this.f53945h[1] = this.f53938a[i4].k();
        this.f53939b[i4].mapPoints(this.f53945h);
        this.f53946i[0] = this.f53938a[i5].l();
        this.f53946i[1] = this.f53938a[i5].m();
        this.f53939b[i5].mapPoints(this.f53946i);
        float f4 = this.f53945h[0];
        float[] fArr = this.f53946i;
        float max = Math.max(((float) Math.hypot(f4 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i6 = i(cVar.f53953c, i4);
        this.f53944g.p(0.0f, 0.0f);
        g j4 = j(i4, cVar.f53951a);
        j4.c(max, i6, cVar.f53955e, this.f53944g);
        this.f53947j.reset();
        this.f53944g.d(this.f53940c[i4], this.f53947j);
        if (this.f53949l && (j4.b() || l(this.f53947j, i4) || l(this.f53947j, i5))) {
            Path path = this.f53947j;
            path.op(path, this.f53943f, Path.Op.DIFFERENCE);
            this.f53945h[0] = this.f53944g.l();
            this.f53945h[1] = this.f53944g.m();
            this.f53940c[i4].mapPoints(this.f53945h);
            Path path2 = this.f53942e;
            float[] fArr2 = this.f53945h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f53944g.d(this.f53940c[i4], this.f53942e);
        } else {
            this.f53944g.d(this.f53940c[i4], cVar.f53952b);
        }
        b bVar = cVar.f53954d;
        if (bVar != null) {
            bVar.b(this.f53944g, this.f53940c[i4], i4);
        }
    }

    private void f(int i4, @o0 RectF rectF, @o0 PointF pointF) {
        if (i4 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i4 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i4 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private d g(int i4, @o0 o oVar) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? oVar.t() : oVar.r() : oVar.j() : oVar.l();
    }

    private e h(int i4, @o0 o oVar) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? oVar.s() : oVar.q() : oVar.i() : oVar.k();
    }

    private float i(@o0 RectF rectF, int i4) {
        float[] fArr = this.f53945h;
        q qVar = this.f53938a[i4];
        fArr[0] = qVar.f53960c;
        fArr[1] = qVar.f53961d;
        this.f53939b[i4].mapPoints(fArr);
        return (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - this.f53945h[0]) : Math.abs(rectF.centerY() - this.f53945h[1]);
    }

    private g j(int i4, @o0 o oVar) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? oVar.o() : oVar.p() : oVar.n() : oVar.h();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @l1
    @o0
    public static p k() {
        return a.f53950a;
    }

    @x0(19)
    private boolean l(Path path, int i4) {
        this.f53948k.reset();
        this.f53938a[i4].d(this.f53939b[i4], this.f53948k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f53948k.computeBounds(rectF, true);
        path.op(this.f53948k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(@o0 c cVar, int i4) {
        h(i4, cVar.f53951a).c(this.f53938a[i4], 90.0f, cVar.f53955e, cVar.f53953c, g(i4, cVar.f53951a));
        float a5 = a(i4);
        this.f53939b[i4].reset();
        f(i4, cVar.f53953c, this.f53941d);
        Matrix matrix = this.f53939b[i4];
        PointF pointF = this.f53941d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f53939b[i4].preRotate(a5);
    }

    private void o(int i4) {
        this.f53945h[0] = this.f53938a[i4].j();
        this.f53945h[1] = this.f53938a[i4].k();
        this.f53939b[i4].mapPoints(this.f53945h);
        float a5 = a(i4);
        this.f53940c[i4].reset();
        Matrix matrix = this.f53940c[i4];
        float[] fArr = this.f53945h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f53940c[i4].preRotate(a5);
    }

    public void d(o oVar, float f4, RectF rectF, @o0 Path path) {
        e(oVar, f4, rectF, null, path);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void e(o oVar, float f4, RectF rectF, b bVar, @o0 Path path) {
        path.rewind();
        this.f53942e.rewind();
        this.f53943f.rewind();
        this.f53943f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(oVar, f4, rectF, bVar, path);
        for (int i4 = 0; i4 < 4; i4++) {
            m(cVar, i4);
            o(i4);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            b(cVar, i5);
            c(cVar, i5);
        }
        path.close();
        this.f53942e.close();
        if (this.f53942e.isEmpty()) {
            return;
        }
        path.op(this.f53942e, Path.Op.UNION);
    }

    void n(boolean z4) {
        this.f53949l = z4;
    }
}
