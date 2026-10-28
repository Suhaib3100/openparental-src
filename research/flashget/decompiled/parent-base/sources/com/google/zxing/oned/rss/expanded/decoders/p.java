package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

/* compiled from: DecodedNumeric.java */
/* loaded from: classes6.dex */
final class p extends q {

    /* renamed from: d, reason: collision with root package name */
    static final int f63131d = 10;

    /* renamed from: b, reason: collision with root package name */
    private final int f63132b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63133c;

    p(int i4, int i5, int i6) throws FormatException {
        super(i4);
        if (i5 < 0 || i5 > 10 || i6 < 0 || i6 > 10) {
            throw FormatException.a();
        }
        this.f63132b = i5;
        this.f63133c = i6;
    }

    int b() {
        return this.f63132b;
    }

    int c() {
        return this.f63133c;
    }

    int d() {
        return (this.f63132b * 10) + this.f63133c;
    }

    boolean e() {
        return this.f63132b == 10;
    }

    boolean f() {
        return this.f63133c == 10;
    }
}
