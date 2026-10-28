package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import com.google.firebase.remoteconfig.p;
import java.util.List;

/* compiled from: Transformer.java */
/* loaded from: classes5.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    protected l f50649c;

    /* renamed from: a, reason: collision with root package name */
    protected Matrix f50647a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    protected Matrix f50648b = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    protected float[] f50650d = new float[1];

    /* renamed from: e, reason: collision with root package name */
    protected float[] f50651e = new float[1];

    /* renamed from: f, reason: collision with root package name */
    protected float[] f50652f = new float[1];

    /* renamed from: g, reason: collision with root package name */
    protected float[] f50653g = new float[1];

    /* renamed from: h, reason: collision with root package name */
    protected Matrix f50654h = new Matrix();

    /* renamed from: i, reason: collision with root package name */
    float[] f50655i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private Matrix f50656j = new Matrix();

    /* renamed from: k, reason: collision with root package name */
    private Matrix f50657k = new Matrix();

    public i(l lVar) {
        this.f50649c = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    public float[] a(f8.c cVar, float f4, int i4, int i5) {
        int i6 = ((i5 - i4) + 1) * 2;
        if (this.f50651e.length != i6) {
            this.f50651e = new float[i6];
        }
        float[] fArr = this.f50651e;
        for (int i7 = 0; i7 < i6; i7 += 2) {
            ?? w4 = cVar.w((i7 / 2) + i4);
            if (w4 != 0) {
                fArr[i7] = w4.j();
                fArr[i7 + 1] = w4.c() * f4;
            } else {
                fArr[i7] = 0.0f;
                fArr[i7 + 1] = 0.0f;
            }
        }
        i().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float[] b(f8.d dVar, float f4, float f5, int i4, int i5) {
        int i6 = ((int) (((i5 - i4) * f4) + 1.0f)) * 2;
        if (this.f50653g.length != i6) {
            this.f50653g = new float[i6];
        }
        float[] fArr = this.f50653g;
        for (int i7 = 0; i7 < i6; i7 += 2) {
            CandleEntry candleEntry = (CandleEntry) dVar.w((i7 / 2) + i4);
            if (candleEntry != null) {
                fArr[i7] = candleEntry.j();
                fArr[i7 + 1] = candleEntry.r() * f5;
            } else {
                fArr[i7] = 0.0f;
                fArr[i7 + 1] = 0.0f;
            }
        }
        i().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    public float[] c(f8.f fVar, float f4, float f5, int i4, int i5) {
        int i6 = (((int) ((i5 - i4) * f4)) + 1) * 2;
        if (this.f50652f.length != i6) {
            this.f50652f = new float[i6];
        }
        float[] fArr = this.f50652f;
        for (int i7 = 0; i7 < i6; i7 += 2) {
            ?? w4 = fVar.w((i7 / 2) + i4);
            if (w4 != 0) {
                fArr[i7] = w4.j();
                fArr[i7 + 1] = w4.c() * f5;
            } else {
                fArr[i7] = 0.0f;
                fArr[i7 + 1] = 0.0f;
            }
        }
        i().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.f] */
    public float[] d(f8.k kVar, float f4, float f5, int i4, int i5) {
        int i6 = ((int) (((i5 - i4) * f4) + 1.0f)) * 2;
        if (this.f50650d.length != i6) {
            this.f50650d = new float[i6];
        }
        float[] fArr = this.f50650d;
        for (int i7 = 0; i7 < i6; i7 += 2) {
            ?? w4 = kVar.w((i7 / 2) + i4);
            if (w4 != 0) {
                fArr[i7] = w4.j();
                fArr[i7 + 1] = w4.c() * f5;
            } else {
                fArr[i7] = 0.0f;
                fArr[i7 + 1] = 0.0f;
            }
        }
        i().mapPoints(fArr);
        return fArr;
    }

    public Matrix e() {
        return this.f50648b;
    }

    public f f(float f4, float f5) {
        float[] fArr = this.f50655i;
        fArr[0] = f4;
        fArr[1] = f5;
        o(fArr);
        float[] fArr2 = this.f50655i;
        return f.b(fArr2[0], fArr2[1]);
    }

    public Matrix g() {
        i().invert(this.f50657k);
        return this.f50657k;
    }

    public Matrix h() {
        return this.f50647a;
    }

    public Matrix i() {
        this.f50656j.set(this.f50647a);
        this.f50656j.postConcat(this.f50649c.f50673a);
        this.f50656j.postConcat(this.f50648b);
        return this.f50656j;
    }

    public f j(float f4, float f5) {
        f b5 = f.b(p.f60679p, p.f60679p);
        k(f4, f5, b5);
        return b5;
    }

    public void k(float f4, float f5, f fVar) {
        float[] fArr = this.f50655i;
        fArr[0] = f4;
        fArr[1] = f5;
        n(fArr);
        float[] fArr2 = this.f50655i;
        fVar.f50632d = fArr2[0];
        fVar.f50633e = fArr2[1];
    }

    public void l(Path path) {
        path.transform(this.f50647a);
        path.transform(this.f50649c.r());
        path.transform(this.f50648b);
    }

    public void m(List<Path> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            l(list.get(i4));
        }
    }

    public void n(float[] fArr) {
        Matrix matrix = this.f50654h;
        matrix.reset();
        this.f50648b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f50649c.r().invert(matrix);
        matrix.mapPoints(fArr);
        this.f50647a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void o(float[] fArr) {
        this.f50647a.mapPoints(fArr);
        this.f50649c.r().mapPoints(fArr);
        this.f50648b.mapPoints(fArr);
    }

    public void p(boolean z4) {
        this.f50648b.reset();
        if (!z4) {
            this.f50648b.postTranslate(this.f50649c.P(), this.f50649c.n() - this.f50649c.O());
        } else {
            this.f50648b.setTranslate(this.f50649c.P(), -this.f50649c.R());
            this.f50648b.postScale(1.0f, -1.0f);
        }
    }

    public void q(float f4, float f5, float f6, float f7) {
        float k4 = this.f50649c.k() / f5;
        float g4 = this.f50649c.g() / f6;
        if (Float.isInfinite(k4)) {
            k4 = 0.0f;
        }
        if (Float.isInfinite(g4)) {
            g4 = 0.0f;
        }
        this.f50647a.reset();
        this.f50647a.postTranslate(-f4, -f7);
        this.f50647a.postScale(k4, -g4);
    }

    public void r(RectF rectF, float f4) {
        rectF.top *= f4;
        rectF.bottom *= f4;
        this.f50647a.mapRect(rectF);
        this.f50649c.r().mapRect(rectF);
        this.f50648b.mapRect(rectF);
    }

    public void s(RectF rectF, float f4) {
        rectF.left *= f4;
        rectF.right *= f4;
        this.f50647a.mapRect(rectF);
        this.f50649c.r().mapRect(rectF);
        this.f50648b.mapRect(rectF);
    }

    public void t(RectF rectF) {
        this.f50647a.mapRect(rectF);
        this.f50649c.r().mapRect(rectF);
        this.f50648b.mapRect(rectF);
    }

    public void u(RectF rectF) {
        this.f50647a.mapRect(rectF);
        this.f50649c.r().mapRect(rectF);
        this.f50648b.mapRect(rectF);
    }

    public void v(RectF rectF, float f4) {
        rectF.left *= f4;
        rectF.right *= f4;
        this.f50647a.mapRect(rectF);
        this.f50649c.r().mapRect(rectF);
        this.f50648b.mapRect(rectF);
    }

    public void w(List<RectF> list) {
        Matrix i4 = i();
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4.mapRect(list.get(i5));
        }
    }
}
