package com.google.zxing.qrcode.detector;

import com.google.zxing.p;

/* compiled from: AlignmentPattern.java */
/* loaded from: classes6.dex */
public final class a extends p {

    /* renamed from: c, reason: collision with root package name */
    private final float f63311c;

    a(float f4, float f5, float f6) {
        super(f4, f5);
        this.f63311c = f6;
    }

    boolean f(float f4, float f5, float f6) {
        if (Math.abs(f5 - d()) > f4 || Math.abs(f6 - c()) > f4) {
            return false;
        }
        float abs = Math.abs(f4 - this.f63311c);
        return abs <= 1.0f || abs <= this.f63311c;
    }

    a g(float f4, float f5, float f6) {
        return new a((c() + f5) / 2.0f, (d() + f4) / 2.0f, (this.f63311c + f6) / 2.0f);
    }
}
