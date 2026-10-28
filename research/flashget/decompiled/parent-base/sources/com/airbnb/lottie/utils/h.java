package com.airbnb.lottie.utils;

/* compiled from: MeanCalculator.java */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private float f39385a;

    /* renamed from: b, reason: collision with root package name */
    private int f39386b;

    public void a(float f4) {
        float f5 = this.f39385a + f4;
        this.f39385a = f5;
        int i4 = this.f39386b + 1;
        this.f39386b = i4;
        if (i4 == Integer.MAX_VALUE) {
            this.f39385a = f5 / 2.0f;
            this.f39386b = i4 / 2;
        }
    }

    public float b() {
        int i4 = this.f39386b;
        if (i4 == 0) {
            return 0.0f;
        }
        return this.f39385a / i4;
    }
}
