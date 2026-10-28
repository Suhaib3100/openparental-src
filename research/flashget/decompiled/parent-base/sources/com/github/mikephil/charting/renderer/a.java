package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.x1;

/* compiled from: AxisRenderer.java */
/* loaded from: classes5.dex */
public abstract class a extends o {

    /* renamed from: b, reason: collision with root package name */
    protected com.github.mikephil.charting.components.a f50504b;

    /* renamed from: c, reason: collision with root package name */
    protected com.github.mikephil.charting.utils.i f50505c;

    /* renamed from: d, reason: collision with root package name */
    protected Paint f50506d;

    /* renamed from: e, reason: collision with root package name */
    protected Paint f50507e;

    /* renamed from: f, reason: collision with root package name */
    protected Paint f50508f;

    /* renamed from: g, reason: collision with root package name */
    protected Paint f50509g;

    public a(com.github.mikephil.charting.utils.l lVar, com.github.mikephil.charting.utils.i iVar, com.github.mikephil.charting.components.a aVar) {
        super(lVar);
        this.f50505c = iVar;
        this.f50504b = aVar;
        if (this.f50589a != null) {
            this.f50507e = new Paint(1);
            Paint paint = new Paint();
            this.f50506d = paint;
            paint.setColor(-7829368);
            this.f50506d.setStrokeWidth(1.0f);
            Paint paint2 = this.f50506d;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.f50506d.setAlpha(90);
            Paint paint3 = new Paint();
            this.f50508f = paint3;
            paint3.setColor(x1.f27484y);
            this.f50508f.setStrokeWidth(1.0f);
            this.f50508f.setStyle(style);
            Paint paint4 = new Paint(1);
            this.f50509g = paint4;
            paint4.setStyle(style);
        }
    }

    public void a(float f4, float f5, boolean z4) {
        float f6;
        double d5;
        com.github.mikephil.charting.utils.l lVar = this.f50589a;
        if (lVar != null && lVar.k() > 10.0f && !this.f50589a.F()) {
            com.github.mikephil.charting.utils.f j4 = this.f50505c.j(this.f50589a.h(), this.f50589a.j());
            com.github.mikephil.charting.utils.f j5 = this.f50505c.j(this.f50589a.h(), this.f50589a.f());
            if (z4) {
                f6 = (float) j4.f50633e;
                d5 = j5.f50633e;
            } else {
                f6 = (float) j5.f50633e;
                d5 = j4.f50633e;
            }
            float f7 = (float) d5;
            com.github.mikephil.charting.utils.f.c(j4);
            com.github.mikephil.charting.utils.f.c(j5);
            f4 = f6;
            f5 = f7;
        }
        b(f4, f5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    protected void b(float f4, float f5) {
        float f6 = f4;
        int C = this.f50504b.C();
        double abs = Math.abs(f5 - f6);
        if (C == 0 || abs <= com.google.firebase.remoteconfig.p.f60679p || Double.isInfinite(abs)) {
            com.github.mikephil.charting.components.a aVar = this.f50504b;
            aVar.f50274l = new float[0];
            aVar.f50275m = new float[0];
            aVar.f50276n = 0;
            return;
        }
        double L = com.github.mikephil.charting.utils.k.L(abs / C);
        if (this.f50504b.S() && L < this.f50504b.y()) {
            L = this.f50504b.y();
        }
        double L2 = com.github.mikephil.charting.utils.k.L(Math.pow(10.0d, (int) Math.log10(L)));
        if (((int) (L / L2)) > 5) {
            L = Math.floor(L2 * 10.0d);
        }
        int L3 = this.f50504b.L();
        if (this.f50504b.R()) {
            L = ((float) abs) / (C - 1);
            com.github.mikephil.charting.components.a aVar2 = this.f50504b;
            aVar2.f50276n = C;
            if (aVar2.f50274l.length < C) {
                aVar2.f50274l = new float[C];
            }
            for (int i4 = 0; i4 < C; i4++) {
                this.f50504b.f50274l[i4] = f6;
                f6 = (float) (f6 + L);
            }
        } else {
            double ceil = L == com.google.firebase.remoteconfig.p.f60679p ? com.google.firebase.remoteconfig.p.f60679p : Math.ceil(f6 / L) * L;
            if (this.f50504b.L()) {
                ceil -= L;
            }
            double J = L == com.google.firebase.remoteconfig.p.f60679p ? com.google.firebase.remoteconfig.p.f60679p : com.github.mikephil.charting.utils.k.J(Math.floor(f5 / L) * L);
            if (L != com.google.firebase.remoteconfig.p.f60679p) {
                double d5 = ceil;
                L3 = L3;
                while (d5 <= J) {
                    d5 += L;
                    L3++;
                }
            }
            com.github.mikephil.charting.components.a aVar3 = this.f50504b;
            aVar3.f50276n = L3;
            if (aVar3.f50274l.length < L3) {
                aVar3.f50274l = new float[L3];
            }
            for (int i5 = 0; i5 < L3; i5++) {
                if (ceil == com.google.firebase.remoteconfig.p.f60679p) {
                    ceil = 0.0d;
                }
                this.f50504b.f50274l[i5] = (float) ceil;
                ceil += L;
            }
            C = L3;
        }
        if (L < 1.0d) {
            this.f50504b.f50277o = (int) Math.ceil(-Math.log10(L));
        } else {
            this.f50504b.f50277o = 0;
        }
        if (this.f50504b.L()) {
            com.github.mikephil.charting.components.a aVar4 = this.f50504b;
            if (aVar4.f50275m.length < C) {
                aVar4.f50275m = new float[C];
            }
            float f7 = ((float) L) / 2.0f;
            for (int i6 = 0; i6 < C; i6++) {
                com.github.mikephil.charting.components.a aVar5 = this.f50504b;
                aVar5.f50275m[i6] = aVar5.f50274l[i6] + f7;
            }
        }
    }

    public Paint c() {
        return this.f50507e;
    }

    public Paint d() {
        return this.f50508f;
    }

    public Paint e() {
        return this.f50506d;
    }

    public com.github.mikephil.charting.utils.i f() {
        return this.f50505c;
    }

    public abstract void g(Canvas canvas);

    public abstract void h(Canvas canvas);

    public abstract void i(Canvas canvas);

    public abstract void j(Canvas canvas);
}
