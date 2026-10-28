package com.google.zxing.oned.rss.expanded.decoders;

/* compiled from: CurrentParsingState.java */
/* loaded from: classes6.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private int f63124a = 0;

    /* renamed from: b, reason: collision with root package name */
    private a f63125b = a.NUMERIC;

    /* compiled from: CurrentParsingState.java */
    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    m() {
    }

    int a() {
        return this.f63124a;
    }

    void b(int i4) {
        this.f63124a += i4;
    }

    boolean c() {
        return this.f63125b == a.ALPHA;
    }

    boolean d() {
        return this.f63125b == a.ISO_IEC_646;
    }

    boolean e() {
        return this.f63125b == a.NUMERIC;
    }

    void f() {
        this.f63125b = a.ALPHA;
    }

    void g() {
        this.f63125b = a.ISO_IEC_646;
    }

    void h() {
        this.f63125b = a.NUMERIC;
    }

    void i(int i4) {
        this.f63124a = i4;
    }
}
