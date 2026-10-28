package com.annimon.stream.operator;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ObjFilterIndexed.java */
/* loaded from: classes3.dex */
public class z1<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    private final com.annimon.stream.iterator.a<? extends T> f41834b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.f0<? super T> f41835c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41836d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41837e;

    /* renamed from: f, reason: collision with root package name */
    private T f41838f;

    public z1(com.annimon.stream.iterator.a<? extends T> aVar, com.annimon.stream.function.f0<? super T> f0Var) {
        this.f41834b = aVar;
        this.f41835c = f0Var;
    }

    private void a() {
        while (this.f41834b.hasNext()) {
            int a5 = this.f41834b.a();
            T next = this.f41834b.next();
            this.f41838f = next;
            if (this.f41835c.a(a5, next)) {
                this.f41836d = true;
                return;
            }
        }
        this.f41836d = false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f41837e) {
            a();
            this.f41837e = true;
        }
        return this.f41836d;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f41837e) {
            this.f41836d = hasNext();
        }
        if (!this.f41836d) {
            throw new NoSuchElementException();
        }
        this.f41837e = false;
        return this.f41838f;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("߮"));
    }
}
