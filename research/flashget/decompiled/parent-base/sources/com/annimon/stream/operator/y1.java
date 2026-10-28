package com.annimon.stream.operator;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ObjFilter.java */
/* loaded from: classes3.dex */
public class y1<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41823b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.z0<? super T> f41824c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41825d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41826e;

    /* renamed from: f, reason: collision with root package name */
    private T f41827f;

    public y1(Iterator<? extends T> it, com.annimon.stream.function.z0<? super T> z0Var) {
        this.f41823b = it;
        this.f41824c = z0Var;
    }

    private void a() {
        while (this.f41823b.hasNext()) {
            T next = this.f41823b.next();
            this.f41827f = next;
            if (this.f41824c.test(next)) {
                this.f41825d = true;
                return;
            }
        }
        this.f41825d = false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f41826e) {
            a();
            this.f41826e = true;
        }
        return this.f41825d;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f41826e) {
            this.f41825d = hasNext();
        }
        if (!this.f41825d) {
            throw new NoSuchElementException();
        }
        this.f41826e = false;
        return this.f41827f;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("߭"));
    }
}
