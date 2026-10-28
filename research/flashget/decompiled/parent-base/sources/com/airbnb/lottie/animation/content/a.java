package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.s;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes3.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e, reason: collision with root package name */
    private final n0 f38650e;

    /* renamed from: f, reason: collision with root package name */
    protected final com.airbnb.lottie.model.layer.b f38651f;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f38653h;

    /* renamed from: i, reason: collision with root package name */
    final Paint f38654i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38655j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Integer> f38656k;

    /* renamed from: l, reason: collision with root package name */
    private final List<com.airbnb.lottie.animation.keyframe.a<?, Float>> f38657l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38658m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f38659n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f38660o;

    /* renamed from: p, reason: collision with root package name */
    float f38661p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.c f38662q;

    /* renamed from: a, reason: collision with root package name */
    private final PathMeasure f38646a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    private final Path f38647b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f38648c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f38649d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final List<b> f38652g = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<n> f38663a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        private final v f38664b;

        private b(@q0 v vVar) {
            this.f38663a = new ArrayList();
            this.f38664b = vVar;
        }
    }

    a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, Paint.Cap cap, Paint.Join join, float f4, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, List<com.airbnb.lottie.model.animatable.b> list, com.airbnb.lottie.model.animatable.b bVar3) {
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a(1);
        this.f38654i = aVar;
        this.f38661p = 0.0f;
        this.f38650e = n0Var;
        this.f38651f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f4);
        this.f38656k = dVar.p();
        this.f38655j = bVar2.p();
        if (bVar3 == null) {
            this.f38658m = null;
        } else {
            this.f38658m = bVar3.p();
        }
        this.f38657l = new ArrayList(list.size());
        this.f38653h = new float[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f38657l.add(list.get(i4).p());
        }
        bVar.i(this.f38656k);
        bVar.i(this.f38655j);
        for (int i5 = 0; i5 < this.f38657l.size(); i5++) {
            bVar.i(this.f38657l.get(i5));
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f38658m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f38656k.a(this);
        this.f38655j.a(this);
        for (int i6 = 0; i6 < list.size(); i6++) {
            this.f38657l.get(i6).a(this);
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar3 = this.f38658m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> p4 = bVar.v().a().p();
            this.f38660o = p4;
            p4.a(this);
            bVar.i(this.f38660o);
        }
        if (bVar.x() != null) {
            this.f38662q = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.x());
        }
    }

    private void g(Matrix matrix) {
        String s4 = ProtectedSandApp.s("õ");
        com.airbnb.lottie.e.a(s4);
        if (this.f38657l.isEmpty()) {
            com.airbnb.lottie.e.b(s4);
            return;
        }
        float g4 = com.airbnb.lottie.utils.j.g(matrix);
        for (int i4 = 0; i4 < this.f38657l.size(); i4++) {
            this.f38653h[i4] = this.f38657l.get(i4).h().floatValue();
            if (i4 % 2 == 0) {
                float[] fArr = this.f38653h;
                if (fArr[i4] < 1.0f) {
                    fArr[i4] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f38653h;
                if (fArr2[i4] < 0.1f) {
                    fArr2[i4] = 0.1f;
                }
            }
            float[] fArr3 = this.f38653h;
            fArr3[i4] = fArr3[i4] * g4;
        }
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f38658m;
        this.f38654i.setPathEffect(new DashPathEffect(this.f38653h, aVar == null ? 0.0f : g4 * aVar.h().floatValue()));
        com.airbnb.lottie.e.b(s4);
    }

    private void i(Canvas canvas, b bVar, Matrix matrix) {
        String s4 = ProtectedSandApp.s("ö");
        com.airbnb.lottie.e.a(s4);
        if (bVar.f38664b == null) {
            com.airbnb.lottie.e.b(s4);
            return;
        }
        this.f38647b.reset();
        for (int size = bVar.f38663a.size() - 1; size >= 0; size--) {
            this.f38647b.addPath(((n) bVar.f38663a.get(size)).getPath(), matrix);
        }
        float floatValue = bVar.f38664b.i().h().floatValue() / 100.0f;
        float floatValue2 = bVar.f38664b.e().h().floatValue() / 100.0f;
        float floatValue3 = bVar.f38664b.g().h().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f38647b, this.f38654i);
            com.airbnb.lottie.e.b(s4);
            return;
        }
        this.f38646a.setPath(this.f38647b, false);
        float length = this.f38646a.getLength();
        while (this.f38646a.nextContour()) {
            length += this.f38646a.getLength();
        }
        float f4 = floatValue3 * length;
        float f5 = (floatValue * length) + f4;
        float min = Math.min((floatValue2 * length) + f4, (f5 + length) - 1.0f);
        float f6 = 0.0f;
        for (int size2 = bVar.f38663a.size() - 1; size2 >= 0; size2--) {
            this.f38648c.set(((n) bVar.f38663a.get(size2)).getPath());
            this.f38648c.transform(matrix);
            this.f38646a.setPath(this.f38648c, false);
            float length2 = this.f38646a.getLength();
            if (min > length) {
                float f7 = min - length;
                if (f7 < f6 + length2 && f6 < f7) {
                    com.airbnb.lottie.utils.j.a(this.f38648c, f5 > length ? (f5 - length) / length2 : 0.0f, Math.min(f7 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f38648c, this.f38654i);
                    f6 += length2;
                }
            }
            float f10 = f6 + length2;
            if (f10 >= f5 && f6 <= min) {
                if (f10 > min || f5 >= f6) {
                    com.airbnb.lottie.utils.j.a(this.f38648c, f5 < f6 ? 0.0f : (f5 - f6) / length2, min > f10 ? 1.0f : (min - f6) / length2, 0.0f);
                    canvas.drawPath(this.f38648c, this.f38654i);
                } else {
                    canvas.drawPath(this.f38648c, this.f38654i);
                }
            }
            f6 += length2;
        }
        com.airbnb.lottie.e.b(s4);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f38650e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        v vVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof v) {
                v vVar2 = (v) cVar;
                if (vVar2.j() == s.a.INDIVIDUALLY) {
                    vVar = vVar2;
                }
            }
        }
        if (vVar != null) {
            vVar.d(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof v) {
                v vVar3 = (v) cVar2;
                if (vVar3.j() == s.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f38652g.add(bVar);
                    }
                    bVar = new b(vVar3);
                    vVar3.d(this);
                }
            }
            if (cVar2 instanceof n) {
                if (bVar == null) {
                    bVar = new b(vVar);
                }
                bVar.f38663a.add((n) cVar2);
            }
        }
        if (bVar != null) {
            this.f38652g.add(bVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    @androidx.annotation.i
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t4 == s0.f39343d) {
            this.f38656k.n(jVar);
            return;
        }
        if (t4 == s0.f39358s) {
            this.f38655j.n(jVar);
            return;
        }
        if (t4 == s0.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f38659n;
            if (aVar != null) {
                this.f38651f.G(aVar);
            }
            if (jVar == null) {
                this.f38659n = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f38659n = qVar;
            qVar.a(this);
            this.f38651f.i(this.f38659n);
            return;
        }
        if (t4 == s0.f39349j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f38660o;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f38660o = qVar2;
            qVar2.a(this);
            this.f38651f.i(this.f38660o);
            return;
        }
        if (t4 == s0.f39344e && (cVar5 = this.f38662q) != null) {
            cVar5.c(jVar);
            return;
        }
        if (t4 == s0.G && (cVar4 = this.f38662q) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t4 == s0.H && (cVar3 = this.f38662q) != null) {
            cVar3.d(jVar);
            return;
        }
        if (t4 == s0.I && (cVar2 = this.f38662q) != null) {
            cVar2.e(jVar);
        } else {
            if (t4 != s0.J || (cVar = this.f38662q) == null) {
                return;
            }
            cVar.g(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i4, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void f(RectF rectF, Matrix matrix, boolean z4) {
        String s4 = ProtectedSandApp.s("÷");
        com.airbnb.lottie.e.a(s4);
        this.f38647b.reset();
        for (int i4 = 0; i4 < this.f38652g.size(); i4++) {
            b bVar = this.f38652g.get(i4);
            for (int i5 = 0; i5 < bVar.f38663a.size(); i5++) {
                this.f38647b.addPath(((n) bVar.f38663a.get(i5)).getPath(), matrix);
            }
        }
        this.f38647b.computeBounds(this.f38649d, false);
        float p4 = ((com.airbnb.lottie.animation.keyframe.d) this.f38655j).p();
        RectF rectF2 = this.f38649d;
        float f4 = p4 / 2.0f;
        rectF2.set(rectF2.left - f4, rectF2.top - f4, rectF2.right + f4, rectF2.bottom + f4);
        rectF.set(this.f38649d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.airbnb.lottie.e.b(s4);
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        String s4 = ProtectedSandApp.s("ø");
        com.airbnb.lottie.e.a(s4);
        if (com.airbnb.lottie.utils.j.h(matrix)) {
            com.airbnb.lottie.e.b(s4);
            return;
        }
        this.f38654i.setAlpha(com.airbnb.lottie.utils.i.d((int) ((((i4 / 255.0f) * ((com.airbnb.lottie.animation.keyframe.f) this.f38656k).p()) / 100.0f) * 255.0f), 0, 255));
        this.f38654i.setStrokeWidth(com.airbnb.lottie.utils.j.g(matrix) * ((com.airbnb.lottie.animation.keyframe.d) this.f38655j).p());
        if (this.f38654i.getStrokeWidth() <= 0.0f) {
            com.airbnb.lottie.e.b(s4);
            return;
        }
        g(matrix);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f38659n;
        if (aVar != null) {
            this.f38654i.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f38660o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f38654i.setMaskFilter(null);
            } else if (floatValue != this.f38661p) {
                this.f38654i.setMaskFilter(this.f38651f.w(floatValue));
            }
            this.f38661p = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f38662q;
        if (cVar != null) {
            cVar.b(this.f38654i);
        }
        for (int i5 = 0; i5 < this.f38652g.size(); i5++) {
            b bVar = this.f38652g.get(i5);
            if (bVar.f38664b != null) {
                i(canvas, bVar, matrix);
            } else {
                String s5 = ProtectedSandApp.s("ù");
                com.airbnb.lottie.e.a(s5);
                this.f38647b.reset();
                for (int size = bVar.f38663a.size() - 1; size >= 0; size--) {
                    this.f38647b.addPath(((n) bVar.f38663a.get(size)).getPath(), matrix);
                }
                com.airbnb.lottie.e.b(s5);
                String s6 = ProtectedSandApp.s("ú");
                com.airbnb.lottie.e.a(s6);
                canvas.drawPath(this.f38647b, this.f38654i);
                com.airbnb.lottie.e.b(s6);
            }
        }
        com.airbnb.lottie.e.b(s4);
    }
}
