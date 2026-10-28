package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

/* compiled from: BitReaderBuffer.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    int f63961a;

    /* renamed from: b, reason: collision with root package name */
    int f63962b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer f63963c;

    public c(ByteBuffer byteBuffer) {
        this.f63963c = byteBuffer;
        this.f63961a = byteBuffer.position();
    }

    public int a() {
        int i4 = 8 - (this.f63962b % 8);
        if (i4 == 8) {
            i4 = 0;
        }
        c(i4);
        return i4;
    }

    public int b() {
        return this.f63962b;
    }

    public int c(int i4) {
        int c5;
        int i5 = this.f63963c.get((this.f63962b / 8) + this.f63961a);
        if (i5 < 0) {
            i5 += 256;
        }
        int i6 = this.f63962b;
        int i7 = 8 - (i6 % 8);
        if (i4 <= i7) {
            c5 = ((i5 << (i6 % 8)) & 255) >> ((i7 - i4) + (i6 % 8));
            this.f63962b = i6 + i4;
        } else {
            int i10 = i4 - i7;
            c5 = (c(i7) << i10) + c(i10);
        }
        this.f63963c.position(this.f63961a + ((int) Math.ceil(this.f63962b / 8.0d)));
        return c5;
    }

    public boolean d() {
        return c(1) == 1;
    }

    public int e() {
        return (this.f63963c.limit() * 8) - this.f63962b;
    }
}
