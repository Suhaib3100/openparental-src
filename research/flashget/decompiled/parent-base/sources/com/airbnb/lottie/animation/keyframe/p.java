package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.s0;
import java.util.Collections;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f38850a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f38851b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f38852c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f38853d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f38854e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private a<PointF, PointF> f38855f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private a<?, PointF> f38856g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> f38857h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private a<Float, Float> f38858i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private a<Integer, Integer> f38859j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private d f38860k;

    /* renamed from: l, reason: collision with root package name */
    @q0
    private d f38861l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private a<?, Float> f38862m;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private a<?, Float> f38863n;

    public p(com.airbnb.lottie.model.animatable.l lVar) {
        this.f38855f = lVar.c() == null ? null : lVar.c().p();
        this.f38856g = lVar.f() == null ? null : lVar.f().p();
        this.f38857h = lVar.h() == null ? null : lVar.h().p();
        this.f38858i = lVar.g() == null ? null : lVar.g().p();
        d dVar = lVar.i() == null ? null : (d) lVar.i().p();
        this.f38860k = dVar;
        if (dVar != null) {
            this.f38851b = new Matrix();
            this.f38852c = new Matrix();
            this.f38853d = new Matrix();
            this.f38854e = new float[9];
        } else {
            this.f38851b = null;
            this.f38852c = null;
            this.f38853d = null;
            this.f38854e = null;
        }
        this.f38861l = lVar.j() == null ? null : (d) lVar.j().p();
        if (lVar.e() != null) {
            this.f38859j = lVar.e().p();
        }
        if (lVar.k() != null) {
            this.f38862m = lVar.k().p();
        } else {
            this.f38862m = null;
        }
        if (lVar.d() != null) {
            this.f38863n = lVar.d().p();
        } else {
            this.f38863n = null;
        }
    }

    private void d() {
        for (int i4 = 0; i4 < 9; i4++) {
            this.f38854e[i4] = 0.0f;
        }
    }

    public void a(com.airbnb.lottie.model.layer.b bVar) {
        bVar.i(this.f38859j);
        bVar.i(this.f38862m);
        bVar.i(this.f38863n);
        bVar.i(this.f38855f);
        bVar.i(this.f38856g);
        bVar.i(this.f38857h);
        bVar.i(this.f38858i);
        bVar.i(this.f38860k);
        bVar.i(this.f38861l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f38859j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f38862m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f38863n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f38855f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f38856g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f38857h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f38858i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f38860k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f38861l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        if (t4 == s0.f39345f) {
            a<PointF, PointF> aVar = this.f38855f;
            if (aVar == null) {
                this.f38855f = new q(jVar, new PointF());
                return true;
            }
            aVar.n(jVar);
            return true;
        }
        if (t4 == s0.f39346g) {
            a<?, PointF> aVar2 = this.f38856g;
            if (aVar2 == null) {
                this.f38856g = new q(jVar, new PointF());
                return true;
            }
            aVar2.n(jVar);
            return true;
        }
        if (t4 == s0.f39347h) {
            a<?, PointF> aVar3 = this.f38856g;
            if (aVar3 instanceof n) {
                ((n) aVar3).r(jVar);
                return true;
            }
        }
        if (t4 == s0.f39348i) {
            a<?, PointF> aVar4 = this.f38856g;
            if (aVar4 instanceof n) {
                ((n) aVar4).s(jVar);
                return true;
            }
        }
        if (t4 == s0.f39354o) {
            a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar5 = this.f38857h;
            if (aVar5 == null) {
                this.f38857h = new q(jVar, new com.airbnb.lottie.value.k());
                return true;
            }
            aVar5.n(jVar);
            return true;
        }
        if (t4 == s0.f39355p) {
            a<Float, Float> aVar6 = this.f38858i;
            if (aVar6 == null) {
                this.f38858i = new q(jVar, Float.valueOf(0.0f));
                return true;
            }
            aVar6.n(jVar);
            return true;
        }
        if (t4 == s0.f39342c) {
            a<Integer, Integer> aVar7 = this.f38859j;
            if (aVar7 == null) {
                this.f38859j = new q(jVar, 100);
                return true;
            }
            aVar7.n(jVar);
            return true;
        }
        if (t4 == s0.C) {
            a<?, Float> aVar8 = this.f38862m;
            if (aVar8 == null) {
                this.f38862m = new q(jVar, Float.valueOf(100.0f));
                return true;
            }
            aVar8.n(jVar);
            return true;
        }
        if (t4 == s0.D) {
            a<?, Float> aVar9 = this.f38863n;
            if (aVar9 == null) {
                this.f38863n = new q(jVar, Float.valueOf(100.0f));
                return true;
            }
            aVar9.n(jVar);
            return true;
        }
        if (t4 == s0.f39356q) {
            if (this.f38860k == null) {
                this.f38860k = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
            }
            this.f38860k.n(jVar);
            return true;
        }
        if (t4 != s0.f39357r) {
            return false;
        }
        if (this.f38861l == null) {
            this.f38861l = new d(Collections.singletonList(new com.airbnb.lottie.value.a(Float.valueOf(0.0f))));
        }
        this.f38861l.n(jVar);
        return true;
    }

    @q0
    public a<?, Float> e() {
        return this.f38863n;
    }

    public Matrix f() {
        PointF h4;
        this.f38850a.reset();
        a<?, PointF> aVar = this.f38856g;
        if (aVar != null && (h4 = aVar.h()) != null) {
            float f4 = h4.x;
            if (f4 != 0.0f || h4.y != 0.0f) {
                this.f38850a.preTranslate(f4, h4.y);
            }
        }
        a<Float, Float> aVar2 = this.f38858i;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((d) aVar2).p();
            if (floatValue != 0.0f) {
                this.f38850a.preRotate(floatValue);
            }
        }
        if (this.f38860k != null) {
            float cos = this.f38861l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.p()) + 90.0f));
            float sin = this.f38861l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.p()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.p()));
            d();
            float[] fArr = this.f38854e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f5 = -sin;
            fArr[3] = f5;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f38851b.setValues(fArr);
            d();
            float[] fArr2 = this.f38854e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f38852c.setValues(fArr2);
            d();
            float[] fArr3 = this.f38854e;
            fArr3[0] = cos;
            fArr3[1] = f5;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f38853d.setValues(fArr3);
            this.f38852c.preConcat(this.f38851b);
            this.f38853d.preConcat(this.f38852c);
            this.f38850a.preConcat(this.f38853d);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar3 = this.f38857h;
        if (aVar3 != null) {
            com.airbnb.lottie.value.k h5 = aVar3.h();
            if (h5.b() != 1.0f || h5.c() != 1.0f) {
                this.f38850a.preScale(h5.b(), h5.c());
            }
        }
        a<PointF, PointF> aVar4 = this.f38855f;
        if (aVar4 != null) {
            PointF h6 = aVar4.h();
            float f6 = h6.x;
            if (f6 != 0.0f || h6.y != 0.0f) {
                this.f38850a.preTranslate(-f6, -h6.y);
            }
        }
        return this.f38850a;
    }

    public Matrix g(float f4) {
        a<?, PointF> aVar = this.f38856g;
        PointF h4 = aVar == null ? null : aVar.h();
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar2 = this.f38857h;
        com.airbnb.lottie.value.k h5 = aVar2 == null ? null : aVar2.h();
        this.f38850a.reset();
        if (h4 != null) {
            this.f38850a.preTranslate(h4.x * f4, h4.y * f4);
        }
        if (h5 != null) {
            double d5 = f4;
            this.f38850a.preScale((float) Math.pow(h5.b(), d5), (float) Math.pow(h5.c(), d5));
        }
        a<Float, Float> aVar3 = this.f38858i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f38855f;
            PointF h6 = aVar4 != null ? aVar4.h() : null;
            this.f38850a.preRotate(floatValue * f4, h6 == null ? 0.0f : h6.x, h6 != null ? h6.y : 0.0f);
        }
        return this.f38850a;
    }

    @q0
    public a<?, Integer> h() {
        return this.f38859j;
    }

    @q0
    public a<?, Float> i() {
        return this.f38862m;
    }

    public void j(float f4) {
        a<Integer, Integer> aVar = this.f38859j;
        if (aVar != null) {
            aVar.m(f4);
        }
        a<?, Float> aVar2 = this.f38862m;
        if (aVar2 != null) {
            aVar2.m(f4);
        }
        a<?, Float> aVar3 = this.f38863n;
        if (aVar3 != null) {
            aVar3.m(f4);
        }
        a<PointF, PointF> aVar4 = this.f38855f;
        if (aVar4 != null) {
            aVar4.m(f4);
        }
        a<?, PointF> aVar5 = this.f38856g;
        if (aVar5 != null) {
            aVar5.m(f4);
        }
        a<com.airbnb.lottie.value.k, com.airbnb.lottie.value.k> aVar6 = this.f38857h;
        if (aVar6 != null) {
            aVar6.m(f4);
        }
        a<Float, Float> aVar7 = this.f38858i;
        if (aVar7 != null) {
            aVar7.m(f4);
        }
        d dVar = this.f38860k;
        if (dVar != null) {
            dVar.m(f4);
        }
        d dVar2 = this.f38861l;
        if (dVar2 != null) {
            dVar2.m(f4);
        }
    }
}
