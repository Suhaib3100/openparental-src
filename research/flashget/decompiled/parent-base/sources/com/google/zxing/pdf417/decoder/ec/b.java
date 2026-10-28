package com.google.zxing.pdf417.decoder.ec;

/* compiled from: ModulusGF.java */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final b f63215f = new b(ta.a.f91896a, 3);

    /* renamed from: a, reason: collision with root package name */
    private final int[] f63216a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f63217b;

    /* renamed from: c, reason: collision with root package name */
    private final c f63218c;

    /* renamed from: d, reason: collision with root package name */
    private final c f63219d;

    /* renamed from: e, reason: collision with root package name */
    private final int f63220e;

    private b(int i4, int i5) {
        this.f63220e = i4;
        this.f63216a = new int[i4];
        this.f63217b = new int[i4];
        int i6 = 1;
        for (int i7 = 0; i7 < i4; i7++) {
            this.f63216a[i7] = i6;
            i6 = (i6 * i5) % i4;
        }
        for (int i10 = 0; i10 < i4 - 1; i10++) {
            this.f63217b[this.f63216a[i10]] = i10;
        }
        this.f63218c = new c(this, new int[]{0});
        this.f63219d = new c(this, new int[]{1});
    }

    int a(int i4, int i5) {
        return (i4 + i5) % this.f63220e;
    }

    c b(int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (i5 == 0) {
            return this.f63218c;
        }
        int[] iArr = new int[i4 + 1];
        iArr[0] = i5;
        return new c(this, iArr);
    }

    int c(int i4) {
        return this.f63216a[i4];
    }

    c d() {
        return this.f63219d;
    }

    int e() {
        return this.f63220e;
    }

    c f() {
        return this.f63218c;
    }

    int g(int i4) {
        if (i4 != 0) {
            return this.f63216a[(this.f63220e - this.f63217b[i4]) - 1];
        }
        throw new ArithmeticException();
    }

    int h(int i4) {
        if (i4 != 0) {
            return this.f63217b[i4];
        }
        throw new IllegalArgumentException();
    }

    int i(int i4, int i5) {
        if (i4 == 0 || i5 == 0) {
            return 0;
        }
        int[] iArr = this.f63216a;
        int[] iArr2 = this.f63217b;
        return iArr[(iArr2[i4] + iArr2[i5]) % (this.f63220e - 1)];
    }

    int j(int i4, int i5) {
        int i6 = this.f63220e;
        return ((i4 + i6) - i5) % i6;
    }
}
