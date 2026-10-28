package com.tencent.beacon.base.net.b.a.c;

import java.io.IOException;

/* compiled from: BitTreeDecoder.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    short[] f71289a;

    /* renamed from: b, reason: collision with root package name */
    int f71290b;

    public a(int i4) {
        this.f71290b = i4;
        this.f71289a = new short[1 << i4];
    }

    public void a() {
        c.a(this.f71289a);
    }

    public int b(c cVar) throws IOException {
        int i4 = 1;
        int i5 = 0;
        for (int i6 = 0; i6 < this.f71290b; i6++) {
            int a5 = cVar.a(this.f71289a, i4);
            i4 = (i4 << 1) + a5;
            i5 |= a5 << i6;
        }
        return i5;
    }

    public int a(c cVar) throws IOException {
        int i4 = 1;
        for (int i5 = this.f71290b; i5 != 0; i5--) {
            i4 = cVar.a(this.f71289a, i4) + (i4 << 1);
        }
        return i4 - (1 << this.f71290b);
    }

    public static int a(short[] sArr, int i4, c cVar, int i5) throws IOException {
        int i6 = 1;
        int i7 = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            int a5 = cVar.a(sArr, i4 + i6);
            i6 = (i6 << 1) + a5;
            i7 |= a5 << i10;
        }
        return i7;
    }
}
