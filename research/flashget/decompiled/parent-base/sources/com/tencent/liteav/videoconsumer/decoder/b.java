package com.tencent.liteav.videoconsumer.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    int f72424b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f72425c;

    /* renamed from: d, reason: collision with root package name */
    private int f72426d;

    /* renamed from: e, reason: collision with root package name */
    private int f72427e;

    /* renamed from: f, reason: collision with root package name */
    private final OutputStream f72428f;

    /* renamed from: h, reason: collision with root package name */
    private int f72430h;

    /* renamed from: a, reason: collision with root package name */
    protected a f72423a = new a();

    /* renamed from: g, reason: collision with root package name */
    private int[] f72429g = new int[8];

    public b(InputStream inputStream, OutputStream outputStream) throws IOException {
        this.f72425c = inputStream;
        this.f72428f = outputStream;
        this.f72426d = inputStream.read();
        this.f72427e = inputStream.read();
    }

    private int c(boolean z4) throws IOException {
        if (this.f72424b == 8) {
            f();
            if (this.f72426d == -1) {
                return -1;
            }
        }
        int i4 = this.f72426d;
        int i5 = this.f72424b;
        int i6 = (i4 >> (7 - i5)) & 1;
        this.f72424b = i5 + 1;
        if (z4 && this.f72428f != null) {
            f(i6);
        }
        return i6;
    }

    private long e(int i4) throws IOException {
        if (i4 > 64) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嘅\u0001"));
        }
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = (j4 << 1) | c(true);
        }
        return j4;
    }

    private void f() throws IOException {
        this.f72426d = this.f72427e;
        this.f72427e = this.f72425c.read();
        this.f72424b = 0;
    }

    private int g() throws IOException {
        int i4 = 0;
        while (c(true) == 0) {
            i4++;
        }
        if (i4 <= 0) {
            return 0;
        }
        return (int) (((1 << i4) - 1) + e(i4));
    }

    private void h() throws IOException {
        int[] iArr = this.f72429g;
        this.f72428f.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    public final boolean a(boolean z4) throws IOException {
        return c(z4) == 1;
    }

    public final void b(int i4) throws IOException {
        a(i4);
    }

    public final void d() throws IOException {
        int i4 = 0;
        while (c(true) == 0) {
            i4++;
        }
        if (i4 > 0) {
            a(i4);
        }
    }

    public final long a() throws IOException {
        long e4 = e(8);
        String.valueOf(e4);
        return e4;
    }

    public final int b() throws IOException {
        int i4 = 0;
        while (c(false) == 0) {
            i4++;
        }
        if (i4 <= 0) {
            return 0;
        }
        if (i4 > 64) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嘅\u0001"));
        }
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = (j4 << 1) | c(false);
        }
        return (int) (((1 << i4) - 1) + j4);
    }

    public final void d(int i4) throws IOException {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= 15) {
                break;
            }
            int i10 = (1 << i6) + i7;
            if (i4 < i10) {
                i5 = i6;
                break;
            } else {
                i6++;
                i7 = i10;
            }
        }
        a(0L, i5);
        f(1);
        a(i4 - i7, i5);
    }

    public final void e() throws IOException {
        f(1);
        a(0L, 8 - this.f72430h);
        for (int i4 = this.f72430h; i4 < 8; i4++) {
            this.f72429g[i4] = 0;
        }
        this.f72430h = 0;
        h();
    }

    private void f(int i4) throws IOException {
        if (this.f72430h == 8) {
            this.f72430h = 0;
            h();
        }
        int[] iArr = this.f72429g;
        int i5 = this.f72430h;
        this.f72430h = i5 + 1;
        iArr[i5] = i4;
    }

    public final void a(int i4) throws IOException {
        if (i4 > 64) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嘆\u0001"));
        }
        for (int i5 = 0; i5 < i4; i5++) {
            c(true);
        }
    }

    public final void b(boolean z4) throws IOException {
        f(z4 ? 1 : 0);
    }

    private void a(long j4, int i4) throws IOException {
        for (int i5 = 0; i5 < i4; i5++) {
            f(((int) (j4 >> ((i4 - i5) - 1))) & 1);
        }
    }

    public final int c() throws IOException {
        int g4 = g();
        String.valueOf(g4);
        return g4;
    }

    public final void c(int i4) throws IOException {
        int[] iArr = new int[i4];
        int i5 = 8;
        int i6 = 8;
        for (int i7 = 0; i7 < i4; i7++) {
            if (i5 != 0) {
                int g4 = g();
                int i10 = ((g4 >> 1) + (g4 & 1)) * ((r4 << 1) - 1);
                String.valueOf(i10);
                i5 = ((i10 + i6) + 256) % 256;
            }
            if (i5 != 0) {
                i6 = i5;
            }
            iArr[i7] = i6;
        }
    }
}
