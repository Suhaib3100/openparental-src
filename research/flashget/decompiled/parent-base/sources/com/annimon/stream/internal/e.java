package com.annimon.stream.internal;

import com.annimon.stream.function.h0;
import com.annimon.stream.function.j;
import com.annimon.stream.function.p0;
import com.annimon.stream.iterator.g;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: SpinedBuffer.java */
/* loaded from: classes3.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    static final int f41495a = 4;

    /* renamed from: b, reason: collision with root package name */
    static final int f41496b = 16;

    /* renamed from: c, reason: collision with root package name */
    private static final int f41497c = 30;

    /* renamed from: d, reason: collision with root package name */
    static final int f41498d = 8;

    /* compiled from: SpinedBuffer.java */
    static class a extends d<Double, double[], j> implements j {

        /* compiled from: SpinedBuffer.java */
        /* renamed from: com.annimon.stream.internal.e$a$a, reason: collision with other inner class name */
        class C0729a extends g.a {

            /* renamed from: b, reason: collision with root package name */
            long f41499b = 0;

            C0729a() {
            }

            @Override // com.annimon.stream.iterator.g.a
            public double b() {
                a aVar = a.this;
                long j4 = this.f41499b;
                this.f41499b = 1 + j4;
                return aVar.F(j4);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f41499b < a.this.q();
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.annimon.stream.internal.e.d
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public int b(double[] dArr) {
            return dArr.length;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public double F(long j4) {
            int l4 = l(j4);
            return (this.f41507d == 0 && l4 == 0) ? ((double[]) this.f41509f)[(int) j4] : ((double[][]) this.f41510g)[l4][(int) (j4 - this.f41508e[l4])];
        }

        @Override // com.annimon.stream.internal.e.d, java.lang.Iterable
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public g.a iterator() {
            return new C0729a();
        }

        @Override // com.annimon.stream.internal.e.d
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public double[] w(int i4) {
            return new double[i4];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.annimon.stream.internal.e.d
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public double[][] x(int i4) {
            return new double[i4][];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.annimon.stream.function.j
        public void c(double d5) {
            A();
            double[] dArr = (double[]) this.f41509f;
            int i4 = this.f41506c;
            this.f41506c = i4 + 1;
            dArr[i4] = d5;
        }

        a(int i4) {
            super(i4);
        }
    }

    /* compiled from: SpinedBuffer.java */
    static class b extends d<Integer, int[], h0> implements h0 {

        /* compiled from: SpinedBuffer.java */
        class a extends g.b {

            /* renamed from: b, reason: collision with root package name */
            long f41501b = 0;

            a() {
            }

            @Override // com.annimon.stream.iterator.g.b
            public int b() {
                b bVar = b.this;
                long j4 = this.f41501b;
                this.f41501b = 1 + j4;
                return bVar.F(j4);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f41501b < b.this.q();
            }
        }

        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.annimon.stream.internal.e.d
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public int b(int[] iArr) {
            return iArr.length;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int F(long j4) {
            int l4 = l(j4);
            return (this.f41507d == 0 && l4 == 0) ? ((int[]) this.f41509f)[(int) j4] : ((int[][]) this.f41510g)[l4][(int) (j4 - this.f41508e[l4])];
        }

        @Override // com.annimon.stream.internal.e.d, java.lang.Iterable
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public g.b iterator() {
            return new a();
        }

        @Override // com.annimon.stream.internal.e.d
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public int[] w(int i4) {
            return new int[i4];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.annimon.stream.internal.e.d
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public int[][] x(int i4) {
            return new int[i4][];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.annimon.stream.function.h0
        public void f(int i4) {
            A();
            int[] iArr = (int[]) this.f41509f;
            int i5 = this.f41506c;
            this.f41506c = i5 + 1;
            iArr[i5] = i4;
        }

        b(int i4) {
            super(i4);
        }
    }

    /* compiled from: SpinedBuffer.java */
    static class c extends d<Long, long[], p0> implements p0 {

        /* compiled from: SpinedBuffer.java */
        class a extends g.c {

            /* renamed from: b, reason: collision with root package name */
            long f41503b = 0;

            a() {
            }

            @Override // com.annimon.stream.iterator.g.c
            public long b() {
                c cVar = c.this;
                long j4 = this.f41503b;
                this.f41503b = 1 + j4;
                return cVar.F(j4);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f41503b < c.this.q();
            }
        }

        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.annimon.stream.internal.e.d
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public int b(long[] jArr) {
            return jArr.length;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public long F(long j4) {
            int l4 = l(j4);
            return (this.f41507d == 0 && l4 == 0) ? ((long[]) this.f41509f)[(int) j4] : ((long[][]) this.f41510g)[l4][(int) (j4 - this.f41508e[l4])];
        }

        @Override // com.annimon.stream.internal.e.d, java.lang.Iterable
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public g.c iterator() {
            return new a();
        }

        @Override // com.annimon.stream.internal.e.d
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public long[] w(int i4) {
            return new long[i4];
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.annimon.stream.internal.e.d
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public long[][] x(int i4) {
            return new long[i4][];
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.annimon.stream.function.p0
        public void h(long j4) {
            A();
            long[] jArr = (long[]) this.f41509f;
            int i4 = this.f41506c;
            this.f41506c = i4 + 1;
            jArr[i4] = j4;
        }

        c(int i4) {
            super(i4);
        }
    }

    private e() {
    }

    /* compiled from: SpinedBuffer.java */
    static abstract class d<E, T_ARR, T_CONS> implements Iterable<E> {

        /* renamed from: b, reason: collision with root package name */
        final int f41505b;

        /* renamed from: c, reason: collision with root package name */
        int f41506c;

        /* renamed from: d, reason: collision with root package name */
        int f41507d;

        /* renamed from: e, reason: collision with root package name */
        long[] f41508e;

        /* renamed from: f, reason: collision with root package name */
        T_ARR f41509f;

        /* renamed from: g, reason: collision with root package name */
        T_ARR[] f41510g;

        d(int i4) {
            if (i4 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ߗ"), i4));
            }
            int max = Math.max(4, 32 - Integer.numberOfLeadingZeros(i4 - 1));
            this.f41505b = max;
            this.f41509f = w(1 << max);
        }

        private void v() {
            if (this.f41510g == null) {
                T_ARR[] x4 = x(8);
                this.f41510g = x4;
                this.f41508e = new long[8];
                x4[0] = this.f41509f;
            }
        }

        void A() {
            if (this.f41506c == b(this.f41509f)) {
                v();
                int i4 = this.f41507d;
                int i5 = i4 + 1;
                T_ARR[] t_arrArr = this.f41510g;
                if (i5 >= t_arrArr.length || t_arrArr[i4 + 1] == null) {
                    s();
                }
                this.f41506c = 0;
                int i6 = this.f41507d + 1;
                this.f41507d = i6;
                this.f41509f = this.f41510g[i6];
            }
        }

        protected abstract int b(T_ARR t_arr);

        public void clear() {
            T_ARR[] t_arrArr = this.f41510g;
            if (t_arrArr != null) {
                this.f41509f = t_arrArr[0];
                this.f41510g = null;
                this.f41508e = null;
            }
            this.f41506c = 0;
            this.f41507d = 0;
        }

        public T_ARR i() {
            long q4 = q();
            com.annimon.stream.internal.a.a(q4);
            T_ARR w4 = w((int) q4);
            p(w4, 0);
            return w4;
        }

        public boolean isEmpty() {
            return this.f41507d == 0 && this.f41506c == 0;
        }

        @Override // java.lang.Iterable
        public abstract Iterator<E> iterator();

        long j() {
            int i4 = this.f41507d;
            if (i4 == 0) {
                return b(this.f41509f);
            }
            return b(this.f41510g[i4]) + this.f41508e[i4];
        }

        int l(long j4) {
            if (this.f41507d == 0) {
                if (j4 < this.f41506c) {
                    return 0;
                }
                throw new IndexOutOfBoundsException(Long.toString(j4));
            }
            if (j4 >= q()) {
                throw new IndexOutOfBoundsException(Long.toString(j4));
            }
            for (int i4 = 0; i4 <= this.f41507d; i4++) {
                if (j4 < this.f41508e[i4] + b(this.f41510g[i4])) {
                    return i4;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j4));
        }

        int m(int i4) {
            return 1 << ((i4 == 0 || i4 == 1) ? this.f41505b : Math.min((this.f41505b + i4) - 1, 30));
        }

        void p(T_ARR t_arr, int i4) {
            long j4 = i4;
            long q4 = q() + j4;
            if (q4 > b(t_arr) || q4 < j4) {
                throw new IndexOutOfBoundsException(ProtectedSandApp.s("ߘ"));
            }
            if (this.f41507d == 0) {
                System.arraycopy(this.f41509f, 0, t_arr, i4, this.f41506c);
                return;
            }
            for (int i5 = 0; i5 < this.f41507d; i5++) {
                T_ARR t_arr2 = this.f41510g[i5];
                System.arraycopy(t_arr2, 0, t_arr, i4, b(t_arr2));
                i4 += b(this.f41510g[i5]);
            }
            int i6 = this.f41506c;
            if (i6 > 0) {
                System.arraycopy(this.f41509f, 0, t_arr, i4, i6);
            }
        }

        public long q() {
            int i4 = this.f41507d;
            return i4 == 0 ? this.f41506c : this.f41508e[i4] + this.f41506c;
        }

        final void r(long j4) {
            long j5 = j();
            if (j4 <= j5) {
                return;
            }
            v();
            int i4 = this.f41507d;
            while (true) {
                i4++;
                if (j4 <= j5) {
                    return;
                }
                T_ARR[] t_arrArr = this.f41510g;
                if (i4 >= t_arrArr.length) {
                    int length = t_arrArr.length * 2;
                    this.f41510g = (T_ARR[]) Arrays.copyOf(t_arrArr, length);
                    this.f41508e = Arrays.copyOf(this.f41508e, length);
                }
                int m4 = m(i4);
                this.f41510g[i4] = w(m4);
                long[] jArr = this.f41508e;
                jArr[i4] = jArr[i4 - 1] + b(this.f41510g[r5]);
                j5 += m4;
            }
        }

        void s() {
            r(j() + 1);
        }

        protected abstract T_ARR w(int i4);

        protected abstract T_ARR[] x(int i4);

        d() {
            this.f41505b = 4;
            this.f41509f = w(1 << 4);
        }
    }
}
