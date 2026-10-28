package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.y1;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes2.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final View f12896a;

    /* renamed from: b, reason: collision with root package name */
    private int f12897b;

    /* renamed from: c, reason: collision with root package name */
    private int f12898c;

    /* renamed from: d, reason: collision with root package name */
    private int f12899d;

    /* renamed from: e, reason: collision with root package name */
    private int f12900e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12901f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12902g = true;

    public a(View view) {
        this.f12896a = view;
    }

    void a() {
        View view = this.f12896a;
        y1.f1(view, this.f12899d - (view.getTop() - this.f12897b));
        View view2 = this.f12896a;
        view2.offsetLeftAndRight(this.f12900e - (view2.getLeft() - this.f12898c));
    }

    public int b() {
        return this.f12898c;
    }

    public int c() {
        return this.f12897b;
    }

    public int d() {
        return this.f12900e;
    }

    public int e() {
        return this.f12899d;
    }

    public boolean f() {
        return this.f12902g;
    }

    public boolean g() {
        return this.f12901f;
    }

    void h() {
        this.f12897b = this.f12896a.getTop();
        this.f12898c = this.f12896a.getLeft();
    }

    public void i(boolean z5) {
        this.f12902g = z5;
    }

    public boolean j(int i5) {
        if (!this.f12902g || this.f12900e == i5) {
            return false;
        }
        this.f12900e = i5;
        a();
        return true;
    }

    public boolean k(int i5) {
        if (!this.f12901f || this.f12899d == i5) {
            return false;
        }
        this.f12899d = i5;
        a();
        return true;
    }

    public void l(boolean z5) {
        this.f12901f = z5;
    }
}
