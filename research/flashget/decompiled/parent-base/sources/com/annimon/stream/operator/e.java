package com.annimon.stream.operator;

import com.annimon.stream.iterator.f;
import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: DoubleFilterIndexed.java */
/* loaded from: classes3.dex */
public class e extends g.a {

    /* renamed from: b, reason: collision with root package name */
    private final f.a f41618b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.v f41619c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41620d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41621e;

    /* renamed from: f, reason: collision with root package name */
    private double f41622f;

    public e(f.a aVar, com.annimon.stream.function.v vVar) {
        this.f41618b = aVar;
        this.f41619c = vVar;
    }

    private void c() {
        while (this.f41618b.hasNext()) {
            int c5 = this.f41618b.c();
            double doubleValue = this.f41618b.next().doubleValue();
            this.f41622f = doubleValue;
            if (this.f41619c.a(c5, doubleValue)) {
                this.f41620d = true;
                return;
            }
        }
        this.f41620d = false;
    }

    @Override // com.annimon.stream.iterator.g.a
    public double b() {
        if (!this.f41621e) {
            this.f41620d = hasNext();
        }
        if (!this.f41620d) {
            throw new NoSuchElementException();
        }
        this.f41621e = false;
        return this.f41622f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f41621e) {
            c();
            this.f41621e = true;
        }
        return this.f41620d;
    }
}
