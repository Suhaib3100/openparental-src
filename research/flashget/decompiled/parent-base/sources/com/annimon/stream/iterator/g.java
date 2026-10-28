package com.annimon.stream.iterator;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;

/* compiled from: PrimitiveIterator.java */
/* loaded from: classes3.dex */
public final class g {

    /* compiled from: PrimitiveIterator.java */
    public static abstract class a implements Iterator<Double> {
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Double next() {
            return Double.valueOf(b());
        }

        public abstract double b();

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\u07bd"));
        }
    }

    /* compiled from: PrimitiveIterator.java */
    public static abstract class b implements Iterator<Integer> {
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer next() {
            return Integer.valueOf(b());
        }

        public abstract int b();

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("߇"));
        }
    }

    /* compiled from: PrimitiveIterator.java */
    public static abstract class c implements Iterator<Long> {
        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long next() {
            return Long.valueOf(b());
        }

        public abstract long b();

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ߍ"));
        }
    }

    private g() {
    }
}
