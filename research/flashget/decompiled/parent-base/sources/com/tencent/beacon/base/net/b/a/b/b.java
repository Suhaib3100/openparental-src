package com.tencent.beacon.base.net.b.a.b;

import java.io.IOException;

/* compiled from: Decoder.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    com.tencent.beacon.base.net.b.a.a.c f71202a = new com.tencent.beacon.base.net.b.a.a.c();

    /* renamed from: b, reason: collision with root package name */
    com.tencent.beacon.base.net.b.a.c.c f71203b = new com.tencent.beacon.base.net.b.a.c.c();

    /* renamed from: c, reason: collision with root package name */
    short[] f71204c = new short[192];

    /* renamed from: d, reason: collision with root package name */
    short[] f71205d = new short[12];

    /* renamed from: e, reason: collision with root package name */
    short[] f71206e = new short[12];

    /* renamed from: f, reason: collision with root package name */
    short[] f71207f = new short[12];

    /* renamed from: g, reason: collision with root package name */
    short[] f71208g = new short[12];

    /* renamed from: h, reason: collision with root package name */
    short[] f71209h = new short[192];

    /* renamed from: i, reason: collision with root package name */
    com.tencent.beacon.base.net.b.a.c.a[] f71210i = new com.tencent.beacon.base.net.b.a.c.a[4];

    /* renamed from: j, reason: collision with root package name */
    short[] f71211j = new short[114];

    /* renamed from: k, reason: collision with root package name */
    com.tencent.beacon.base.net.b.a.c.a f71212k = new com.tencent.beacon.base.net.b.a.c.a(4);

    /* renamed from: l, reason: collision with root package name */
    a f71213l = new a();

    /* renamed from: m, reason: collision with root package name */
    a f71214m = new a();

    /* renamed from: n, reason: collision with root package name */
    C0998b f71215n = new C0998b();

    /* renamed from: o, reason: collision with root package name */
    int f71216o = -1;

    /* renamed from: p, reason: collision with root package name */
    int f71217p = -1;

    /* renamed from: q, reason: collision with root package name */
    int f71218q;

    public b() {
        for (int i4 = 0; i4 < 4; i4++) {
            this.f71210i[i4] = new com.tencent.beacon.base.net.b.a.c.a(6);
        }
    }

    boolean a(int i4) {
        if (i4 < 0) {
            return false;
        }
        if (this.f71216o != i4) {
            this.f71216o = i4;
            int max = Math.max(i4, 1);
            this.f71217p = max;
            this.f71202a.a(Math.max(max, 4096));
        }
        return true;
    }

    /* compiled from: Decoder.java */
    class a {

        /* renamed from: a, reason: collision with root package name */
        short[] f71219a = new short[2];

        /* renamed from: b, reason: collision with root package name */
        com.tencent.beacon.base.net.b.a.c.a[] f71220b = new com.tencent.beacon.base.net.b.a.c.a[16];

        /* renamed from: c, reason: collision with root package name */
        com.tencent.beacon.base.net.b.a.c.a[] f71221c = new com.tencent.beacon.base.net.b.a.c.a[16];

        /* renamed from: d, reason: collision with root package name */
        com.tencent.beacon.base.net.b.a.c.a f71222d = new com.tencent.beacon.base.net.b.a.c.a(8);

        /* renamed from: e, reason: collision with root package name */
        int f71223e = 0;

        a() {
        }

        public void a(int i4) {
            while (true) {
                int i5 = this.f71223e;
                if (i5 >= i4) {
                    return;
                }
                this.f71220b[i5] = new com.tencent.beacon.base.net.b.a.c.a(3);
                this.f71221c[this.f71223e] = new com.tencent.beacon.base.net.b.a.c.a(3);
                this.f71223e++;
            }
        }

        public void a() {
            com.tencent.beacon.base.net.b.a.c.c.a(this.f71219a);
            for (int i4 = 0; i4 < this.f71223e; i4++) {
                this.f71220b[i4].a();
                this.f71221c[i4].a();
            }
            this.f71222d.a();
        }

        public int a(com.tencent.beacon.base.net.b.a.c.c cVar, int i4) throws IOException {
            if (cVar.a(this.f71219a, 0) == 0) {
                return this.f71220b[i4].a(cVar);
            }
            if (cVar.a(this.f71219a, 1) == 0) {
                return this.f71221c[i4].a(cVar) + 8;
            }
            return this.f71222d.a(cVar) + 16;
        }
    }

    boolean a(int i4, int i5, int i6) {
        if (i4 > 8 || i5 > 4 || i6 > 4) {
            return false;
        }
        this.f71215n.a(i5, i4);
        int i7 = 1 << i6;
        this.f71213l.a(i7);
        this.f71214m.a(i7);
        this.f71218q = i7 - 1;
        return true;
    }

    /* compiled from: Decoder.java */
    /* renamed from: com.tencent.beacon.base.net.b.a.b.b$b, reason: collision with other inner class name */
    class C0998b {

        /* renamed from: a, reason: collision with root package name */
        a[] f71225a;

        /* renamed from: b, reason: collision with root package name */
        int f71226b;

        /* renamed from: c, reason: collision with root package name */
        int f71227c;

        /* renamed from: d, reason: collision with root package name */
        int f71228d;

        /* compiled from: Decoder.java */
        /* renamed from: com.tencent.beacon.base.net.b.a.b.b$b$a */
        class a {

            /* renamed from: a, reason: collision with root package name */
            short[] f71230a = new short[768];

            a() {
            }

            public void a() {
                com.tencent.beacon.base.net.b.a.c.c.a(this.f71230a);
            }

            public byte a(com.tencent.beacon.base.net.b.a.c.c cVar) throws IOException {
                int i4 = 1;
                do {
                    i4 = cVar.a(this.f71230a, i4) | (i4 << 1);
                } while (i4 < 256);
                return (byte) i4;
            }

            public byte a(com.tencent.beacon.base.net.b.a.c.c cVar, byte b5) throws IOException {
                int i4 = 1;
                while (true) {
                    int i5 = (b5 >> 7) & 1;
                    b5 = (byte) (b5 << 1);
                    int a5 = cVar.a(this.f71230a, ((i5 + 1) << 8) + i4);
                    i4 = (i4 << 1) | a5;
                    if (i5 != a5) {
                        while (i4 < 256) {
                            i4 = (i4 << 1) | cVar.a(this.f71230a, i4);
                        }
                    } else if (i4 >= 256) {
                        break;
                    }
                }
                return (byte) i4;
            }
        }

        C0998b() {
        }

        public void a(int i4, int i5) {
            if (this.f71225a != null && this.f71226b == i5 && this.f71227c == i4) {
                return;
            }
            this.f71227c = i4;
            this.f71228d = (1 << i4) - 1;
            this.f71226b = i5;
            int i6 = 1 << (i5 + i4);
            this.f71225a = new a[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                this.f71225a[i7] = new a();
            }
        }

        public void a() {
            int i4 = 1 << (this.f71226b + this.f71227c);
            for (int i5 = 0; i5 < i4; i5++) {
                this.f71225a[i5].a();
            }
        }

        a a(int i4, byte b5) {
            a[] aVarArr = this.f71225a;
            int i5 = i4 & this.f71228d;
            int i6 = this.f71226b;
            return aVarArr[(i5 << i6) + ((b5 & 255) >>> (8 - i6))];
        }
    }

    void a() throws IOException {
        this.f71202a.a(false);
        com.tencent.beacon.base.net.b.a.c.c.a(this.f71204c);
        com.tencent.beacon.base.net.b.a.c.c.a(this.f71209h);
        com.tencent.beacon.base.net.b.a.c.c.a(this.f71205d);
        com.tencent.beacon.base.net.b.a.c.c.a(this.f71206e);
        com.tencent.beacon.base.net.b.a.c.c.a(this.f71207f);
        com.tencent.beacon.base.net.b.a.c.c.a(this.f71208g);
        com.tencent.beacon.base.net.b.a.c.c.a(this.f71211j);
        this.f71215n.a();
        for (int i4 = 0; i4 < 4; i4++) {
            this.f71210i[i4].a();
        }
        this.f71213l.a();
        this.f71214m.a();
        this.f71212k.a();
        this.f71203b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0119, code lost:
    
        r17.f71202a.a();
        r17.f71202a.b();
        r17.f71203b.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0128, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.io.InputStream r18, java.io.OutputStream r19, long r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.base.net.b.a.b.b.a(java.io.InputStream, java.io.OutputStream, long):boolean");
    }

    public boolean a(byte[] bArr) {
        if (bArr.length < 5) {
            return false;
        }
        int i4 = bArr[0] & 255;
        int i5 = i4 % 9;
        int i6 = i4 / 9;
        int i7 = i6 % 5;
        int i10 = i6 / 5;
        int i11 = 0;
        int i12 = 0;
        while (i11 < 4) {
            int i13 = i11 + 1;
            i12 += (bArr[i13] & 255) << (i11 * 8);
            i11 = i13;
        }
        if (a(i5, i7, i10)) {
            return a(i12);
        }
        return false;
    }
}
