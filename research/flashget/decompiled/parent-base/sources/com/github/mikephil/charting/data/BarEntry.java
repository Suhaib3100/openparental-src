package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

@SuppressLint({"ParcelCreator"})
/* loaded from: classes5.dex */
public class BarEntry extends Entry {

    /* renamed from: f, reason: collision with root package name */
    private float[] f50342f;

    /* renamed from: g, reason: collision with root package name */
    private com.github.mikephil.charting.highlight.j[] f50343g;

    /* renamed from: h, reason: collision with root package name */
    private float f50344h;

    /* renamed from: i, reason: collision with root package name */
    private float f50345i;

    public BarEntry(float f4, float f5) {
        super(f4, f5);
    }

    private void n() {
        float[] fArr = this.f50342f;
        if (fArr == null) {
            this.f50344h = 0.0f;
            this.f50345i = 0.0f;
            return;
        }
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (float f6 : fArr) {
            if (f6 <= 0.0f) {
                f4 += Math.abs(f6);
            } else {
                f5 += f6;
            }
        }
        this.f50344h = f4;
        this.f50345i = f5;
    }

    private static float p(float[] fArr) {
        float f4 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (float f5 : fArr) {
            f4 += f5;
        }
        return f4;
    }

    public void A(float[] fArr) {
        f(p(fArr));
        this.f50342f = fArr;
        n();
        o();
    }

    @Override // com.github.mikephil.charting.data.f
    public float c() {
        return super.c();
    }

    protected void o() {
        float[] y4 = y();
        if (y4 == null || y4.length == 0) {
            return;
        }
        this.f50343g = new com.github.mikephil.charting.highlight.j[y4.length];
        float f4 = -u();
        int i4 = 0;
        float f5 = 0.0f;
        while (true) {
            com.github.mikephil.charting.highlight.j[] jVarArr = this.f50343g;
            if (i4 >= jVarArr.length) {
                return;
            }
            float f6 = y4[i4];
            if (f6 < 0.0f) {
                float f7 = f4 - f6;
                jVarArr[i4] = new com.github.mikephil.charting.highlight.j(f4, f7);
                f4 = f7;
            } else {
                float f10 = f6 + f5;
                jVarArr[i4] = new com.github.mikephil.charting.highlight.j(f5, f10);
                f5 = f10;
            }
            i4++;
        }
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public BarEntry g() {
        BarEntry barEntry = new BarEntry(j(), c(), a());
        barEntry.A(this.f50342f);
        return barEntry;
    }

    @Deprecated
    public float t(int i4) {
        return x(i4);
    }

    public float u() {
        return this.f50344h;
    }

    public float v() {
        return this.f50345i;
    }

    public com.github.mikephil.charting.highlight.j[] w() {
        return this.f50343g;
    }

    public float x(int i4) {
        float[] fArr = this.f50342f;
        float f4 = 0.0f;
        if (fArr == null) {
            return 0.0f;
        }
        for (int length = fArr.length - 1; length > i4 && length >= 0; length--) {
            f4 += this.f50342f[length];
        }
        return f4;
    }

    public float[] y() {
        return this.f50342f;
    }

    public boolean z() {
        return this.f50342f != null;
    }

    public BarEntry(float f4, float f5, Object obj) {
        super(f4, f5, obj);
    }

    public BarEntry(float f4, float f5, Drawable drawable) {
        super(f4, f5, drawable);
    }

    public BarEntry(float f4, float f5, Drawable drawable, Object obj) {
        super(f4, f5, drawable, obj);
    }

    public BarEntry(float f4, float[] fArr) {
        super(f4, p(fArr));
        this.f50342f = fArr;
        n();
        o();
    }

    public BarEntry(float f4, float[] fArr, Object obj) {
        super(f4, p(fArr), obj);
        this.f50342f = fArr;
        n();
        o();
    }

    public BarEntry(float f4, float[] fArr, Drawable drawable) {
        super(f4, p(fArr), drawable);
        this.f50342f = fArr;
        n();
        o();
    }

    public BarEntry(float f4, float[] fArr, Drawable drawable, Object obj) {
        super(f4, p(fArr), drawable, obj);
        this.f50342f = fArr;
        n();
        o();
    }
}
