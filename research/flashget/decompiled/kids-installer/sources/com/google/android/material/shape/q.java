package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: j, reason: collision with root package name */
    private static final float f14083j = 270.0f;

    /* renamed from: k, reason: collision with root package name */
    protected static final float f14084k = 180.0f;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f14085a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f14086b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f14087c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f14088d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f14089e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f14090f;

    /* renamed from: g, reason: collision with root package name */
    private final List<g> f14091g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<i> f14092h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f14093i;

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    class a extends i {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f14094b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f14095c;

        a(List list, Matrix matrix) {
            this.f14094b = list;
            this.f14095c = matrix;
        }

        @Override // com.google.android.material.shape.q.i
        public void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i5, Canvas canvas) {
            Iterator it = this.f14094b.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(this.f14095c, bVar, i5, canvas);
            }
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    static class b extends i {

        /* renamed from: b, reason: collision with root package name */
        private final d f14097b;

        public b(d dVar) {
            this.f14097b = dVar;
        }

        @Override // com.google.android.material.shape.q.i
        public void a(Matrix matrix, @o0 com.google.android.material.shadow.b bVar, int i5, @o0 Canvas canvas) {
            float h5 = d.h(this.f14097b);
            float f6 = this.f14097b.f14107g;
            d dVar = this.f14097b;
            bVar.a(canvas, matrix, new RectF(dVar.f14102b, dVar.f14103c, dVar.f14104d, dVar.f14105e), i5, h5, f6);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    static class c extends i {

        /* renamed from: b, reason: collision with root package name */
        private final f f14098b;

        /* renamed from: c, reason: collision with root package name */
        private final float f14099c;

        /* renamed from: d, reason: collision with root package name */
        private final float f14100d;

        public c(f fVar, float f6, float f7) {
            this.f14098b = fVar;
            this.f14099c = f6;
            this.f14100d = f7;
        }

        @Override // com.google.android.material.shape.q.i
        public void a(Matrix matrix, @o0 com.google.android.material.shadow.b bVar, int i5, @o0 Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f14098b.f14115c - this.f14100d, this.f14098b.f14114b - this.f14099c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f14099c, this.f14100d);
            matrix2.preRotate(c());
            bVar.b(canvas, matrix2, rectF, i5);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f14098b.f14115c - this.f14100d) / (this.f14098b.f14114b - this.f14099c)));
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class d extends g {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f14101h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f14102b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f14103c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f14104d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f14105e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f14106f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f14107g;

        public d(float f6, float f7, float f8, float f9) {
            this.f14102b = f6;
            this.f14103c = f7;
            this.f14104d = f8;
            this.f14105e = f9;
        }

        static float b(d dVar) {
            return dVar.f14102b;
        }

        static float c(d dVar) {
            return dVar.f14103c;
        }

        static float d(d dVar) {
            return dVar.f14104d;
        }

        static float e(d dVar) {
            return dVar.f14105e;
        }

        static void f(d dVar, float f6) {
            dVar.f14106f = f6;
        }

        static void g(d dVar, float f6) {
            dVar.f14107g = f6;
        }

        static float h(d dVar) {
            return dVar.f14106f;
        }

        static float i(d dVar) {
            return dVar.f14107g;
        }

        private float j() {
            return this.f14105e;
        }

        private float k() {
            return this.f14102b;
        }

        private float l() {
            return this.f14104d;
        }

        private float m() {
            return this.f14106f;
        }

        private float n() {
            return this.f14107g;
        }

        private float o() {
            return this.f14103c;
        }

        private void p(float f6) {
            this.f14105e = f6;
        }

        private void q(float f6) {
            this.f14102b = f6;
        }

        private void r(float f6) {
            this.f14104d = f6;
        }

        private void s(float f6) {
            this.f14106f = f6;
        }

        private void t(float f6) {
            this.f14107g = f6;
        }

        private void u(float f6) {
            this.f14103c = f6;
        }

        @Override // com.google.android.material.shape.q.g
        public void a(@o0 Matrix matrix, @o0 Path path) {
            Matrix matrix2 = this.f14116a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f14101h;
            rectF.set(this.f14102b, this.f14103c, this.f14104d, this.f14105e);
            path.arcTo(rectF, this.f14106f, this.f14107g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class e extends g {

        /* renamed from: b, reason: collision with root package name */
        private float f14108b;

        /* renamed from: c, reason: collision with root package name */
        private float f14109c;

        /* renamed from: d, reason: collision with root package name */
        private float f14110d;

        /* renamed from: e, reason: collision with root package name */
        private float f14111e;

        /* renamed from: f, reason: collision with root package name */
        private float f14112f;

        /* renamed from: g, reason: collision with root package name */
        private float f14113g;

        public e(float f6, float f7, float f8, float f9, float f10, float f11) {
            this.f14108b = f6;
            this.f14109c = f7;
            this.f14110d = f8;
            this.f14111e = f9;
            this.f14112f = f10;
            this.f14113g = f11;
        }

        private float b() {
            return this.f14108b;
        }

        private float c() {
            return this.f14110d;
        }

        private float d() {
            return this.f14109c;
        }

        private float e() {
            return this.f14109c;
        }

        private float f() {
            return this.f14112f;
        }

        private float g() {
            return this.f14113g;
        }

        private void h(float f6) {
            this.f14108b = f6;
        }

        private void i(float f6) {
            this.f14110d = f6;
        }

        private void j(float f6) {
            this.f14109c = f6;
        }

        private void k(float f6) {
            this.f14111e = f6;
        }

        private void l(float f6) {
            this.f14112f = f6;
        }

        private void m(float f6) {
            this.f14113g = f6;
        }

        @Override // com.google.android.material.shape.q.g
        public void a(@o0 Matrix matrix, @o0 Path path) {
            Matrix matrix2 = this.f14116a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f14108b, this.f14109c, this.f14110d, this.f14111e, this.f14112f, this.f14113g);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class f extends g {

        /* renamed from: b, reason: collision with root package name */
        private float f14114b;

        /* renamed from: c, reason: collision with root package name */
        private float f14115c;

        @Override // com.google.android.material.shape.q.g
        public void a(@o0 Matrix matrix, @o0 Path path) {
            Matrix matrix2 = this.f14116a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f14114b, this.f14115c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f14116a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    /* loaded from: classes3.dex */
    public static class h extends g {

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f14117b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f14118c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f14119d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f14120e;

        static void b(h hVar, float f6) {
            hVar.f14117b = f6;
        }

        static void c(h hVar, float f6) {
            hVar.f14118c = f6;
        }

        static void d(h hVar, float f6) {
            hVar.f14119d = f6;
        }

        static void e(h hVar, float f6) {
            hVar.f14120e = f6;
        }

        private float f() {
            return this.f14117b;
        }

        private float g() {
            return this.f14118c;
        }

        private float h() {
            return this.f14119d;
        }

        private float i() {
            return this.f14120e;
        }

        private void j(float f6) {
            this.f14117b = f6;
        }

        private void k(float f6) {
            this.f14118c = f6;
        }

        private void l(float f6) {
            this.f14119d = f6;
        }

        private void m(float f6) {
            this.f14120e = f6;
        }

        @Override // com.google.android.material.shape.q.g
        public void a(@o0 Matrix matrix, @o0 Path path) {
            Matrix matrix2 = this.f14116a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(this.f14117b, this.f14118c, this.f14119d, this.f14120e);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        static final Matrix f14121a = new Matrix();

        i() {
        }

        public abstract void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i5, Canvas canvas);

        public final void b(com.google.android.material.shadow.b bVar, int i5, Canvas canvas) {
            a(f14121a, bVar, i5, canvas);
        }
    }

    public q() {
        p(0.0f, 0.0f);
    }

    private void b(float f6) {
        float f7 = this.f14089e;
        if (f7 == f6) {
            return;
        }
        float f8 = ((f6 - f7) + 360.0f) % 360.0f;
        if (f8 > f14084k) {
            return;
        }
        d dVar = new d(j(), k(), j(), k());
        dVar.f14106f = this.f14089e;
        dVar.f14107g = f8;
        this.f14092h.add(new b(dVar));
        this.f14089e = f6;
    }

    private void c(i iVar, float f6, float f7) {
        b(f6);
        this.f14092h.add(iVar);
        this.f14089e = f7;
    }

    private float h() {
        return this.f14089e;
    }

    private float i() {
        return this.f14090f;
    }

    private void r(float f6) {
        this.f14089e = f6;
    }

    private void s(float f6) {
        this.f14090f = f6;
    }

    private void t(float f6) {
        this.f14087c = f6;
    }

    private void u(float f6) {
        this.f14088d = f6;
    }

    private void v(float f6) {
        this.f14085a = f6;
    }

    private void w(float f6) {
        this.f14086b = f6;
    }

    public void a(float f6, float f7, float f8, float f9, float f10, float f11) {
        d dVar = new d(f6, f7, f8, f9);
        dVar.f14106f = f10;
        dVar.f14107g = f11;
        this.f14091g.add(dVar);
        b bVar = new b(dVar);
        float f12 = f10 + f11;
        boolean z5 = f11 < 0.0f;
        if (z5) {
            f10 = (f10 + f14084k) % 360.0f;
        }
        c(bVar, f10, z5 ? (f14084k + f12) % 360.0f : f12);
        double d6 = f12;
        this.f14087c = (((f8 - f6) / 2.0f) * ((float) Math.cos(Math.toRadians(d6)))) + ((f6 + f8) * 0.5f);
        this.f14088d = (((f9 - f7) / 2.0f) * ((float) Math.sin(Math.toRadians(d6)))) + ((f7 + f9) * 0.5f);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f14091g.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f14091g.get(i5).a(matrix, path);
        }
    }

    boolean e() {
        return this.f14093i;
    }

    @o0
    i f(Matrix matrix) {
        b(this.f14090f);
        return new a(new ArrayList(this.f14092h), new Matrix(matrix));
    }

    @x0(21)
    public void g(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f14091g.add(new e(f6, f7, f8, f9, f10, f11));
        this.f14093i = true;
        this.f14087c = f10;
        this.f14088d = f11;
    }

    float j() {
        return this.f14087c;
    }

    float k() {
        return this.f14088d;
    }

    float l() {
        return this.f14085a;
    }

    float m() {
        return this.f14086b;
    }

    public void n(float f6, float f7) {
        f fVar = new f();
        fVar.f14114b = f6;
        fVar.f14115c = f7;
        this.f14091g.add(fVar);
        c cVar = new c(fVar, j(), k());
        c(cVar, cVar.c() + f14083j, cVar.c() + f14083j);
        this.f14087c = f6;
        this.f14088d = f7;
    }

    @x0(21)
    public void o(float f6, float f7, float f8, float f9) {
        h hVar = new h();
        hVar.f14117b = f6;
        hVar.f14118c = f7;
        hVar.f14119d = f8;
        hVar.f14120e = f9;
        this.f14091g.add(hVar);
        this.f14093i = true;
        this.f14087c = f8;
        this.f14088d = f9;
    }

    public void p(float f6, float f7) {
        q(f6, f7, f14083j, 0.0f);
    }

    public void q(float f6, float f7, float f8, float f9) {
        this.f14085a = f6;
        this.f14086b = f7;
        this.f14087c = f6;
        this.f14088d = f7;
        this.f14089e = f8;
        this.f14090f = (f8 + f9) % 360.0f;
        this.f14091g.clear();
        this.f14092h.clear();
        this.f14093i = false;
    }

    public q(float f6, float f7) {
        p(f6, f7);
    }
}
