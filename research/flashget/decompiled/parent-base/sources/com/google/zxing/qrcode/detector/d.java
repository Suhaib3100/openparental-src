package com.google.zxing.qrcode.detector;

import com.google.zxing.p;

/* compiled from: FinderPattern.java */
/* loaded from: classes6.dex */
public final class d extends p {

    /* renamed from: c, reason: collision with root package name */
    private final float f63323c;

    /* renamed from: d, reason: collision with root package name */
    private final int f63324d;

    d(float f4, float f5, float f6) {
        this(f4, f5, f6, 1);
    }

    boolean f(float f4, float f5, float f6) {
        if (Math.abs(f5 - d()) > f4 || Math.abs(f6 - c()) > f4) {
            return false;
        }
        float abs = Math.abs(f4 - this.f63323c);
        return abs <= 1.0f || abs <= this.f63323c;
    }

    d g(float f4, float f5, float f6) {
        int i4 = this.f63324d;
        int i5 = i4 + 1;
        float c5 = (c() * i4) + f5;
        float f7 = i5;
        return new d(c5 / f7, ((d() * this.f63324d) + f4) / f7, ((this.f63324d * this.f63323c) + f6) / f7, i5);
    }

    int h() {
        return this.f63324d;
    }

    public float i() {
        return this.f63323c;
    }

    private d(float f4, float f5, float f6, int i4) {
        super(f4, f5);
        this.f63323c = f6;
        this.f63324d = i4;
    }
}
