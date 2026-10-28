package androidx.constraintlayout.core;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f21887a = false;

    /* compiled from: Pools.java */
    interface a<T> {
        void a(T[] tArr, int i4);

        T acquire();

        boolean release(T t4);
    }

    /* compiled from: Pools.java */
    static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f21888a;

        /* renamed from: b, reason: collision with root package name */
        private int f21889b;

        b(int i4) {
            if (i4 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f21888a = new Object[i4];
        }

        private boolean b(T t4) {
            for (int i4 = 0; i4 < this.f21889b; i4++) {
                if (this.f21888a[i4] == t4) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.h.a
        public void a(T[] tArr, int i4) {
            if (i4 > tArr.length) {
                i4 = tArr.length;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                T t4 = tArr[i5];
                int i6 = this.f21889b;
                Object[] objArr = this.f21888a;
                if (i6 < objArr.length) {
                    objArr[i6] = t4;
                    this.f21889b = i6 + 1;
                }
            }
        }

        @Override // androidx.constraintlayout.core.h.a
        public T acquire() {
            int i4 = this.f21889b;
            if (i4 <= 0) {
                return null;
            }
            int i5 = i4 - 1;
            Object[] objArr = this.f21888a;
            T t4 = (T) objArr[i5];
            objArr[i5] = null;
            this.f21889b = i4 - 1;
            return t4;
        }

        @Override // androidx.constraintlayout.core.h.a
        public boolean release(T t4) {
            int i4 = this.f21889b;
            Object[] objArr = this.f21888a;
            if (i4 >= objArr.length) {
                return false;
            }
            objArr[i4] = t4;
            this.f21889b = i4 + 1;
            return true;
        }
    }

    private h() {
    }
}
