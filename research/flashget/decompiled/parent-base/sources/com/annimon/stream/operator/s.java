package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: DoubleSkip.java */
/* loaded from: classes3.dex */
public class s extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41753b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41754c;

    /* renamed from: d, reason: collision with root package name */
    private long f41755d = 0;

    public s(g.a aVar, long j4) {
        this.f41753b = aVar;
        this.f41754c = j4;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        return this.f41753b.b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (this.f41753b.hasNext() && this.f41755d != this.f41754c) {
            this.f41753b.b();
            this.f41755d++;
        }
        return this.f41753b.hasNext();
    }
}
