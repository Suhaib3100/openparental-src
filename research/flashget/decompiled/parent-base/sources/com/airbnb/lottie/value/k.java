package com.airbnb.lottie.value;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ScaleXY.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private float f39435a;

    /* renamed from: b, reason: collision with root package name */
    private float f39436b;

    public k(float f4, float f5) {
        this.f39435a = f4;
        this.f39436b = f5;
    }

    public boolean a(float f4, float f5) {
        return this.f39435a == f4 && this.f39436b == f5;
    }

    public float b() {
        return this.f39435a;
    }

    public float c() {
        return this.f39436b;
    }

    public void d(float f4, float f5) {
        this.f39435a = f4;
        this.f39436b = f5;
    }

    public String toString() {
        return b() + ProtectedSandApp.s("̀") + c();
    }

    public k() {
        this(1.0f, 1.0f);
    }
}
