package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.q0;
import androidx.collection.e1;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes3.dex */
public class i extends a {
    private static final int C = 32;
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> A;

    @q0
    private com.airbnb.lottie.animation.keyframe.q B;

    /* renamed from: r, reason: collision with root package name */
    private final String f38721r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f38722s;

    /* renamed from: t, reason: collision with root package name */
    private final e1<LinearGradient> f38723t;

    /* renamed from: u, reason: collision with root package name */
    private final e1<RadialGradient> f38724u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f38725v;

    /* renamed from: w, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.g f38726w;

    /* renamed from: x, reason: collision with root package name */
    private final int f38727x;

    /* renamed from: y, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> f38728y;

    /* renamed from: z, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<PointF, PointF> f38729z;

    public i(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.f fVar) {
        super(n0Var, bVar, fVar.b().toPaintCap(), fVar.g().toPaintJoin(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f38723t = new e1<>();
        this.f38724u = new e1<>();
        this.f38725v = new RectF();
        this.f38721r = fVar.j();
        this.f38726w = fVar.f();
        this.f38722s = fVar.n();
        this.f38727x = (int) (n0Var.Q().d() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> p4 = fVar.e().p();
        this.f38728y = p4;
        p4.a(this);
        bVar.i(p4);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p5 = fVar.l().p();
        this.f38729z = p5;
        p5.a(this);
        bVar.i(p5);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p6 = fVar.d().p();
        this.A = p6;
        p6.a(this);
        bVar.i(p6);
    }

    private int[] j(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.B;
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

    private int k() {
        int round = Math.round(this.f38729z.f() * this.f38727x);
        int round2 = Math.round(this.A.f() * this.f38727x);
        int round3 = Math.round(this.f38728y.f() * this.f38727x);
        int i4 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i4 = i4 * 31 * round2;
        }
        return round3 != 0 ? i4 * 31 * round3 : i4;
    }

    private LinearGradient l() {
        long k4 = k();
        LinearGradient i4 = this.f38723t.i(k4);
        if (i4 != null) {
            return i4;
        }
        PointF h4 = this.f38729z.h();
        PointF h5 = this.A.h();
        com.airbnb.lottie.model.content.d h6 = this.f38728y.h();
        LinearGradient linearGradient = new LinearGradient(h4.x, h4.y, h5.x, h5.y, j(h6.a()), h6.b(), Shader.TileMode.CLAMP);
        this.f38723t.p(k4, linearGradient);
        return linearGradient;
    }

    private RadialGradient m() {
        long k4 = k();
        RadialGradient i4 = this.f38724u.i(k4);
        if (i4 != null) {
            return i4;
        }
        PointF h4 = this.f38729z.h();
        PointF h5 = this.A.h();
        com.airbnb.lottie.model.content.d h6 = this.f38728y.h();
        int[] j4 = j(h6.a());
        float[] b5 = h6.b();
        RadialGradient radialGradient = new RadialGradient(h4.x, h4.y, (float) Math.hypot(h5.x - r7, h5.y - r8), j4, b5, Shader.TileMode.CLAMP);
        this.f38724u.p(k4, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.L) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.B;
            if (qVar != null) {
                this.f38651f.G(qVar);
            }
            if (jVar == null) {
                this.B = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.B = qVar2;
            qVar2.a(this);
            this.f38651f.i(this.B);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38721r;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        if (this.f38722s) {
            return;
        }
        f(this.f38725v, matrix, false);
        Shader l4 = this.f38726w == com.airbnb.lottie.model.content.g.LINEAR ? l() : m();
        l4.setLocalMatrix(matrix);
        this.f38654i.setShader(l4);
        super.h(canvas, matrix, i4);
    }
}
