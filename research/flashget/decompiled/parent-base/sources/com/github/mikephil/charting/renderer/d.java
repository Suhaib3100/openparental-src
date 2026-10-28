package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.renderer.c;
import java.util.List;

/* compiled from: BubbleChartRenderer.java */
/* loaded from: classes5.dex */
public class d extends c {

    /* renamed from: h, reason: collision with root package name */
    protected e8.c f50521h;

    /* renamed from: i, reason: collision with root package name */
    private float[] f50522i;

    /* renamed from: j, reason: collision with root package name */
    private float[] f50523j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f50524k;

    public d(e8.c cVar, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, lVar);
        this.f50522i = new float[4];
        this.f50523j = new float[2];
        this.f50524k = new float[3];
        this.f50521h = cVar;
        this.f50536c.setStyle(Paint.Style.FILL);
        this.f50537d.setStyle(Paint.Style.STROKE);
        this.f50537d.setStrokeWidth(com.github.mikephil.charting.utils.k.e(1.5f));
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas) {
        for (T t4 : this.f50521h.c().q()) {
            if (t4.isVisible()) {
                n(canvas, t4);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        com.github.mikephil.charting.data.g c5 = this.f50521h.c();
        float i4 = this.f50535b.i();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            f8.c cVar = (f8.c) c5.k(dVar.d());
            if (cVar != null && cVar.k1()) {
                BubbleEntry bubbleEntry = (BubbleEntry) cVar.o0(dVar.h(), dVar.j());
                if (bubbleEntry.c() == dVar.j() && l(bubbleEntry, cVar)) {
                    com.github.mikephil.charting.utils.i d5 = this.f50521h.d(cVar.U());
                    float[] fArr = this.f50522i;
                    fArr[0] = 0.0f;
                    fArr[2] = 1.0f;
                    d5.o(fArr);
                    boolean d02 = cVar.d0();
                    float[] fArr2 = this.f50522i;
                    float min = Math.min(Math.abs(this.f50589a.f() - this.f50589a.j()), Math.abs(fArr2[2] - fArr2[0]));
                    this.f50523j[0] = bubbleEntry.j();
                    this.f50523j[1] = bubbleEntry.c() * i4;
                    d5.o(this.f50523j);
                    float[] fArr3 = this.f50523j;
                    dVar.n(fArr3[0], fArr3[1]);
                    float o4 = o(bubbleEntry.o(), cVar.a(), min, d02) / 2.0f;
                    if (this.f50589a.K(this.f50523j[1] + o4) && this.f50589a.H(this.f50523j[1] - o4) && this.f50589a.I(this.f50523j[0] + o4)) {
                        if (!this.f50589a.J(this.f50523j[0] - o4)) {
                            return;
                        }
                        int G0 = cVar.G0((int) bubbleEntry.j());
                        Color.RGBToHSV(Color.red(G0), Color.green(G0), Color.blue(G0), this.f50524k);
                        float[] fArr4 = this.f50524k;
                        fArr4[2] = fArr4[2] * 0.5f;
                        this.f50537d.setColor(Color.HSVToColor(Color.alpha(G0), this.f50524k));
                        this.f50537d.setStrokeWidth(cVar.R());
                        float[] fArr5 = this.f50523j;
                        canvas.drawCircle(fArr5[0], fArr5[1], o4, this.f50537d);
                    }
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
        int i4;
        BubbleEntry bubbleEntry;
        float f4;
        float f5;
        com.github.mikephil.charting.data.g c5 = this.f50521h.c();
        if (c5 != null && k(this.f50521h)) {
            List<T> q4 = c5.q();
            float a5 = com.github.mikephil.charting.utils.k.a(this.f50539f, ProtectedSandApp.s("쑎"));
            for (int i5 = 0; i5 < q4.size(); i5++) {
                f8.c cVar = (f8.c) q4.get(i5);
                if (m(cVar) && cVar.h1() >= 1) {
                    a(cVar);
                    float max = Math.max(0.0f, Math.min(1.0f, this.f50535b.h()));
                    float i6 = this.f50535b.i();
                    this.f50516g.a(this.f50521h, cVar);
                    com.github.mikephil.charting.utils.i d5 = this.f50521h.d(cVar.U());
                    c.a aVar = this.f50516g;
                    float[] a6 = d5.a(cVar, i6, aVar.f50517a, aVar.f50518b);
                    float f6 = max == 1.0f ? i6 : max;
                    com.github.mikephil.charting.formatter.l u4 = cVar.u();
                    com.github.mikephil.charting.utils.g d6 = com.github.mikephil.charting.utils.g.d(cVar.i1());
                    d6.f50636d = com.github.mikephil.charting.utils.k.e(d6.f50636d);
                    d6.f50637e = com.github.mikephil.charting.utils.k.e(d6.f50637e);
                    for (int i7 = 0; i7 < a6.length; i7 = i4 + 2) {
                        int i10 = i7 / 2;
                        int E = cVar.E(this.f50516g.f50517a + i10);
                        int argb = Color.argb(Math.round(255.0f * f6), Color.red(E), Color.green(E), Color.blue(E));
                        float f7 = a6[i7];
                        float f10 = a6[i7 + 1];
                        if (!this.f50589a.J(f7)) {
                            break;
                        }
                        if (this.f50589a.I(f7) && this.f50589a.M(f10)) {
                            BubbleEntry bubbleEntry2 = (BubbleEntry) cVar.w(i10 + this.f50516g.f50517a);
                            if (cVar.S()) {
                                bubbleEntry = bubbleEntry2;
                                f4 = f10;
                                f5 = f7;
                                i4 = i7;
                                e(canvas, u4.f(bubbleEntry2), f7, (0.5f * a5) + f10, argb);
                            } else {
                                bubbleEntry = bubbleEntry2;
                                f4 = f10;
                                f5 = f7;
                                i4 = i7;
                            }
                            if (bubbleEntry.b() != null && cVar.q0()) {
                                Drawable b5 = bubbleEntry.b();
                                com.github.mikephil.charting.utils.k.k(canvas, b5, (int) (f5 + d6.f50636d), (int) (f4 + d6.f50637e), b5.getIntrinsicWidth(), b5.getIntrinsicHeight());
                            }
                        } else {
                            i4 = i7;
                        }
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
    protected void n(Canvas canvas, f8.c cVar) {
        if (cVar.h1() < 1) {
            return;
        }
        com.github.mikephil.charting.utils.i d5 = this.f50521h.d(cVar.U());
        float i4 = this.f50535b.i();
        this.f50516g.a(this.f50521h, cVar);
        float[] fArr = this.f50522i;
        fArr[0] = 0.0f;
        fArr[2] = 1.0f;
        d5.o(fArr);
        boolean d02 = cVar.d0();
        float[] fArr2 = this.f50522i;
        float min = Math.min(Math.abs(this.f50589a.f() - this.f50589a.j()), Math.abs(fArr2[2] - fArr2[0]));
        int i5 = this.f50516g.f50517a;
        while (true) {
            c.a aVar = this.f50516g;
            if (i5 > aVar.f50519c + aVar.f50517a) {
                return;
            }
            BubbleEntry bubbleEntry = (BubbleEntry) cVar.w(i5);
            this.f50523j[0] = bubbleEntry.j();
            this.f50523j[1] = bubbleEntry.c() * i4;
            d5.o(this.f50523j);
            float o4 = o(bubbleEntry.o(), cVar.a(), min, d02) / 2.0f;
            if (this.f50589a.K(this.f50523j[1] + o4) && this.f50589a.H(this.f50523j[1] - o4) && this.f50589a.I(this.f50523j[0] + o4)) {
                if (!this.f50589a.J(this.f50523j[0] - o4)) {
                    return;
                }
                this.f50536c.setColor(cVar.G0((int) bubbleEntry.j()));
                float[] fArr3 = this.f50523j;
                canvas.drawCircle(fArr3[0], fArr3[1], o4, this.f50536c);
            }
            i5++;
        }
    }

    protected float o(float f4, float f5, float f6, boolean z4) {
        if (z4) {
            f4 = f5 == 0.0f ? 1.0f : (float) Math.sqrt(f4 / f5);
        }
        return f6 * f4;
    }
}
