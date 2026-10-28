package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntLimit.java */
/* loaded from: classes3.dex */
public class f0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41632b;

    /* renamed from: c, reason: collision with root package name */
    private final long f41633c;

    /* renamed from: d, reason: collision with root package name */
    private long f41634d = 0;

    public f0(g.b bVar, long j4) {
        this.f41632b = bVar;
        this.f41633c = j4;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        this.f41634d++;
        return this.f41632b.b();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41634d < this.f41633c && this.f41632b.hasNext();
    }
}
