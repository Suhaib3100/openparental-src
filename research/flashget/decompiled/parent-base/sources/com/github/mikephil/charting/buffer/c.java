package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;

/* compiled from: HorizontalBarBuffer.java */
/* loaded from: classes5.dex */
public class c extends b {
    public c(int i4, int i5, boolean z4) {
        super(i4, i5, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.buffer.b, com.github.mikephil.charting.buffer.a
    /* renamed from: h */
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
                    g(f4, f10, c5, f7);
                } else {
                    float f13 = -barEntry.u();
                    float f14 = 0.0f;
                    int i5 = 0;
                    while (i5 < y4.length) {
                        float f15 = y4[i5];
                        if (f15 >= 0.0f) {
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
                        g(f5 * f20, f17, f13 * f20, f16);
                        i5++;
                        f13 = abs2;
                    }
                }
            }
        }
        d();
    }
}
