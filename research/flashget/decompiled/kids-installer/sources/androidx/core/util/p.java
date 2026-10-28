package androidx.core.util;

import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public final class p {

    /* compiled from: Pools.java */
    public interface a<T> {
        boolean a(@o0 T t5);

        @q0
        T b();
    }

    /* compiled from: Pools.java */
    /* loaded from: classes3.dex */
    public static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f5279a;

        /* renamed from: b, reason: collision with root package name */
        private int f5280b;

        public b(int i5) {
            if (i5 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f5279a = new Object[i5];
        }

        private boolean c(@o0 T t5) {
            for (int i5 = 0; i5 < this.f5280b; i5++) {
                if (this.f5279a[i5] == t5) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.p.a
        public boolean a(@o0 T t5) {
            if (c(t5)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i5 = this.f5280b;
            Object[] objArr = this.f5279a;
            if (i5 >= objArr.length) {
                return false;
            }
            objArr[i5] = t5;
            this.f5280b = i5 + 1;
            return true;
        }

        @Override // androidx.core.util.p.a
        public T b() {
            int i5 = this.f5280b;
            if (i5 <= 0) {
                return null;
            }
            int i6 = i5 - 1;
            Object[] objArr = this.f5279a;
            T t5 = (T) objArr[i6];
            objArr[i6] = null;
            this.f5280b = i5 - 1;
            return t5;
        }
    }

    /* compiled from: Pools.java */
    /* loaded from: classes3.dex */
    public static class c<T> extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        private final Object f5281c;

        public c(int i5) {
            super(i5);
            this.f5281c = new Object();
        }

        @Override // androidx.core.util.p.b, androidx.core.util.p.a
        public boolean a(@o0 T t5) {
            boolean a6;
            synchronized (this.f5281c) {
                a6 = super.a(t5);
            }
            return a6;
        }

        @Override // androidx.core.util.p.b, androidx.core.util.p.a
        public T b() {
            T t5;
            synchronized (this.f5281c) {
                t5 = (T) super.b();
            }
            return t5;
        }
    }

    private p() {
    }
}
