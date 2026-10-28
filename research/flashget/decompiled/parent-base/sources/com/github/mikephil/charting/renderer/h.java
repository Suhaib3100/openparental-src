package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

/* compiled from: HorizontalBarChartRenderer.java */
/* loaded from: classes5.dex */
public class h extends b {

    /* renamed from: n, reason: collision with root package name */
    private RectF f50540n;

    public h(e8.a aVar, com.github.mikephil.charting.animation.a aVar2, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, aVar2, lVar);
        this.f50540n = new RectF();
        this.f50539f.setTextAlign(Paint.Align.LEFT);
    }

    @Override // com.github.mikephil.charting.renderer.b, com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas, String str, float f4, float f5, int i4) {
        this.f50539f.setColor(i4);
        canvas.drawText(str, f4, f5, this.f50539f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.b, com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas) {
        List list;
        int i4;
        com.github.mikephil.charting.utils.g gVar;
        int i5;
        float f4;
        float[] fArr;
        float f5;
        int i6;
        float[] fArr2;
        float f6;
        float f7;
        BarEntry barEntry;
        int i7;
        List list2;
        int i10;
        float f10;
        com.github.mikephil.charting.utils.g gVar2;
        com.github.mikephil.charting.buffer.b bVar;
        com.github.mikephil.charting.formatter.l lVar;
        if (k(this.f50510h)) {
            List q4 = this.f50510h.v().q();
            float e4 = com.github.mikephil.charting.utils.k.e(5.0f);
            boolean h4 = this.f50510h.h();
            int i11 = 0;
            while (i11 < this.f50510h.v().m()) {
                f8.a aVar = (f8.a) q4.get(i11);
                if (m(aVar)) {
                    boolean n4 = this.f50510h.n(aVar.U());
                    a(aVar);
                    float f11 = 2.0f;
                    float a5 = com.github.mikephil.charting.utils.k.a(this.f50539f, ProtectedSandApp.s("쑏")) / 2.0f;
                    com.github.mikephil.charting.formatter.l u4 = aVar.u();
                    com.github.mikephil.charting.buffer.b bVar2 = this.f50512j[i11];
                    float i12 = this.f50535b.i();
                    com.github.mikephil.charting.utils.g d5 = com.github.mikephil.charting.utils.g.d(aVar.i1());
                    d5.f50636d = com.github.mikephil.charting.utils.k.e(d5.f50636d);
                    d5.f50637e = com.github.mikephil.charting.utils.k.e(d5.f50637e);
                    if (aVar.d1()) {
                        list = q4;
                        i4 = i11;
                        gVar = d5;
                        com.github.mikephil.charting.utils.i d6 = this.f50510h.d(aVar.U());
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < this.f50535b.h() * aVar.h1()) {
                            BarEntry barEntry2 = (BarEntry) aVar.w(i13);
                            int E = aVar.E(i13);
                            float[] y4 = barEntry2.y();
                            if (y4 == null) {
                                int i15 = i14 + 1;
                                if (!this.f50589a.K(bVar2.f50197b[i15])) {
                                    break;
                                }
                                if (this.f50589a.L(bVar2.f50197b[i14]) && this.f50589a.H(bVar2.f50197b[i15])) {
                                    String d7 = u4.d(barEntry2);
                                    float measureText = (int) this.f50539f.measureText(d7);
                                    float f12 = h4 ? e4 : -(measureText + e4);
                                    float f13 = h4 ? -(measureText + e4) : e4;
                                    if (n4) {
                                        f12 = (-f12) - measureText;
                                        f13 = (-f13) - measureText;
                                    }
                                    float f14 = f12;
                                    float f15 = f13;
                                    if (aVar.S()) {
                                        float f16 = bVar2.f50197b[i14 + 2] + (barEntry2.c() >= 0.0f ? f14 : f15);
                                        float f17 = bVar2.f50197b[i15] + a5;
                                        f4 = a5;
                                        fArr = y4;
                                        barEntry = barEntry2;
                                        i5 = i13;
                                        e(canvas, d7, f16, f17, E);
                                    } else {
                                        i5 = i13;
                                        f4 = a5;
                                        fArr = y4;
                                        barEntry = barEntry2;
                                    }
                                    if (barEntry.b() != null && aVar.q0()) {
                                        Drawable b5 = barEntry.b();
                                        float f18 = bVar2.f50197b[i14 + 2];
                                        if (barEntry.c() < 0.0f) {
                                            f14 = f15;
                                        }
                                        com.github.mikephil.charting.utils.k.k(canvas, b5, (int) (f18 + f14 + gVar.f50636d), (int) (bVar2.f50197b[i15] + gVar.f50637e), b5.getIntrinsicWidth(), b5.getIntrinsicHeight());
                                    }
                                }
                            } else {
                                i5 = i13;
                                f4 = a5;
                                fArr = y4;
                                int length = fArr.length * 2;
                                float[] fArr3 = new float[length];
                                float f19 = -barEntry2.u();
                                float f20 = 0.0f;
                                int i16 = 0;
                                int i17 = 0;
                                while (i16 < length) {
                                    float f21 = fArr[i17];
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
                                    fArr3[i16] = f19 * i12;
                                    i16 += 2;
                                    i17++;
                                    f19 = f7;
                                }
                                d6.o(fArr3);
                                int i18 = 0;
                                while (i18 < length) {
                                    float f23 = fArr[i18 / 2];
                                    String e5 = u4.e(f23, barEntry2);
                                    float measureText2 = (int) this.f50539f.measureText(e5);
                                    float f24 = h4 ? e4 : -(measureText2 + e4);
                                    int i19 = length;
                                    float f25 = h4 ? -(measureText2 + e4) : e4;
                                    if (n4) {
                                        f24 = (-f24) - measureText2;
                                        f25 = (-f25) - measureText2;
                                    }
                                    boolean z4 = (f23 == 0.0f && f19 == 0.0f && f20 > 0.0f) || f23 < 0.0f;
                                    float f26 = fArr3[i18];
                                    if (z4) {
                                        f24 = f25;
                                    }
                                    float f27 = f26 + f24;
                                    float[] fArr4 = bVar2.f50197b;
                                    float f28 = (fArr4[i14 + 1] + fArr4[i14 + 3]) / 2.0f;
                                    if (!this.f50589a.K(f28)) {
                                        break;
                                    }
                                    if (this.f50589a.L(f27) && this.f50589a.H(f28)) {
                                        if (aVar.S()) {
                                            f5 = f28;
                                            i6 = i18;
                                            fArr2 = fArr3;
                                            f6 = f27;
                                            e(canvas, e5, f27, f28 + f4, E);
                                        } else {
                                            f5 = f28;
                                            i6 = i18;
                                            fArr2 = fArr3;
                                            f6 = f27;
                                        }
                                        if (barEntry2.b() != null && aVar.q0()) {
                                            Drawable b6 = barEntry2.b();
                                            com.github.mikephil.charting.utils.k.k(canvas, b6, (int) (f6 + gVar.f50636d), (int) (f5 + gVar.f50637e), b6.getIntrinsicWidth(), b6.getIntrinsicHeight());
                                        }
                                    } else {
                                        i6 = i18;
                                        fArr2 = fArr3;
                                    }
                                    i18 = i6 + 2;
                                    length = i19;
                                    fArr3 = fArr2;
                                }
                            }
                            i14 = fArr == null ? i14 + 4 : (fArr.length * 4) + i14;
                            i13 = i5 + 1;
                            a5 = f4;
                        }
                    } else {
                        int i20 = 0;
                        while (i20 < this.f50535b.h() * bVar2.f50197b.length) {
                            float[] fArr5 = bVar2.f50197b;
                            int i21 = i20 + 1;
                            float f29 = fArr5[i21];
                            float f30 = (fArr5[i20 + 3] + f29) / f11;
                            if (!this.f50589a.K(f29)) {
                                break;
                            }
                            if (this.f50589a.L(bVar2.f50197b[i20]) && this.f50589a.H(bVar2.f50197b[i21])) {
                                BarEntry barEntry3 = (BarEntry) aVar.w(i20 / 4);
                                float c5 = barEntry3.c();
                                String d10 = u4.d(barEntry3);
                                float measureText3 = (int) this.f50539f.measureText(d10);
                                float f31 = h4 ? e4 : -(measureText3 + e4);
                                float f32 = h4 ? -(measureText3 + e4) : e4;
                                if (n4) {
                                    f31 = (-f31) - measureText3;
                                    f32 = (-f32) - measureText3;
                                }
                                float f33 = f31;
                                float f34 = f32;
                                if (aVar.S()) {
                                    float f35 = bVar2.f50197b[i20 + 2];
                                    float f36 = c5 >= 0.0f ? f33 : f34;
                                    i7 = i20;
                                    list2 = q4;
                                    gVar2 = d5;
                                    f10 = f34;
                                    bVar = bVar2;
                                    i10 = i11;
                                    lVar = u4;
                                    e(canvas, d10, f35 + f36, f30 + a5, aVar.E(i20 / 2));
                                } else {
                                    i7 = i20;
                                    list2 = q4;
                                    i10 = i11;
                                    f10 = f34;
                                    gVar2 = d5;
                                    bVar = bVar2;
                                    lVar = u4;
                                }
                                if (barEntry3.b() != null && aVar.q0()) {
                                    Drawable b7 = barEntry3.b();
                                    float f37 = bVar.f50197b[i7 + 2];
                                    if (c5 < 0.0f) {
                                        f33 = f10;
                                    }
                                    com.github.mikephil.charting.utils.k.k(canvas, b7, (int) (f37 + f33 + gVar2.f50636d), (int) (f30 + gVar2.f50637e), b7.getIntrinsicWidth(), b7.getIntrinsicHeight());
                                }
                            } else {
                                i7 = i20;
                                bVar = bVar2;
                                list2 = q4;
                                i10 = i11;
                                gVar2 = d5;
                                lVar = u4;
                            }
                            i20 = i7 + 4;
                            d5 = gVar2;
                            u4 = lVar;
                            bVar2 = bVar;
                            q4 = list2;
                            i11 = i10;
                            f11 = 2.0f;
                        }
                        list = q4;
                        i4 = i11;
                        gVar = d5;
                    }
                    com.github.mikephil.charting.utils.g.h(gVar);
                } else {
                    list = q4;
                    i4 = i11;
                }
                i11 = i4 + 1;
                q4 = list;
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.b, com.github.mikephil.charting.renderer.g
    public void j() {
        com.github.mikephil.charting.data.a v4 = this.f50510h.v();
        this.f50512j = new com.github.mikephil.charting.buffer.c[v4.m()];
        for (int i4 = 0; i4 < this.f50512j.length; i4++) {
            f8.a aVar = (f8.a) v4.k(i4);
            this.f50512j[i4] = new com.github.mikephil.charting.buffer.c(aVar.h1() * 4 * (aVar.d1() ? aVar.J() : 1), v4.m(), aVar.d1());
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    protected boolean k(e8.e eVar) {
        return ((float) eVar.b().r()) < this.f50589a.x() * ((float) eVar.m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.b
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
                RectF rectF = this.f50540n;
                rectF.top = j4 - Q;
                rectF.bottom = j4 + Q;
                d5.t(rectF);
                if (this.f50589a.K(this.f50540n.bottom)) {
                    if (!this.f50589a.H(this.f50540n.top)) {
                        break;
                    }
                    this.f50540n.left = this.f50589a.h();
                    this.f50540n.right = this.f50589a.i();
                    canvas.drawRect(this.f50540n, this.f50513k);
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
            int i10 = i7 + 3;
            if (!this.f50589a.K(bVar.f50197b[i10])) {
                return;
            }
            int i11 = i7 + 1;
            if (this.f50589a.H(bVar.f50197b[i11])) {
                if (!z5) {
                    this.f50536c.setColor(aVar.G0(i7 / 4));
                }
                float[] fArr = bVar.f50197b;
                int i12 = i7 + 2;
                canvas.drawRect(fArr[i7], fArr[i11], fArr[i12], fArr[i10], this.f50536c);
                if (z4) {
                    float[] fArr2 = bVar.f50197b;
                    canvas.drawRect(fArr2[i7], fArr2[i11], fArr2[i12], fArr2[i10], this.f50514l);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.b
    protected void o(float f4, float f5, float f6, float f7, com.github.mikephil.charting.utils.i iVar) {
        this.f50511i.set(f5, f4 - f7, f6, f4 + f7);
        iVar.s(this.f50511i, this.f50535b.i());
    }

    @Override // com.github.mikephil.charting.renderer.b
    protected void p(com.github.mikephil.charting.highlight.d dVar, RectF rectF) {
        dVar.n(rectF.centerY(), rectF.right);
    }
}
