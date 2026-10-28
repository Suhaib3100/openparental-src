package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.renderer.c;
import java.util.List;

/* compiled from: CandleStickChartRenderer.java */
/* loaded from: classes5.dex */
public class e extends l {

    /* renamed from: i, reason: collision with root package name */
    protected e8.d f50525i;

    /* renamed from: j, reason: collision with root package name */
    private float[] f50526j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f50527k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f50528l;

    /* renamed from: m, reason: collision with root package name */
    private float[] f50529m;

    /* renamed from: n, reason: collision with root package name */
    private float[] f50530n;

    public e(e8.d dVar, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, lVar);
        this.f50526j = new float[8];
        this.f50527k = new float[4];
        this.f50528l = new float[4];
        this.f50529m = new float[4];
        this.f50530n = new float[4];
        this.f50525i = dVar;
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas) {
        for (T t4 : this.f50525i.z().q()) {
            if (t4.isVisible()) {
                o(canvas, t4);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        com.github.mikephil.charting.data.i z4 = this.f50525i.z();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            f8.h hVar = (f8.d) z4.k(dVar.d());
            if (hVar != null && hVar.k1()) {
                CandleEntry candleEntry = (CandleEntry) hVar.o0(dVar.h(), dVar.j());
                if (l(candleEntry, hVar)) {
                    com.github.mikephil.charting.utils.f f4 = this.f50525i.d(hVar.U()).f(candleEntry.j(), ((this.f50535b.i() * candleEntry.r()) + (this.f50535b.i() * candleEntry.t())) / 2.0f);
                    dVar.n((float) f4.f50632d, (float) f4.f50633e);
                    n(canvas, (float) f4.f50632d, (float) f4.f50633e, hVar);
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
        f8.d dVar;
        CandleEntry candleEntry;
        float f4;
        if (k(this.f50525i)) {
            List<T> q4 = this.f50525i.z().q();
            for (int i4 = 0; i4 < q4.size(); i4++) {
                f8.d dVar2 = (f8.d) q4.get(i4);
                if (m(dVar2) && dVar2.h1() >= 1) {
                    a(dVar2);
                    com.github.mikephil.charting.utils.i d5 = this.f50525i.d(dVar2.U());
                    this.f50516g.a(this.f50525i, dVar2);
                    float h4 = this.f50535b.h();
                    float i5 = this.f50535b.i();
                    c.a aVar = this.f50516g;
                    float[] b5 = d5.b(dVar2, h4, i5, aVar.f50517a, aVar.f50518b);
                    float e4 = com.github.mikephil.charting.utils.k.e(5.0f);
                    com.github.mikephil.charting.formatter.l u4 = dVar2.u();
                    com.github.mikephil.charting.utils.g d6 = com.github.mikephil.charting.utils.g.d(dVar2.i1());
                    d6.f50636d = com.github.mikephil.charting.utils.k.e(d6.f50636d);
                    d6.f50637e = com.github.mikephil.charting.utils.k.e(d6.f50637e);
                    int i6 = 0;
                    while (i6 < b5.length) {
                        float f5 = b5[i6];
                        float f6 = b5[i6 + 1];
                        if (!this.f50589a.J(f5)) {
                            break;
                        }
                        if (this.f50589a.I(f5) && this.f50589a.M(f6)) {
                            int i7 = i6 / 2;
                            CandleEntry candleEntry2 = (CandleEntry) dVar2.w(this.f50516g.f50517a + i7);
                            if (dVar2.S()) {
                                candleEntry = candleEntry2;
                                f4 = f6;
                                dVar = dVar2;
                                e(canvas, u4.g(candleEntry2), f5, f6 - e4, dVar2.E(i7));
                            } else {
                                candleEntry = candleEntry2;
                                f4 = f6;
                                dVar = dVar2;
                            }
                            if (candleEntry.b() != null && dVar.q0()) {
                                Drawable b6 = candleEntry.b();
                                com.github.mikephil.charting.utils.k.k(canvas, b6, (int) (f5 + d6.f50636d), (int) (f4 + d6.f50637e), b6.getIntrinsicWidth(), b6.getIntrinsicHeight());
                            }
                        } else {
                            dVar = dVar2;
                        }
                        i6 += 2;
                        dVar2 = dVar;
                    }
                    com.github.mikephil.charting.utils.g.h(d6);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void o(Canvas canvas, f8.d dVar) {
        com.github.mikephil.charting.utils.i d5 = this.f50525i.d(dVar.U());
        float i4 = this.f50535b.i();
        float A0 = dVar.A0();
        boolean X = dVar.X();
        this.f50516g.a(this.f50525i, dVar);
        this.f50536c.setStrokeWidth(dVar.m0());
        int i5 = this.f50516g.f50517a;
        while (true) {
            c.a aVar = this.f50516g;
            if (i5 > aVar.f50519c + aVar.f50517a) {
                return;
            }
            CandleEntry candleEntry = (CandleEntry) dVar.w(i5);
            if (candleEntry != null) {
                float j4 = candleEntry.j();
                float u4 = candleEntry.u();
                float p4 = candleEntry.p();
                float r4 = candleEntry.r();
                float t4 = candleEntry.t();
                if (X) {
                    float[] fArr = this.f50526j;
                    fArr[0] = j4;
                    fArr[2] = j4;
                    fArr[4] = j4;
                    fArr[6] = j4;
                    if (u4 > p4) {
                        fArr[1] = r4 * i4;
                        fArr[3] = u4 * i4;
                        fArr[5] = t4 * i4;
                        fArr[7] = p4 * i4;
                    } else if (u4 < p4) {
                        fArr[1] = r4 * i4;
                        fArr[3] = p4 * i4;
                        fArr[5] = t4 * i4;
                        fArr[7] = u4 * i4;
                    } else {
                        fArr[1] = r4 * i4;
                        float f4 = u4 * i4;
                        fArr[3] = f4;
                        fArr[5] = t4 * i4;
                        fArr[7] = f4;
                    }
                    d5.o(fArr);
                    if (!dVar.G()) {
                        this.f50536c.setColor(dVar.a1() == 1122867 ? dVar.G0(i5) : dVar.a1());
                    } else if (u4 > p4) {
                        this.f50536c.setColor(dVar.q1() == 1122867 ? dVar.G0(i5) : dVar.q1());
                    } else if (u4 < p4) {
                        this.f50536c.setColor(dVar.T() == 1122867 ? dVar.G0(i5) : dVar.T());
                    } else {
                        this.f50536c.setColor(dVar.c0() == 1122867 ? dVar.G0(i5) : dVar.c0());
                    }
                    this.f50536c.setStyle(Paint.Style.STROKE);
                    canvas.drawLines(this.f50526j, this.f50536c);
                    float[] fArr2 = this.f50527k;
                    fArr2[0] = (j4 - 0.5f) + A0;
                    fArr2[1] = p4 * i4;
                    fArr2[2] = (j4 + 0.5f) - A0;
                    fArr2[3] = u4 * i4;
                    d5.o(fArr2);
                    if (u4 > p4) {
                        if (dVar.q1() == 1122867) {
                            this.f50536c.setColor(dVar.G0(i5));
                        } else {
                            this.f50536c.setColor(dVar.q1());
                        }
                        this.f50536c.setStyle(dVar.y0());
                        float[] fArr3 = this.f50527k;
                        canvas.drawRect(fArr3[0], fArr3[3], fArr3[2], fArr3[1], this.f50536c);
                    } else if (u4 < p4) {
                        if (dVar.T() == 1122867) {
                            this.f50536c.setColor(dVar.G0(i5));
                        } else {
                            this.f50536c.setColor(dVar.T());
                        }
                        this.f50536c.setStyle(dVar.J0());
                        float[] fArr4 = this.f50527k;
                        canvas.drawRect(fArr4[0], fArr4[1], fArr4[2], fArr4[3], this.f50536c);
                    } else {
                        if (dVar.c0() == 1122867) {
                            this.f50536c.setColor(dVar.G0(i5));
                        } else {
                            this.f50536c.setColor(dVar.c0());
                        }
                        float[] fArr5 = this.f50527k;
                        canvas.drawLine(fArr5[0], fArr5[1], fArr5[2], fArr5[3], this.f50536c);
                    }
                } else {
                    float[] fArr6 = this.f50528l;
                    fArr6[0] = j4;
                    fArr6[1] = r4 * i4;
                    fArr6[2] = j4;
                    fArr6[3] = t4 * i4;
                    float[] fArr7 = this.f50529m;
                    fArr7[0] = (j4 - 0.5f) + A0;
                    float f5 = u4 * i4;
                    fArr7[1] = f5;
                    fArr7[2] = j4;
                    fArr7[3] = f5;
                    float[] fArr8 = this.f50530n;
                    fArr8[0] = (0.5f + j4) - A0;
                    float f6 = p4 * i4;
                    fArr8[1] = f6;
                    fArr8[2] = j4;
                    fArr8[3] = f6;
                    d5.o(fArr6);
                    d5.o(this.f50529m);
                    d5.o(this.f50530n);
                    this.f50536c.setColor(u4 > p4 ? dVar.q1() == 1122867 ? dVar.G0(i5) : dVar.q1() : u4 < p4 ? dVar.T() == 1122867 ? dVar.G0(i5) : dVar.T() : dVar.c0() == 1122867 ? dVar.G0(i5) : dVar.c0());
                    float[] fArr9 = this.f50528l;
                    canvas.drawLine(fArr9[0], fArr9[1], fArr9[2], fArr9[3], this.f50536c);
                    float[] fArr10 = this.f50529m;
                    canvas.drawLine(fArr10[0], fArr10[1], fArr10[2], fArr10[3], this.f50536c);
                    float[] fArr11 = this.f50530n;
                    canvas.drawLine(fArr11[0], fArr11[1], fArr11[2], fArr11[3], this.f50536c);
                }
            }
            i5++;
        }
    }
}
