package com.nostra13.universalimageloader.core.assist;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: ImageSize.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final int f70280c = 9;

    /* renamed from: d, reason: collision with root package name */
    private static final String f70281d = ProtectedSandApp.s("ᩏ\u0001");

    /* renamed from: a, reason: collision with root package name */
    private final int f70282a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70283b;

    public e(int i4, int i5) {
        this.f70282a = i4;
        this.f70283b = i5;
    }

    public int a() {
        return this.f70283b;
    }

    public int b() {
        return this.f70282a;
    }

    public e c(float f4) {
        return new e((int) (this.f70282a * f4), (int) (this.f70283b * f4));
    }

    public e d(int i4) {
        return new e(this.f70282a / i4, this.f70283b / i4);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(9);
        sb.append(this.f70282a);
        sb.append(ProtectedSandApp.s("ᩏ\u0001"));
        sb.append(this.f70283b);
        return sb.toString();
    }

    public e(int i4, int i5, int i6) {
        if (i6 % 180 == 0) {
            this.f70282a = i4;
            this.f70283b = i5;
        } else {
            this.f70282a = i5;
            this.f70283b = i4;
        }
    }
}
