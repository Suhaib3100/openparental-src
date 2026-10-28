package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.renderer.c;
import java.util.List;

/* compiled from: ScatterChartRenderer.java */
/* loaded from: classes5.dex */
public class p extends l {

    /* renamed from: i, reason: collision with root package name */
    protected e8.h f50590i;

    /* renamed from: j, reason: collision with root package name */
    float[] f50591j;

    public p(e8.h hVar, com.github.mikephil.charting.animation.a aVar, com.github.mikephil.charting.utils.l lVar) {
        super(aVar, lVar);
        this.f50591j = new float[2];
        this.f50590i = hVar;
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas) {
        for (T t4 : this.f50590i.e().q()) {
            if (t4.isVisible()) {
                o(canvas, t4);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    @Override // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas, com.github.mikephil.charting.highlight.d[] dVarArr) {
        com.github.mikephil.charting.data.v e4 = this.f50590i.e();
        for (com.github.mikephil.charting.highlight.d dVar : dVarArr) {
            f8.k kVar = (f8.k) e4.k(dVar.d());
            if (kVar != null && kVar.k1()) {
                ?? o02 = kVar.o0(dVar.h(), dVar.j());
                if (l(o02, kVar)) {
                    com.github.mikephil.charting.utils.f f4 = this.f50590i.d(kVar.U()).f(o02.j(), this.f50535b.i() * o02.c());
                    dVar.n((float) f4.f50632d, (float) f4.f50633e);
                    n(canvas, (float) f4.f50632d, (float) f4.f50633e, kVar);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas, String str, float f4, float f5, int i4) {
        this.f50539f.setColor(i4);
        canvas.drawText(str, f4, f5, this.f50539f);
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas) {
        f8.k kVar;
        Entry entry;
        if (k(this.f50590i)) {
            List<T> q4 = this.f50590i.e().q();
            for (int i4 = 0; i4 < this.f50590i.e().m(); i4++) {
                f8.k kVar2 = (f8.k) q4.get(i4);
                if (m(kVar2) && kVar2.h1() >= 1) {
                    a(kVar2);
                    this.f50516g.a(this.f50590i, kVar2);
                    com.github.mikephil.charting.utils.i d5 = this.f50590i.d(kVar2.U());
                    float h4 = this.f50535b.h();
                    float i5 = this.f50535b.i();
                    c.a aVar = this.f50516g;
                    float[] d6 = d5.d(kVar2, h4, i5, aVar.f50517a, aVar.f50518b);
                    float e4 = com.github.mikephil.charting.utils.k.e(kVar2.C());
                    com.github.mikephil.charting.formatter.l u4 = kVar2.u();
                    com.github.mikephil.charting.utils.g d7 = com.github.mikephil.charting.utils.g.d(kVar2.i1());
                    d7.f50636d = com.github.mikephil.charting.utils.k.e(d7.f50636d);
                    d7.f50637e = com.github.mikephil.charting.utils.k.e(d7.f50637e);
                    int i6 = 0;
                    while (i6 < d6.length && this.f50589a.J(d6[i6])) {
                        if (this.f50589a.I(d6[i6])) {
                            int i7 = i6 + 1;
                            if (this.f50589a.M(d6[i7])) {
                                int i10 = i6 / 2;
                                Entry w4 = kVar2.w(this.f50516g.f50517a + i10);
                                if (kVar2.S()) {
                                    entry = w4;
                                    kVar = kVar2;
                                    e(canvas, u4.j(w4), d6[i6], d6[i7] - e4, kVar2.E(i10 + this.f50516g.f50517a));
                                } else {
                                    entry = w4;
                                    kVar = kVar2;
                                }
                                if (entry.b() != null && kVar.q0()) {
                                    Drawable b5 = entry.b();
                                    com.github.mikephil.charting.utils.k.k(canvas, b5, (int) (d6[i6] + d7.f50636d), (int) (d6[i7] + d7.f50637e), b5.getIntrinsicWidth(), b5.getIntrinsicHeight());
                                }
                                i6 += 2;
                                kVar2 = kVar;
                            }
                        }
                        kVar = kVar2;
                        i6 += 2;
                        kVar2 = kVar;
                    }
                    com.github.mikephil.charting.utils.g.h(d7);
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    protected void o(Canvas canvas, f8.k kVar) {
        int i4;
        if (kVar.h1() < 1) {
            return;
        }
        com.github.mikephil.charting.utils.l lVar = this.f50589a;
        com.github.mikephil.charting.utils.i d5 = this.f50590i.d(kVar.U());
        float i5 = this.f50535b.i();
        com.github.mikephil.charting.renderer.scatter.e Z0 = kVar.Z0();
        if (Z0 == null) {
            return;
        }
        int min = (int) Math.min(Math.ceil(this.f50535b.h() * kVar.h1()), kVar.h1());
        int i6 = 0;
        while (i6 < min) {
            ?? w4 = kVar.w(i6);
            this.f50591j[0] = w4.j();
            this.f50591j[1] = w4.c() * i5;
            d5.o(this.f50591j);
            if (!lVar.J(this.f50591j[0])) {
                return;
            }
            if (lVar.I(this.f50591j[0]) && lVar.M(this.f50591j[1])) {
                this.f50536c.setColor(kVar.G0(i6 / 2));
                com.github.mikephil.charting.utils.l lVar2 = this.f50589a;
                float[] fArr = this.f50591j;
                i4 = i6;
                Z0.a(canvas, kVar, lVar2, fArr[0], fArr[1], this.f50536c);
            } else {
                i4 = i6;
            }
            i6 = i4 + 1;
        }
    }
}
