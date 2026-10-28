package com.github.mikephil.charting.formatter;

import java.util.Collection;

/* compiled from: IndexAxisValueFormatter.java */
/* loaded from: classes5.dex */
public class h extends l {

    /* renamed from: a, reason: collision with root package name */
    private String[] f50418a;

    /* renamed from: b, reason: collision with root package name */
    private int f50419b;

    public h() {
        this.f50418a = new String[0];
        this.f50419b = 0;
    }

    @Override // com.github.mikephil.charting.formatter.l
    public String h(float f4) {
        int round = Math.round(f4);
        return (round < 0 || round >= this.f50419b || round != ((int) f4)) ? "" : this.f50418a[round];
    }

    public String[] l() {
        return this.f50418a;
    }

    public void m(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        this.f50418a = strArr;
        this.f50419b = strArr.length;
    }

    public h(String[] strArr) {
        this.f50418a = new String[0];
        this.f50419b = 0;
        if (strArr != null) {
            m(strArr);
        }
    }

    public h(Collection<String> collection) {
        this.f50418a = new String[0];
        this.f50419b = 0;
        if (collection != null) {
            m((String[]) collection.toArray(new String[collection.size()]));
        }
    }
}
