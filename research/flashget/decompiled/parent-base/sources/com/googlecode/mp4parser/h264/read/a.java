package com.googlecode.mp4parser.h264.read;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: BitstreamReader.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    protected static int f64075f;

    /* renamed from: a, reason: collision with root package name */
    private InputStream f64076a;

    /* renamed from: b, reason: collision with root package name */
    private int f64077b;

    /* renamed from: c, reason: collision with root package name */
    private int f64078c;

    /* renamed from: d, reason: collision with root package name */
    int f64079d;

    /* renamed from: e, reason: collision with root package name */
    protected xa.b f64080e = new xa.b(50);

    public a(InputStream inputStream) throws IOException {
        this.f64076a = inputStream;
        this.f64077b = inputStream.read();
        this.f64078c = inputStream.read();
    }

    private void a() throws IOException {
        this.f64077b = this.f64078c;
        this.f64078c = this.f64076a.read();
        this.f64079d = 0;
    }

    public void b() throws IOException {
    }

    public long c() {
        return (this.f64079d % 8) + (f64075f * 8);
    }

    public int d() {
        return this.f64079d;
    }

    public boolean e() {
        return this.f64079d % 8 == 0;
    }

    public boolean f() throws IOException {
        if (this.f64079d == 8) {
            a();
        }
        int i4 = 1 << (7 - this.f64079d);
        int i5 = this.f64077b;
        return (i5 == -1 || (this.f64078c == -1 && ((((i4 << 1) - 1) & i5) == i4))) ? false : true;
    }

    public int g(int i4) throws IOException {
        if (i4 > 8) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᐸ\u0001"));
        }
        if (this.f64079d == 8) {
            a();
            if (this.f64077b == -1) {
                return -1;
            }
        }
        int i5 = this.f64079d;
        int[] iArr = new int[16 - i5];
        int i6 = 0;
        while (i5 < 8) {
            iArr[i6] = (this.f64077b >> (7 - i5)) & 1;
            i5++;
            i6++;
        }
        int i7 = 0;
        while (i7 < 8) {
            iArr[i6] = (this.f64078c >> (7 - i7)) & 1;
            i7++;
            i6++;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < i4; i11++) {
            i10 = (i10 << 1) | iArr[i11];
        }
        return i10;
    }

    public int h() throws IOException {
        if (this.f64079d == 8) {
            a();
            if (this.f64077b == -1) {
                return -1;
            }
        }
        int i4 = this.f64077b;
        int i5 = this.f64079d;
        int i6 = (i4 >> (7 - i5)) & 1;
        this.f64079d = i5 + 1;
        this.f64080e.a(i6 == 0 ? '0' : '1');
        f64075f++;
        return i6;
    }

    public boolean i() throws IOException {
        return h() == 1;
    }

    public int j() throws IOException {
        if (this.f64079d > 0) {
            a();
        }
        int i4 = this.f64077b;
        a();
        return i4;
    }

    public long k(int i4) throws IOException {
        if (i4 > 64) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᐹ\u0001"));
        }
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = (j4 << 1) | h();
        }
        return j4;
    }

    public long l() throws IOException {
        return k(8 - this.f64079d);
    }
}
