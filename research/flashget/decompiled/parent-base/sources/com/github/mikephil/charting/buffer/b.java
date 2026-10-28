package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;

/* compiled from: BarBuffer.java */
/* loaded from: classes5.dex */
public class b extends a<f8.a> {

    /* renamed from: g, reason: collision with root package name */
    protected int f50202g;

    /* renamed from: h, reason: collision with root package name */
    protected int f50203h;

    /* renamed from: i, reason: collision with root package name */
    protected boolean f50204i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f50205j;

    /* renamed from: k, reason: collision with root package name */
    protected float f50206k;

    public b(int i4, int i5, boolean z4) {
        super(i4);
        this.f50202g = 0;
        this.f50205j = false;
        this.f50206k = 1.0f;
        this.f50203h = i5;
        this.f50204i = z4;
    }

    protected void g(float f4, float f5, float f6, float f7) {
        float[] fArr = this.f50197b;
        int i4 = this.f50196a;
        int i5 = i4 + 1;
        this.f50196a = i5;
        fArr[i4] = f4;
        int i6 = i4 + 2;
        this.f50196a = i6;
        fArr[i5] = f5;
        int i7 = i4 + 3;
        this.f50196a = i7;
        fArr[i6] = f6;
        this.f50196a = i4 + 4;
        fArr[i7] = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(f8.a aVar) {
        float f4;
        float abs;
        float abs2;
        float f5;
        float h12 = aVar.h1() * this.f50198c;
        float f6 = this.f50206k / 2.0f;
        for (int i4 = 0; i4 < h12; i4++) {
            BarEntry barEntry = (BarEntry) aVar.w(i4);
            if (barEntry != null) {
                float j4 = barEntry.j();
                float c5 = barEntry.c();
                float[] y4 = barEntry.y();
                if (!this.f50204i || y4 == null) {
                    float f7 = j4 - f6;
                    float f10 = j4 + f6;
                    if (this.f50205j) {
                        f4 = c5 >= 0.0f ? c5 : 0.0f;
                        if (c5 > 0.0f) {
                            c5 = 0.0f;
                        }
                    } else {
                        float f11 = c5 >= 0.0f ? c5 : 0.0f;
                        if (c5 > 0.0f) {
                            c5 = 0.0f;
                        }
                        float f12 = c5;
                        c5 = f11;
                        f4 = f12;
                    }
                    if (c5 > 0.0f) {
                        c5 *= this.f50199d;
                    } else {
                        f4 *= this.f50199d;
                    }
                    g(f7, c5, f10, f4);
                } else {
                    float f13 = -barEntry.u();
                    float f14 = 0.0f;
                    int i5 = 0;
                    while (i5 < y4.length) {
                        float f15 = y4[i5];
                        if (f15 == 0.0f && (f14 == 0.0f || f13 == 0.0f)) {
                            abs = f15;
                            abs2 = f13;
                            f13 = abs;
                        } else if (f15 >= 0.0f) {
                            abs = f15 + f14;
                            abs2 = f13;
                            f13 = f14;
                            f14 = abs;
                        } else {
                            abs = Math.abs(f15) + f13;
                            abs2 = Math.abs(f15) + f13;
                        }
                        float f16 = j4 - f6;
                        float f17 = j4 + f6;
                        if (this.f50205j) {
                            f5 = f13 >= abs ? f13 : abs;
                            if (f13 > abs) {
                                f13 = abs;
                            }
                        } else {
                            float f18 = f13 >= abs ? f13 : abs;
                            if (f13 > abs) {
                                f13 = abs;
                            }
                            float f19 = f13;
                            f13 = f18;
                            f5 = f19;
                        }
                        float f20 = this.f50199d;
                        g(f16, f13 * f20, f17, f5 * f20);
                        i5++;
                        f13 = abs2;
                    }
                }
            }
        }
        d();
    }

    public void i(float f4) {
        this.f50206k = f4;
    }

    public void j(int i4) {
        this.f50202g = i4;
    }

    public void k(boolean z4) {
        this.f50205j = z4;
    }
}
