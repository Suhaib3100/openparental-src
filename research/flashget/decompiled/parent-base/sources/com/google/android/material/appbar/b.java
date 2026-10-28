package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.x1;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes6.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final View f52605a;

    /* renamed from: b, reason: collision with root package name */
    private int f52606b;

    /* renamed from: c, reason: collision with root package name */
    private int f52607c;

    /* renamed from: d, reason: collision with root package name */
    private int f52608d;

    /* renamed from: e, reason: collision with root package name */
    private int f52609e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f52610f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f52611g = true;

    public b(View view) {
        this.f52605a = view;
    }

    void a() {
        View view = this.f52605a;
        x1.j1(view, this.f52608d - (view.getTop() - this.f52606b));
        View view2 = this.f52605a;
        view2.offsetLeftAndRight(this.f52609e - (view2.getLeft() - this.f52607c));
    }

    public int b() {
        return this.f52607c;
    }

    public int c() {
        return this.f52606b;
    }

    public int d() {
        return this.f52609e;
    }

    public int e() {
        return this.f52608d;
    }

    public boolean f() {
        return this.f52611g;
    }

    public boolean g() {
        return this.f52610f;
    }

    void h() {
        this.f52606b = this.f52605a.getTop();
        this.f52607c = this.f52605a.getLeft();
    }

    public void i(boolean z4) {
        this.f52611g = z4;
    }

    public boolean j(int i4) {
        if (!this.f52611g || this.f52609e == i4) {
            return false;
        }
        this.f52609e = i4;
        a();
        return true;
    }

    public boolean k(int i4) {
        if (!this.f52610f || this.f52608d == i4) {
            return false;
        }
        this.f52608d = i4;
        a();
        return true;
    }

    public void l(boolean z4) {
        this.f52610f = z4;
    }
}
