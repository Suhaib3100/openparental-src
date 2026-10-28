package com.github.mikephil.charting.formatter;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.data.BarEntry;
import java.text.DecimalFormat;

/* compiled from: StackedValueFormatter.java */
/* loaded from: classes5.dex */
public class k extends l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f50426a;

    /* renamed from: b, reason: collision with root package name */
    private String f50427b;

    /* renamed from: c, reason: collision with root package name */
    private DecimalFormat f50428c;

    public k(boolean z4, String str, int i4) {
        this.f50426a = z4;
        this.f50427b = str;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 == 0) {
                stringBuffer.append(ProtectedSandApp.s("쐻"));
            }
            stringBuffer.append(ProtectedSandApp.s("쐼"));
        }
        this.f50428c = new DecimalFormat(ProtectedSandApp.s("쐽") + stringBuffer.toString());
    }

    @Override // com.github.mikephil.charting.formatter.l
    public String e(float f4, BarEntry barEntry) {
        float[] y4;
        if (this.f50426a || (y4 = barEntry.y()) == null) {
            return this.f50428c.format(f4) + this.f50427b;
        }
        if (y4[y4.length - 1] != f4) {
            return "";
        }
        return this.f50428c.format(barEntry.c()) + this.f50427b;
    }
}
