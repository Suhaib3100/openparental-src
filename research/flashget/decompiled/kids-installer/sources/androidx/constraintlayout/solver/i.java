package androidx.constraintlayout.solver;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f2205a = false;

    /* compiled from: Pools.java */
    interface a<T> {
        boolean a(T t5);

        T b();

        void c(T[] tArr, int i5);
    }

    /* compiled from: Pools.java */
    /* loaded from: classes2.dex */
    static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object[] f2206a;

        /* renamed from: b, reason: collision with root package name */
        private int f2207b;

        b(int i5) {
            if (i5 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f2206a = new Object[i5];
        }

        private boolean d(T t5) {
            for (int i5 = 0; i5 < this.f2207b; i5++) {
                if (this.f2206a[i5] == t5) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.solver.i.a
        public boolean a(T t5) {
            int i5 = this.f2207b;
            Object[] objArr = this.f2206a;
            if (i5 >= objArr.length) {
                return false;
            }
            objArr[i5] = t5;
            this.f2207b = i5 + 1;
            return true;
        }

        @Override // androidx.constraintlayout.solver.i.a
        public T b() {
            int i5 = this.f2207b;
            if (i5 <= 0) {
                return null;
            }
            int i6 = i5 - 1;
            Object[] objArr = this.f2206a;
            T t5 = (T) objArr[i6];
            objArr[i6] = null;
            this.f2207b = i5 - 1;
            return t5;
        }

        @Override // androidx.constraintlayout.solver.i.a
        public void c(T[] tArr, int i5) {
            if (i5 > tArr.length) {
                i5 = tArr.length;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                T t5 = tArr[i6];
                int i7 = this.f2207b;
                Object[] objArr = this.f2206a;
                if (i7 < objArr.length) {
                    objArr[i7] = t5;
                    this.f2207b = i7 + 1;
                }
            }
        }
    }

    private i() {
    }
}
