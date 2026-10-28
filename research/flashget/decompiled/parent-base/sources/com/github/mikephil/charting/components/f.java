package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import com.github.mikephil.charting.components.e;

/* compiled from: LegendEntry.java */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public String f50319a;

    /* renamed from: b, reason: collision with root package name */
    public e.c f50320b;

    /* renamed from: c, reason: collision with root package name */
    public float f50321c;

    /* renamed from: d, reason: collision with root package name */
    public float f50322d;

    /* renamed from: e, reason: collision with root package name */
    public DashPathEffect f50323e;

    /* renamed from: f, reason: collision with root package name */
    public int f50324f;

    public f() {
        this.f50320b = e.c.DEFAULT;
        this.f50321c = Float.NaN;
        this.f50322d = Float.NaN;
        this.f50323e = null;
        this.f50324f = com.github.mikephil.charting.utils.a.f50619a;
    }

    public f(String str, e.c cVar, float f4, float f5, DashPathEffect dashPathEffect, int i4) {
        e.c cVar2 = e.c.DEFAULT;
        this.f50319a = str;
        this.f50320b = cVar;
        this.f50321c = f4;
        this.f50322d = f5;
        this.f50323e = dashPathEffect;
        this.f50324f = i4;
    }
}
