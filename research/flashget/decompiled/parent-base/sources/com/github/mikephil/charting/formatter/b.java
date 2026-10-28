package com.github.mikephil.charting.formatter;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.DecimalFormat;

/* compiled from: DefaultAxisValueFormatter.java */
/* loaded from: classes5.dex */
public class b extends l {

    /* renamed from: a, reason: collision with root package name */
    protected DecimalFormat f50414a;

    /* renamed from: b, reason: collision with root package name */
    protected int f50415b;

    public b(int i4) {
        this.f50415b = i4;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 == 0) {
                stringBuffer.append(ProtectedSandApp.s("쐬"));
            }
            stringBuffer.append(ProtectedSandApp.s("쐭"));
        }
        this.f50414a = new DecimalFormat(ProtectedSandApp.s("쐮") + stringBuffer.toString());
    }

    @Override // com.github.mikephil.charting.formatter.l
    public String h(float f4) {
        return this.f50414a.format(f4);
    }

    public int l() {
        return this.f50415b;
    }
}
