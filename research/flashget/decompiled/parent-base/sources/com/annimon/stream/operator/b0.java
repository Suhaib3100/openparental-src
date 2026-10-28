package com.annimon.stream.operator;

import com.annimon.stream.iterator.f;
import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: IntFilterIndexed.java */
/* loaded from: classes3.dex */
public class b0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final f.b f41585b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.a0 f41586c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41587d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41588e;

    /* renamed from: f, reason: collision with root package name */
    private int f41589f;

    public b0(f.b bVar, com.annimon.stream.function.a0 a0Var) {
        this.f41585b = bVar;
        this.f41586c = a0Var;
    }

    private void c() {
        while (this.f41585b.hasNext()) {
            int c5 = this.f41585b.c();
            int intValue = this.f41585b.next().intValue();
            this.f41589f = intValue;
            if (this.f41586c.a(c5, intValue)) {
                this.f41587d = true;
                return;
            }
        }
        this.f41587d = false;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        if (!this.f41588e) {
            this.f41587d = hasNext();
        }
        if (!this.f41587d) {
            throw new NoSuchElementException();
        }
        this.f41588e = false;
        return this.f41589f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f41588e) {
            c();
            this.f41588e = true;
        }
        return this.f41587d;
    }
}
