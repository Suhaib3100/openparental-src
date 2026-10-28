package com.tencent.beacon.base.net.b.a.c;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: RCEncoder.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static int[] f71296a = new int[512];

    /* renamed from: b, reason: collision with root package name */
    OutputStream f71297b;

    /* renamed from: c, reason: collision with root package name */
    long f71298c;

    /* renamed from: d, reason: collision with root package name */
    int f71299d;

    /* renamed from: e, reason: collision with root package name */
    int f71300e;

    /* renamed from: f, reason: collision with root package name */
    int f71301f;

    /* renamed from: g, reason: collision with root package name */
    long f71302g;

    static {
        for (int i4 = 8; i4 >= 0; i4--) {
            int i5 = 8 - i4;
            int i6 = 1 << (9 - i4);
            for (int i7 = 1 << i5; i7 < i6; i7++) {
                f71296a[i7] = (i4 << 6) + (((i6 - i7) << 6) >>> i5);
            }
        }
    }

    public void a(OutputStream outputStream) {
        this.f71297b = outputStream;
    }

    public void b() throws IOException {
        this.f71297b.flush();
    }

    public long c() {
        return this.f71300e + this.f71302g + 4;
    }

    public void d() {
        this.f71302g = 0L;
        this.f71298c = 0L;
        this.f71299d = -1;
        this.f71300e = 1;
        this.f71301f = 0;
    }

    public void e() {
        this.f71297b = null;
    }

    public void f() throws IOException {
        long j4 = this.f71298c;
        int i4 = (int) (j4 >>> 32);
        if (i4 != 0 || j4 < 4278190080L) {
            this.f71302g += this.f71300e;
            int i5 = this.f71301f;
            while (true) {
                this.f71297b.write(i5 + i4);
                int i6 = this.f71300e - 1;
                this.f71300e = i6;
                if (i6 == 0) {
                    break;
                } else {
                    i5 = 255;
                }
            }
            this.f71301f = ((int) this.f71298c) >>> 24;
        }
        this.f71300e++;
        this.f71298c = (this.f71298c & 16777215) << 8;
    }

    public static int b(int i4, int i5) {
        return f71296a[(((i4 - i5) ^ (-i5)) & 2047) >>> 2];
    }

    public void a() throws IOException {
        for (int i4 = 0; i4 < 5; i4++) {
            f();
        }
    }

    public static int b(int i4) {
        return f71296a[(2048 - i4) >>> 2];
    }

    public void a(int i4, int i5) throws IOException {
        for (int i6 = i5 - 1; i6 >= 0; i6--) {
            int i7 = this.f71299d >>> 1;
            this.f71299d = i7;
            if (((i4 >>> i6) & 1) == 1) {
                this.f71298c += i7;
            }
            if (((-16777216) & i7) == 0) {
                this.f71299d = i7 << 8;
                f();
            }
        }
    }

    public static void a(short[] sArr) {
        for (int i4 = 0; i4 < sArr.length; i4++) {
            sArr[i4] = 1024;
        }
    }

    public void a(short[] sArr, int i4, int i5) throws IOException {
        short s4 = sArr[i4];
        int i6 = this.f71299d;
        int i7 = (i6 >>> 11) * s4;
        if (i5 == 0) {
            this.f71299d = i7;
            sArr[i4] = (short) (s4 + ((2048 - s4) >>> 5));
        } else {
            this.f71298c += i7 & 4294967295L;
            this.f71299d = i6 - i7;
            sArr[i4] = (short) (s4 - (s4 >>> 5));
        }
        int i10 = this.f71299d;
        if (((-16777216) & i10) == 0) {
            this.f71299d = i10 << 8;
            f();
        }
    }

    public static int a(int i4) {
        return f71296a[i4 >>> 2];
    }
}
