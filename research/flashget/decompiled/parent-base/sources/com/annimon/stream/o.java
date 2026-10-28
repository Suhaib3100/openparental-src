package com.annimon.stream;

import com.annimon.stream.function.k0;
import com.annimon.stream.function.s0;
import java.util.Random;

/* compiled from: RandomCompat.java */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Random f41553a;

    /* compiled from: RandomCompat.java */
    class a implements k0 {
        a() {
        }

        @Override // com.annimon.stream.function.k0
        public int a() {
            return o.this.f41553a.nextInt();
        }
    }

    /* compiled from: RandomCompat.java */
    class b implements s0 {
        b() {
        }

        @Override // com.annimon.stream.function.s0
        public long a() {
            return o.this.f41553a.nextLong();
        }
    }

    /* compiled from: RandomCompat.java */
    class c implements com.annimon.stream.function.m {
        c() {
        }

        @Override // com.annimon.stream.function.m
        public double a() {
            return o.this.f41553a.nextDouble();
        }
    }

    /* compiled from: RandomCompat.java */
    class d implements k0 {

        /* renamed from: a, reason: collision with root package name */
        private final int f41557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f41558b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f41559c;

        d(int i4, int i5) {
            this.f41558b = i4;
            this.f41559c = i5;
            this.f41557a = i4 - i5;
        }

        @Override // com.annimon.stream.function.k0
        public int a() {
            if (this.f41557a >= 0) {
                return o.this.f41553a.nextInt(this.f41557a) + this.f41559c;
            }
            while (true) {
                int nextInt = o.this.f41553a.nextInt();
                if (this.f41559c < nextInt && nextInt < this.f41558b) {
                    return nextInt;
                }
            }
        }
    }

    /* compiled from: RandomCompat.java */
    class e implements s0 {

        /* renamed from: a, reason: collision with root package name */
        private final long f41561a;

        /* renamed from: b, reason: collision with root package name */
        private final long f41562b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f41563c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f41564d;

        e(long j4, long j5) {
            this.f41563c = j4;
            this.f41564d = j5;
            long j6 = j4 - j5;
            this.f41561a = j6;
            this.f41562b = j6 - 1;
        }

        @Override // com.annimon.stream.function.s0
        public long a() {
            long j4;
            long j5;
            long nextLong = o.this.f41553a.nextLong();
            long j6 = this.f41561a;
            long j7 = this.f41562b;
            if ((j6 & j7) == 0) {
                j4 = nextLong & j7;
                j5 = this.f41564d;
            } else if (j6 > 0) {
                while (true) {
                    long j10 = nextLong >>> 1;
                    long j11 = this.f41562b + j10;
                    j4 = j10 % this.f41561a;
                    if (j11 - j4 >= 0) {
                        break;
                    }
                    nextLong = o.this.f41553a.nextLong();
                }
                j5 = this.f41564d;
            } else {
                while (true) {
                    if (this.f41564d < nextLong && nextLong < this.f41563c) {
                        return nextLong;
                    }
                    nextLong = o.this.f41553a.nextLong();
                }
            }
            return j4 + j5;
        }
    }

    /* compiled from: RandomCompat.java */
    class f implements com.annimon.stream.function.m {

        /* renamed from: a, reason: collision with root package name */
        private final double f41566a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f41567b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ double f41568c;

        f(double d5, double d6) {
            this.f41567b = d5;
            this.f41568c = d6;
            this.f41566a = d5 - d6;
        }

        @Override // com.annimon.stream.function.m
        public double a() {
            double nextDouble = (o.this.f41553a.nextDouble() * this.f41566a) + this.f41568c;
            double d5 = this.f41567b;
            return nextDouble >= d5 ? Double.longBitsToDouble(Double.doubleToLongBits(d5) - 1) : nextDouble;
        }
    }

    public o() {
        this.f41553a = new Random();
    }

    public com.annimon.stream.d b() {
        return com.annimon.stream.d.C(new c());
    }

    public com.annimon.stream.d c(double d5, double d6) {
        if (d5 < d6) {
            return com.annimon.stream.d.C(new f(d6, d5));
        }
        throw new IllegalArgumentException();
    }

    public com.annimon.stream.d d(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? com.annimon.stream.d.l() : b().G(j4);
        }
        throw new IllegalArgumentException();
    }

    public com.annimon.stream.d e(long j4, double d5, double d6) {
        if (j4 >= 0) {
            return j4 == 0 ? com.annimon.stream.d.l() : c(d5, d6).G(j4);
        }
        throw new IllegalArgumentException();
    }

    public Random f() {
        return this.f41553a;
    }

    public g g() {
        return g.B(new a());
    }

    public g h(int i4, int i5) {
        if (i4 < i5) {
            return g.B(new d(i5, i4));
        }
        throw new IllegalArgumentException();
    }

    public g i(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? g.k() : g().F(j4);
        }
        throw new IllegalArgumentException();
    }

    public g j(long j4, int i4, int i5) {
        if (j4 >= 0) {
            return j4 == 0 ? g.k() : h(i4, i5).F(j4);
        }
        throw new IllegalArgumentException();
    }

    public h k() {
        return h.B(new b());
    }

    public h l(long j4) {
        if (j4 >= 0) {
            return j4 == 0 ? h.k() : k().F(j4);
        }
        throw new IllegalArgumentException();
    }

    public h m(long j4, long j5) {
        if (j4 < j5) {
            return h.B(new e(j5, j4));
        }
        throw new IllegalArgumentException();
    }

    public h n(long j4, long j5, long j6) {
        if (j4 >= 0) {
            return j4 == 0 ? h.k() : m(j5, j6).F(j4);
        }
        throw new IllegalArgumentException();
    }

    public o(long j4) {
        this.f41553a = new Random(j4);
    }

    public o(Random random) {
        this.f41553a = random;
    }
}
