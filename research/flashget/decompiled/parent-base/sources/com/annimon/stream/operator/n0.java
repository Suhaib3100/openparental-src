package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntSample.java */
/* loaded from: classes3.dex */
public class n0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41705b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41706c;

    public n0(g.b bVar, int i4) {
        this.f41705b = bVar;
        this.f41706c = i4;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        int b5 = this.f41705b.b();
        for (int i4 = 1; i4 < this.f41706c && this.f41705b.hasNext(); i4++) {
            this.f41705b.b();
        }
        return b5;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41705b.hasNext();
    }
}
