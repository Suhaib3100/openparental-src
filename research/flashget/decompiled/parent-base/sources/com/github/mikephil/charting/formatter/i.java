package com.github.mikephil.charting.formatter;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.text.DecimalFormat;

/* compiled from: LargeValueFormatter.java */
/* loaded from: classes5.dex */
public class i extends l {

    /* renamed from: a, reason: collision with root package name */
    private String[] f50420a;

    /* renamed from: b, reason: collision with root package name */
    private int f50421b;

    /* renamed from: c, reason: collision with root package name */
    private DecimalFormat f50422c;

    /* renamed from: d, reason: collision with root package name */
    private String f50423d;

    public i() {
        this.f50420a = new String[]{"", ProtectedSandApp.s("쐴"), ProtectedSandApp.s("쐵"), ProtectedSandApp.s("쐲"), ProtectedSandApp.s("쐳")};
        this.f50421b = 5;
        this.f50423d = "";
        this.f50422c = new DecimalFormat(ProtectedSandApp.s("쐶"));
    }

    private String m(double d5) {
        String format = this.f50422c.format(d5);
        int numericValue = Character.getNumericValue(format.charAt(format.length() - 1));
        String replaceAll = format.replaceAll(ProtectedSandApp.s("쐷"), this.f50420a[Integer.valueOf(Character.getNumericValue(format.charAt(format.length() - 2)) + "" + numericValue).intValue() / 3]);
        while (true) {
            if (replaceAll.length() <= this.f50421b && !replaceAll.matches(ProtectedSandApp.s("쐸"))) {
                return replaceAll;
            }
            replaceAll = replaceAll.substring(0, replaceAll.length() - 2) + replaceAll.substring(replaceAll.length() - 1);
        }
    }

    @Override // com.github.mikephil.charting.formatter.l
    public String h(float f4) {
        return m(f4) + this.f50423d;
    }

    public int l() {
        return 0;
    }

    public void n(String str) {
        this.f50423d = str;
    }

    public void o(int i4) {
        this.f50421b = i4;
    }

    public void p(String[] strArr) {
        this.f50420a = strArr;
    }

    public i(String str) {
        this();
        this.f50423d = str;
    }
}
