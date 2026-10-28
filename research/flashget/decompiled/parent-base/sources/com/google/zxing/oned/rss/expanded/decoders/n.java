package com.google.zxing.oned.rss.expanded.decoders;

/* compiled from: DecodedChar.java */
/* loaded from: classes6.dex */
final class n extends q {

    /* renamed from: c, reason: collision with root package name */
    static final char f63126c = '$';

    /* renamed from: b, reason: collision with root package name */
    private final char f63127b;

    n(int i4, char c5) {
        super(i4);
        this.f63127b = c5;
    }

    char b() {
        return this.f63127b;
    }

    boolean c() {
        return this.f63127b == '$';
    }
}
