package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* loaded from: classes3.dex */
public class g implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Path f38686a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f38687b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f38688c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38689d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f38690e;

    /* renamed from: f, reason: collision with root package name */
    private final List<n> f38691f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f38692g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f38693h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f38694i;

    /* renamed from: j, reason: collision with root package name */
    private final n0 f38695j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f38696k;

    /* renamed from: l, reason: collision with root package name */
    float f38697l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.c f38698m;

    public g(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.o oVar) {
        Path path = new Path();
        this.f38686a = path;
        this.f38687b = new com.airbnb.lottie.animation.a(1);
        this.f38691f = new ArrayList();
        this.f38688c = bVar;
        this.f38689d = oVar.d();
        this.f38690e = oVar.f();
        this.f38695j = n0Var;
        if (bVar.v() != null) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> p4 = bVar.v().a().p();
            this.f38696k = p4;
            p4.a(this);
            bVar.i(this.f38696k);
        }
        if (bVar.x() != null) {
            this.f38698m = new com.airbnb.lottie.animation.keyframe.c(this, bVar, bVar.x());
        }
        if (oVar.b() == null || oVar.e() == null) {
            this.f38692g = null;
            this.f38693h = null;
            return;
        }
        path.setFillType(oVar.c());
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> p5 = oVar.b().p();
        this.f38692g = p5;
        p5.a(this);
        bVar.i(p5);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> p6 = oVar.e().p();
        this.f38693h = p6;
        p6.a(this);
        bVar.i(p6);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f38695j.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list2.size(); i4++) {
            c cVar = list2.get(i4);
            if (cVar instanceof n) {
                this.f38691f.add((n) cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.c cVar;
        com.airbnb.lottie.animation.keyframe.c cVar2;
        com.airbnb.lottie.animation.keyframe.c cVar3;
        com.airbnb.lottie.animation.keyframe.c cVar4;
        com.airbnb.lottie.animation.keyframe.c cVar5;
        if (t4 == s0.f39340a) {
            this.f38692g.n(jVar);
            return;
        }
        if (t4 == s0.f39343d) {
            this.f38693h.n(jVar);
            return;
        }
        if (t4 == s0.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f38694i;
            if (aVar != null) {
                this.f38688c.G(aVar);
            }
            if (jVar == null) {
                this.f38694i = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f38694i = qVar;
            qVar.a(this);
            this.f38688c.i(this.f38694i);
            return;
        }
        if (t4 == s0.f39349j) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f38696k;
            if (aVar2 != null) {
                aVar2.n(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f38696k = qVar2;
            qVar2.a(this);
            this.f38688c.i(this.f38696k);
            return;
        }
        if (t4 == s0.f39344e && (cVar5 = this.f38698m) != null) {
            cVar5.c(jVar);
            return;
        }
        if (t4 == s0.G && (cVar4 = this.f38698m) != null) {
            cVar4.f(jVar);
            return;
        }
        if (t4 == s0.H && (cVar3 = this.f38698m) != null) {
            cVar3.d(jVar);
            return;
        }
        if (t4 == s0.I && (cVar2 = this.f38698m) != null) {
            cVar2.e(jVar);
        } else {
            if (t4 != s0.J || (cVar = this.f38698m) == null) {
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
        this.f38686a.reset();
        for (int i4 = 0; i4 < this.f38691f.size(); i4++) {
            this.f38686a.addPath(this.f38691f.get(i4).getPath(), matrix);
        }
        this.f38686a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38689d;
    }

    @Override // com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        if (this.f38690e) {
            return;
        }
        String s4 = ProtectedSandApp.s("ü");
        com.airbnb.lottie.e.a(s4);
        this.f38687b.setColor((com.airbnb.lottie.utils.i.d((int) ((((i4 / 255.0f) * this.f38693h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.airbnb.lottie.animation.keyframe.b) this.f38692g).p() & 16777215));
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f38694i;
        if (aVar != null) {
            this.f38687b.setColorFilter(aVar.h());
        }
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar2 = this.f38696k;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == 0.0f) {
                this.f38687b.setMaskFilter(null);
            } else if (floatValue != this.f38697l) {
                this.f38687b.setMaskFilter(this.f38688c.w(floatValue));
            }
            this.f38697l = floatValue;
        }
        com.airbnb.lottie.animation.keyframe.c cVar = this.f38698m;
        if (cVar != null) {
            cVar.b(this.f38687b);
        }
        this.f38686a.reset();
        for (int i5 = 0; i5 < this.f38691f.size(); i5++) {
            this.f38686a.addPath(this.f38691f.get(i5).getPath(), matrix);
        }
        canvas.drawPath(this.f38686a, this.f38687b);
        com.airbnb.lottie.e.b(s4);
    }
}
