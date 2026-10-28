package com.github.mikephil.charting.formatter;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.DecimalFormat;

/* compiled from: DefaultValueFormatter.java */
/* loaded from: classes5.dex */
public class d extends l {

    /* renamed from: a, reason: collision with root package name */
    protected DecimalFormat f50416a;

    /* renamed from: b, reason: collision with root package name */
    protected int f50417b;

    public d(int i4) {
        m(i4);
    }

    @Override // com.github.mikephil.charting.formatter.l
    public String h(float f4) {
        return this.f50416a.format(f4);
    }

    public int l() {
        return this.f50417b;
    }

    public void m(int i4) {
        this.f50417b = i4;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 == 0) {
                stringBuffer.append(ProtectedSandApp.s("쐯"));
            }
            stringBuffer.append(ProtectedSandApp.s("쐰"));
        }
        this.f50416a = new DecimalFormat(ProtectedSandApp.s("쐱") + stringBuffer.toString());
    }
}
