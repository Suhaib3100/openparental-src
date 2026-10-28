package com.annimon.stream.operator;

import com.annimon.stream.iterator.f;
import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: LongFilterIndexed.java */
/* loaded from: classes3.dex */
public class y0 extends g.c {

    /* renamed from: b, reason: collision with root package name */
    private final f.c f41818b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.d0 f41819c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41820d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41821e;

    /* renamed from: f, reason: collision with root package name */
    private long f41822f;

    public y0(f.c cVar, com.annimon.stream.function.d0 d0Var) {
        this.f41818b = cVar;
        this.f41819c = d0Var;
    }

    private void c() {
        while (this.f41818b.hasNext()) {
            int c5 = this.f41818b.c();
            long longValue = this.f41818b.next().longValue();
            this.f41822f = longValue;
            if (this.f41819c.a(c5, longValue)) {
                this.f41820d = true;
                return;
            }
        }
        this.f41820d = false;
    }

    @Override // com.annimon.stream.iterator.g.c
    public long b() {
        if (!this.f41821e) {
            this.f41820d = hasNext();
        }
        if (!this.f41820d) {
            throw new NoSuchElementException();
        }
        this.f41821e = false;
        return this.f41822f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f41821e) {
            c();
            this.f41821e = true;
        }
        return this.f41820d;
    }
}
