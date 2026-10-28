package com.annimon.stream.iterator;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: LsaIterator.java */
/* loaded from: classes3.dex */
public abstract class d<T> implements Iterator<T> {
    public abstract T a();

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            return a();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ߚ"));
    }
}
