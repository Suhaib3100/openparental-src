package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: LongFilter.java */
/* loaded from: classes3.dex */
public class x0 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final g.c f41805b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.r0 f41806c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41807d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41808e;

    /* renamed from: f, reason: collision with root package name */
    private long f41809f;

    public x0(g.c cVar, com.annimon.stream.function.r0 r0Var) {
        this.f41805b = cVar;
        this.f41806c = r0Var;
    }

    private void c() {
        while (this.f41805b.hasNext()) {
            long b5 = this.f41805b.b();
            this.f41809f = b5;
            if (this.f41806c.d(b5)) {
                this.f41807d = true;
                return;
            }
        }
        this.f41807d = false;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        if (!this.f41808e) {
            this.f41807d = hasNext();
        }
        if (!this.f41807d) {
            throw new NoSuchElementException();
        }
        this.f41808e = false;
        return this.f41809f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f41808e) {
            c();
            this.f41808e = true;
        }
        return this.f41807d;
    }
}
