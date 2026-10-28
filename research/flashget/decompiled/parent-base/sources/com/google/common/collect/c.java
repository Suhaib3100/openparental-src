package com.google.common.collect;

import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class c<T> extends e7<T> {

    /* renamed from: b, reason: collision with root package name */
    private b f55404b = b.NOT_READY;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private T f55405c;

    /* compiled from: AbstractIterator.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55406a;

        static {
            int[] iArr = new int[b.values().length];
            f55406a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55406a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AbstractIterator.java */
    private enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected c() {
    }

    private boolean c() {
        this.f55404b = b.FAILED;
        this.f55405c = a();
        if (this.f55404b == b.DONE) {
            return false;
        }
        this.f55404b = b.READY;
        return true;
    }

    @zc.a
    protected abstract T a();

    @zc.a
    @f9.a
    protected final T b() {
        this.f55404b = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    @f9.a
    public final boolean hasNext() {
        com.google.common.base.l0.g0(this.f55404b != b.FAILED);
        int i4 = a.f55406a[this.f55404b.ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    @f5
    @f9.a
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f55404b = b.NOT_READY;
        T t4 = this.f55405c;
        this.f55405c = null;
        return t4;
    }

    @f5
    public final T peek() {
        if (hasNext()) {
            return this.f55405c;
        }
        throw new NoSuchElementException();
    }
}
