package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* compiled from: BarChartRenderer.java */
/* loaded from: classes5.dex */
public class b extends c {

    /* renamed from: h, reason: collision with root package name */
    protected e8.a f50510h;

    /* renamed from: i, reason: collision with root package name */
    protected RectF f50511i;

    /* renamed from: j, reason: collision with root package name */
    protected com.github.mikephil.charting.buffer.b[] f50512j;

    /* renamed from: k, reason: collision with root package name */
    protected Paint f50513k;

    /* renamed from: l, reason: collision with root package name */
    protected Paint f50514l;

    /* renamed from: m, reason: collision with root package name */
    private RectF f50515m;

    public b(e8.a aVar, com.github.mikephil.charting.animation.a aVar2, com.github.mikephil.charting.utils.l lVar) {
        super(aVar2, lVar);
        this.f50511i = new RectF();
        this.f50515m = new RectF();
        this.f50510h = aVar;
        Paint paint = new Paint(1);
        this.f50537d = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f50537d.setColor(Color.rgb(0, 0, 0));
        this.f50537d.setAlpha(120);
        Paint paint2 = new Paint(1);
        this.f50513k = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.f50514l = paint3;
        paint3.setStyle(Paint.Style.STROKE);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas) {
        com.github.mikephil.charting.data.a v4 = this.f50510h.v();
        for (int i4 = 0; i4 < v4.m(); i4++) {
            f8.a aVar = (f8.a) v4.k(i4);
            if (aVar.isVisible()) {
                n(canvas, aVar, i4);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        float c5;
        float f4;
        float f5;
        float f6;
        com.github.mikephil.charting.data.a v4 = this.f50510h.v();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            f8.a aVar = (f8.a) v4.k(dVar.d());
            if (aVar != null && aVar.k1()) {
                BarEntry barEntry = (BarEntry) aVar.o0(dVar.h(), dVar.j());
                if (l(barEntry, aVar)) {
                    com.github.mikephil.charting.utils.i d5 = this.f50510h.d(aVar.U());
                    this.f50537d.setColor(aVar.f1());
                    this.f50537d.setAlpha(aVar.Y0());
                    if (dVar.g() < 0 || !barEntry.z()) {
                        c5 = barEntry.c();
                        f4 = 0.0f;
                    } else if (this.f50510h.i()) {
                        c5 = barEntry.v();
                        f4 = -barEntry.u();
                    } else {
                        com.github.mikephil.charting.highlight.j jVar = barEntry.w()[dVar.g()];
                        f6 = jVar.f50444a;
                        f5 = jVar.f50445b;
                        o(barEntry.j(), f6, f5, v4.Q() / 2.0f, d5);
                        p(dVar, this.f50511i);
                        canvas.drawRect(this.f50511i, this.f50537d);
                    }
                    f5 = f4;
                    f6 = c5;
                    o(barEntry.j(), f6, f5, v4.Q() / 2.0f, d5);
                    p(dVar, this.f50511i);
                    canvas.drawRect(this.f50511i, this.f50537d);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas, String str, float f4, float f5, int i4) {
        this.f50539f.setColor(i4);
        canvas.drawText(str, f4, f5, this.f50539f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas) {
        List list;
        com.github.mikephil.charting.utils.g gVar;
        int i4;
        float f4;
        boolean z4;
        float[] fArr;
        com.github.mikephil.charting.utils.i iVar;
        int i5;
        float f5;
        int i6;
        BarEntry barEntry;
        float[] fArr2;
        float f6;
        float f7;
        float f10;
        BarEntry barEntry2;
        float f11;
        boolean z5;
        int i7;
        com.github.mikephil.charting.formatter.l lVar;
        List list2;
        com.github.mikephil.charting.utils.g gVar2;
        BarEntry barEntry3;
        float f12;
        if (k(this.f50510h)) {
            List q4 = this.f50510h.v().q();
            float e4 = com.github.mikephil.charting.utils.k.e(4.5f);
            boolean h4 = this.f50510h.h();
            int i10 = 0;
            while (i10 < this.f50510h.v().m()) {
                f8.a aVar = (f8.a) q4.get(i10);
                if (m(aVar)) {
                    a(aVar);
                    boolean n4 = this.f50510h.n(aVar.U());
                    float a5 = com.github.mikephil.charting.utils.k.a(this.f50539f, ProtectedSandApp.s("쑍"));
                    float f13 = h4 ? -e4 : a5 + e4;
                    float f14 = h4 ? a5 + e4 : -e4;
                    if (n4) {
                        f13 = (-f13) - a5;
                        f14 = (-f14) - a5;
                    }
                    float f15 = f13;
                    float f16 = f14;
                    com.github.mikephil.charting.buffer.b bVar = this.f50512j[i10];
                    float i11 = this.f50535b.i();
                    com.github.mikephil.charting.formatter.l u4 = aVar.u();
                    com.github.mikephil.charting.utils.g d5 = com.github.mikephil.charting.utils.g.d(aVar.i1());
                    d5.f50636d = com.github.mikephil.charting.utils.k.e(d5.f50636d);
                    d5.f50637e = com.github.mikephil.charting.utils.k.e(d5.f50637e);
                    if (aVar.d1()) {
                        list = q4;
                        gVar = d5;
                        com.github.mikephil.charting.utils.i d6 = this.f50510h.d(aVar.U());
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < this.f50535b.h() * aVar.h1()) {
                            BarEntry barEntry4 = (BarEntry) aVar.w(i12);
                            float[] y4 = barEntry4.y();
                            float[] fArr3 = bVar.f50197b;
                            float f17 = (fArr3[i13] + fArr3[i13 + 2]) / 2.0f;
                            int E = aVar.E(i12);
                            if (y4 != null) {
                                BarEntry barEntry5 = barEntry4;
                                i4 = i12;
                                f4 = e4;
                                z4 = h4;
                                fArr = y4;
                                iVar = d6;
                                float f18 = f17;
                                int length = fArr.length * 2;
                                float[] fArr4 = new float[length];
                                float f19 = -barEntry5.u();
                                float f20 = 0.0f;
                                int i14 = 0;
                                int i15 = 0;
                                while (i14 < length) {
                                    float f21 = fArr[i15];
                                    if (f21 == 0.0f && (f20 == 0.0f || f19 == 0.0f)) {
                                        float f22 = f19;
                                        f19 = f21;
                                        f7 = f22;
                                    } else if (f21 >= 0.0f) {
                                        f20 += f21;
                                        f7 = f19;
                                        f19 = f20;
                                    } else {
                                        f7 = f19 - f21;
                                    }
                                    fArr4[i14 + 1] = f19 * i11;
                                    i14 += 2;
                                    i15++;
                                    f19 = f7;
                                }
                                iVar.o(fArr4);
                                int i16 = 0;
                                while (i16 < length) {
                                    float f23 = fArr[i16 / 2];
                                    float f24 = fArr4[i16 + 1] + (((f23 > 0.0f ? 1 : (f23 == 0.0f ? 0 : -1)) == 0 && (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1)) == 0 && (f20 > 0.0f ? 1 : (f20 == 0.0f ? 0 : -1)) > 0) || (f23 > 0.0f ? 1 : (f23 == 0.0f ? 0 : -1)) < 0 ? f16 : f15);
                                    int i17 = i16;
                                    if (!this.f50589a.J(f18)) {
                                        break;
                                    }
                                    if (this.f50589a.M(f24) && this.f50589a.I(f18)) {
                                        if (aVar.S()) {
                                            BarEntry barEntry6 = barEntry5;
                                            f6 = f24;
                                            i6 = i17;
                                            barEntry = barEntry6;
                                            fArr2 = fArr4;
                                            i5 = length;
                                            f5 = f18;
                                            e(canvas, u4.e(f23, barEntry6), f18, f6, E);
                                        } else {
                                            f6 = f24;
                                            i5 = length;
                                            f5 = f18;
                                            i6 = i17;
                                            barEntry = barEntry5;
                                            fArr2 = fArr4;
                                        }
                                        if (barEntry.b() != null && aVar.q0()) {
                                            Drawable b5 = barEntry.b();
                                            com.github.mikephil.charting.utils.k.k(canvas, b5, (int) (f5 + gVar.f50636d), (int) (f6 + gVar.f50637e), b5.getIntrinsicWidth(), b5.getIntrinsicHeight());
                                        }
                                    } else {
                                        i5 = length;
                                        f5 = f18;
                                        i6 = i17;
                                        barEntry = barEntry5;
                                        fArr2 = fArr4;
                                    }
                                    i16 = i6 + 2;
                                    fArr4 = fArr2;
                                    barEntry5 = barEntry;
                                    length = i5;
                                    f18 = f5;
                                }
                            } else {
                                if (!this.f50589a.J(f17)) {
                                    break;
                                }
                                int i18 = i13 + 1;
                                if (this.f50589a.M(bVar.f50197b[i18]) && this.f50589a.I(f17)) {
                                    if (aVar.S()) {
                                        f10 = f17;
                                        f4 = e4;
                                        fArr = y4;
                                        barEntry2 = barEntry4;
                                        i4 = i12;
                                        z4 = h4;
                                        iVar = d6;
                                        e(canvas, u4.d(barEntry4), f10, bVar.f50197b[i18] + (barEntry4.c() >= 0.0f ? f15 : f16), E);
                                    } else {
                                        f10 = f17;
                                        i4 = i12;
                                        f4 = e4;
                                        z4 = h4;
                                        fArr = y4;
                                        barEntry2 = barEntry4;
                                        iVar = d6;
                                    }
                                    if (barEntry2.b() != null && aVar.q0()) {
                                        Drawable b6 = barEntry2.b();
                                        com.github.mikephil.charting.utils.k.k(canvas, b6, (int) (gVar.f50636d + f10), (int) (bVar.f50197b[i18] + (barEntry2.c() >= 0.0f ? f15 : f16) + gVar.f50637e), b6.getIntrinsicWidth(), b6.getIntrinsicHeight());
                                    }
                                } else {
                                    d6 = d6;
                                    h4 = h4;
                                    e4 = e4;
                                    i12 = i12;
                                }
                            }
                            i13 = fArr == null ? i13 + 4 : (fArr.length * 4) + i13;
                            i12 = i4 + 1;
                            d6 = iVar;
                            h4 = z4;
                            e4 = f4;
                        }
                    } else {
                        int i19 = 0;
                        while (i19 < this.f50535b.h() * bVar.f50197b.length) {
                            float[] fArr5 = bVar.f50197b;
                            float f25 = (fArr5[i19] + fArr5[i19 + 2]) / 2.0f;
                            if (!this.f50589a.J(f25)) {
                                break;
                            }
                            int i20 = i19 + 1;
                            if (this.f50589a.M(bVar.f50197b[i20]) && this.f50589a.I(f25)) {
                                int i21 = i19 / 4;
                                BarEntry barEntry7 = (BarEntry) aVar.w(i21);
                                float c5 = barEntry7.c();
                                if (aVar.S()) {
                                    String d7 = u4.d(barEntry7);
                                    float[] fArr6 = bVar.f50197b;
                                    barEntry3 = barEntry7;
                                    f12 = f25;
                                    i7 = i19;
                                    list2 = q4;
                                    gVar2 = d5;
                                    float f26 = c5 >= 0.0f ? fArr6[i20] + f15 : fArr6[i19 + 3] + f16;
                                    lVar = u4;
                                    e(canvas, d7, f12, f26, aVar.E(i21));
                                } else {
                                    barEntry3 = barEntry7;
                                    f12 = f25;
                                    i7 = i19;
                                    lVar = u4;
                                    list2 = q4;
                                    gVar2 = d5;
                                }
                                if (barEntry3.b() != null && aVar.q0()) {
                                    Drawable b7 = barEntry3.b();
                                    com.github.mikephil.charting.utils.k.k(canvas, b7, (int) (f12 + gVar2.f50636d), (int) ((c5 >= 0.0f ? bVar.f50197b[i20] + f15 : bVar.f50197b[i7 + 3] + f16) + gVar2.f50637e), b7.getIntrinsicWidth(), b7.getIntrinsicHeight());
                                }
                            } else {
                                i7 = i19;
                                lVar = u4;
                                list2 = q4;
                                gVar2 = d5;
                            }
                            i19 = i7 + 4;
                            d5 = gVar2;
                            u4 = lVar;
                            q4 = list2;
                        }
                        list = q4;
                        gVar = d5;
                    }
                    f11 = e4;
                    z5 = h4;
                    com.github.mikephil.charting.utils.g.h(gVar);
                } else {
                    list = q4;
                    f11 = e4;
                    z5 = h4;
                }
                i10++;
                h4 = z5;
                q4 = list;
                e4 = f11;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void j() {
        com.github.mikephil.charting.data.a v4 = this.f50510h.v();
        this.f50512j = new com.github.mikephil.charting.buffer.b[v4.m()];
        for (int i4 = 0; i4 < this.f50512j.length; i4++) {
            f8.a aVar = (f8.a) v4.k(i4);
            this.f50512j[i4] = new com.github.mikephil.charting.buffer.b(aVar.h1() * 4 * (aVar.d1() ? aVar.J() : 1), v4.m(), aVar.d1());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void n(Canvas canvas, f8.a aVar, int i4) {
        com.github.mikephil.charting.utils.i d5 = this.f50510h.d(aVar.U());
        this.f50514l.setColor(aVar.j());
        this.f50514l.setStrokeWidth(com.github.mikephil.charting.utils.k.e(aVar.s0()));
        boolean z4 = aVar.s0() > 0.0f;
        float h4 = this.f50535b.h();
        float i5 = this.f50535b.i();
        if (this.f50510h.t()) {
            this.f50513k.setColor(aVar.K0());
            float Q = this.f50510h.v().Q() / 2.0f;
            int min = Math.min((int) Math.ceil(aVar.h1() * h4), aVar.h1());
            for (int i6 = 0; i6 < min; i6++) {
                float j4 = ((BarEntry) aVar.w(i6)).j();
                RectF rectF = this.f50515m;
                rectF.left = j4 - Q;
                rectF.right = j4 + Q;
                d5.t(rectF);
                if (this.f50589a.I(this.f50515m.right)) {
                    if (!this.f50589a.J(this.f50515m.left)) {
                        break;
                    }
                    this.f50515m.top = this.f50589a.j();
                    this.f50515m.bottom = this.f50589a.f();
                    canvas.drawRect(this.f50515m, this.f50513k);
                }
            }
        }
        com.github.mikephil.charting.buffer.b bVar = this.f50512j[i4];
        bVar.e(h4, i5);
        bVar.j(i4);
        bVar.k(this.f50510h.n(aVar.U()));
        bVar.i(this.f50510h.v().Q());
        bVar.a(aVar);
        d5.o(bVar.f50197b);
        boolean z5 = aVar.I().size() == 1;
        if (z5) {
            this.f50536c.setColor(aVar.Y());
        }
        for (int i7 = 0; i7 < bVar.f(); i7 += 4) {
            int i10 = i7 + 2;
            if (this.f50589a.I(bVar.f50197b[i10])) {
                if (!this.f50589a.J(bVar.f50197b[i7])) {
                    return;
                }
                if (!z5) {
                    this.f50536c.setColor(aVar.G0(i7 / 4));
                }
                if (aVar.v0() != null) {
                    h8.a v02 = aVar.v0();
                    Paint paint = this.f50536c;
                    float[] fArr = bVar.f50197b;
                    float f4 = fArr[i7];
                    paint.setShader(new LinearGradient(f4, fArr[i7 + 3], f4, fArr[i7 + 1], v02.b(), v02.a(), Shader.TileMode.MIRROR));
                }
                if (aVar.P() != null) {
                    Paint paint2 = this.f50536c;
                    float[] fArr2 = bVar.f50197b;
                    float f5 = fArr2[i7];
                    float f6 = fArr2[i7 + 3];
                    float f7 = fArr2[i7 + 1];
                    int i11 = i7 / 4;
                    paint2.setShader(new LinearGradient(f5, f6, f5, f7, aVar.n1(i11).b(), aVar.n1(i11).a(), Shader.TileMode.MIRROR));
                }
                float[] fArr3 = bVar.f50197b;
                int i12 = i7 + 1;
                int i13 = i7 + 3;
                canvas.drawRect(fArr3[i7], fArr3[i12], fArr3[i10], fArr3[i13], this.f50536c);
                if (z4) {
                    float[] fArr4 = bVar.f50197b;
                    canvas.drawRect(fArr4[i7], fArr4[i12], fArr4[i10], fArr4[i13], this.f50514l);
                }
            }
        }
    }

    protected void o(float f4, float f5, float f6, float f7, com.github.mikephil.charting.utils.i iVar) {
        this.f50511i.set(f4 - f7, f5, f4 + f7, f6);
        iVar.r(this.f50511i, this.f50535b.i());
    }

    protected void p(com.github.mikephil.charting.highlight.d dVar, RectF rectF) {
        dVar.n(rectF.centerX(), rectF.top);
    }
}
