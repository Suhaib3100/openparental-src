package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;

/* compiled from: IntRangeClosed.java */
/* loaded from: classes3.dex */
public class m0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final int f41691b;

    /* renamed from: c, reason: collision with root package name */
    private int f41692c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41693d;

    public m0(int i4, int i5) {
        this.f41691b = i5;
        this.f41692c = i4;
        this.f41693d = i4 <= i5;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        int i4 = this.f41692c;
        int i5 = this.f41691b;
        if (i4 >= i5) {
            this.f41693d = false;
            return i5;
        }
        this.f41692c = i4 + 1;
        return i4;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41693d;
    }
}
