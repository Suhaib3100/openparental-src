package com.airbnb.lottie.animation.content;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.e1;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientFillContent.java */
/* loaded from: classes3.dex */
public class h implements e, a.b, k {

    /* renamed from: v, reason: collision with root package name */
    private static final int f38699v = 32;

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final String f38700a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38701b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f38702c;

    /* renamed from: d, reason: collision with root package name */
    private final e1<LinearGradient> f38703d = new e1<>();

    /* renamed from: e, reason: collision with root package name */
    private final e1<RadialGradient> f38704e = new e1<>();

    /* renamed from: f, reason: collision with root package name */
    private final Path f38705f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f38706g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f38707h;

    /* renamed from: i, reason: collision with root package name */
    private final List<n> f38708i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.g f38709j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f38710k;

    /* renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f38711l;

    /* renamed from: m, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f38712m;

    /* renamed from: n, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f38713n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f38714o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.q f38715p;

    /* renamed from: q, reason: collision with root package name */
    private final n0 f38716q;

    /* renamed from: r, reason: collision with root package name */
    private final int f38717r;

    /* renamed from: s, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f38718s;

    /* renamed from: t, reason: collision with root package name */
    float f38719t;

    /* renamed from: u, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.c f38720u;

    public h(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.e eVar) {
        Path path = new Path();
        this.f38705f = path;
        this.f38706g = new com.airbnb.lottie.animation.a(1);
        this.f38707h = new RectF();
        this.f38708i = new ArrayList();
        this.f38719t = 0.0f;
        this.f38702c = bVar;
        this.f38700a = eVar.f();
        this.f38701b = eVar.i();
        this.f38716q = n0Var;
        this.f38709j = eVar.e();
        path.setFillType(eVar.c());
        this.f38717r = (int) (n0Var.Q().d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> p4 = eVar.d().p();
        this.f38710k = p4;
        p4.a(this);
        bVar.i(p4);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> p5 = eVar.g().p();
        this.f38711l = p5;
        p5.a(this);
        bVar.i(p5);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p6 = eVar.h().p();
        this.f38712m = p6;
        p6.a(this);
        bVar.i(p6);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p7 = eVar.b().p();
        this.f38713n = p7;
        p7.a(this);
        bVar.i(p7);
        if (bVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> p10 = bVar.v().a().p();
            this.f38718s = p10;
            p10.a(this);
            bVar.i(this.f38718s);
        }
        if (bVar.x() != null) {
            this.f38720u = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.x());
        }
    }

    private int[] g(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.f38715p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i4 = 0;
            if (iArr.length == numArr.length) {
                while (i4 < iArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i4 < numArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int round = Math.round(this.f38712m.f() * this.f38717r);
        int round2 = Math.round(this.f38713n.f() * this.f38717r);
        int round3 = Math.round(this.f38710k.f() * this.f38717r);
        int i4 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i4 = i4 * 31 * round2;
        }
        return round3 != 0 ? i4 * 31 * round3 : i4;
    }

    private LinearGradient j() {
        long i4 = i();
        LinearGradient i5 = this.f38703d.i(i4);
        if (i5 != null) {
            return i5;
        }
        PointF h4 = this.f38712m.h();
        PointF h5 = this.f38713n.h();
        com.airbnb.lottie.model.content.d h6 = this.f38710k.h();
        LinearGradient linearGradient = new LinearGradient(h4.x, h4.y, h5.x, h5.y, g(h6.a()), h6.b(), Shader.TileMode.CLAMP);
        this.f38703d.p(i4, linearGradient);
        return linearGradient;
    }

    private RadialGradient k() {
        long i4 = i();
        RadialGradient i5 = this.f38704e.i(i4);
        if (i5 != null) {
            return i5;
        }
        PointF h4 = this.f38712m.h();
        PointF h5 = this.f38713n.h();
        com.airbnb.lottie.model.content.d h6 = this.f38710k.h();
        int[] g4 = g(h6.a());
        float[] b5 = h6.b();
        float f4 = h4.x;
        float f5 = h4.y;
        float hypot = (float) Math.hypot(h5.x - f4, h5.y - f5);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f4, f5, hypot, g4, b5, Shader.TileMode.CLAMP);
        this.f38704e.p(i4, radialGradient);
        return radialGradient;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f38716q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            c cVar = list2.get(i4);
            if (cVar instanceof n) {
                this.f38708i.add((n) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t4 == s0.f39343d) {
            this.f38711l.n(jVar);
            return;
        }
        if (t4 == s0.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f38714o;
            if (aVar != null) {
                this.f38702c.G(aVar);
            }
            if (jVar == null) {
                this.f38714o = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f38714o = qVar;
            qVar.a(this);
            this.f38702c.i(this.f38714o);
            return;
        }
        if (t4 == s0.L) {
            com.airbnb.lottie.animation.keyframe.q qVar2 = this.f38715p;
            if (qVar2 != null) {
                this.f38702c.G(qVar2);
            }
            if (jVar == null) {
                this.f38715p = null;
                return;
            }
            this.f38703d.c();
            this.f38704e.c();
            com.airbnb.lottie.animation.keyframe.q qVar3 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f38715p = qVar3;
            qVar3.a(this);
            this.f38702c.i(this.f38715p);
            return;
        }
        if (t4 == s0.f39349j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f38718s;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar4 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f38718s = qVar4;
            qVar4.a(this);
            this.f38702c.i(this.f38718s);
            return;
        }
        if (t4 == s0.f39344e && (cVar5 = this.f38720u) != null) {
            cVar5.c(jVar);
            return;
        }
        if (t4 == s0.G && (cVar4 = this.f38720u) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t4 == s0.H && (cVar3 = this.f38720u) != null) {
            cVar3.d(jVar);
            return;
        }
        if (t4 == s0.I && (cVar2 = this.f38720u) != null) {
            cVar2.e(jVar);
        } else {
            if (t4 != s0.J || (cVar = this.f38720u) == null) {
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
        this.f38705f.reset();
        for (int i4 = 0; i4 < this.f38708i.size(); i4++) {
            this.f38705f.addPath(this.f38708i.get(i4).getPath(), matrix);
        }
        this.f38705f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38700a;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        if (this.f38701b) {
            return;
        }
        String s4 = ProtectedSandApp.s("ý");
        com.airbnb.lottie.e.a(s4);
        this.f38705f.reset();
        for (int i5 = 0; i5 < this.f38708i.size(); i5++) {
            this.f38705f.addPath(this.f38708i.get(i5).getPath(), matrix);
        }
        this.f38705f.computeBounds(this.f38707h, false);
        Shader j4 = this.f38709j == com.airbnb.lottie.model.content.g.LINEAR ? j() : k();
        j4.setLocalMatrix(matrix);
        this.f38706g.setShader(j4);
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f38714o;
        if (aVar != null) {
            this.f38706g.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f38718s;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f38706g.setMaskFilter(null);
            } else if (floatValue != this.f38719t) {
                this.f38706g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f38719t = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f38720u;
        if (cVar != null) {
            cVar.b(this.f38706g);
        }
        this.f38706g.setAlpha(com.airbnb.lottie.utils.i.d((int) ((((i4 / 255.0f) * this.f38711l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f38705f, this.f38706g);
        com.airbnb.lottie.e.b(s4);
    }
}
