package com.github.mikephil.charting.data;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* compiled from: BarData.java */
/* loaded from: classes5.dex */
public class a extends c<f8.a> {

    /* renamed from: j, reason: collision with root package name */
    private float f50353j;

    public a() {
        this.f50353j = 0.85f;
    }

    public float Q() {
        return this.f50353j;
    }

    public float R(float f4, float f5) {
        return ((this.f50353j + f5) * this.f50395i.size()) + f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void S(float f4, float f5, float f6) {
        BarEntry barEntry;
        if (this.f50395i.size() <= 1) {
            throw new RuntimeException(ProtectedSandApp.s("쐛"));
        }
        int h12 = ((f8.a) w()).h1();
        float f7 = f5 / 2.0f;
        float f10 = f6 / 2.0f;
        float f11 = this.f50353j / 2.0f;
        float R = R(f5, f6);
        for (int i4 = 0; i4 < h12; i4++) {
            float f12 = f4 + f7;
            for (T t4 : this.f50395i) {
                float f13 = f12 + f10 + f11;
                if (i4 < t4.h1() && (barEntry = (BarEntry) t4.w(i4)) != null) {
                    barEntry.k(f13);
                }
                f12 = f13 + f11 + f10;
            }
            float f14 = f12 + f7;
            float f15 = R - (f14 - f4);
            if (f15 > 0.0f || f15 < 0.0f) {
                f14 += f15;
            }
            f4 = f14;
        }
        E();
    }

    public void T(float f4) {
        this.f50353j = f4;
    }

    public a(f8.a... aVarArr) {
        super((f8.e[]) aVarArr);
        this.f50353j = 0.85f;
    }

    public a(List<f8.a> list) {
        super(list);
        this.f50353j = 0.85f;
    }
}
