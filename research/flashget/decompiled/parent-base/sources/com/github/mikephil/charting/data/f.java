package com.github.mikephil.charting.data;

import android.graphics.drawable.Drawable;

/* compiled from: BaseEntry.java */
/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    private float f50375b;

    /* renamed from: c, reason: collision with root package name */
    private Object f50376c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f50377d;

    public f() {
        this.f50375b = 0.0f;
        this.f50376c = null;
        this.f50377d = null;
    }

    public Object a() {
        return this.f50376c;
    }

    public Drawable b() {
        return this.f50377d;
    }

    public float c() {
        return this.f50375b;
    }

    public void d(Object obj) {
        this.f50376c = obj;
    }

    public void e(Drawable drawable) {
        this.f50377d = drawable;
    }

    public void f(float f4) {
        this.f50375b = f4;
    }

    public f(float f4) {
        this.f50376c = null;
        this.f50377d = null;
        this.f50375b = f4;
    }

    public f(float f4, Object obj) {
        this(f4);
        this.f50376c = obj;
    }

    public f(float f4, Drawable drawable) {
        this(f4);
        this.f50377d = drawable;
    }

    public f(float f4, Drawable drawable, Object obj) {
        this(f4);
        this.f50377d = drawable;
        this.f50376c = obj;
    }
}
