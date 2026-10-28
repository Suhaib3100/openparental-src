package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntSkip.java */
/* loaded from: classes3.dex */
public class q0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41733b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41734c;

    /* renamed from: d, reason: collision with root package name */
    private long f41735d = 0;

    public q0(g.b bVar, long j4) {
        this.f41733b = bVar;
        this.f41734c = j4;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        return this.f41733b.b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (this.f41733b.hasNext() && this.f41735d != this.f41734c) {
            this.f41733b.b();
            this.f41735d++;
        }
        return this.f41733b.hasNext();
    }
}
