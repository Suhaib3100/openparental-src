package com.tencent.beacon.base.net.b.a.a;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: InWindow.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f71174a;

    /* renamed from: b, reason: collision with root package name */
    InputStream f71175b;

    /* renamed from: c, reason: collision with root package name */
    int f71176c;

    /* renamed from: d, reason: collision with root package name */
    boolean f71177d;

    /* renamed from: e, reason: collision with root package name */
    int f71178e;

    /* renamed from: f, reason: collision with root package name */
    public int f71179f;

    /* renamed from: g, reason: collision with root package name */
    public int f71180g;

    /* renamed from: h, reason: collision with root package name */
    public int f71181h;

    /* renamed from: i, reason: collision with root package name */
    int f71182i;

    /* renamed from: j, reason: collision with root package name */
    int f71183j;

    /* renamed from: k, reason: collision with root package name */
    public int f71184k;

    void a() {
        this.f71174a = null;
    }

    public int b(int i4, int i5, int i6) {
        if (this.f71177d) {
            int i7 = this.f71181h + i4;
            int i10 = i7 + i6;
            int i11 = this.f71184k;
            if (i10 > i11) {
                i6 = i11 - i7;
            }
        }
        int i12 = i5 + 1;
        int i13 = this.f71179f + this.f71181h + i4;
        int i14 = 0;
        while (i14 < i6) {
            byte[] bArr = this.f71174a;
            int i15 = i13 + i14;
            if (bArr[i15] != bArr[i15 - i12]) {
                break;
            }
            i14++;
        }
        return i14;
    }

    public void c() throws IOException {
        this.f71179f = 0;
        this.f71181h = 0;
        this.f71184k = 0;
        this.f71177d = false;
        f();
    }

    public void d() {
        int i4 = this.f71179f;
        int i5 = (this.f71181h + i4) - this.f71182i;
        if (i5 > 0) {
            i5--;
        }
        int i6 = (i4 + this.f71184k) - i5;
        for (int i7 = 0; i7 < i6; i7++) {
            byte[] bArr = this.f71174a;
            bArr[i7] = bArr[i5 + i7];
        }
        this.f71179f -= i5;
    }

    public void e() throws IOException {
        int i4 = this.f71181h + 1;
        this.f71181h = i4;
        if (i4 > this.f71176c) {
            if (this.f71179f + i4 > this.f71178e) {
                d();
            }
            f();
        }
    }

    public void f() throws IOException {
        if (this.f71177d) {
            return;
        }
        while (true) {
            int i4 = this.f71179f;
            int i5 = (0 - i4) + this.f71180g;
            int i6 = this.f71184k;
            int i7 = i5 - i6;
            if (i7 == 0) {
                return;
            }
            int read = this.f71175b.read(this.f71174a, i4 + i6, i7);
            if (read == -1) {
                int i10 = this.f71184k;
                this.f71176c = i10;
                int i11 = this.f71179f;
                int i12 = i10 + i11;
                int i13 = this.f71178e;
                if (i12 > i13) {
                    this.f71176c = i13 - i11;
                }
                this.f71177d = true;
                return;
            }
            int i14 = this.f71184k + read;
            this.f71184k = i14;
            int i15 = this.f71181h;
            int i16 = this.f71183j;
            if (i14 >= i15 + i16) {
                this.f71176c = i14 - i16;
            }
        }
    }

    public void g() {
        this.f71175b = null;
    }

    public void a(int i4, int i5, int i6) {
        this.f71182i = i4;
        this.f71183j = i5;
        int i7 = i4 + i5 + i6;
        if (this.f71174a == null || this.f71180g != i7) {
            a();
            this.f71180g = i7;
            this.f71174a = new byte[i7];
        }
        this.f71178e = this.f71180g - i5;
    }

    public int b() {
        return this.f71184k - this.f71181h;
    }

    public void b(int i4) {
        this.f71179f += i4;
        this.f71176c -= i4;
        this.f71181h -= i4;
        this.f71184k -= i4;
    }

    public void a(InputStream inputStream) {
        this.f71175b = inputStream;
    }

    public byte a(int i4) {
        return this.f71174a[this.f71179f + this.f71181h + i4];
    }
}
