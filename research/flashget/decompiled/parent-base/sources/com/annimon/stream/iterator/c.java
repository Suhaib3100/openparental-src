package com.annimon.stream.iterator;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: LsaExtIterator.java */
/* loaded from: classes3.dex */
public abstract class c<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    protected T f41516b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f41517c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f41518d;

    protected abstract void a();

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f41518d) {
            a();
            this.f41518d = true;
        }
        return this.f41517c;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f41518d) {
            hasNext();
        }
        if (!this.f41517c) {
            throw new NoSuchElementException();
        }
        T t4 = this.f41516b;
        a();
        if (!this.f41517c) {
            this.f41516b = null;
        }
        return t4;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ߙ"));
    }
}
