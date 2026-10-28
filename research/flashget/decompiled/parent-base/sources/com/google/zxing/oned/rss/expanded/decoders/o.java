package com.google.zxing.oned.rss.expanded.decoders;

/* compiled from: DecodedInformation.java */
/* loaded from: classes6.dex */
final class o extends q {

    /* renamed from: b, reason: collision with root package name */
    private final String f63128b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63129c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f63130d;

    o(int i4, String str) {
        super(i4);
        this.f63128b = str;
        this.f63130d = false;
        this.f63129c = 0;
    }

    String b() {
        return this.f63128b;
    }

    int c() {
        return this.f63129c;
    }

    boolean d() {
        return this.f63130d;
    }

    o(int i4, String str, int i5) {
        super(i4);
        this.f63130d = true;
        this.f63129c = i5;
        this.f63128b = str;
    }
}
