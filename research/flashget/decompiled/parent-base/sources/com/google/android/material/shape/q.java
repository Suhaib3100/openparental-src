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
/* loaded from: classes6.dex */
public class q {

    /* renamed from: j, reason: collision with root package name */
    private static final float f53956j = 270.0f;

    /* renamed from: k, reason: collision with root package name */
    protected static final float f53957k = 180.0f;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f53958a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f53959b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f53960c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f53961d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f53962e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f53963f;

    /* renamed from: g, reason: collision with root package name */
    private final List<g> f53964g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<i> f53965h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f53966i;

    /* compiled from: ShapePath.java */
    class a extends i {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f53967b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f53968c;

        a(List list, Matrix matrix) {
            this.f53967b = list;
            this.f53968c = matrix;
        }

        @Override // com.google.android.material.shape.q.i
        public void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i4, Canvas canvas) {
            Iterator it = this.f53967b.iterator();
            while (it.hasNext()) {
                ((i) it.next()).a(this.f53968c, bVar, i4, canvas);
            }
        }
    }

    /* compiled from: ShapePath.java */
    static class b extends i {

        /* renamed from: b, reason: collision with root package name */
        private final d f53970b;

        public b(d dVar) {
            this.f53970b = dVar;
        }

        @Override // com.google.android.material.shape.q.i
        public void a(Matrix matrix, @o0 com.google.android.material.shadow.b bVar, int i4, @o0 Canvas canvas) {
            float h4 = d.h(this.f53970b);
            float f4 = this.f53970b.f53980g;
            d dVar = this.f53970b;
            bVar.a(canvas, matrix, new RectF(dVar.f53975b, dVar.f53976c, dVar.f53977d, dVar.f53978e), i4, h4, f4);
        }
    }

    /* compiled from: ShapePath.java */
    static class c extends i {

        /* renamed from: b, reason: collision with root package name */
        private final f f53971b;

        /* renamed from: c, reason: collision with root package name */
        private final float f53972c;

        /* renamed from: d, reason: collision with root package name */
        private final float f53973d;

        public c(f fVar, float f4, float f5) {
            this.f53971b = fVar;
            this.f53972c = f4;
            this.f53973d = f5;
        }

        @Override // com.google.android.material.shape.q.i
        public void a(Matrix matrix, @o0 com.google.android.material.shadow.b bVar, int i4, @o0 Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f53971b.f53988c - this.f53973d, this.f53971b.f53987b - this.f53972c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f53972c, this.f53973d);
            matrix2.preRotate(c());
            bVar.b(canvas, matrix2, rectF, i4);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f53971b.f53988c - this.f53973d) / (this.f53971b.f53987b - this.f53972c)));
        }
    }

    /* compiled from: ShapePath.java */
    public static class d extends g {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f53974h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f53975b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f53976c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f53977d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f53978e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f53979f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f53980g;

        public d(float f4, float f5, float f6, float f7) {
            this.f53975b = f4;
            this.f53976c = f5;
            this.f53977d = f6;
            this.f53978e = f7;
        }

        static float b(d dVar) {
            return dVar.f53975b;
        }

        static float c(d dVar) {
            return dVar.f53976c;
        }

        static float d(d dVar) {
            return dVar.f53977d;
        }

        static float e(d dVar) {
            return dVar.f53978e;
        }

        static void f(d dVar, float f4) {
            dVar.f53979f = f4;
        }

        static void g(d dVar, float f4) {
            dVar.f53980g = f4;
        }

        static float h(d dVar) {
            return dVar.f53979f;
        }

        static float i(d dVar) {
            return dVar.f53980g;
        }

        private float j() {
            return this.f53978e;
        }

        private float k() {
            return this.f53975b;
        }

        private float l() {
            return this.f53977d;
        }

        private float m() {
            return this.f53979f;
        }

        private float n() {
            return this.f53980g;
        }

        private float o() {
            return this.f53976c;
        }

        private void p(float f4) {
            this.f53978e = f4;
        }

        private void q(float f4) {
            this.f53975b = f4;
        }

        private void r(float f4) {
            this.f53977d = f4;
        }

        private void s(float f4) {
            this.f53979f = f4;
        }

        private void t(float f4) {
            this.f53980g = f4;
        }

        private void u(float f4) {
            this.f53976c = f4;
        }

        @Override // com.google.android.material.shape.q.g
        public void a(@o0 Matrix matrix, @o0 Path path) {
            Matrix matrix2 = this.f53989a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f53974h;
            rectF.set(this.f53975b, this.f53976c, this.f53977d, this.f53978e);
            path.arcTo(rectF, this.f53979f, this.f53980g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static class e extends g {

        /* renamed from: b, reason: collision with root package name */
        private float f53981b;

        /* renamed from: c, reason: collision with root package name */
        private float f53982c;

        /* renamed from: d, reason: collision with root package name */
        private float f53983d;

        /* renamed from: e, reason: collision with root package name */
        private float f53984e;

        /* renamed from: f, reason: collision with root package name */
        private float f53985f;

        /* renamed from: g, reason: collision with root package name */
        private float f53986g;

        public e(float f4, float f5, float f6, float f7, float f10, float f11) {
            this.f53981b = f4;
            this.f53982c = f5;
            this.f53983d = f6;
            this.f53984e = f7;
            this.f53985f = f10;
            this.f53986g = f11;
        }

        private float b() {
            return this.f53981b;
        }

        private float c() {
            return this.f53983d;
        }

        private float d() {
            return this.f53982c;
        }

        private float e() {
            return this.f53982c;
        }

        private float f() {
            return this.f53985f;
        }

        private float g() {
            return this.f53986g;
        }

        private void h(float f4) {
            this.f53981b = f4;
        }

        private void i(float f4) {
            this.f53983d = f4;
        }

        private void j(float f4) {
            this.f53982c = f4;
        }

        private void k(float f4) {
            this.f53984e = f4;
        }

        private void l(float f4) {
            this.f53985f = f4;
        }

        private void m(float f4) {
            this.f53986g = f4;
        }

        @Override // com.google.android.material.shape.q.g
        public void a(@o0 Matrix matrix, @o0 Path path) {
            Matrix matrix2 = this.f53989a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.f53981b, this.f53982c, this.f53983d, this.f53984e, this.f53985f, this.f53986g);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static class f extends g {

        /* renamed from: b, reason: collision with root package name */
        private float f53987b;

        /* renamed from: c, reason: collision with root package name */
        private float f53988c;

        @Override // com.google.android.material.shape.q.g
        public void a(@o0 Matrix matrix, @o0 Path path) {
            Matrix matrix2 = this.f53989a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f53987b, this.f53988c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f53989a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    public static class h extends g {

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f53990b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f53991c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f53992d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f53993e;

        static void b(h hVar, float f4) {
            hVar.f53990b = f4;
        }

        static void c(h hVar, float f4) {
            hVar.f53991c = f4;
        }

        static void d(h hVar, float f4) {
            hVar.f53992d = f4;
        }

        static void e(h hVar, float f4) {
            hVar.f53993e = f4;
        }

        private float f() {
            return this.f53990b;
        }

        private float g() {
            return this.f53991c;
        }

        private float h() {
            return this.f53992d;
        }

        private float i() {
            return this.f53993e;
        }

        private void j(float f4) {
            this.f53990b = f4;
        }

        private void k(float f4) {
            this.f53991c = f4;
        }

        private void l(float f4) {
            this.f53992d = f4;
        }

        private void m(float f4) {
            this.f53993e = f4;
        }

        @Override // com.google.android.material.shape.q.g
        public void a(@o0 Matrix matrix, @o0 Path path) {
            Matrix matrix2 = this.f53989a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(this.f53990b, this.f53991c, this.f53992d, this.f53993e);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    static abstract class i {

        /* renamed from: a, reason: collision with root package name */
        static final Matrix f53994a = new Matrix();

        i() {
        }

        public abstract void a(Matrix matrix, com.google.android.material.shadow.b bVar, int i4, Canvas canvas);

        public final void b(com.google.android.material.shadow.b bVar, int i4, Canvas canvas) {
            a(f53994a, bVar, i4, canvas);
        }
    }

    public q() {
        p(0.0f, 0.0f);
    }

    private void b(float f4) {
        float f5 = this.f53962e;
        if (f5 == f4) {
            return;
        }
        float f6 = ((f4 - f5) + 360.0f) % 360.0f;
        if (f6 > 180.0f) {
            return;
        }
        d dVar = new d(j(), k(), j(), k());
        dVar.f53979f = this.f53962e;
        dVar.f53980g = f6;
        this.f53965h.add(new b(dVar));
        this.f53962e = f4;
    }

    private void c(i iVar, float f4, float f5) {
        b(f4);
        this.f53965h.add(iVar);
        this.f53962e = f5;
    }

    private float h() {
        return this.f53962e;
    }

    private float i() {
        return this.f53963f;
    }

    private void r(float f4) {
        this.f53962e = f4;
    }

    private void s(float f4) {
        this.f53963f = f4;
    }

    private void t(float f4) {
        this.f53960c = f4;
    }

    private void u(float f4) {
        this.f53961d = f4;
    }

    private void v(float f4) {
        this.f53958a = f4;
    }

    private void w(float f4) {
        this.f53959b = f4;
    }

    public void a(float f4, float f5, float f6, float f7, float f10, float f11) {
        d dVar = new d(f4, f5, f6, f7);
        dVar.f53979f = f10;
        dVar.f53980g = f11;
        this.f53964g.add(dVar);
        b bVar = new b(dVar);
        float f12 = f10 + f11;
        boolean z4 = f11 < 0.0f;
        if (z4) {
            f10 = (f10 + 180.0f) % 360.0f;
        }
        c(bVar, f10, z4 ? (180.0f + f12) % 360.0f : f12);
        double d5 = f12;
        this.f53960c = (((f6 - f4) / 2.0f) * ((float) Math.cos(Math.toRadians(d5)))) + ((f4 + f6) * 0.5f);
        this.f53961d = (((f7 - f5) / 2.0f) * ((float) Math.sin(Math.toRadians(d5)))) + ((f5 + f7) * 0.5f);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f53964g.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f53964g.get(i4).a(matrix, path);
        }
    }

    boolean e() {
        return this.f53966i;
    }

    @o0
    i f(Matrix matrix) {
        b(this.f53963f);
        return new a(new ArrayList(this.f53965h), new Matrix(matrix));
    }

    @x0(21)
    public void g(float f4, float f5, float f6, float f7, float f10, float f11) {
        this.f53964g.add(new e(f4, f5, f6, f7, f10, f11));
        this.f53966i = true;
        this.f53960c = f10;
        this.f53961d = f11;
    }

    float j() {
        return this.f53960c;
    }

    float k() {
        return this.f53961d;
    }

    float l() {
        return this.f53958a;
    }

    float m() {
        return this.f53959b;
    }

    public void n(float f4, float f5) {
        f fVar = new f();
        fVar.f53987b = f4;
        fVar.f53988c = f5;
        this.f53964g.add(fVar);
        c cVar = new c(fVar, j(), k());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        this.f53960c = f4;
        this.f53961d = f5;
    }

    @x0(21)
    public void o(float f4, float f5, float f6, float f7) {
        h hVar = new h();
        hVar.f53990b = f4;
        hVar.f53991c = f5;
        hVar.f53992d = f6;
        hVar.f53993e = f7;
        this.f53964g.add(hVar);
        this.f53966i = true;
        this.f53960c = f6;
        this.f53961d = f7;
    }

    public void p(float f4, float f5) {
        q(f4, f5, 270.0f, 0.0f);
    }

    public void q(float f4, float f5, float f6, float f7) {
        this.f53958a = f4;
        this.f53959b = f5;
        this.f53960c = f4;
        this.f53961d = f5;
        this.f53962e = f6;
        this.f53963f = (f6 + f7) % 360.0f;
        this.f53964g.clear();
        this.f53965h.clear();
        this.f53966i = false;
    }

    public q(float f4, float f5) {
        p(f4, f5);
    }
}
