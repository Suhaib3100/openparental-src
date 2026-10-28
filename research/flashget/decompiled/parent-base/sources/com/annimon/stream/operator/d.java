package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: DoubleFilter.java */
/* loaded from: classes3.dex */
public class d extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final g.a f41607b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.l f41608c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41609d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41610e;

    /* renamed from: f, reason: collision with root package name */
    private double f41611f;

    public d(g.a aVar, com.annimon.stream.function.l lVar) {
        this.f41607b = aVar;
        this.f41608c = lVar;
    }

    private void c() {
        while (this.f41607b.hasNext()) {
            double b5 = this.f41607b.b();
            this.f41611f = b5;
            if (this.f41608c.d(b5)) {
                this.f41609d = true;
                return;
            }
        }
        this.f41609d = false;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        if (!this.f41610e) {
            this.f41609d = hasNext();
        }
        if (!this.f41609d) {
            throw new NoSuchElementException();
        }
        this.f41610e = false;
        return this.f41611f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f41610e) {
            c();
            this.f41610e = true;
        }
        return this.f41609d;
    }
}
