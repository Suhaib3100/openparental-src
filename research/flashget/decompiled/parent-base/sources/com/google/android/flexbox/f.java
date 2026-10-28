package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FlexLine.java */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: e, reason: collision with root package name */
    int f52423e;

    /* renamed from: f, reason: collision with root package name */
    int f52424f;

    /* renamed from: g, reason: collision with root package name */
    int f52425g;

    /* renamed from: h, reason: collision with root package name */
    int f52426h;

    /* renamed from: i, reason: collision with root package name */
    int f52427i;

    /* renamed from: j, reason: collision with root package name */
    float f52428j;

    /* renamed from: k, reason: collision with root package name */
    float f52429k;

    /* renamed from: l, reason: collision with root package name */
    int f52430l;

    /* renamed from: m, reason: collision with root package name */
    int f52431m;

    /* renamed from: o, reason: collision with root package name */
    int f52433o;

    /* renamed from: p, reason: collision with root package name */
    int f52434p;

    /* renamed from: q, reason: collision with root package name */
    boolean f52435q;

    /* renamed from: r, reason: collision with root package name */
    boolean f52436r;

    /* renamed from: a, reason: collision with root package name */
    int f52419a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    int f52420b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    int f52421c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    int f52422d = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    List<Integer> f52432n = new ArrayList();

    f() {
    }

    public int a() {
        return this.f52425g;
    }

    public int b() {
        return this.f52433o;
    }

    public int c() {
        return this.f52426h;
    }

    public int d() {
        return this.f52426h - this.f52427i;
    }

    public int e() {
        return this.f52423e;
    }

    public float f() {
        return this.f52428j;
    }

    public float g() {
        return this.f52429k;
    }

    void h(View view, int i4, int i5, int i6, int i7) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f52419a = Math.min(this.f52419a, (view.getLeft() - flexItem.M2()) - i4);
        this.f52420b = Math.min(this.f52420b, (view.getTop() - flexItem.u0()) - i5);
        this.f52421c = Math.max(this.f52421c, view.getRight() + flexItem.s3() + i6);
        this.f52422d = Math.max(this.f52422d, view.getBottom() + flexItem.I2() + i7);
    }
}
