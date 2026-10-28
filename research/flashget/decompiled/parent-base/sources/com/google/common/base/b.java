package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
@o
@d9.b
/* loaded from: classes6.dex */
abstract class b<T> implements Iterator<T> {

    /* renamed from: b, reason: collision with root package name */
    private EnumC0825b f54849b = EnumC0825b.NOT_READY;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private T f54850c;

    /* compiled from: AbstractIterator.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54851a;

        static {
            int[] iArr = new int[EnumC0825b.values().length];
            f54851a = iArr;
            try {
                iArr[EnumC0825b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54851a[EnumC0825b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AbstractIterator.java */
    /* renamed from: com.google.common.base.b$b, reason: collision with other inner class name */
    private enum EnumC0825b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f54849b = EnumC0825b.FAILED;
        this.f54850c = a();
        if (this.f54849b == EnumC0825b.DONE) {
            return false;
        }
        this.f54849b = EnumC0825b.READY;
        return true;
    }

    @zc.a
    protected abstract T a();

    @zc.a
    @f9.a
    protected final T b() {
        this.f54849b = EnumC0825b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l0.g0(this.f54849b != EnumC0825b.FAILED);
        int i4 = a.f54851a[this.f54849b.ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    @i0
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f54849b = EnumC0825b.NOT_READY;
        T t4 = this.f54850c;
        this.f54850c = null;
        return t4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
