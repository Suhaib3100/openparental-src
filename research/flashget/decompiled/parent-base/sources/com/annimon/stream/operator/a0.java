package com.annimon.stream.operator;

import com.annimon.stream.iterator.g;
import java.util.NoSuchElementException;

/* compiled from: IntFilter.java */
/* loaded from: classes3.dex */
public class a0 extends g.b {

    /* renamed from: b, reason: collision with root package name */
    private final g.b f41572b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.j0 f41573c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41574d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41575e;

    /* renamed from: f, reason: collision with root package name */
    private int f41576f;

    public a0(g.b bVar, com.annimon.stream.function.j0 j0Var) {
        this.f41572b = bVar;
        this.f41573c = j0Var;
    }

    private void c() {
        while (this.f41572b.hasNext()) {
            int b5 = this.f41572b.b();
            this.f41576f = b5;
            if (this.f41573c.test(b5)) {
                this.f41574d = true;
                return;
            }
        }
        this.f41574d = false;
    }

    @Override // com.annimon.stream.iterator.g.b
    public int b() {
        if (!this.f41575e) {
            this.f41574d = hasNext();
        }
        if (!this.f41574d) {
            throw new NoSuchElementException();
        }
        this.f41575e = false;
        return this.f41576f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f41575e) {
            c();
            this.f41575e = true;
        }
        return this.f41574d;
    }
}
